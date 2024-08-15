package br.com.coreeduc.aplication.services;


import br.com.coreeduc.aplication.entities.UnidadeEnsinoEntity;

import java.util.List;
import java.util.Optional;

public interface UnidadeEnsinoService {

    UnidadeEnsinoEntity salvar(UnidadeEnsinoEntity unidade);

    List<UnidadeEnsinoEntity> buscar();

    Optional findById(Long codigoInep);
}
