package br.com.coreeduc.aplication.repositories;

import br.com.coreeduc.aplication.entities.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PessoaRepository extends JpaRepository<PessoaEntity, Long> {
    Optional<PessoaEntity> findPessoaByCpf(String cpf);
    Optional<PessoaEntity> findPessoaByNome(String nome);
}
