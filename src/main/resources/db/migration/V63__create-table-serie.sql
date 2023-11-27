CREATE SEQUENCE SERIE_ID_SEQ;

CREATE TABLE IF NOT EXISTS SERIE
(
    id              INTEGER UNIQUE DEFAULT nextval('SERIE_ID_SEQ'),
    nome            varchar(50),
    tipo_reprovacao INTEGER, -- Faltas, Notas, Faltas/Notas
    composicao_id   INTEGER,
    CONSTRAINT fk_composicao FOREIGN KEY (composicao_id)
        REFERENCES composicao_ensino (id)

);

ALTER SEQUENCE SERIE_ID_SEQ
    OWNED BY SERIE.ID;


