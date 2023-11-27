CREATE SEQUENCE CHAMADA_ID_SEQ;

CREATE TABLE IF NOT EXISTS CHAMADA
(
    id                    INTEGER UNIQUE DEFAULT nextval('CHAMADA_ID_SEQ'),
    conteudo_planejado_id INTEGER,
    nome                  varchar(100),
    data_chamada          date,
    CONSTRAINT fk_conteudo_planejado FOREIGN KEY (conteudo_planejado_id)
        REFERENCES CONTEUDO_PLANEJADO (id)
);

ALTER SEQUENCE CHAMADA_ID_SEQ
    OWNED BY CHAMADA.ID;