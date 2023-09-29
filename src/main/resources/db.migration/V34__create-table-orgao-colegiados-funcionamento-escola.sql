CREATE SEQUENCE ORGAOS_COLEGIADOS_FUNCIONAMENTO_ESCOLA_ID_SEQ;

CREATE TABLE IF NOT EXISTS ORGAOS_COLEGIADOS_FUNCIONAMENTO_ESCOLA   (id INTEGER PRIMARY KEY DEFAULT nextval('ORGAOS_COLEGIADOS_FUNCIONAMENTO_ESCOLA_ID_SEQ'),
                                                                     associacao_pais BOOLEAN,
                                                                     associacao_pais_mestres BOOLEAN,
                                                                     conselho_escolar BOOLEAN,
                                                                     gremio_estudantil BOOLEAN,
                                                                     outros BOOLEAN,
                                                                     is_orgaos_colegiados_em_funcionamento BOOLEAN,
                                                                     projeto_politico_lei_ldb_12 INTEGER
);
ALTER SEQUENCE ORGAOS_COLEGIADOS_FUNCIONAMENTO_ESCOLA_ID_SEQ
    OWNED BY ORGAOS_COLEGIADOS_FUNCIONAMENTO_ESCOLA.id;
