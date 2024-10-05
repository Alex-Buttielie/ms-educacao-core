package br.com.coreeduc.aplication.resources;

import br.com.coreeduc.aplication.entities.CityEntity;
import br.com.coreeduc.aplication.records.BranchActingRecord;
import br.com.coreeduc.aplication.records.PropertiesViewRecord;
import br.com.coreeduc.aplication.services.CityService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/city")
public class CityResource implements ComumResource {

    private final CityService service;

    @Autowired
    public CityResource(CityService service) {
        this.service = service;
    }

    public CityService getService() {
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
    public ResponseEntity<List<CityEntity>> autoComplete(@RequestParam String value, @RequestParam String key) {
        return ResponseEntity.ok(getService().autoComplete(value, key));
    }

    @PostMapping("/importCitys")
    public void importCitys(@RequestBody List<Map<String, Object>> citys) {
        getService().importCitys(citys);
    }

}
