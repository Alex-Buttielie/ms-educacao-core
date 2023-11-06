CREATE SEQUENCE MATRICULA_ID_SEQ;

CREATE TABLE IF  NOT EXISTS MATRICULA (id INTEGER UNIQUE DEFAULT nextval('MATRICULA_ID_SEQ'),
                                       fk_id_unidade_ensino INTEGER,
                                       fk_id_aluno INTEGER,
                                       data_matricula DATE,
                                       situacao INTEGER,
                                       matricula varchar (20),
                                       is_ativa BOOLEAN,
                                       data_saida DATE,
                                       CONSTRAINT fk_unidade_ensino FOREIGN KEY (fk_id_unidade_ensino)
                                           REFERENCES unidade_ensino (id),
                                       CONSTRAINT fk_aluno FOREIGN KEY (fk_id_aluno)
                                           REFERENCES aluno (id)
);

ALTER SEQUENCE MATRICULA_ID_SEQ
    OWNED BY MATRICULA.ID;