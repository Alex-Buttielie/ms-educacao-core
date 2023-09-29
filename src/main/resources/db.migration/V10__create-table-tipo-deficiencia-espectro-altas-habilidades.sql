CREATE SEQUENCE TIPO_DEFICIENCIA_ESPECTRO_ALTAS_HABILIDADES_ID_SEQ;

CREATE TABLE IF  NOT EXISTS TIPO_DEFICIENCIA_ESPECTRO_ALTAS_HABILIDADES  (
                                                                             id INTEGER PRIMARY KEY DEFAULT nextval('TIPO_DEFICIENCIA_ESPECTRO_ALTAS_HABILIDADES_ID_SEQ'),
                                                                             pessoa_com_deficiencia_espectro_autistia_superdotacao BOOLEAN ,
                                                                             cegueira BOOLEAN ,
                                                                             baixa_visao BOOLEAN ,
                                                                             surdez BOOLEAN ,
                                                                             dificiencia_auditiva BOOLEAN ,
                                                                             surdo_cegueira BOOLEAN ,
                                                                             deficiencia_fisica   BOOLEAN,
                                                                             deficiencia_intelectual BOOLEAN,
                                                                             deficiencia_multipla BOOLEAN,
                                                                             transtorno_espectro_autista BOOLEAN,
                                                                             altas_habilidades_superdotacao BOOLEAN

);

ALTER SEQUENCE TIPO_DEFICIENCIA_ESPECTRO_ALTAS_HABILIDADES_ID_SEQ
    OWNED BY TIPO_DEFICIENCIA_ESPECTRO_ALTAS_HABILIDADES.ID;