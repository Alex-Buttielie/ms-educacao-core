CREATE SEQUENCE CHAMADA_ID_SEQ;

CREATE TABLE IF  NOT EXISTS CHAMADA (id INTEGER UNIQUE DEFAULT nextval('CHAMADA_ID_SEQ'),
                                     fk_id_conteudo_planejado INTEGER,
                                     nome varchar(100),
                                     data date,
                                     CONSTRAINT fk_id_conteudo_planejado FOREIGN KEY (fk_id_conteudo_planejado)
                                         REFERENCES CONTEUDO_PLANEJADO (id)
);

ALTER SEQUENCE CHAMADA_ID_SEQ
    OWNED BY CHAMADA.ID;