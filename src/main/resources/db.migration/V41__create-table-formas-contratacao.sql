CREATE SEQUENCE FORMAS_CONTRATACAO_ID_SEQ;

CREATE TABLE IF NOT EXISTS FORMAS_CONTRATACAO (id INTEGER PRIMARY KEY DEFAULT nextval('FORMAS_CONTRATACAO_ID_SEQ'),
                                               termo_colaboracao_lei BOOLEAN,
                                               termo_fomento BOOLEAN,
                                               acordo_cooperacao BOOLEAN,
                                               contrato_prestacao_servico BOOLEAN,
                                               termo_cooperacao_tecnica_financeira BOOLEAN,
                                               contrato_consorcio_publico_convenio_cooperacao BOOLEAN
);
ALTER SEQUENCE FORMAS_CONTRATACAO_ID_SEQ
    OWNED BY FORMAS_CONTRATACAO.id;
