CREATE SEQUENCE MATRICULA_ID_SEQ;

CREATE TABLE IF NOT EXISTS MATRICULA
(
    id                INTEGER UNIQUE DEFAULT nextval('MATRICULA_ID_SEQ'),
    unidade_ensino_id INTEGER,
    aluno_id          INTEGER,
    data_matricula    DATE,
    situacao          INTEGER,
    matricula         varchar(20),
    is_ativa          BOOLEAN,
    data_saida        DATE,
    CONSTRAINT fk_unidade_ensino FOREIGN KEY (unidade_ensino_id)
        REFERENCES unidade_ensino (id),
    CONSTRAINT fk_aluno FOREIGN KEY (aluno_id)
        REFERENCES aluno (id)
);

ALTER SEQUENCE MATRICULA_ID_SEQ
    OWNED BY MATRICULA.ID;