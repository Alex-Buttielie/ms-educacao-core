CREATE SEQUENCE MATRIZ_CURRICULAR_ID_SEQ;

CREATE TABLE IF  NOT EXISTS MATRIZ_CURRICULAR (id INTEGER UNIQUE DEFAULT nextval('MATRIZ_CURRICULAR_ID_SEQ'),
                                               carga_horaria_total INTEGER,
                                               tipo INTEGER,
                                               fk_id_ativ_complementar INTEGER,
                                               fk_id_diretriz INTEGER,
                                               CONSTRAINT fk_ativ_complementar FOREIGN KEY (fk_id_ativ_complementar)
                                                   REFERENCES CONFIG_ATIV_COMPLEMENTAR (id),
                                               CONSTRAINT fk_diretriz FOREIGN KEY (fk_id_diretriz)
                                                   REFERENCES diretriz (id)
);

ALTER SEQUENCE MATRIZ_CURRICULAR_ID_SEQ
    OWNED BY MATRIZ_CURRICULAR.ID;
