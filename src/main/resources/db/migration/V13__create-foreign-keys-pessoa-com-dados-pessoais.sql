ALTER TABLE pessoa ADD CONSTRAINT pessoa_formacao_complementar_professor
    FOREIGN KEY (formacao_complementar_pedagogica_professor_id)
        REFERENCES formacao_complementar_pedagogica_professor(id);

ALTER TABLE pessoa ADD CONSTRAINT pessoa_cursos_especificos_professor
    FOREIGN KEY (outros_cursos_especificos_id)
        REFERENCES outros_cursos_especificos(id);

ALTER TABLE pessoa ADD CONSTRAINT tipo_deficiencia_espectro_altas_habilidades
    FOREIGN KEY (tipo_deficiencia_espectro_altas_habilidades_id)
        REFERENCES tipo_deficiencia_espectro_altas_habilidades(id);

ALTER TABLE pessoa ADD CONSTRAINT pessoa_recurso_aluno_avaliacao_inep
    FOREIGN KEY (recurso_aluno_para_avaliacao_inep_id)
        REFERENCES recurso_aluno_para_avaliacao_inep(id);

ALTER TABLE pessoa ADD CONSTRAINT pessoa_pos_graduacao_concluida_professor
    FOREIGN KEY (pos_graduacao_concluida_professor_id)
        REFERENCES pos_graduacao_concluida_professor(id);
