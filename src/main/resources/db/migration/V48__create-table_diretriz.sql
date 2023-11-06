CREATE SEQUENCE DIRETRIZ_ID_SEQ;

CREATE TABLE IF  NOT EXISTS DIRETRIZ (id INTEGER UNIQUE DEFAULT nextval('DIRETRIZ_ID_SEQ'),
                                      nome varchar (200),
                                      fk_id_calendario INTEGER,
                                      fk_id_serie INTEGER,
                                      CONSTRAINT fk_calendario FOREIGN KEY (fk_id_calendario)
                                          REFERENCES CALENDARIO (id)
);

ALTER SEQUENCE DIRETRIZ_ID_SEQ
    OWNED BY DIRETRIZ.ID;
