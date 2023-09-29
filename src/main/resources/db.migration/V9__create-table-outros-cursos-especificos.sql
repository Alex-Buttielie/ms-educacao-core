CREATE SEQUENCE OUTROS_CURSOS_ESPECIFICOS_ID_SEQ;

CREATE TABLE IF  NOT EXISTS OUTROS_CURSOS_ESPECIFICOS (
                                                          id INTEGER PRIMARY KEY DEFAULT nextval('OUTROS_CURSOS_ESPECIFICOS_ID_SEQ'),
                                                          creche BOOLEAN,
                                                          pre_escola BOOLEAN,
                                                          anos_iniciais_ensino_fundamental BOOLEAN,
                                                          anos_finais_ensino_fundamental BOOLEAN,
                                                          ensino_medio BOOLEAN,
                                                          educacao_jovens_adultos BOOLEAN,
                                                          educacao_especial BOOLEAN,
                                                          educacao_indigena BOOLEAN,
                                                          educacao_campo BOOLEAN,
                                                          educacao_ambiental BOOLEAN,
                                                          educacao_direitos_humanos BOOLEAN,
                                                          gerero_diversidade_sexual BOOLEAN,
                                                          direitos_criacao_adolescente BOOLEAN,
                                                          educacao_relacoes_etnico_raciais_cultura_afro_brasileira BOOLEAN,
                                                          gestao_escolar BOOLEAN,
                                                          outros BOOLEAN,
                                                          nao_tem_outros_cursos_especificos BOOLEAN

);

ALTER SEQUENCE OUTROS_CURSOS_ESPECIFICOS_ID_SEQ
    OWNED BY OUTROS_CURSOS_ESPECIFICOS.ID;