CREATE SEQUENCE FONTE_ENERGIA_ELETRICA_ID_SEQ;

CREATE TABLE IF NOT EXISTS FONTE_ENERGIA_ELETRICA
(
    id                                      INTEGER PRIMARY KEY DEFAULT nextval('FONTE_ENERGIA_ELETRICA_ID_SEQ'),
    rede_publica                            BOOLEAN DEFAULT FALSE,
    gerador_movido_combustivel_fossil       BOOLEAN DEFAULT FALSE,
    fontes_energias_renovaveis_alternativas BOOLEAN DEFAULT FALSE,
    nao_ha_energia_eletrica                 BOOLEAN DEFAULT FALSE
);
ALTER SEQUENCE FONTE_ENERGIA_ELETRICA_ID_SEQ
    OWNED BY ESCOLAS_COM_QUAL_COMPARTILHA.id;
