CREATE SEQUENCE ESCOLAS_COM_QUAL_COMPARTILHA_ID_SEQ;

CREATE TABLE IF NOT EXISTS ESCOLAS_COM_QUAL_COMPARTILHA   (id INTEGER PRIMARY KEY DEFAULT nextval('ESCOLAS_COM_QUAL_COMPARTILHA_ID_SEQ'),
                                                           codigo_escola_com_qual_compartilha1_codigo_inep INTEGER,
                                                           codigo_escola_com_qual_compartilha2_codigo_inep INTEGER,
                                                           codigo_escola_com_qual_compartilha3_codigo_inep INTEGER,
                                                           codigo_escola_com_qual_compartilha4_codigo_inep INTEGER,
                                                           codigo_escola_com_qual_compartilha5_codigo_inep INTEGER,
                                                           codigo_escola_com_qual_compartilha6_codigo_inep INTEGER,
                                                           fornece_agua_potavel_para_consumo BOOLEAN,
                                                           CONSTRAINT fk_codigo_escola_com_qual_compartilha1_id FOREIGN KEY (codigo_escola_com_qual_compartilha1_codigo_inep)
                                                               REFERENCES UNIDADE_ENSINO(codigo_inep),
                                                           CONSTRAINT fk_codigo_escola_com_qual_compartilha2_id FOREIGN KEY (codigo_escola_com_qual_compartilha2_codigo_inep)
                                                               REFERENCES UNIDADE_ENSINO(codigo_inep),
                                                           CONSTRAINT fk_codigo_escola_com_qual_compartilha3_id FOREIGN KEY (codigo_escola_com_qual_compartilha3_codigo_inep)
                                                               REFERENCES UNIDADE_ENSINO(codigo_inep),
                                                           CONSTRAINT fk_codigo_escola_com_qual_compartilha4_id FOREIGN KEY (codigo_escola_com_qual_compartilha4_codigo_inep)
                                                               REFERENCES UNIDADE_ENSINO(codigo_inep),
                                                           CONSTRAINT fk_codigo_escola_com_qual_compartilha5_id FOREIGN KEY (codigo_escola_com_qual_compartilha5_codigo_inep)
                                                               REFERENCES UNIDADE_ENSINO(codigo_inep),
                                                           CONSTRAINT fk_codigo_escola_com_qual_compartilha6_id FOREIGN KEY (codigo_escola_com_qual_compartilha6_codigo_inep)
                                                               REFERENCES UNIDADE_ENSINO(codigo_inep)

);
ALTER SEQUENCE ESCOLAS_COM_QUAL_COMPARTILHA_ID_SEQ
    OWNED BY ESCOLAS_COM_QUAL_COMPARTILHA.id;
