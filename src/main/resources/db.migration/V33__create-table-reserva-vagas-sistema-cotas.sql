CREATE SEQUENCE RESERVA_VAGAS_SISTEMA_COTAS_ID_SEQ;

CREATE TABLE IF NOT EXISTS RESERVA_VAGAS_SISTEMA_COTAS   (id INTEGER PRIMARY KEY DEFAULT nextval('RESERVA_VAGAS_SISTEMA_COTAS_ID_SEQ'),
                                                          auto_declaradado_negro_indigena BOOLEAN,
                                                          condicao_renda BOOLEAN,
                                                          oriundo_escola_publica BOOLEAN,
                                                          pessoa_com_deficiencia BOOLEAN,
                                                          outros_grupos_nao_listados BOOLEAN,
                                                          is_reserva_vagas_cotas BOOLEAN,
                                                          escola_possui_redes_comunicacao_institucional BOOLEAN,
                                                          escola_compartilha_espacos_comunidade BOOLEAN,
                                                          espaco_usado_atividade_alunos BOOLEAN
);
ALTER SEQUENCE RESERVA_VAGAS_SISTEMA_COTAS_ID_SEQ
    OWNED BY RESERVA_VAGAS_SISTEMA_COTAS.id;
