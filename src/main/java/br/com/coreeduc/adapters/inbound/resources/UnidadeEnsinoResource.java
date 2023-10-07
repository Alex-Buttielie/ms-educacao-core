package br.com.coreeduc.adapters.inbound.resources;

import br.com.coreeduc.aplication.domains.UnidadeEnsino;
import br.com.coreeduc.aplication.ports.services.UnidadeEnsinoServicePort;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;

@RestController
@RequestMapping("/unidade-ensino")
public class UnidadeEnsinoResource {

    @Autowired
    private UnidadeEnsinoServicePort servicePort;

    @ApiOperation(value = "Salva unidade de ensino")
    @PostMapping
    public ResponseEntity<UnidadeEnsino> salvar(@RequestBody @Valid UnidadeEnsino unidade, UriComponentsBuilder uriBuilder) {
        UnidadeEnsino unidadeEnsino = servicePort.salvar(unidade);

        return ResponseEntity.ok(unidadeEnsino);
    }

}
