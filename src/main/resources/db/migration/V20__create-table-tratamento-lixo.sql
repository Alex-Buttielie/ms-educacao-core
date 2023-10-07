CREATE SEQUENCE TRATAMENTO_LIXO_ID_SEQ;

CREATE TABLE IF NOT EXISTS TRATAMENTO_LIXO   (id INTEGER PRIMARY KEY DEFAULT nextval('TRATAMENTO_LIXO_ID_SEQ'),
                                              separacao_lixo_residuos BOOLEAN,
                                              reaproveitamento_reutilizacao BOOLEAN,
                                              recliclagem BOOLEAN,
                                              nao_faz_tratamento BOOLEAN
);
ALTER SEQUENCE TRATAMENTO_LIXO_ID_SEQ
    OWNED BY TRATAMENTO_LIXO.id;
