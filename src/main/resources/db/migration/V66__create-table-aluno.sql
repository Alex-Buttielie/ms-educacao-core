CREATE SEQUENCE ALUNO_ID_SEQ;

CREATE TABLE IF  NOT EXISTS ALUNO (id INTEGER UNIQUE DEFAULT nextval('ALUNO_ID_SEQ'),
                                   fk_id_pessoa INTEGER,
                                   CONSTRAINT fk_pessoa FOREIGN KEY (fk_id_pessoa)
                                       REFERENCES pessoa (id)
);

ALTER SEQUENCE ALUNO_ID_SEQ
    OWNED BY ALUNO.ID;
