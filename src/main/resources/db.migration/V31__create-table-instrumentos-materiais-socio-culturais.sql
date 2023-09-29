CREATE SEQUENCE INSTRUMENTOS_MATERIAIS_SOCIO_CULTURAIS_ID_SEQ;

CREATE TABLE IF NOT EXISTS INSTRUMENTOS_MATERIAIS_SOCIO_CULTURAIS   (id INTEGER PRIMARY KEY DEFAULT nextval('INSTRUMENTOS_MATERIAIS_SOCIO_CULTURAIS_ID_SEQ'),
                                                                     acervo_multimidia BOOLEAN,
                                                                     brinquedos_para_educacao_infantil BOOLEAN,
                                                                     conjunto_materiais_cientificos BOOLEAN,
                                                                     equipamento_para_aplificacao BOOLEAN,
                                                                     instrumentos_musicais BOOLEAN,
                                                                     jogos_educativos BOOLEAN,
                                                                     materiais_atividades_culturais BOOLEAN,
                                                                     materiais_educacao_profissional BOOLEAN,
                                                                     brinquedos_educacao_infantil BOOLEAN,
                                                                     materiais_patrica_desportiva BOOLEAN,
                                                                     educacao_escolar_indigena BOOLEAN,
                                                                     materiais_pedagogicos_educacao_indigena BOOLEAN,
                                                                     equipamento_aplificacao BOOLEAN,
                                                                     materiais_pedagogicos_educacao_etnicos_raciais BOOLEAN,
                                                                     materiais_pedagogicos_educacao_campo BOOLEAN,
                                                                     nenhum_instrumetos_listados BOOLEAN
);
ALTER SEQUENCE INSTRUMENTOS_MATERIAIS_SOCIO_CULTURAIS_ID_SEQ
    OWNED BY INSTRUMENTOS_MATERIAIS_SOCIO_CULTURAIS.id;
