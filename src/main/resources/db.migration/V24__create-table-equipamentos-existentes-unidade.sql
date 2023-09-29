CREATE SEQUENCE EQUIPAMENTOS_EXISTENTES_UNIDADE_ID_SEQ;

CREATE TABLE IF NOT EXISTS EQUIPAMENTOS_EXISTENTES_UNIDADE   (id INTEGER PRIMARY KEY DEFAULT nextval('EQUIPAMENTOS_EXISTENTES_UNIDADE_ID_SEQ'),
                                                              antena_parabolica BOOLEAN,
                                                              computadores BOOLEAN,
                                                              copiadora BOOLEAN,
                                                              impressora BOOLEAN,
                                                              impressora_multifuncional BOOLEAN,
                                                              scnaner BOOLEAN,
                                                              nenhum_dos_equipamentos_listados BOOLEAN
);
ALTER SEQUENCE EQUIPAMENTOS_EXISTENTES_UNIDADE_ID_SEQ
    OWNED BY EQUIPAMENTOS_EXISTENTES_UNIDADE.id;
