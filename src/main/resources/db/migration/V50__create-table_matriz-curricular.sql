CREATE SEQUENCE MATRIZ_CURRICULAR_ID_SEQ;

CREATE TABLE IF  NOT EXISTS MATRIZ_CURRICULAR (id INTEGER UNIQUE DEFAULT nextval('MATRIZ_CURRICULAR_ID_SEQ'),
                                               carga_horaria_total INTEGER,
                                               tipo INTEGER,
                                               config_ativ_complementar_id INTEGER,
                                               diretriz_id INTEGER,
                                               CONSTRAINT fk_ativ_complementar FOREIGN KEY (config_ativ_complementar_id)
                                                   REFERENCES CONFIG_ATIV_COMPLEMENTAR (id),
                                               CONSTRAINT fk_diretriz FOREIGN KEY (diretriz_id)
                                                   REFERENCES diretriz (id)
);

ALTER SEQUENCE MATRIZ_CURRICULAR_ID_SEQ
    OWNED BY MATRIZ_CURRICULAR.ID;
