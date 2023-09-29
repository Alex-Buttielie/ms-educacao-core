CREATE SEQUENCE FONTE_ENERGIA_ELETRICA_ID_SEQ;

CREATE TABLE IF NOT EXISTS FONTE_ENERGIA_ELETRICA   (id INTEGER PRIMARY KEY DEFAULT nextval('FONTE_ENERGIA_ELETRICA_ID_SEQ'),
                                                     rede_publica BOOLEAN,
                                                     gerador_movido_combustivel_fossil BOOLEAN,
                                                     fontes_energias_renovaveis_alternativas BOOLEAN,
                                                     nao_ha_energia_eletrica BOOLEAN
);
ALTER SEQUENCE FONTE_ENERGIA_ELETRICA_ID_SEQ
    OWNED BY ESCOLAS_COM_QUAL_COMPARTILHA.id;
