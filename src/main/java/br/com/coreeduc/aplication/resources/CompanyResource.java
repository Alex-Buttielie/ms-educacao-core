package br.com.coreeduc.aplication.resources;

import br.com.coreeduc.aplication.dto.PropertiesView;
import br.com.coreeduc.aplication.services.CompanyService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class CompanyResource implements ComumResource{

    private CompanyService service;

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
    public ResponseEntity<PropertiesView> findPropertiesView() {
        return ResponseEntity.ok(getService().findPropertiesView());
    }

}
