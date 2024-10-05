CREATE SEQUENCE ACESSO_INTERNET_ID_SEQ;

CREATE TABLE IF NOT EXISTS ACESSO_INTERNET
(
    id                             INTEGER PRIMARY KEY DEFAULT nextval('ACESSO_INTERNET_ID_SEQ'),
    para_uso_administrativo        BOOLEAN DEFAULT FALSE,
    para_uso_processo_aprendizagem BOOLEAN DEFAULT FALSE,
    para_uso_alunos                BOOLEAN DEFAULT FALSE,
    para_uso_comunidade            BOOLEAN DEFAULT FALSE,
    nao_possui_acesso_internet     BOOLEAN DEFAULT FALSE
);
ALTER SEQUENCE ACESSO_INTERNET_ID_SEQ
    OWNED BY ACESSO_INTERNET.id;
