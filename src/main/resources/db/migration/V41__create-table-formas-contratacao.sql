CREATE SEQUENCE FORMAS_CONTRATACAO_ID_SEQ;

CREATE TABLE IF NOT EXISTS FORMAS_CONTRATACAO
(
    id                                             INTEGER PRIMARY KEY DEFAULT nextval('FORMAS_CONTRATACAO_ID_SEQ'),
    termo_colaboracao_lei                          BOOLEAN DEFAULT FALSE,
    termo_fomento                                  BOOLEAN DEFAULT FALSE,
    acordo_cooperacao                              BOOLEAN DEFAULT FALSE,
    contrato_prestacao_servico                     BOOLEAN DEFAULT FALSE,
    termo_cooperacao_tecnica_financeira            BOOLEAN DEFAULT FALSE,
    contrato_consorcio_publico_convenio_cooperacao BOOLEAN DEFAULT FALSE
);
ALTER SEQUENCE FORMAS_CONTRATACAO_ID_SEQ
    OWNED BY FORMAS_CONTRATACAO.id;
