package br.com.coreeduc.aplication.resources;

import br.com.coreeduc.aplication.records.PropertiesViewRecord;
import br.com.coreeduc.aplication.services.MatrixDisciplineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/matrix-discipline")
public class MatrixDisciplinesResource implements CommomResource {

   @Autowired
   private MatrixDisciplineService matrixDisciplineService;

    @Override
    @GetMapping("/findPropertiesView")
    public ResponseEntity<PropertiesViewRecord> findPropertiesView() {
        return null;
    }

    @Override
    @GetMapping("/autoComplete")
    public ResponseEntity<List<?>> autoComplete(String value, String key) {
        return ResponseEntity.ok(matrixDisciplineService.autoComplete(value, key));
    }
}
