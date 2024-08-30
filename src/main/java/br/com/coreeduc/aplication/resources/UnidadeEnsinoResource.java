package br.com.coreeduc.aplication.resources;

import br.com.coreeduc.aplication.dto.OptionSelectedView;
import br.com.coreeduc.aplication.entities.UnidadeEnsinoEntity;
import br.com.coreeduc.aplication.services.UnidadeEnsinoService;
import br.com.coreeduc.aplication.dto.PropertiesView;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/unidade")
public class UnidadeEnsinoResource implements ComumResource {

    private UnidadeEnsinoService service;

    @Autowired
    public UnidadeEnsinoResource(UnidadeEnsinoService service) {
        this.service = service;
    }

    public UnidadeEnsinoService getService() {
        return service;
    }

    @ApiOperation(value = "Salva unidade de ensino")
    @PostMapping
    public ResponseEntity<UnidadeEnsinoEntity> salvar(@RequestBody UnidadeEnsinoEntity unidade) {
        UnidadeEnsinoEntity unidadeEnsino = getService().salvar(unidade);
        return ResponseEntity.ok(unidadeEnsino);
    }

    @ApiOperation(value = "Busca unidades ensino do município")
    @GetMapping
    public ResponseEntity<List<UnidadeEnsinoEntity>> buscar() {
        var unidades = getService().buscar();
        return ResponseEntity.ok(unidades);
    }

    @ApiOperation(value = "Busca unidade específica")
    @GetMapping("/unidade/{codigoInep}")
    public ResponseEntity<Object> getOneEmail(@PathVariable(value = "codigoInep") Long codigoInep) {
        return (ResponseEntity<Object>) getService()
                .findById(codigoInep)
                .map(unidade -> ResponseEntity.status(HttpStatus.OK).body(unidade))
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).body("Unidade não encontrada"));
    }

    @Override
    @GetMapping("/findPropertiesView")
    @ApiOperation(value = "Busca lista de propriedades que vão aproveitados pelo front")
    public ResponseEntity<PropertiesView> findPropertiesView() {
        return ResponseEntity.ok(getService().findPropertiesView());
    }

}
