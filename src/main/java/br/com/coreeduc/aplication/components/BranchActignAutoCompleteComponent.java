package br.com.coreeduc.aplication.components;

import br.com.coreeduc.aplication.entities.BranchActing;
import br.com.coreeduc.aplication.factorys.BranchActingFactory;
import br.com.coreeduc.aplication.repositories.BranchActingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.EnumSet;
import java.util.List;
import java.util.Properties;

public enum BranchActignAutoCompleteComponent {

    BRANCH_ACTING_BY_CODE ("id"){
        @Override
        public List<BranchActing> findBranchsActing(String value, String key) {
            var branchActing = new BranchActingFactory(getProperties(value, key)).getBranchActing();
            return findd(branchActingRepository.findBranchActingByCode(branchActing.getCode()));
        }
    };

    public List<BranchActing> findd(List<BranchActing> all) {
        return all.isEmpty() ? branchActingRepository.findAll() : all;
    }

    public abstract List<BranchActing> findBranchsActing(String value, String key);


    public Properties getProperties(String value, String key) {
        var prop = new Properties();
        prop.put(key, value);
        return prop;
    }

    protected BranchActingRepository branchActingRepository;

    private String key;

    BranchActignAutoCompleteComponent(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public static BranchActignAutoCompleteComponent getTipoBuscaAutoComplete(String key) {
        for (BranchActignAutoCompleteComponent value : values()) {
            if (value.getKey().equals(key)) {
                return value;
            }
        }

        throw new RuntimeException("Programador problema ao idenficar o tipo do ramo de atividade da empresa do autocomplete.");

    }

    public void setBranchActingRepository(BranchActingRepository branchActingRepository) {
        this.branchActingRepository = branchActingRepository;
    }

    @Component
    final static class ServiceInjector {
        @Autowired
        protected BranchActingRepository branchActingRepository;

        @PostConstruct
        private void postConstruct() {
            for (var item : EnumSet.allOf(BranchActignAutoCompleteComponent.class)) {
                item.setBranchActingRepository(branchActingRepository);
            }
        }
    }

}
