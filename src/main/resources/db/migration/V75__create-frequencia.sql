CREATE SEQUENCE FREQUENCIA_ID_SEQ;

CREATE TABLE IF  NOT EXISTS FREQUENCIA (id INTEGER UNIQUE DEFAULT nextval('FREQUENCIA_ID_SEQ'),
                                     is_presente BOOLEAN,
                                     data_registro DATE,
                                     chamada_id integer,
                                     aluno_turma_id integer,
                                     CONSTRAINT fk_chamada FOREIGN KEY (chamada_id)
                                         REFERENCES chamada (id),
                                     CONSTRAINT fk_alu_turma FOREIGN KEY (aluno_turma_id)
                                         REFERENCES aluno_turma (id)
);

ALTER SEQUENCE FREQUENCIA_ID_SEQ
    OWNED BY FREQUENCIA.ID;