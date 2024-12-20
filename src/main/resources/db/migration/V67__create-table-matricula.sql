CREATE SEQUENCE MATRICULA_CODE_SEQ;

CREATE TABLE IF NOT EXISTS MATRICULA
(
    id                TEXT,
    unidade_ensino_codigo_inep INTEGER,
    data_matricula    DATE,
    situacao          INTEGER,
    code              INTEGER PRIMARY KEY DEFAULT nextval('MATRICULA_CODE_SEQ'),
    is_ativa          BOOLEAN,
    data_saida        DATE,
    CONSTRAINT fk_unidade_ensino FOREIGN KEY (unidade_ensino_codigo_inep)
        REFERENCES unidade_ensino (codigo_inep)
);


ALTER SEQUENCE MATRICULA_CODE_SEQ
    OWNED BY MATRICULA.CODE;