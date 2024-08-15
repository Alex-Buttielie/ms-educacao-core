package br.com.coreeduc.aplication.resources;

import br.com.coreeduc.aplication.entities.PessoaEntity;
import br.com.coreeduc.aplication.services.PessoaService;
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

    private PessoaService service;

    @Autowired
    public PessoaResource(PessoaService service) {
        this.service = service;
    }

    public PessoaService getService() {
        return service;
    }

    @ApiOperation(value = "Salva pessoa")
    @PostMapping
    public ResponseEntity<PessoaEntity> salvar(@RequestBody PessoaEntity pessoa) {
        return ResponseEntity.ok(getService().salvar(pessoa));
    }

    @ApiOperation(value = "Busca pessoas")
    @GetMapping
    public ResponseEntity<List<PessoaEntity>> buscar() {
        var pessoas = getService().buscar();
        return ResponseEntity.ok(pessoas);
    }

    @ApiOperation(value = "Busca pessoa específica")
    @GetMapping("/{id}")
    public ResponseEntity<Object> buscarPessoa(@PathVariable(value = "id") Long codigoInep) {
        return (ResponseEntity<Object>) getService()
                .findById(codigoInep)
                .map(pessoa -> ResponseEntity.status(HttpStatus.OK).body(pessoa))
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).body("Pessoa não encontrada"));
    }

}
