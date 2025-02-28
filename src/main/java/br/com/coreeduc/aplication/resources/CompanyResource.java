package br.com.coreeduc.aplication.resources;

import br.com.coreeduc.aplication.records.CompanyRecord;
import br.com.coreeduc.aplication.records.PropertiesViewRecord;
import br.com.coreeduc.aplication.services.CompanyService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/company")
public class CompanyResource implements CommomResource {

    private final CompanyService service;

    @Autowired
    public CompanyResource(CompanyService service) {
        this.service = service;
    }

    public CompanyService getService() {
        return service;
    }

    @Override
    @GetMapping("/findPropertiesView")
    @ApiOperation(value = "Busca lista de propriedades que vão ser aproveitados pelo front")
    public ResponseEntity<PropertiesViewRecord> findPropertiesView() {
        return ResponseEntity.ok(getService().findPropertiesView());
    }

    @Override
    @GetMapping("/autoComplete")
    public ResponseEntity<List<?>> autoComplete(@RequestParam String value, @RequestParam String key) {
        return ResponseEntity.ok(getService().autoComplete(value, key));
    }

    @PostMapping
    @ApiOperation(value = "Salva empresa")
    public ResponseEntity<CompanyRecord> save(@RequestBody @Valid CompanyRecord companyRecord) {
        return ResponseEntity.ok(getService().save(companyRecord));
    }

    @PostMapping("upload-logotipo")
    @ApiOperation(value = "Salvar Logo")
    public ResponseEntity<?> uploadLogotipo(@RequestPart(value = "file") MultipartFile file) {
        return ResponseEntity.ok("");
    }

}
