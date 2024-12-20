CREATE SEQUENCE TRATAMENTO_LIXO_ID_SEQ;

CREATE TABLE IF NOT EXISTS TRATAMENTO_LIXO
(
    id                            INTEGER PRIMARY KEY DEFAULT nextval('TRATAMENTO_LIXO_ID_SEQ'),
    separacao_lixo_residuos       BOOLEAN DEFAULT FALSE,
    reaproveitamento_reutilizacao BOOLEAN DEFAULT FALSE,
    recliclagem                   BOOLEAN DEFAULT FALSE,
    nao_faz_tratamento            BOOLEAN DEFAULT FALSE
);
ALTER SEQUENCE TRATAMENTO_LIXO_ID_SEQ
    OWNED BY TRATAMENTO_LIXO.id;
