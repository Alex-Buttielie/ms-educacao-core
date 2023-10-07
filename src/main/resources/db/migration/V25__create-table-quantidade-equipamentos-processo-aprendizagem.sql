CREATE SEQUENCE QUANTIDADE_EQUIPAMENTOS_PROCESSO_APRENDIZAGEM_ID_SEQ;

CREATE TABLE IF NOT EXISTS QUANTIDADE_EQUIPAMENTOS_PROCESSO_APRENDIZAGEM   (id INTEGER PRIMARY KEY DEFAULT nextval('QUANTIDADE_EQUIPAMENTOS_PROCESSO_APRENDIZAGEM_ID_SEQ'),
                                                                            aparelho_dev_bluray INTEGER,
                                                                            aparelho_som INTEGER,
                                                                            aparelho_televisao INTEGER,
                                                                            lousa_digital INTEGER,
                                                                            projetor_multimidia_data_show INTEGER
);
ALTER SEQUENCE QUANTIDADE_EQUIPAMENTOS_PROCESSO_APRENDIZAGEM_ID_SEQ
    OWNED BY QUANTIDADE_EQUIPAMENTOS_PROCESSO_APRENDIZAGEM.id;
