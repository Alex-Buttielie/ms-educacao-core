CREATE SEQUENCE TURNO_ID_SEQ;

CREATE TABLE IF NOT EXISTS TURNO
(
    id   INTEGER UNIQUE DEFAULT nextval('TURNO_ID_SEQ'),
    nome varchar(50)
);

ALTER SEQUENCE TURNO_ID_SEQ
    OWNED BY TURNO.ID;
