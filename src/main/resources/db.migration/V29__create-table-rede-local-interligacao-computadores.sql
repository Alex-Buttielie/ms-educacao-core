CREATE SEQUENCE REDE_LOCAL_INTERLIGACAO_COMPUTADORES_ID_SEQ;

CREATE TABLE IF NOT EXISTS REDE_LOCAL_INTERLIGACAO_COMPUTADORES   (id INTEGER PRIMARY KEY DEFAULT nextval('REDE_LOCAL_INTERLIGACAO_COMPUTADORES_ID_SEQ'),
                                                                   cabo BOOLEAN,
                                                                   wireless BOOLEAN,
                                                                   nao_ha_rede_local_interligacao BOOLEAN
);
ALTER SEQUENCE REDE_LOCAL_INTERLIGACAO_COMPUTADORES_ID_SEQ
    OWNED BY REDE_LOCAL_INTERLIGACAO_COMPUTADORES.id;
