ALTER TABLE unidade_ensino ADD CONSTRAINT unidade_escolas_com_qual_compartilha
    FOREIGN KEY (escolas_com_qual_compartilha_id) REFERENCES escolas_com_qual_compartilha(id);

ALTER TABLE unidade_ensino ADD CONSTRAINT unidade_abastecimento_agua
    FOREIGN KEY (abastecimento_agua_id) REFERENCES abastecimento_agua(id);

ALTER TABLE unidade_ensino ADD CONSTRAINT unidade_fonte_energia_eletrica
    FOREIGN KEY (fonte_energia_eletrica_id) REFERENCES fonte_energia_eletrica(id);

ALTER TABLE unidade_ensino ADD CONSTRAINT unidade_esgotamento_sanitario
    FOREIGN KEY (esgotamento_sanitario_id) REFERENCES esgotamento_sanitario(id);

ALTER TABLE unidade_ensino ADD CONSTRAINT unidade_destinacao_lixo
    FOREIGN KEY (destinacao_lixo_id) REFERENCES destinacao_lixo(id);

ALTER TABLE unidade_ensino ADD CONSTRAINT unidade_dependencias_fisicas
    FOREIGN KEY (dependencias_fisicas_id) REFERENCES dependencias_fisicas(id);

ALTER TABLE unidade_ensino ADD CONSTRAINT unidade_local_funcionamento_escola
    FOREIGN KEY (local_funcionamento_escola_id) REFERENCES local_funcionamento_escola(id);

ALTER TABLE unidade_ensino ADD CONSTRAINT unidade_recurso_pessoas_deficientes
    FOREIGN KEY (recurso_pessoas_deficientes_id) REFERENCES recurso_pessoas_deficientes(id);

ALTER TABLE unidade_ensino ADD CONSTRAINT unidade_equipamentos_existentes_unidade
    FOREIGN KEY (equipamentos_existentes_unidade_id) REFERENCES equipamentos_existentes_unidade(id);

ALTER TABLE unidade_ensino ADD CONSTRAINT unidade_quantidade_equipamentos_processo_aprendizagem
    FOREIGN KEY (quantidade_equipamentos_processo_aprendizagem_id) REFERENCES quantidade_equipamentos_processo_aprendizagem(id);

ALTER TABLE unidade_ensino ADD CONSTRAINT unidade_quantidade_computadores_em_uso_alunos
    FOREIGN KEY (quantidade_computadores_em_uso_alunos_id) REFERENCES quantidade_computadores_em_uso_alunos(id);

ALTER TABLE unidade_ensino ADD CONSTRAINT unidade_acesso_internet
    FOREIGN KEY (acesso_internet_id) REFERENCES acesso_internet(id);

ALTER TABLE unidade_ensino ADD CONSTRAINT unidade_equipamentos_usados_alunos_acesso_internet
    FOREIGN KEY (equipamentos_usados_alunos_acesso_internet_id) REFERENCES equipamentos_usados_alunos_acesso_internet(id);

ALTER TABLE unidade_ensino ADD CONSTRAINT unidade_rede_local_interligacao_computadores
    FOREIGN KEY (rede_local_interligacao_computadores_id) REFERENCES rede_local_interligacao_computadores(id);

ALTER TABLE unidade_ensino ADD CONSTRAINT unidade_total_profissionais_ativos_escola
    FOREIGN KEY (total_profissionais_ativos_escola_id) REFERENCES total_profissionais_ativos_escola(id);

ALTER TABLE unidade_ensino ADD CONSTRAINT unidade_instrumentos_materiais_socio_culturais
    FOREIGN KEY (instrumentos_materiais_socio_culturais_id) REFERENCES instrumentos_materiais_socio_culturais(id);

ALTER TABLE unidade_ensino ADD CONSTRAINT unidade_idioma_ensino
    FOREIGN KEY (idioma_ensino_id) REFERENCES idioma_ensino(id);

ALTER TABLE unidade_ensino ADD CONSTRAINT unidade_reserva_vagas_sistema_cotas
    FOREIGN KEY (reserva_vagas_sistema_cotas_id) REFERENCES reserva_vagas_sistema_cotas(id);

ALTER TABLE unidade_ensino ADD CONSTRAINT unidade_orgaos_colegiador_funcionamento_escola
    FOREIGN KEY (orgaos_colegiados_funcionamento_escola_id) REFERENCES orgaos_colegiados_funcionamento_escola(id);

ALTER TABLE unidade_ensino ADD CONSTRAINT unidade_tratamento_lixo_id
    FOREIGN KEY (tratamento_lixo_id) REFERENCES tratamento_lixo(id);
