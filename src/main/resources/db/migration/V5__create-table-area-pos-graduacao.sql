CREATE SEQUENCE AREA_POS_GRADUACAO_ID_SEQ;

CREATE TABLE IF  NOT EXISTS AREA_POS_GRADUACAO (
                                                   id INTEGER UNIQUE DEFAULT nextval('AREA_POS_GRADUACAO_ID_SEQ'),
                                                   codigo INTEGER PRIMARY KEY  NOT NULL,
                                                   nome VARCHAR (100) NOT NULL,
                                                   ano_conclusao INT8

);

ALTER SEQUENCE AREA_POS_GRADUACAO_ID_SEQ
    OWNED BY AREA_POS_GRADUACAO.ID;
