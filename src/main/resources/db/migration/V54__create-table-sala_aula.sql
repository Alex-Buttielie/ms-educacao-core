CREATE SEQUENCE SALA_AULA_ID_SEQ;

CREATE TABLE IF  NOT EXISTS SALA_AULA (id INTEGER UNIQUE DEFAULT nextval('SALA_AULA_ID_SEQ'),
                                       nome varchar (200),
                                       quantidade_vagas INTEGER
);
ALTER SEQUENCE SALA_AULA_ID_SEQ
    OWNED BY SALA_AULA.ID;