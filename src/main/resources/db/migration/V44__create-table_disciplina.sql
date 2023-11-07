CREATE SEQUENCE DISCIPLINAS_ID_SEQ;

CREATE TABLE IF  NOT EXISTS DISCIPLINAS (
    id INTEGER UNIQUE DEFAULT nextval('DISCIPLINAS_ID_SEQ'),
    codigo_mec INTEGER PRIMARY KEY  NOT NULL,
    nome VARCHAR (100) NOT NULL,
    abreviacao VARCHAR (100),
    area_conhecimento_codigo INTEGER,
    CONSTRAINT fk_area_conhecimento FOREIGN KEY (area_conhecimento_codigo)
    REFERENCES area_conhecimento (codigo)
    );

ALTER SEQUENCE DISCIPLINAS_ID_SEQ
    OWNED BY DISCIPLINAS.ID;
