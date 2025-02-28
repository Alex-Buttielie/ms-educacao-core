package br.com.coreeduc.aplication.services;

import br.com.coreeduc.aplication.components.CompanyAutoCompleteComponent;
import br.com.coreeduc.aplication.contraints.SizesCompany;
import br.com.coreeduc.aplication.contraints.StatesBrazil;
import br.com.coreeduc.aplication.contraints.StatusRegistry;
import br.com.coreeduc.aplication.contraints.TypeLegalNature;
import br.com.coreeduc.aplication.contraints.TypeUnitCompany;
import br.com.coreeduc.aplication.entities.BranchActing;
import br.com.coreeduc.aplication.entities.CityEntity;
import br.com.coreeduc.aplication.entities.CompanyEntity;
import br.com.coreeduc.aplication.entities.NeighbordhoodEntity;
import br.com.coreeduc.aplication.entities.PublicPlaceEntity;
import br.com.coreeduc.aplication.records.CompanyRecord;
import br.com.coreeduc.aplication.records.OptionSelectedViewRecord;
import br.com.coreeduc.aplication.records.PropertiesOptionSelectedViewRecord;
import br.com.coreeduc.aplication.records.PropertiesViewRecord;
import br.com.coreeduc.aplication.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CompanyServiceImpl implements CompanyService {

    private CompanyRepository companyRepository;
    private CityService cityService;
    private BranchActingService branchActingService;
    private NeighbordhoodService neighbordhoodService;
    private PublicPlaceService publicPlaceService;

    @Autowired
    public CompanyServiceImpl(CompanyRepository companyRepository,
                              CityService cityService,
                              BranchActingService branchActingService,
                              NeighbordhoodService neighbordhoodService,
                              PublicPlaceService publicPlaceService) {
        this.companyRepository = companyRepository;
        this.cityService = cityService;
        this.branchActingService = branchActingService;
        this.neighbordhoodService = neighbordhoodService;
        this.publicPlaceService = publicPlaceService;
    }

    @Override
    public PropertiesViewRecord findPropertiesView() {
        return new PropertiesViewRecord(findPropertiesFromSeleted());
    }

    @Override
    public Map<String, OptionSelectedViewRecord> findPropertiesFromSeleted() {
        var retorno = new HashMap<String, OptionSelectedViewRecord>();
        retorno.put("states", getStates());
        retorno.put("sizesCompany", getCompanysSiza());
        retorno.put("legalsNature", getLegalsNature());
        retorno.put("typeUnitCompany", getTypeUnitCompany());
        retorno.put("statusRegistry", getStatusRegistry());
        return retorno;
    }

    protected OptionSelectedViewRecord getStatusRegistry() {
        return new OptionSelectedViewRecord(Arrays.stream(StatusRegistry.values())
                .map(typeUnitCompany -> new PropertiesOptionSelectedViewRecord(typeUnitCompany.getDescription(), typeUnitCompany.getDescricao()))
                .toList());
    }

    protected OptionSelectedViewRecord getTypeUnitCompany() {
        return new OptionSelectedViewRecord(Arrays.stream(TypeUnitCompany.values())
                .map(typeUnitCompany -> new PropertiesOptionSelectedViewRecord(typeUnitCompany.getCode(), typeUnitCompany.getDescription()))
                .toList());
    }

    protected OptionSelectedViewRecord getLegalsNature() {
        return new OptionSelectedViewRecord(Arrays.stream(TypeLegalNature.values())
                .map(nature -> new PropertiesOptionSelectedViewRecord(nature.getCode(), nature.getDescription()))
                .toList());
    }

    @Override
    public List<CompanyRecord> autoComplete(String value, String key) {
        return CompanyAutoCompleteComponent
                .getTipoBuscaAutoComplete(key)
                .findCompanys(value, key)
                .stream()
                .map(this::recordReturnByCompanySave)
                .toList();
    }

    @Override
    public CompanyRecord save(CompanyRecord companyRecord) {
        return recordReturnByCompanySave(getCompanyByRecord(companyRecord));
    }

    private CompanyRecord recordReturnByCompanySave(CompanyEntity company) {
        return new CompanyRecord(
                company.getId(),
                company.getNameCompany(),
                company.getCnpj(),
                company.getOpeningDate(),
                company.getFantasyName(),
                company.getSocialCapital(),
                company.getDateStatusRegistry(),
                Optional.of(company).map(CompanyEntity::getStatusRegistry).map(StatusRegistry::getDescription).orElse(null),
                Optional.of(company).map(CompanyEntity::getCityRegistry).map(CityEntity::getCodigoMec).orElse(null),
                Optional.of(company).map(CompanyEntity::getStateRegistry).map(StatesBrazil::getCodigo).orElse(null),
                Optional.of(company).map(CompanyEntity::getCompanySize).map(SizesCompany::getCodigo).orElse(null),
                Optional.of(company).map(CompanyEntity::getActingBranch).map(BranchActing::getCode).orElse(null),
                Optional.of(company).map(CompanyEntity::getNatureLegal).map(TypeLegalNature::getCode).orElse(null),
                Optional.of(company).map(CompanyEntity::getTypeUnitCompany).map(TypeUnitCompany::getCode).orElse(null),
                company.getSicomCode(),
                company.getPostalCode(),
                Optional.of(company).map(CompanyEntity::getNeighbordhood).map(NeighbordhoodEntity::getDescription).orElse(null),
                Optional.of(company).map(CompanyEntity::getCity).map(CityEntity::getCodigoMec).orElse(null),
                company.getNumber(),
                Optional.of(company).map(CompanyEntity::getPublicPlace).map(PublicPlaceEntity::getDescription).orElse(null),
                Optional.of(company).map(CompanyEntity::getState).map(StatesBrazil::getCodigo).orElse(null),
                company.getComplement()
        );
    }

    private CompanyEntity getCompanyByRecord(CompanyRecord companyRecord) {
        var company = Optional.ofNullable(companyRecord.id())
                .flatMap(companyRepository::findById)
                .orElseGet(CompanyEntity::new);

        var cityAdress = cityService.findCityByCodeMec(companyRecord.idCity());

        var cityRegistry = cityService.findCityByCodeMec(companyRecord.cityRegistry());

        var neighbordhood = neighbordhoodService
                .findNeighbordhoodEntityByDescriptionAndCity(companyRecord.neighbordhood(), cityAdress)
                .orElseGet(()-> neighbordhoodService.createNeighbordhood(companyRecord));

        var publicPlace = publicPlaceService
                .findPublicPlaceEntityByDescriptionAndPostalCodeAndNeighbordhood(companyRecord.publicPlace(), companyRecord.postalCode(), neighbordhood)
                .orElseGet(() -> publicPlaceService.createPublicPlace(companyRecord, neighbordhood));

        var actingBranch = branchActingService.findBranchActingByCode(companyRecord.actingBranch());

        company.setNameCompany(companyRecord.nameCompany());
        company.setFantasyName(companyRecord.fantasyName());
        company.setCnpj(companyRecord.cnpj());
        company.setOpeningDate(companyRecord.openingDate());
        company.setSocialCapital(companyRecord.socialCapital());
        company.setDateStatusRegistry(companyRecord.dateStatusRegistry());
        company.setStatusRegistry(StatusRegistry.getByFromValue(companyRecord.statusRegistry()));
        company.setCityRegistry(cityRegistry);
        company.setStateRegistry(StatesBrazil.fromCodigo(companyRecord.stateRegistry()));
        company.setCompanySize(SizesCompany.fromCodigo(companyRecord.companySize()));
        company.setActingBranch(actingBranch);
        company.setNatureLegal(TypeLegalNature.findByLegalNatureFromCode(companyRecord.natureLegal()));
        company.setTypeUnitCompany(TypeUnitCompany.findByTypeUnitCompanyFromCode(companyRecord.typeUnitCompany()));
        company.setSicomCode(companyRecord.sicomCode());
        company.setPostalCode(companyRecord.postalCode());
        company.setNeighbordhood(neighbordhood);
        company.setState(StatesBrazil.fromCodigo(companyRecord.state()));
        company.setCity(cityAdress);
        company.setNumber(companyRecord.number());
        company.setPublicPlace(publicPlace);
        company.setComplement(companyRecord.complement());

        return companyRepository.save(company);
    }

    protected OptionSelectedViewRecord getStates() {
        return new OptionSelectedViewRecord(Arrays.stream(StatesBrazil.values())
                .map(state -> new PropertiesOptionSelectedViewRecord(state.getCodigo(), state.getNome()))
                .toList());
    }

    protected OptionSelectedViewRecord getCompanysSiza() {
        return new OptionSelectedViewRecord(Arrays.stream(SizesCompany.values())
                .map(state -> new PropertiesOptionSelectedViewRecord(state.getCodigo(), state.getNome()))
                .toList());
    }

}
