CREATE SEQUENCE MODULACAO_ID_SEQ;

CREATE TABLE IF  NOT EXISTS MODULACAO (id INTEGER UNIQUE DEFAULT nextval('MODULACAO_ID_SEQ'),
                                       turma_id INTEGER,
                                       professor_id INTEGER,
                                       disciplina_matriz_id INTEGER,
                                       data_fim DATE,
                                       data_inicio DATE,
                                       carga_horaria BIGINT,
                                       CONSTRAINT fk_turma FOREIGN KEY (turma_id)
                                           REFERENCES turma (id),
                                       CONSTRAINT fk_professor FOREIGN KEY (professor_id)
                                           REFERENCES professor (id),
                                       CONSTRAINT fk_disciplina_matriz FOREIGN KEY (disciplina_matriz_id)
                                           REFERENCES disciplinas_matriz (id)
);

ALTER SEQUENCE MODULACAO_ID_SEQ
    OWNED BY MODULACAO.ID;
