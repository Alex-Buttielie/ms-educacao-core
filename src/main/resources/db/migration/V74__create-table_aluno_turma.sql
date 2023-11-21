CREATE SEQUENCE ALUNO_TURMA_ID_SEQ;

CREATE TABLE IF NOT EXISTS ALUNO_TURMA
(
    id            INTEGER UNIQUE DEFAULT nextval('ALUNO_TURMA_ID_SEQ'),
    matricula_id  INTEGER,
    turma_id      INTEGER,
    situacao      INTEGER,
    data_alocacao date,
    data_saida    date,
    CONSTRAINT fk_matricula FOREIGN KEY (matricula_id)
        REFERENCES matricula (id),
    CONSTRAINT fk_turma FOREIGN KEY (turma_id)
        REFERENCES turma (id)
);

ALTER SEQUENCE ALUNO_TURMA_ID_SEQ
    OWNED BY ALUNO_TURMA.ID;