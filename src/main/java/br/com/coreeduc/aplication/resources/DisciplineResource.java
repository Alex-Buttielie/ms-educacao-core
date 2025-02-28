package br.com.coreeduc.aplication.resources;


import br.com.coreeduc.aplication.records.PropertiesViewRecord;
import br.com.coreeduc.aplication.services.DisciplineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/discipline")
public class DisciplineResource  implements CommomResource {

    @Autowired
    private DisciplineService disciplineService;

    @Override
    @GetMapping("/findPropertiesView")
    public ResponseEntity<PropertiesViewRecord> findPropertiesView() {
        return ResponseEntity.ok(disciplineService.findPropertiesView());
    }

    @Override
    @GetMapping("/autoComplete")
    public ResponseEntity<List<?>> autoComplete(String value, String key) {
        return ResponseEntity.ok(disciplineService.autoComplete(value, key));
    }

}
