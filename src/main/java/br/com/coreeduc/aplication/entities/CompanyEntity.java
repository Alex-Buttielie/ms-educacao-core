package br.com.coreeduc.aplication.entities;

import br.com.coreeduc.aplication.contraints.SizesCompany;
import br.com.coreeduc.aplication.contraints.StatesBrazil;
import br.com.coreeduc.aplication.contraints.StatusRegistry;
import br.com.coreeduc.aplication.contraints.TypeLegalNature;
import br.com.coreeduc.aplication.contraints.TypeUnitCompany;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "company")
@Entity
public class CompanyEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Basic
    @Column(name="name_company")
    private String nameCompany;
    @Basic
    @Column(name="opening_date")
    private Date openingDate;
    @Basic
    @Column(name="fantasy_name")
    private String fantasyName;
    @Basic
    @Column(name="social_capital")
    private  Integer socialCapital;
    @Basic
    @Column(name="cnpj")
    private  String cnpj;
    @Basic
    @Column(name="date_status_registry")
    private  Date dateStatusRegistry;
    @Basic
    @Column(name="status_registry")
    private  StatusRegistry statusRegistry;
    @Basic
    @Column(name="state_registry")
    private StatesBrazil stateRegistry;
    @OneToOne
    @JoinColumn()
    @JsonFormat
    private CityEntity cityRegistry;
    @Basic
    @Column(name="company_size")
    private SizesCompany companySize;
    @OneToOne
    @JoinColumn()
    @JsonFormat
    private BranchActing actingBranch;
    @Basic
    @Column(name="nature_legal")
    private TypeLegalNature natureLegal;
    @Basic
    @Column(name="type_unit_company")
    private TypeUnitCompany typeUnitCompany;
    @Basic
    @Column(name="sicom_code")
    private Integer sicomCode;
    @Basic
    @Column(name="postal_code")
    private String postalCode;
    @Basic
    @Column(name="state")
    private StatesBrazil state;
    @OneToOne
    @JoinColumn()
    @JsonFormat
    private CityEntity city;
    @Basic
    @Column(name="number")
    private Integer number;
    @OneToOne
    @JoinColumn()
    @JsonFormat
    private NeighbordhoodEntity neighbordhood;
    @OneToOne
    @JoinColumn()
    @JsonFormat
    private PublicPlaceEntity publicPlace;
    @Basic
    @Column(name="complement")
    private String complement;

    public CompanyEntity() {
    }

    public CompanyEntity(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public Date getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(Date openingDate) {
        this.openingDate = openingDate;
    }

    public String getFantasyName() {
        return fantasyName;
    }

    public void setFantasyName(String fantasyName) {
        this.fantasyName = fantasyName;
    }

    public Integer getSocialCapital() {
        return socialCapital;
    }

    public void setSocialCapital(Integer socialCapital) {
        this.socialCapital = socialCapital;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Date getDateStatusRegistry() {
        return dateStatusRegistry;
    }

    public void setDateStatusRegistry(Date dateStatusRegistry) {
        this.dateStatusRegistry = dateStatusRegistry;
    }

    public StatusRegistry getStatusRegistry() {
        return statusRegistry;
    }

    public void setStatusRegistry(StatusRegistry statusRegistry) {
        this.statusRegistry = statusRegistry;
    }

    public StatesBrazil getStateRegistry() {
        return stateRegistry;
    }

    public void setStateRegistry(StatesBrazil stateRegistry) {
        this.stateRegistry = stateRegistry;
    }

    public CityEntity getCityRegistry() {
        return cityRegistry;
    }

    public void setCityRegistry(CityEntity cityRegistry) {
        this.cityRegistry = cityRegistry;
    }

    public SizesCompany getCompanySize() {
        return companySize;
    }

    public void setCompanySize(SizesCompany companySize) {
        this.companySize = companySize;
    }

    public BranchActing getActingBranch() {
        return actingBranch;
    }

    public void setActingBranch(BranchActing actingBranch) {
        this.actingBranch = actingBranch;
    }

    public TypeLegalNature getNatureLegal() {
        return natureLegal;
    }

    public void setNatureLegal(TypeLegalNature natureLegal) {
        this.natureLegal = natureLegal;
    }

    public TypeUnitCompany getTypeUnitCompany() {
        return typeUnitCompany;
    }

    public void setTypeUnitCompany(TypeUnitCompany typeUnitCompany) {
        this.typeUnitCompany = typeUnitCompany;
    }

    public Integer getSicomCode() {
        return sicomCode;
    }

    public void setSicomCode(Integer sicomCode) {
        this.sicomCode = sicomCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public StatesBrazil getState() {
        return state;
    }

    public void setState(StatesBrazil state) {
        this.state = state;
    }

    public CityEntity getCity() {
        return city;
    }

    public void setCity(CityEntity city) {
        this.city = city;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public NeighbordhoodEntity getNeighbordhood() {
        return neighbordhood;
    }

    public void setNeighbordhood(NeighbordhoodEntity neighbordhood) {
        this.neighbordhood = neighbordhood;
    }

    public PublicPlaceEntity getPublicPlace() {
        return publicPlace;
    }

    public void setPublicPlace(PublicPlaceEntity publicPlace) {
        this.publicPlace = publicPlace;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }
}
