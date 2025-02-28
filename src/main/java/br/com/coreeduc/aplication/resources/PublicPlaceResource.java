package br.com.coreeduc.aplication.resources;

import br.com.coreeduc.aplication.entities.PublicPlaceEntity;
import br.com.coreeduc.aplication.records.PropertiesViewRecord;
import br.com.coreeduc.aplication.services.PublicPlaceService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/public-place")
public class PublicPlaceResource implements CommomResource {

    private final PublicPlaceService service;

    @Autowired
    public PublicPlaceResource(PublicPlaceService service) {
        this.service = service;
    }

    public PublicPlaceService getService() {
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

}
