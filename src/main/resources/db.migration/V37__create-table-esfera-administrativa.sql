CREATE SEQUENCE ESFERA_ADMINISTRATIVA_ID_SEQ;

CREATE TABLE IF NOT EXISTS ESFERA_ADMINISTRATIVA   (id INTEGER PRIMARY KEY DEFAULT nextval('ESFERA_ADMINISTRATIVA_ID_SEQ'),
                                                    federal BOOLEAN,
                                                    estadual BOOLEAN,
                                                    municipal BOOLEAN,
                                                    uni_vin_escola_edu_basica_uni_ofertante_edu_sup INTEGER,
                                                    fk_uni_escola_sede_codigo_inep INTEGER,
                                                    codigo_ies INTEGER,
                                                    CONSTRAINT fk_codigo_escola_sede FOREIGN KEY (fk_uni_escola_sede_codigo_inep)
                                                        REFERENCES UNIDADE_ENSINO(codigo_inep)

);
ALTER SEQUENCE ESFERA_ADMINISTRATIVA_ID_SEQ
    OWNED BY ESFERA_ADMINISTRATIVA.id;
