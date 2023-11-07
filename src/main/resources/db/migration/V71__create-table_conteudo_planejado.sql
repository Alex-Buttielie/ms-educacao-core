CREATE SEQUENCE CONTEUDO_PLANEJADO_ID_SEQ;

CREATE TABLE IF  NOT EXISTS CONTEUDO_PLANEJADO (id INTEGER UNIQUE DEFAULT nextval('CONTEUDO_PLANEJADO_ID_SEQ'),
                                                fk_id_dia_letivo INTEGER,
                                                CONSTRAINT fk_dia_letivo FOREIGN KEY (fk_id_dia_letivo)
                                                    REFERENCES dias_letivos (id)
);

ALTER SEQUENCE CONTEUDO_PLANEJADO_ID_SEQ
    OWNED BY CONTEUDO_PLANEJADO.ID;