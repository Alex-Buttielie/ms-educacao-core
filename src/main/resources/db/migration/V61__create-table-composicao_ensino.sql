CREATE SEQUENCE COMPOSICAO_ENSINO_ID_SEQ;

CREATE TABLE IF  NOT EXISTS COMPOSICAO_ENSINO (id INTEGER UNIQUE DEFAULT nextval('COMPOSICAO_ENSINO_ID_SEQ'),
                                               nome varchar (70),
                                               fk_id_criterio INTEGER

);

ALTER SEQUENCE COMPOSICAO_ENSINO_ID_SEQ
    OWNED BY COMPOSICAO_ENSINO.ID;


