CREATE SEQUENCE ALUNO_TURMA_ID_SEQ;

CREATE TABLE IF  NOT EXISTS ALUNO_TURMA (id INTEGER UNIQUE DEFAULT nextval('ALUNO_TURMA_ID_SEQ'),
                                     fk_id_matricula INTEGER,
                                     fk_id_turma INTEGER,
                                     situacao INTEGER,
                                     data_alocacao date,
                                     data_saida date,
                                     CONSTRAINT fk_matricula FOREIGN KEY (fk_id_matricula)
                                         REFERENCES matricula (id),
                                     CONSTRAINT fk_turma FOREIGN KEY (fk_id_turma)
                                         REFERENCES turma (id)
);

ALTER SEQUENCE ALUNO_TURMA_ID_SEQ
    OWNED BY ALUNO_TURMA.ID;