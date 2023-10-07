CREATE SEQUENCE MANTENEDORA_ESCOLA_PRIVADA_ID_SEQ;

CREATE TABLE IF NOT EXISTS MANTENEDORA_ESCOLA_PRIVADA (id INTEGER PRIMARY KEY DEFAULT nextval('MANTENEDORA_ESCOLA_PRIVADA_ID_SEQ'),
                                                       empresa_grupos_empresariais_setor_privado_pessoa_fisica BOOLEAN,
                                                       sindicatos_trabalhadores_patronais_associacoes_cooperativas BOOLEAN,
                                                       organizacao_nao_governamental BOOLEAN,
                                                       institucao_sem_fins_lucrativos BOOLEAN,
                                                       sistemas_sesi_senai_sesc_outros BOOLEAN,
                                                       organizacao_sociedade_civil_interesse_publico BOOLEAN,
                                                       categoria_escola_privada INTEGER
);
ALTER SEQUENCE MANTENEDORA_ESCOLA_PRIVADA_ID_SEQ
    OWNED BY MANTENEDORA_ESCOLA_PRIVADA.id;
