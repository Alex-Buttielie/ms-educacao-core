package br.com.coreeduc.adapters.outbound.persistence.repositories;

import br.com.coreeduc.adapters.outbound.persistence.entities.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PessoaRepository extends JpaRepository<PessoaEntity, Long> {
    Optional<PessoaEntity> findPessoaByCpf(String cpf);

    Optional<PessoaEntity> findPessoaByNome(String nome);
}
