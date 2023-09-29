CREATE SEQUENCE LOCAL_FUNCIONAMENTO_ESCOLA_ID_SEQ;

CREATE TABLE IF NOT EXISTS LOCAL_FUNCIONAMENTO_ESCOLA   (id INTEGER PRIMARY KEY DEFAULT nextval('LOCAL_FUNCIONAMENTO_ESCOLA_ID_SEQ'),
                                                         predio_escolar BOOLEAN,
                                                         salas_em_outra_escola BOOLEAN,
                                                         galpao_racho_paiol_barracao BOOLEAN,
                                                         unidade_atendimento_socioeducativa BOOLEAN,
                                                         unidade_prisional BOOLEAN,
                                                         outros BOOLEAN,
                                                         formas_ocupacao_predio INTEGER,
                                                         predio_escolar_compartilhado_com_outra_escola BOOLEAN
);
ALTER SEQUENCE LOCAL_FUNCIONAMENTO_ESCOLA_ID_SEQ
    OWNED BY LOCAL_FUNCIONAMENTO_ESCOLA.id;
