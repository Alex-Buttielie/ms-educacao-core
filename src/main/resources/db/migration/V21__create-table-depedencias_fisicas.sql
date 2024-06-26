CREATE SEQUENCE DEPENDENCIAS_FISICAS_ID_SEQ;

CREATE TABLE IF NOT EXISTS DEPENDENCIAS_FISICAS
(
    id                                           INTEGER PRIMARY KEY DEFAULT nextval('DEPENDENCIAS_FISICAS_ID_SEQ'),
    almoxarifado                                 BOOLEAN,
    area_verde                                   BOOLEAN,
    auditorio                                    BOOLEAN,
    banheiro                                     BOOLEAN,
    banheiro_acessivel_pessoas_deficiencia       BOOLEAN,
    banheiro_adequado_educacao_infantil          BOOLEAN,
    banheiro_exclusivo_para_funcionarios         BOOLEAN,
    banheiro_ou_vestiario_com_chuveiro           BOOLEAN,
    biblioteca                                   BOOLEAN,
    cozinha                                      BOOLEAN,
    dispensa                                     BOOLEAN,
    dormitorio_aluno                             BOOLEAN,
    dormitorio_professora                        BOOLEAN,
    laboratorio_ciencias                         BOOLEAN,
    laboratorio_informatica                      BOOLEAN,
    laboratorio_especifico_educacao_profissional BOOLEAN,
    parque_infantil                              BOOLEAN,
    patio_coberto                                BOOLEAN,
    patio_descoberto                             BOOLEAN,
    piscina                                      BOOLEAN,
    quadra_esportes_coberta                      BOOLEAN,
    quadra_esportes_descoberta                   BOOLEAN,
    refeitorio                                   BOOLEAN,
    sala_repouso_aluno                           BOOLEAN,
    sala_atelie_artes                            BOOLEAN,
    sala_musica_coral                            BOOLEAN,
    sala_estudio_danca                           BOOLEAN,
    sala_multiuso_musica_danca_artes             BOOLEAN,
    terreiro_para_recreacao                      BOOLEAN,
    servico_diretoria                            BOOLEAN,
    viveiro_criacao_animais                      BOOLEAN,
    sala_leituira                                BOOLEAN,
    sala_professores                             BOOLEAN,
    sala_recursos_multifuncionais                BOOLEAN,
    sala_secretaria                              BOOLEAN,
    sala_oficinas_educacao_profissional          BOOLEAN,
    nenhuma_das_dependencias_relacionadas        BOOLEAN

);
ALTER SEQUENCE DEPENDENCIAS_FISICAS_ID_SEQ
    OWNED BY DEPENDENCIAS_FISICAS.id;
