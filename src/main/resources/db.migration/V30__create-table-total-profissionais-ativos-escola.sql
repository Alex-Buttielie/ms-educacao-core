CREATE SEQUENCE TOTAL_PROFISSIONAIS_ATIVOS_ESCOLA_ID_SEQ;

CREATE TABLE IF NOT EXISTS TOTAL_PROFISSIONAIS_ATIVOS_ESCOLA   (id INTEGER PRIMARY KEY DEFAULT nextval('TOTAL_PROFISSIONAIS_ATIVOS_ESCOLA_ID_SEQ'),
                                                                auxiliares_secretaria INTEGER,
                                                                auxilia_servicos_gerais INTEGER,
                                                                bibliotecario_auxiliar_monitor INTEGER,
                                                                bombeiro_brigadista INTEGER,
                                                                coordenador_turno_displinar INTEGER,
                                                                fonoaudiologo INTEGER,
                                                                nutricionisa INTEGER,
                                                                psicologo_escolar INTEGER,
                                                                profissionais_preparacao INTEGER,
                                                                profissionais_apoio_supervisao INTEGER,
                                                                secretario_escolar INTEGER,
                                                                seguranca_guarda_seguranca INTEGER,
                                                                auxiliares_laboratorio INTEGER,
                                                                vice_diretor INTEGER,
                                                                orientador_comunitario INTEGER,
                                                                is_profissionais_funcoes_listadas BOOLEAN,
                                                                alimentacao_escolar_para_aluno BOOLEAN
);
ALTER SEQUENCE TOTAL_PROFISSIONAIS_ATIVOS_ESCOLA_ID_SEQ
    OWNED BY TOTAL_PROFISSIONAIS_ATIVOS_ESCOLA.id;
