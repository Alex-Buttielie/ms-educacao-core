CREATE SEQUENCE CONTEUDO_PLANEJADO_MATRIZ_ID_SEQ;

CREATE TABLE IF  NOT EXISTS CONTEUDO_PLANEJADO_MATRIZ (id INTEGER UNIQUE DEFAULT nextval('CONTEUDO_PLANEJADO_MATRIZ_ID_SEQ'),
                                                disciplina_matriz_id INTEGER,
                                                conteudo_planejado_id INTEGER,
                                                CONSTRAINT fk_disciplina_matriz FOREIGN KEY (disciplina_matriz_id)
                                                    REFERENCES disciplinas_matriz (id),
                                                CONSTRAINT fk_conteudo_planejado FOREIGN KEY (conteudo_planejado_id)
                                                    REFERENCES CONTEUDO_PLANEJADO (id)
);

ALTER SEQUENCE CONTEUDO_PLANEJADO_MATRIZ_ID_SEQ
    OWNED BY CONTEUDO_PLANEJADO_MATRIZ.ID;