package br.com.coreeduc.adapters.outbound.persistence.repositories.impl;


import br.com.coreeduc.adapters.outbound.persistence.entities.PessoaEntity;
import br.com.coreeduc.adapters.outbound.persistence.repositories.PessoaRepository;
import br.com.coreeduc.adapters.outbound.persistence.repositories.impl.PessoaRepositoryImpl;
import br.com.coreeduc.aplication.domains.Pessoa;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PessoaRepositoryImplTest {

    @InjectMocks
    private PessoaRepositoryImpl postgresPessoaRepository;
    @Mock
    private PessoaRepository pessoaRepository;
    private PessoaEntity pessoaEntity;
    private Optional<PessoaEntity> pessoaEntityOptional;

    private Pessoa pessoa;


    @BeforeEach
    void init() {
        pessoaEntity =  PessoaEntity.builder().id(1l).build();
        pessoaEntityOptional =  Optional.of(PessoaEntity.builder().id(1l).build());
        pessoa = new Pessoa();
        pessoa.setId(pessoaEntity.getId());

    }

    @Test
    void deveSalvarPessoa() {
        when(pessoaRepository.save(any())).thenReturn(pessoaEntity);
        var pessoaRetorno = postgresPessoaRepository.save(pessoa);
        Assert.assertEquals(pessoa.getId(), pessoaRetorno.getId());
    }

    @Test
    void deveConverterPessoaToPessoaEntity() {
        var retorno = Optional.ofNullable(pessoa)
                .map(postgresPessoaRepository.convertsPessoaToPessoaEntity())
                .orElse(null);

        Assert.assertNotNull(retorno);
        Assert.assertNotNull(retorno.getId());
    }

    @Test
    void deveConverterPessoaEntityFromPessoa() {
        var retorno = Optional.ofNullable(pessoaEntity)
                .map(postgresPessoaRepository::convertsPessoaEntityFromPessoa)
                .orElse(null);

        Assert.assertNotNull(retorno);
        Assert.assertNotNull(retorno.getId());
    }


}
