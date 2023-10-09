package br.com.coreeduc.adapters.inbound.resources;

import br.com.coreeduc.aplication.domains.UnidadeEnsino;
import br.com.coreeduc.aplication.ports.services.UnidadeEnsinoServicePort;
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
@RequestMapping("/unidade-ensino")
public class UnidadeEnsinoResource {

    private UnidadeEnsinoServicePort servicePort;

    @Autowired
    public UnidadeEnsinoResource(UnidadeEnsinoServicePort servicePort) {
        this.servicePort = servicePort;
    }

    public UnidadeEnsinoServicePort getServicePort() {
        return servicePort;
    }

    @ApiOperation(value = "Salva unidade de ensino")
    @PostMapping
    public ResponseEntity<UnidadeEnsino> salvar(@RequestBody UnidadeEnsino unidade) {
        UnidadeEnsino unidadeEnsino = getServicePort().salvar(unidade);
        return ResponseEntity.ok(unidadeEnsino);
    }

    @ApiOperation(value = "Busca unidades ensino do município")
    @GetMapping
    public ResponseEntity<List<UnidadeEnsino>> buscar() {
        var unidades = getServicePort().buscar();
        return ResponseEntity.ok(unidades);
    }

    @ApiOperation(value = "Busca unidade específica")
    @GetMapping("/unidade/{codigoInep}")
    public ResponseEntity<Object> getOneEmail(@PathVariable(value = "codigoInep") Long codigoInep ) {
        return (ResponseEntity<Object>) getServicePort()
                .findById(codigoInep)
                .map(unidade -> ResponseEntity.status(HttpStatus.OK).body(unidade))
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).body("Email not found"));
    }

}
