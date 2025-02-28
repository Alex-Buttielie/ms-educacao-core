package br.com.coreeduc.aplication.resources;

import br.com.coreeduc.aplication.records.BranchActingRecord;
import br.com.coreeduc.aplication.records.PropertiesViewRecord;
import br.com.coreeduc.aplication.services.BranchActingService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/branch-acting")
@Transactional
public class BranchActingResource implements CommomResource {

    private BranchActingService service;

    @Autowired
    public BranchActingResource(BranchActingService service) {
        this.service = service;
    }

    public BranchActingService getService() {
        return service;
    }

    @ApiOperation(value = "Importar ramos de atividades")
    @PostMapping("/upload")
    public void salvar(@RequestBody List<BranchActingRecord> branchActings) {
        getService().importBranchActings(branchActings);
    }

    @Override
    @GetMapping("/findPropertiesView")
    public ResponseEntity<PropertiesViewRecord> findPropertiesView() {
        return null;
    }

    @Override
    @GetMapping("/autoComplete")
    public ResponseEntity<List<?>> autoComplete(@RequestParam String value, @RequestParam String key) {
        return ResponseEntity.ok(getService().autoComplete(value, key));
    }

}
