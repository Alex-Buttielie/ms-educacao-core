CREATE SEQUENCE ENDERECO_UNIDADE_ID_SEQ;

CREATE TABLE IF NOT EXISTS ENDERECO_UNIDADE
(
    id                INTEGER PRIMARY KEY DEFAULT nextval('ENDERECO_UNIDADE_ID_SEQ'),
    cep               varchar,
    fk_city_codigo_mec  INTEGER,
    distrito_id       INTEGER,
    endereco          VARCHAR(100),
    numero            VARCHAR(10),
    complemento       VARCHAR(20),
    bairro            VARCHAR(50),
    ddd               INTEGER,
    CONSTRAINT fk_city FOREIGN KEY (fk_city_codigo_mec)
        REFERENCES CITY (codigo_mec),
    CONSTRAINT fk_distrito FOREIGN KEY (distrito_id)
        REFERENCES DISTRITO (id)
);
ALTER SEQUENCE ENDERECO_UNIDADE_ID_SEQ
    OWNED BY ENDERECO_UNIDADE.id;
