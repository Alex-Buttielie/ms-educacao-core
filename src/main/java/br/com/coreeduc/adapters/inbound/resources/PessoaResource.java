package br.com.coreeduc.adapters.inbound.resources;

import br.com.coreeduc.aplication.domains.Pessoa;
import br.com.coreeduc.aplication.ports.services.PessoaServicePort;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
@Transactional
public class PessoaResource {

    private PessoaServicePort servicePort;

    @Autowired
    public PessoaResource(PessoaServicePort servicePort) {
        this.servicePort = servicePort;
    }

    public PessoaServicePort getServicePort() {
        return servicePort;
    }

    @ApiOperation(value = "Salva pessoa")
    @PostMapping
    public ResponseEntity<Pessoa> salvar(@RequestBody Pessoa pessoa) {
        return ResponseEntity.ok(getServicePort().salvar(pessoa));
    }

    @ApiOperation(value = "Busca pessoas")
    @GetMapping
    public ResponseEntity<List<Pessoa>> buscar() {
        var pessoas = getServicePort().buscar();
        return ResponseEntity.ok(pessoas);
    }

    @ApiOperation(value = "Busca pessoa específica")
    @GetMapping("/{id}")
    public ResponseEntity<Object> buscarPessoa(@PathVariable(value = "id") Long codigoInep) {
        return (ResponseEntity<Object>) getServicePort()
                .findById(codigoInep)
                .map(pessoa -> ResponseEntity.status(HttpStatus.OK).body(pessoa))
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).body("Pessoa não encontrada"));
    }

}
