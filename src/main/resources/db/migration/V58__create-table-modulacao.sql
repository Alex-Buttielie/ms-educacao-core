CREATE SEQUENCE MODULACAO_ID_SEQ;

CREATE TABLE IF  NOT EXISTS MODULACAO (id INTEGER UNIQUE DEFAULT nextval('MODULACAO_ID_SEQ'),
                                       fk_id_turma INTEGER,
                                       fk_id_professor INTEGER,
                                       fk_id_disciplina_matriz INTEGER,
                                       data_fim DATE,
                                       data_inicio DATE,
                                       carga_horaria BIGINT,
                                       CONSTRAINT fk_turma FOREIGN KEY (fk_id_turma)
                                           REFERENCES turma (id),
                                       CONSTRAINT fk_professor FOREIGN KEY (fk_id_professor)
                                           REFERENCES professor (id),
                                       CONSTRAINT fk_disciplina_matriz FOREIGN KEY (fk_id_disciplina_matriz)
                                           REFERENCES disciplinas_matriz (id)
);

ALTER SEQUENCE MODULACAO_ID_SEQ
    OWNED BY MODULACAO.ID;
