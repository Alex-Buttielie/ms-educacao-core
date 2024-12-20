CREATE SEQUENCE DESTINACAO_LIXO_ID_SEQ;

CREATE TABLE IF NOT EXISTS DESTINACAO_LIXO
(
    id                                       INTEGER PRIMARY KEY DEFAULT nextval('DESTINACAO_LIXO_ID_SEQ'),
    servico_coleta                           BOOLEAN DEFAULT FALSE,
    queima                                   BOOLEAN DEFAULT FALSE,
    enterra                                  BOOLEAN DEFAULT FALSE,
    leva_destinacao_licenciada_poder_publico BOOLEAN DEFAULT FALSE,
    descarta_em_outra_area                   BOOLEAN DEFAULT FALSE
);
ALTER SEQUENCE DESTINACAO_LIXO_ID_SEQ
    OWNED BY DESTINACAO_LIXO.id;
