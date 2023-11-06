CREATE SEQUENCE DIAS_LETIVOS_ID_SEQ;

CREATE TABLE IF  NOT EXISTS DIAS_LETIVOS (id INTEGER UNIQUE DEFAULT nextval('DIAS_LETIVOS_ID_SEQ'),
                                          dia INTEGER,
                                          fk_id_calendario INTEGER,
                                          fk_id_mes INTEGER,
                                          CONSTRAINT fk_id_calendario FOREIGN KEY (fk_id_calendario)
                                              REFERENCES calendario (id)
);
ALTER SEQUENCE DIAS_LETIVOS_ID_SEQ
    OWNED BY DIAS_LETIVOS.ID;
