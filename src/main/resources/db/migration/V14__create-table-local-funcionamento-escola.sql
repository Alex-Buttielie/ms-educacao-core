CREATE SEQUENCE LOCAL_FUNCIONAMENTO_ESCOLA_ID_SEQ;

CREATE TABLE IF NOT EXISTS LOCAL_FUNCIONAMENTO_ESCOLA
(
    id                                            INTEGER PRIMARY KEY DEFAULT nextval('LOCAL_FUNCIONAMENTO_ESCOLA_ID_SEQ'),
    predio_escolar                                BOOLEAN DEFAULT FALSE,
    salas_em_outra_escola                         BOOLEAN DEFAULT FALSE,
    galpao_racho_paiol_barracao                   BOOLEAN DEFAULT FALSE,
    unidade_atendimento_socioeducativa            BOOLEAN DEFAULT FALSE,
    unidade_prisional                             BOOLEAN DEFAULT FALSE,
    outros                                        BOOLEAN DEFAULT FALSE,
    formas_ocupacao_predio                        INTEGER,
    predio_escolar_compartilhado_com_outra_escola BOOLEAN DEFAULT FALSE
);
ALTER SEQUENCE LOCAL_FUNCIONAMENTO_ESCOLA_ID_SEQ
    OWNED BY LOCAL_FUNCIONAMENTO_ESCOLA.id;
