CREATE SEQUENCE EQUIPAMENTOS_USADOS_ALUNOS_ACESSO_INTERNET_ID_SEQ;

CREATE TABLE IF NOT EXISTS EQUIPAMENTOS_USADOS_ALUNOS_ACESSO_INTERNET   (id INTEGER PRIMARY KEY DEFAULT nextval('EQUIPAMENTOS_USADOS_ALUNOS_ACESSO_INTERNET_ID_SEQ'),
                                                                         computadores_tablets_biblioteca_unidade BOOLEAN,
                                                                         dispositivos_pessoais_computadores_portateis BOOLEAN,
                                                                         internet_banda_larga BOOLEAN
);
ALTER SEQUENCE EQUIPAMENTOS_USADOS_ALUNOS_ACESSO_INTERNET_ID_SEQ
    OWNED BY EQUIPAMENTOS_USADOS_ALUNOS_ACESSO_INTERNET.id;
