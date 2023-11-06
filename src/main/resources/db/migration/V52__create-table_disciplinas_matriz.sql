CREATE SEQUENCE DISCIPLINAS_MATRIZ_ID_SEQ;

CREATE TABLE IF  NOT EXISTS DISCIPLINAS_MATRIZ (id INTEGER UNIQUE DEFAULT nextval('DISCIPLINAS_MATRIZ_ID_SEQ'),
                                                fk_id_disciplina INTEGER,
                                                fk_id_matriz_curricular INTEGER,
                                                carga_horaria_disciplina BIGINT,
                                                CONSTRAINT fk_disciplina FOREIGN KEY (fk_id_disciplina)
                                                    REFERENCES disciplinas (id),
                                                CONSTRAINT fk_matriz_curricular FOREIGN KEY (fk_id_matriz_curricular)
                                                    REFERENCES matriz_curricular (id)
);

ALTER SEQUENCE DISCIPLINAS_MATRIZ_ID_SEQ
    OWNED BY DISCIPLINAS_MATRIZ.ID;
