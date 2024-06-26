CREATE SEQUENCE TIPO_ATIVIDADE_COMPLEMENTAR_ID_SEQ;

CREATE TABLE IF NOT EXISTS TIPO_ATIVIDADE_COMPLEMENTAR
(
    ID INTEGER UNIQUE DEFAULT nextval('TIPO_ATIVIDADE_COMPLEMENTAR_ID_SEQ'),
    CODIGO1  INTEGER,
    CODIGO2  INTEGER,
    CODIGO3  INTEGER,
    CODIGO4  INTEGER,
    CODIGO5  INTEGER,
    CODIGO6  INTEGER,
    LOCAL_FUNC_DIFERENCIADO  INTEGER,
    MODALIDADE  INTEGER,
    ETAPA  INTEGER,
    CODIGO_CURSO  INTEGER
);

ALTER SEQUENCE TIPO_ATIVIDADE_COMPLEMENTAR_ID_SEQ
    OWNED BY TIPO_ATIVIDADE_COMPLEMENTAR.ID;