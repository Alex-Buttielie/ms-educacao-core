ALTER TABLE public.unidade_ensino ADD CONSTRAINT unidade_escolas_com_qual_compartilha
    FOREIGN KEY (escolas_com_qual_compartilha_id) REFERENCES public.escolas_com_qual_compartilha(id);

ALTER TABLE public.unidade_ensino ADD CONSTRAINT unidade_abastecimento_agua
    FOREIGN KEY (abastecimento_agua_id) REFERENCES public.abastecimento_agua(id);

ALTER TABLE public.unidade_ensino ADD CONSTRAINT unidade_fonte_energia_eletrica
    FOREIGN KEY (fonte_energia_eletrica_id) REFERENCES public.fonte_energia_eletrica(id);

ALTER TABLE public.unidade_ensino ADD CONSTRAINT unidade_esgotamento_sanitario
    FOREIGN KEY (esgotamento_sanitario_id) REFERENCES public.esgotamento_sanitario(id);

ALTER TABLE public.unidade_ensino ADD CONSTRAINT unidade_destinacao_lixo
    FOREIGN KEY (destinacao_lixo_id) REFERENCES public.destinacao_lixo(id);

ALTER TABLE public.unidade_ensino ADD CONSTRAINT unidade_dependencias_fisicas
    FOREIGN KEY (dependencias_fisicas_id) REFERENCES public.dependencias_fisicas(id);

ALTER TABLE public.unidade_ensino ADD CONSTRAINT unidade_local_funcionamento_escola
    FOREIGN KEY (local_funcionamento_escola_id) REFERENCES public.local_funcionamento_escola(id);

ALTER TABLE public.unidade_ensino ADD CONSTRAINT unidade_recurso_pessoas_deficientes
    FOREIGN KEY (recurso_pessoas_deficientes_id) REFERENCES public.recurso_pessoas_deficientes(id);

ALTER TABLE public.unidade_ensino ADD CONSTRAINT unidade_equipamentos_existentes_unidade
    FOREIGN KEY (equipamentos_existentes_unidade_id) REFERENCES public.equipamentos_existentes_unidade(id);

ALTER TABLE public.unidade_ensino ADD CONSTRAINT unidade_quantidade_equipamentos_processo_aprendizagem
    FOREIGN KEY (quantidade_equipamentos_processo_aprendizagem_id) REFERENCES public.quantidade_equipamentos_processo_aprendizagem(id);

ALTER TABLE public.unidade_ensino ADD CONSTRAINT unidade_quantidade_computadores_em_uso_alunos
    FOREIGN KEY (quantidade_computadores_em_uso_alunos_id) REFERENCES public.quantidade_computadores_em_uso_alunos(id);

ALTER TABLE public.unidade_ensino ADD CONSTRAINT unidade_acesso_internet
    FOREIGN KEY (acesso_internet_id) REFERENCES public.acesso_internet(id);

ALTER TABLE public.unidade_ensino ADD CONSTRAINT unidade_equipamentos_usados_alunos_acesso_internet
    FOREIGN KEY (equipamentos_usados_alunos_acesso_internet_id) REFERENCES public.equipamentos_usados_alunos_acesso_internet(id);

ALTER TABLE public.unidade_ensino ADD CONSTRAINT unidade_rede_local_interligacao_computadores
    FOREIGN KEY (rede_local_interligacao_computadores_id) REFERENCES public.rede_local_interligacao_computadores(id);

ALTER TABLE public.unidade_ensino ADD CONSTRAINT unidade_total_profissionais_ativos_escola
    FOREIGN KEY (total_profissionais_ativos_escola_id) REFERENCES public.total_profissionais_ativos_escola(id);

ALTER TABLE public.unidade_ensino ADD CONSTRAINT unidade_instrumentos_materiais_socio_culturais
    FOREIGN KEY (instrumentos_materiais_socio_culturais_id) REFERENCES public.instrumentos_materiais_socio_culturais(id);

ALTER TABLE public.unidade_ensino ADD CONSTRAINT unidade_idioma_ensino
    FOREIGN KEY (idioma_ensino_id) REFERENCES public.idioma_ensino(id);

ALTER TABLE public.unidade_ensino ADD CONSTRAINT unidade_reserva_vagas_sistema_cotas
    FOREIGN KEY (reserva_vagas_sistema_cotas_id) REFERENCES public.reserva_vagas_sistema_cotas(id);

ALTER TABLE public.unidade_ensino ADD CONSTRAINT unidade_orgaos_colegiador_funcionamento_escola
    FOREIGN KEY (orgaos_colegiados_funcionamento_escola_id) REFERENCES public.orgaos_colegiados_funcionamento_escola(id);

ALTER TABLE public.unidade_ensino ADD CONSTRAINT unidade_tratamento_lixo_id
    FOREIGN KEY (tratamento_lixo_id) REFERENCES public.tratamento_lixo(id);
