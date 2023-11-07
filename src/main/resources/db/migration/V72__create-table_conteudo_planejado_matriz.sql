CREATE SEQUENCE CONTEUDO_PLANEJADO_MATRIZ_ID_SEQ;

CREATE TABLE IF  NOT EXISTS CONTEUDO_PLANEJADO_MATRIZ (id INTEGER UNIQUE DEFAULT nextval('CONTEUDO_PLANEJADO_MATRIZ_ID_SEQ'),
                                                fk_id_disciplina_matriz INTEGER,
                                                fk_id_conteudo_planejado INTEGER,
                                                CONSTRAINT fk_id_disciplina_matriz FOREIGN KEY (fk_id_disciplina_matriz)
                                                    REFERENCES disciplinas_matriz (id),
                                                CONSTRAINT fk_id_conteudo_planejado FOREIGN KEY (fk_id_conteudo_planejado)
                                                    REFERENCES CONTEUDO_PLANEJADO (id)
);

ALTER SEQUENCE CONTEUDO_PLANEJADO_MATRIZ_ID_SEQ
    OWNED BY CONTEUDO_PLANEJADO_MATRIZ.ID;