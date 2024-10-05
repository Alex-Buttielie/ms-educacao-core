CREATE SEQUENCE INSTRUMENTOS_MATERIAIS_SOCIO_CULTURAIS_ID_SEQ;

CREATE TABLE IF NOT EXISTS INSTRUMENTOS_MATERIAIS_SOCIO_CULTURAIS
(
    id                                             INTEGER PRIMARY KEY DEFAULT nextval('INSTRUMENTOS_MATERIAIS_SOCIO_CULTURAIS_ID_SEQ'),
    acervo_multimidia                              BOOLEAN DEFAULT FALSE,
    brinquedos_para_educacao_infantil              BOOLEAN DEFAULT FALSE,
    conjunto_materiais_cientificos                 BOOLEAN DEFAULT FALSE,
    equipamento_para_aplificacao                   BOOLEAN DEFAULT FALSE,
    instrumentos_musicais                          BOOLEAN DEFAULT FALSE,
    jogos_educativos                               BOOLEAN DEFAULT FALSE,
    materiais_atividades_culturais                 BOOLEAN DEFAULT FALSE,
    materiais_educacao_profissional                BOOLEAN DEFAULT FALSE,
    brinquedos_educacao_infantil                   BOOLEAN DEFAULT FALSE,
    materiais_patrica_desportiva                   BOOLEAN DEFAULT FALSE,
    educacao_escolar_indigena                      BOOLEAN DEFAULT FALSE,
    materiais_pedagogicos_educacao_indigena        BOOLEAN DEFAULT FALSE,
    equipamento_aplificacao                        BOOLEAN DEFAULT FALSE,
    materiais_pedagogicos_educacao_etnicos_raciais BOOLEAN DEFAULT FALSE,
    materiais_pedagogicos_educacao_campo           BOOLEAN DEFAULT FALSE,
    nenhum_instrumetos_listados                    BOOLEAN DEFAULT FALSE
);
ALTER SEQUENCE INSTRUMENTOS_MATERIAIS_SOCIO_CULTURAIS_ID_SEQ
    OWNED BY INSTRUMENTOS_MATERIAIS_SOCIO_CULTURAIS.id;
