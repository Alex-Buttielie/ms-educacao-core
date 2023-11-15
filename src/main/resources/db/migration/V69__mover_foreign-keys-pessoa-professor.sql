ALTER TABLE pessoa DROP CONSTRAINT pessoa_cursos_especificos_professor;
ALTER TABLE pessoa DROP CONSTRAINT pessoa_formacao_complementar_professor;
ALTER TABLE pessoa DROP CONSTRAINT pessoa_pos_graduacao_concluida_professor;
ALTER TABLE pessoa DROP CONSTRAINT pessoa_recurso_aluno_avaliacao_inep;
ALTER TABLE pessoa DROP CONSTRAINT tipo_deficiencia_espectro_altas_habilidades;

ALTER TABLE pessoa DROP COLUMN outros_cursos_especificos_id;
ALTER TABLE pessoa DROP COLUMN formacao_complementar_pedagogica_professor_id;
ALTER TABLE pessoa DROP COLUMN pos_graduacao_concluida_professor_id;
ALTER TABLE pessoa DROP COLUMN nao_tem_pos_graduacao_concluida;
ALTER TABLE pessoa DROP COLUMN nao_tem_outros_cursos_especificos;
ALTER TABLE pessoa DROP COLUMN tipo_ensino_medio_cursado;
ALTER TABLE pessoa DROP COLUMN maior_nivel_escolaridade_concluido;
ALTER TABLE pessoa DROP COLUMN tipo_deficiencia_espectro_altas_habilidades_id;
ALTER TABLE pessoa DROP COLUMN recurso_aluno_para_avaliacao_inep_id;

ALTER TABLE professor ADD outros_cursos_especificos_id integer NULL;
ALTER TABLE professor ADD formacao_complementar_pedagogica_professor_id integer NULL;
ALTER TABLE professor ADD pos_graduacao_concluida_professor_id integer NULL;
ALTER TABLE professor ADD nao_tem_pos_graduacao_concluida BOOLEAN;
ALTER TABLE professor ADD nao_tem_outros_cursos_especificos BOOLEAN;
ALTER TABLE professor ADD tipo_ensino_medio_cursado INTEGER;
ALTER TABLE professor ADD maior_nivel_escolaridade_concluido INTEGER;
ALTER TABLE professor ADD tipo_deficiencia_espectro_altas_habilidades_id INTEGER;
ALTER TABLE professor ADD recurso_aluno_para_avaliacao_inep_id INTEGER;

ALTER TABLE professor ADD CONSTRAINT pessoa_cursos_especificos_professor
    FOREIGN KEY (outros_cursos_especificos_id)
        REFERENCES outros_cursos_especificos(id);

ALTER TABLE professor ADD CONSTRAINT pessoa_formacao_complementar_professor
    FOREIGN KEY (formacao_complementar_pedagogica_professor_id)
        REFERENCES formacao_complementar_pedagogica_professor(id);

ALTER TABLE professor ADD CONSTRAINT pessoa_pos_graduacao_concluida_professor
    FOREIGN KEY (pos_graduacao_concluida_professor_id)
        REFERENCES pos_graduacao_concluida_professor(id);

ALTER TABLE professor ADD CONSTRAINT tipo_deficiencia_espectro_altas_habilidades
    FOREIGN KEY (tipo_deficiencia_espectro_altas_habilidades_id)
        REFERENCES tipo_deficiencia_espectro_altas_habilidades(id);

ALTER TABLE professor ADD CONSTRAINT recurso_aluno_para_avaliacao_inep
    FOREIGN KEY (recurso_aluno_para_avaliacao_inep_id)
        REFERENCES recurso_aluno_para_avaliacao_inep(id);