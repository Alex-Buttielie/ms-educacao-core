CREATE SEQUENCE QUANTIDADE_COMPUTADORES_EM_USO_ALUNOS_ID_SEQ;

CREATE TABLE IF NOT EXISTS QUANTIDADE_COMPUTADORES_EM_USO_ALUNOS   (id INTEGER PRIMARY KEY DEFAULT nextval('QUANTIDADE_COMPUTADORES_EM_USO_ALUNOS_ID_SEQ'),
                                                                    computadores_mesa_desktop INTEGER,
                                                                    computadores_portateis INTEGER,
                                                                    tablets INTEGER
);
ALTER SEQUENCE QUANTIDADE_COMPUTADORES_EM_USO_ALUNOS_ID_SEQ
    OWNED BY QUANTIDADE_COMPUTADORES_EM_USO_ALUNOS.id;
