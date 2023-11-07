CREATE SEQUENCE DIRETRIZ_ID_SEQ;

CREATE TABLE IF  NOT EXISTS DIRETRIZ (id INTEGER UNIQUE DEFAULT nextval('DIRETRIZ_ID_SEQ'),
                                      nome varchar (200),
                                      calendario_id INTEGER,
                                      serie_id INTEGER,
                                      CONSTRAINT fk_calendario FOREIGN KEY (calendario_id)
                                          REFERENCES CALENDARIO (id)
);

ALTER SEQUENCE DIRETRIZ_ID_SEQ
    OWNED BY DIRETRIZ.ID;
