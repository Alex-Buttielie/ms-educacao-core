CREATE SEQUENCE POS_GRADUACAO_CONCLUIDA_PROFESSOR_ID_SEQ;

CREATE TABLE IF  NOT EXISTS POS_GRADUACAO_CONCLUIDA_PROFESSOR (
                                                                  id INTEGER PRIMARY KEY DEFAULT nextval('POS_GRADUACAO_CONCLUIDA_PROFESSOR_ID_SEQ'),
                                                                  tipo_pos_graduacao1 INTEGER,
                                                                  area_pos_graduacao1_codigo INTEGER,
                                                                  ano_conclusao1 INTEGER,
                                                                  tipo_pos_graduacao2 INTEGER,
                                                                  area_pos_graduacao2_codigo INTEGER,
                                                                  ano_conclusao2 INTEGER,
                                                                  tipo_pos_graduacao3 INTEGER,
                                                                  area_pos_graduacao3_codigo INTEGER,
                                                                  ano_conclusao3 INTEGER,
                                                                  tipo_pos_graduacao4 INTEGER,
                                                                  area_pos_graduacao4_codigo INTEGER,
                                                                  ano_conclusao4 INTEGER,
                                                                  tipo_pos_graduacao5 INTEGER,
                                                                  area_pos_graduacao5_codigo INTEGER,
                                                                  ano_conclusao5 INTEGER,
                                                                  tipo_pos_graduacao6 INTEGER,
                                                                  area_pos_graduacao6_codigo INTEGER,
                                                                  ano_conclusao6 INTEGER,
                                                                  CONSTRAINT fk_codigo_area_pos_graduacao1 FOREIGN KEY (area_pos_graduacao1_codigo)
                                                                      REFERENCES AREA_POS_GRADUACAO(codigo),
                                                                  CONSTRAINT fk_codigo_area_pos_graduacao2 FOREIGN KEY (area_pos_graduacao2_codigo)
                                                                      REFERENCES AREA_POS_GRADUACAO(codigo),
                                                                  CONSTRAINT fk_codigo_area_pos_graduacao3 FOREIGN KEY (area_pos_graduacao3_codigo)
                                                                      REFERENCES AREA_POS_GRADUACAO(codigo),
                                                                  CONSTRAINT fk_codigo_area_pos_graduacao4 FOREIGN KEY (area_pos_graduacao4_codigo)
                                                                      REFERENCES AREA_POS_GRADUACAO(codigo),
                                                                  CONSTRAINT fk_codigo_area_pos_graduacao5 FOREIGN KEY (area_pos_graduacao5_codigo)
                                                                      REFERENCES AREA_POS_GRADUACAO(codigo),
                                                                  CONSTRAINT fk_codigo_area_pos_graduacao6 FOREIGN KEY (area_pos_graduacao6_codigo)
                                                                      REFERENCES AREA_POS_GRADUACAO(codigo)

);

ALTER SEQUENCE POS_GRADUACAO_CONCLUIDA_PROFESSOR_ID_SEQ
    OWNED BY POS_GRADUACAO_CONCLUIDA_PROFESSOR.ID;