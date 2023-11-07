CREATE SEQUENCE TURMA_ID_SEQ;

CREATE TABLE IF  NOT EXISTS TURMA (id INTEGER UNIQUE DEFAULT nextval('TURMA_ID_SEQ'),
                                   nome varchar (100),
                                   diretriz_id INTEGER,
                                   turno_id INTEGER,
                                   tipo INTEGER,
                                   codigo_inep INTEGER,
                                   data_criacao DATE,
                                   sala_aula_id INTEGER,
                                   CONSTRAINT fk_diretriz FOREIGN KEY (diretriz_id)
                                       REFERENCES diretriz (id),
                                   CONSTRAINT fk_sala_aula FOREIGN KEY (sala_aula_id)
                                       REFERENCES sala_aula (id),
                                   CONSTRAINT fk_turno FOREIGN KEY (turno_id)
                                       REFERENCES turno (id)
);

ALTER SEQUENCE TURMA_ID_SEQ
    OWNED BY TURMA.ID;
