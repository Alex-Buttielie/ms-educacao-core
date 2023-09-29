CREATE SEQUENCE AREA_CONHECIMENTO_ID_SEQ;

CREATE TABLE IF  NOT EXISTS AREA_CONHECIMENTO (
                                                  id INTEGER DEFAULT nextval('AREA_CONHECIMENTO_ID_SEQ'),
                                                  codigo INTEGER PRIMARY KEY  NOT NULL,
                                                  nome VARCHAR (100) NOT NULL

);

ALTER SEQUENCE AREA_CONHECIMENTO_ID_SEQ
    OWNED BY AREA_CONHECIMENTO.ID;