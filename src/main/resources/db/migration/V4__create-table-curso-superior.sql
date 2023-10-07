CREATE SEQUENCE CURSO_SUPERIOR_ID_SEQ;

CREATE TABLE IF  NOT EXISTS CURSO_SUPERIOR (
                                               id INTEGER PRIMARY KEY DEFAULT nextval('CURSO_SUPERIOR_ID_SEQ'),
                                               codigo INTEGER UNIQUE  NOT NULL,
                                               nome VARCHAR (100) NOT NULL

);

ALTER SEQUENCE CURSO_SUPERIOR_ID_SEQ
    OWNED BY CURSO_SUPERIOR.ID;