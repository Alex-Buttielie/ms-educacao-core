CREATE SEQUENCE ESGOTAMENTO_SANITARIO_ID_SEQ;

CREATE TABLE IF NOT EXISTS ESGOTAMENTO_SANITARIO   (id INTEGER PRIMARY KEY DEFAULT nextval('ESGOTAMENTO_SANITARIO_ID_SEQ'),
                                                    rede_publica BOOLEAN,
                                                    fossa_septica BOOLEAN,
                                                    fossa_rudimentar_comum BOOLEAN,
                                                    nao_ha_esgostamento_sanitario BOOLEAN
);
ALTER SEQUENCE ESGOTAMENTO_SANITARIO_ID_SEQ
    OWNED BY ESGOTAMENTO_SANITARIO.id;
