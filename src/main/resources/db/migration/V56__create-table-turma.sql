CREATE SEQUENCE TURMA_ID_SEQ;

CREATE TABLE IF  NOT EXISTS TURMA (id INTEGER UNIQUE DEFAULT nextval('TURMA_ID_SEQ'),
                                   nome varchar (100),
                                   fk_id_diretriz INTEGER,
                                   fk_id_turno INTEGER,
                                   tipo INTEGER,
                                   codigo_inep INTEGER,
                                   data_criacao DATE,
                                   fk_id_sala_aula INTEGER,
                                   CONSTRAINT fk_diretriz FOREIGN KEY (fk_id_diretriz)
                                       REFERENCES diretriz (id),
                                   CONSTRAINT fk_sala_aula FOREIGN KEY (fk_id_sala_aula)
                                       REFERENCES sala_aula (id),
                                   CONSTRAINT fk_turno FOREIGN KEY (fk_id_turno)
                                       REFERENCES turno (id)
);

ALTER SEQUENCE TURMA_ID_SEQ
    OWNED BY TURMA.ID;
