CREATE SEQUENCE ANO_ID_SEQ;

CREATE TABLE IF  NOT EXISTS ANO (id INTEGER UNIQUE DEFAULT nextval('ANO_ID_SEQ'),
                                 dt_fechamento_ano DATE,
                                 dt_fechamento_1_semestre DATE,
                                 dt_fechamento_2_semestre DATE
);

ALTER SEQUENCE ANO_ID_SEQ
    OWNED BY ANO.ID;
