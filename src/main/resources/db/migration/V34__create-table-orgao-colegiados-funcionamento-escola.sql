CREATE SEQUENCE ORGAOS_COLEGIADOS_FUNCIONAMENTO_ESCOLA_ID_SEQ;

CREATE TABLE IF NOT EXISTS ORGAOS_COLEGIADOS_FUNCIONAMENTO_ESCOLA
(
    id                                    INTEGER PRIMARY KEY DEFAULT nextval('ORGAOS_COLEGIADOS_FUNCIONAMENTO_ESCOLA_ID_SEQ'),
    associacao_pais                       BOOLEAN DEFAULT FALSE,
    associacao_pais_mestres               BOOLEAN DEFAULT FALSE,
    conselho_escolar                      BOOLEAN DEFAULT FALSE,
    gremio_estudantil                     BOOLEAN DEFAULT FALSE,
    outros                                BOOLEAN DEFAULT FALSE,
    is_orgaos_colegiados_em_funcionamento BOOLEAN DEFAULT FALSE,
    projeto_politico_lei_ldb_12           INTEGER
);
ALTER SEQUENCE ORGAOS_COLEGIADOS_FUNCIONAMENTO_ESCOLA_ID_SEQ
    OWNED BY ORGAOS_COLEGIADOS_FUNCIONAMENTO_ESCOLA.id;
