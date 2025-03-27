package br.com.coreeduc.aplication.resources;

import br.com.coreeduc.aplication.records.MatrixDisciplineRecord;
import br.com.coreeduc.aplication.records.PropertiesViewRecord;
import br.com.coreeduc.aplication.services.MatrixDisciplineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/findDisciplinasMatriz")
    public ResponseEntity<List<MatrixDisciplineRecord>> findDisciplinasMatriz(@RequestParam String matrixCode) {
        return ResponseEntity.ok(matrixDisciplineService.findDisciplinasMatriz(matrixCode));
    }

    @Override
    @GetMapping("/autoComplete")
    public ResponseEntity<List<?>> autoComplete(@RequestParam String value, @RequestParam String key) {
        return ResponseEntity.ok(matrixDisciplineService.autoComplete(value, key));
    }
}
