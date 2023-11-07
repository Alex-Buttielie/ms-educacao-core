CREATE SEQUENCE CALENDARIO_ID_SEQ;

CREATE TABLE IF  NOT EXISTS CALENDARIO (id INTEGER UNIQUE DEFAULT nextval('CALENDARIO_ID_SEQ'),
                                        nome varchar (200),
                                        ano_id INTEGER,
                                        CONSTRAINT fk_ano FOREIGN KEY (ano_id)
                                            REFERENCES ANO (id)
);

ALTER SEQUENCE CALENDARIO_ID_SEQ
    OWNED BY CALENDARIO.ID;
