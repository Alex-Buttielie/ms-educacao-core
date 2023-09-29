CREATE SEQUENCE FORMACAO_COMPLEMENTAR_PEDAGOGICA_PROFESSOR_ID_SEQ;

CREATE TABLE IF  NOT EXISTS FORMACAO_COMPLEMENTAR_PEDAGOGICA_PROFESSOR (
                                                                           id INTEGER PRIMARY KEY DEFAULT nextval('FORMACAO_COMPLEMENTAR_PEDAGOGICA_PROFESSOR_ID_SEQ'),
                                                                           area_conhecimento_componentes_curriculares1_codigo INTEGER,
                                                                           area_conhecimento_componentes_curriculares2_codigo INTEGER,
                                                                           area_conhecimento_componentes_curriculares3_codigo INTEGER,
                                                                           CONSTRAINT fk_area_conhecimento_1 FOREIGN KEY (area_conhecimento_componentes_curriculares1_codigo)
                                                                               REFERENCES AREA_CONHECIMENTO (codigo),
                                                                           CONSTRAINT fk_area_conhecimento_2 FOREIGN KEY (area_conhecimento_componentes_curriculares2_codigo)
                                                                               REFERENCES AREA_CONHECIMENTO (codigo),
                                                                           CONSTRAINT fk_area_conhecimento_3 FOREIGN KEY (area_conhecimento_componentes_curriculares3_codigo)
                                                                               REFERENCES AREA_CONHECIMENTO (codigo)
);


ALTER SEQUENCE FORMACAO_COMPLEMENTAR_PEDAGOGICA_PROFESSOR_ID_SEQ
    OWNED BY FORMACAO_COMPLEMENTAR_PEDAGOGICA_PROFESSOR.ID;
