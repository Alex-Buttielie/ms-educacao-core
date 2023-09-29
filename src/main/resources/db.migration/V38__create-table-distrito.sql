CREATE SEQUENCE DISTRITO_ID_SEQ;

CREATE TABLE IF  NOT EXISTS DISTRITO (
                                          id INTEGER PRIMARY KEY DEFAULT nextval('DISTRITO_ID_SEQ'),
                                          codigo_mec INTEGER   NOT NULL,
                                          nome VARCHAR (100) NOT NULL

);

ALTER SEQUENCE DISTRITO_ID_SEQ
    OWNED BY DISTRITO.ID;