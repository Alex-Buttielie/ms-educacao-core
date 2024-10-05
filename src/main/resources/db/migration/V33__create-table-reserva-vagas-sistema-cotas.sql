CREATE SEQUENCE RESERVA_VAGAS_SISTEMA_COTAS_ID_SEQ;

CREATE TABLE IF NOT EXISTS RESERVA_VAGAS_SISTEMA_COTAS
(
    id                                            INTEGER PRIMARY KEY DEFAULT nextval('RESERVA_VAGAS_SISTEMA_COTAS_ID_SEQ'),
    auto_declaradado_negro_indigena               BOOLEAN DEFAULT FALSE,
    condicao_renda                                BOOLEAN DEFAULT FALSE,
    oriundo_escola_publica                        BOOLEAN DEFAULT FALSE,
    pessoa_com_deficiencia                        BOOLEAN DEFAULT FALSE,
    outros_grupos_nao_listados                    BOOLEAN DEFAULT FALSE,
    is_reserva_vagas_cotas                        BOOLEAN DEFAULT FALSE,
    escola_possui_redes_comunicacao_institucional BOOLEAN DEFAULT FALSE,
    escola_compartilha_espacos_comunidade         BOOLEAN DEFAULT FALSE,
    espaco_usado_atividade_alunos                 BOOLEAN DEFAULT FALSE
);
ALTER SEQUENCE RESERVA_VAGAS_SISTEMA_COTAS_ID_SEQ
    OWNED BY RESERVA_VAGAS_SISTEMA_COTAS.id;
