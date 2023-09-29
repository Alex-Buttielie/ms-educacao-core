CREATE SEQUENCE PESSOA_ID_SEQ;

CREATE TABLE IF  NOT EXISTS PESSOA
(
    id INTEGER PRIMARY KEY DEFAULT nextval('PESSOA_ID_SEQ'),
    nome VARCHAR(100) ,
    --Voltar quando tiver com a importação de unidade de ensino pronta codigo_unidade_ensino_inep_id INTEGER ,
    fk_uni_codigo_inep INTEGER ,
    tipo_registro INTEGER,
    cpf VARCHAR (11) UNIQUE  ,
    tipo_filiacao INTEGER,
    data_nascimento DATE ,
    nome_mae VARCHAR(100) ,
    nome_pai VARCHAR(100) ,
    sexo INTEGER ,
    identificacao_unica int8,
    cor_raca INTEGER,
    nacionalidade INTEGER,
    pais_nacionalidade INTEGER,
    fk_mun_nasc_codigo_mec INTEGER,
    numero_matricula_certidao_nascimento VARCHAR(32),
    pais_residencia VARCHAR(3),
    cep VARCHAR (15),
    fk_mun_resid_codigo_mec INTEGER,
    localizacao_zona_residencia INTEGER,
    localizacao_diferenciada_residencia INTEGER,
    maior_nivel_escolaridade_concluido INTEGER,
    tipo_ensino_medio_cursado INTEGER,
    nao_tem_pos_graduacao_concluida BOOLEAN,
    nao_tem_outros_cursos_especificos BOOLEAN,
    endereco_eletronico_email VARCHAR(50),
    formacao_complementar_pedagogica_professor_id INTEGER,
    outros_cursos_especificos_id INTEGER,
    tipo_deficiencia_espectro_altas_habilidades_id INTEGER,
    recurso_aluno_para_avaliacao_inep_id INTEGER,
    pos_graduacao_concluida_professor_id INTEGER,
    CONSTRAINT fk_municipio_residencia FOREIGN KEY (fk_mun_resid_codigo_mec)
        REFERENCES municipio (codigo_mec),
    CONSTRAINT fk_municipio_nascimento FOREIGN KEY (fk_mun_nasc_codigo_mec)
        REFERENCES municipio (codigo_mec),
    CONSTRAINT fk_codigo_inep FOREIGN KEY (fk_uni_codigo_inep)
        REFERENCES UNIDADE_ENSINO (codigo_inep)
);

ALTER SEQUENCE PESSOA_ID_SEQ
    OWNED BY PESSOA.id;

