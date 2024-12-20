CREATE SEQUENCE IDIOMA_ENSINO_ID_SEQ;

CREATE TABLE IF NOT EXISTS IDIOMA_ENSINO
(
    id                              INTEGER PRIMARY KEY DEFAULT nextval('IDIOMA_ENSINO_ID_SEQ'),
    lingua_indigena                 BOOLEAN DEFAULT FALSE,
    lingua_portuguesa               BOOLEAN DEFAULT FALSE,
    codigo_lingua_indigena1_id      INTEGER,
    codigo_lingua_indigena2_id      INTEGER,
    codigo_lingua_indigena3_id      INTEGER,
    realiza_exames_avaliacao_alunos BOOLEAN DEFAULT FALSE
);
ALTER SEQUENCE IDIOMA_ENSINO_ID_SEQ
    OWNED BY IDIOMA_ENSINO.id;
