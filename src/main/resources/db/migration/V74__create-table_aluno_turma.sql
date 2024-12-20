CREATE SEQUENCE ALUNO_TURMA_MATRICULA_SEQ;

CREATE TABLE IF NOT EXISTS ALUNO_TURMA
(
    id            text PRIMARY KEY,
    matricula_code INTEGER DEFAULT nextval('ALUNO_TURMA_MATRICULA_SEQ'),
    turma_codigo_turma      text,
    situacao      INTEGER,
    data_alocacao date,
    data_saida    date,
    CONSTRAINT fk_matricula FOREIGN KEY (matricula_code)
        REFERENCES matricula (code),
    CONSTRAINT fk_turma FOREIGN KEY (turma_codigo_turma)
        REFERENCES turma (codigo_turma)
);
ALTER SEQUENCE ALUNO_TURMA_MATRICULA_SEQ
    OWNED BY ALUNO_TURMA.matricula_code;
