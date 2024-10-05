CREATE SEQUENCE RECURSO_PESSOAS_DEFICIENTES_ID_SEQ;

CREATE TABLE IF NOT EXISTS RECURSO_PESSOAS_DEFICIENTES
(
    id                                         INTEGER PRIMARY KEY DEFAULT nextval('RECURSO_PESSOAS_DEFICIENTES_ID_SEQ'),
    corrimao_guarda_copos                      BOOLEAN DEFAULT FALSE,
    elevador                                   BOOLEAN DEFAULT FALSE,
    pisos_tateis                               BOOLEAN DEFAULT FALSE,
    portas_vao_livre                           BOOLEAN DEFAULT FALSE,
    rampas                                     BOOLEAN DEFAULT FALSE,
    sinalizacao_sonora                         BOOLEAN DEFAULT FALSE,
    sinalizacao_tatil                          BOOLEAN DEFAULT FALSE,
    sinalizacao_visual                         BOOLEAN DEFAULT FALSE,
    nenhum_recusos_acessibilidade              BOOLEAN DEFAULT FALSE,
    numero_salas_utilizadas_predio             INTEGER,
    numero_salas_utilizadas_escola_fora_predio INTEGER,
    numero_salas_climatizadas                  INTEGER,
    numero_salas_acessivel_pessoas_deficientes INTEGER
);
ALTER SEQUENCE RECURSO_PESSOAS_DEFICIENTES_ID_SEQ
    OWNED BY RECURSO_PESSOAS_DEFICIENTES.id;
