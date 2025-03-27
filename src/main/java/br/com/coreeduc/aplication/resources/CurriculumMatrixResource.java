package br.com.coreeduc.aplication.resources;

import br.com.coreeduc.aplication.records.CurriculumMatrixRecord;
import br.com.coreeduc.aplication.records.PropertiesViewRecord;
import br.com.coreeduc.aplication.services.CurriculumMatrixService;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/curriculum-matrix")
public class CurriculumMatrixResource implements CommomResource {

    private CurriculumMatrixService curriculumMatrixService;

    public CurriculumMatrixResource(CurriculumMatrixService curriculumMatrixService) {
        this.curriculumMatrixService = curriculumMatrixService;
    }

    @Override
    @GetMapping("/findPropertiesView")
    public ResponseEntity<PropertiesViewRecord> findPropertiesView() {
        return null;
    }

    @Override
    @GetMapping("/autoComplete")
    public ResponseEntity<List<?>> autoComplete(@RequestParam String value, @RequestParam String key) {
        return ResponseEntity.ok(curriculumMatrixService.autoComplete(value, key));
    }

    @PostMapping
    @ApiOperation(value = "Salva matriz curricular")
    public ResponseEntity<CurriculumMatrixRecord> save(@RequestBody @Valid CurriculumMatrixRecord curriculumMatrixRecord) {
        return ResponseEntity.ok(curriculumMatrixService.save(curriculumMatrixRecord));
    }

}
