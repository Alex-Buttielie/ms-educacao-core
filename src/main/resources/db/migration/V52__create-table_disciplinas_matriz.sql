CREATE SEQUENCE DISCIPLINAS_MATRIZ_ID_SEQ;

CREATE TABLE IF  NOT EXISTS DISCIPLINAS_MATRIZ (id INTEGER UNIQUE DEFAULT nextval('DISCIPLINAS_MATRIZ_ID_SEQ'),
                                                disciplina_id INTEGER,
                                                matriz_curricular_id INTEGER,
                                                carga_horaria_disciplina BIGINT,
                                                CONSTRAINT fk_disciplina FOREIGN KEY (disciplina_id)
                                                    REFERENCES disciplinas (id),
                                                CONSTRAINT fk_matriz_curricular FOREIGN KEY (matriz_curricular_id)
                                                    REFERENCES matriz_curricular (id)
);

ALTER SEQUENCE DISCIPLINAS_MATRIZ_ID_SEQ
    OWNED BY DISCIPLINAS_MATRIZ.ID;
