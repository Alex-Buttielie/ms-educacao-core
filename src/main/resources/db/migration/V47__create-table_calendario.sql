CREATE SEQUENCE CALENDARIO_ID_SEQ;

CREATE TABLE IF  NOT EXISTS CALENDARIO (id INTEGER UNIQUE DEFAULT nextval('CALENDARIO_ID_SEQ'),
                                        nome varchar (200),
                                        fk_id_ano INTEGER,
                                        CONSTRAINT fk_ano FOREIGN KEY (fk_id_ano)
                                            REFERENCES ANO (id)
);

ALTER SEQUENCE CALENDARIO_ID_SEQ
    OWNED BY CALENDARIO.ID;
