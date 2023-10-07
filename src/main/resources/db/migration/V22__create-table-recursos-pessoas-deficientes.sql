CREATE SEQUENCE RECURSO_PESSOAS_DEFICIENTES_ID_SEQ;

CREATE TABLE IF NOT EXISTS RECURSO_PESSOAS_DEFICIENTES   (id INTEGER PRIMARY KEY DEFAULT nextval('RECURSO_PESSOAS_DEFICIENTES_ID_SEQ'),
                                                          corrimao_guarda_copos BOOLEAN,
                                                          elevador BOOLEAN,
                                                          pisos_tateis BOOLEAN,
                                                          portas_vao_livre BOOLEAN,
                                                          rampas BOOLEAN,
                                                          sinalizacao_sonora BOOLEAN,
                                                          sinalizacao_tatil BOOLEAN,
                                                          sinalizacao_visual BOOLEAN,
                                                          nenhum_recusos_acessibilidade BOOLEAN,
                                                          numero_salas_utilizadas_predio INTEGER,
                                                          numero_salas_utilizadas_escola_fora_predio INTEGER,
                                                          numero_salas_climatizadas INTEGER,
                                                          numero_salas_acessivel_pessoas_deficientes INTEGER
);
ALTER SEQUENCE RECURSO_PESSOAS_DEFICIENTES_ID_SEQ
    OWNED BY RECURSO_PESSOAS_DEFICIENTES.id;
