CREATE SEQUENCE MUNICIPIO_ID_SEQ;

CREATE TABLE IF  NOT EXISTS MUNICIPIO (
                                          id INTEGER UNIQUE DEFAULT nextval('MUNICIPIO_ID_SEQ'),
                                          codigo_mec INTEGER PRIMARY KEY  NOT NULL,
                                          nome VARCHAR (100) NOT NULL

);

ALTER SEQUENCE MUNICIPIO_ID_SEQ
    OWNED BY MUNICIPIO.ID;