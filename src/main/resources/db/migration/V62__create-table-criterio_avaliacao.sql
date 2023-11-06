CREATE SEQUENCE CRITERIO_AVALIACAO_ID_SEQ;

CREATE TABLE IF  NOT EXISTS CRITERIO_AVALIACAO (id INTEGER UNIQUE DEFAULT nextval('CRITERIO_AVALIACAO_ID_SEQ'),
                                                is_avaliado_semestral BOOLEAN,
                                                nome varchar (50)

);

ALTER SEQUENCE CRITERIO_AVALIACAO_ID_SEQ
    OWNED BY CRITERIO_AVALIACAO.ID;


