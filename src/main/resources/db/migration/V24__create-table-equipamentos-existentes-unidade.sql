CREATE SEQUENCE EQUIPAMENTOS_EXISTENTES_UNIDADE_ID_SEQ;

CREATE TABLE IF NOT EXISTS EQUIPAMENTOS_EXISTENTES_UNIDADE
(
    id                               INTEGER PRIMARY KEY DEFAULT nextval('EQUIPAMENTOS_EXISTENTES_UNIDADE_ID_SEQ'),
    antena_parabolica                BOOLEAN DEFAULT FALSE,
    computadores                     BOOLEAN DEFAULT FALSE,
    copiadora                        BOOLEAN DEFAULT FALSE,
    impressora                       BOOLEAN DEFAULT FALSE,
    impressora_multifuncional        BOOLEAN DEFAULT FALSE,
    scnaner                          BOOLEAN DEFAULT FALSE,
    nenhum_dos_equipamentos_listados BOOLEAN DEFAULT FALSE
);
ALTER SEQUENCE EQUIPAMENTOS_EXISTENTES_UNIDADE_ID_SEQ
    OWNED BY EQUIPAMENTOS_EXISTENTES_UNIDADE.id;
