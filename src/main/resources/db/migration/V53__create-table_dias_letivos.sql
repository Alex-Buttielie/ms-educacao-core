CREATE SEQUENCE DIAS_LETIVOS_ID_SEQ;

CREATE TABLE IF  NOT EXISTS DIAS_LETIVOS (id INTEGER UNIQUE DEFAULT nextval('DIAS_LETIVOS_ID_SEQ'),
                                          dia INTEGER,
                                          calendario_id INTEGER,
                                          mes_id INTEGER,
                                          CONSTRAINT fk_calendario FOREIGN KEY (calendario_id)
                                              REFERENCES calendario (id)
);
ALTER SEQUENCE DIAS_LETIVOS_ID_SEQ
    OWNED BY DIAS_LETIVOS.ID;
