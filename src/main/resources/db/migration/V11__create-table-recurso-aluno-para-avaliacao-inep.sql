CREATE SEQUENCE RECURSO_ALUNO_PARA_AVALIACAO_INEP_ID_SEQ;

CREATE TABLE IF  NOT EXISTS RECURSO_ALUNO_PARA_AVALIACAO_INEP   (id INTEGER PRIMARY KEY DEFAULT nextval('RECURSO_ALUNO_PARA_AVALIACAO_INEP_ID_SEQ'),
                                                                 auxilio_ledor BOOLEAN,
                                                                 auxilio_transcricao BOOLEAN,
                                                                 guia_interprete BOOLEAN,
                                                                 tradutor_interprete_libras BOOLEAN,
                                                                 leitura_labial BOOLEAN,
                                                                 prova_ampliada_fonte_18 BOOLEAN,
                                                                 prova_superampliada_fonte_24 BOOLEAN,
                                                                 codigo_audio_deficiente_visual BOOLEAN,
                                                                 prova_lingua_portuguesa_segunda_linha_surdos_deficiente_auditiv BOOLEAN,
                                                                 prova_videos_libras BOOLEAN,
                                                                 materia_didatico_prova_braille BOOLEAN,
                                                                 nenhum BOOLEAN

);
ALTER SEQUENCE RECURSO_ALUNO_PARA_AVALIACAO_INEP_ID_SEQ
    OWNED BY RECURSO_ALUNO_PARA_AVALIACAO_INEP.id;
