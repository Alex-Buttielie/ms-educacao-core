CREATE SEQUENCE DEPENDENCIAS_FISICAS_ID_SEQ;

CREATE TABLE IF NOT EXISTS DEPENDENCIAS_FISICAS
(
    id                                           INTEGER PRIMARY KEY DEFAULT nextval('DEPENDENCIAS_FISICAS_ID_SEQ'),
    almoxarifado                                 BOOLEAN DEFAULT FALSE,
    area_verde                                   BOOLEAN DEFAULT FALSE,
    auditorio                                    BOOLEAN DEFAULT FALSE,
    banheiro                                     BOOLEAN DEFAULT FALSE,
    banheiro_acessivel_pessoas_deficiencia       BOOLEAN DEFAULT FALSE,
    banheiro_adequado_educacao_infantil          BOOLEAN DEFAULT FALSE,
    banheiro_exclusivo_para_funcionarios         BOOLEAN DEFAULT FALSE,
    banheiro_ou_vestiario_com_chuveiro           BOOLEAN DEFAULT FALSE,
    biblioteca                                   BOOLEAN DEFAULT FALSE,
    cozinha                                      BOOLEAN DEFAULT FALSE,
    dispensa                                     BOOLEAN DEFAULT FALSE,
    dormitorio_aluno                             BOOLEAN DEFAULT FALSE,
    dormitorio_professora                        BOOLEAN DEFAULT FALSE,
    laboratorio_ciencias                         BOOLEAN DEFAULT FALSE,
    laboratorio_informatica                      BOOLEAN DEFAULT FALSE,
    laboratorio_especifico_educacao_profissional BOOLEAN DEFAULT FALSE,
    parque_infantil                              BOOLEAN DEFAULT FALSE,
    patio_coberto                                BOOLEAN DEFAULT FALSE,
    patio_descoberto                             BOOLEAN DEFAULT FALSE,
    piscina                                      BOOLEAN DEFAULT FALSE,
    quadra_esportes_coberta                      BOOLEAN DEFAULT FALSE,
    quadra_esportes_descoberta                   BOOLEAN DEFAULT FALSE,
    refeitorio                                   BOOLEAN DEFAULT FALSE,
    sala_repouso_aluno                           BOOLEAN DEFAULT FALSE,
    sala_atelie_artes                            BOOLEAN DEFAULT FALSE,
    sala_musica_coral                            BOOLEAN DEFAULT FALSE,
    sala_estudio_danca                           BOOLEAN DEFAULT FALSE,
    sala_multiuso_musica_danca_artes             BOOLEAN DEFAULT FALSE,
    terreiro_para_recreacao                      BOOLEAN DEFAULT FALSE,
    servico_diretoria                            BOOLEAN DEFAULT FALSE,
    viveiro_criacao_animais                      BOOLEAN DEFAULT FALSE,
    sala_leituira                                BOOLEAN DEFAULT FALSE,
    sala_professores                             BOOLEAN DEFAULT FALSE,
    sala_recursos_multifuncionais                BOOLEAN DEFAULT FALSE,
    sala_secretaria                              BOOLEAN DEFAULT FALSE,
    sala_oficinas_educacao_profissional          BOOLEAN DEFAULT FALSE,
    nenhuma_das_dependencias_relacionadas        BOOLEAN DEFAULT FALSE

);
ALTER SEQUENCE DEPENDENCIAS_FISICAS_ID_SEQ
    OWNED BY DEPENDENCIAS_FISICAS.id;
