CREATE SEQUENCE ABASTECIMENTO_AGUA_ID_SEQ;

CREATE TABLE IF NOT EXISTS ABASTECIMENTO_AGUA
(
    id                               INTEGER PRIMARY KEY DEFAULT nextval('ABASTECIMENTO_AGUA_ID_SEQ'),
    rede_publica                     BOOLEAN DEFAULT FALSE,
    poco_artesiano                   BOOLEAN DEFAULT FALSE,
    cacimba_cisterna_poco            BOOLEAN DEFAULT FALSE,
    fonte_rio_igarape_riacho_corrego BOOLEAN DEFAULT FALSE,
    nao_ha_abastecimento_agua        BOOLEAN DEFAULT FALSE
);
ALTER SEQUENCE ESCOLAS_COM_QUAL_COMPARTILHA_ID_SEQ
    OWNED BY ESCOLAS_COM_QUAL_COMPARTILHA.id;
