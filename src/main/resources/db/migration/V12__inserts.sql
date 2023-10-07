INSERT INTO municipio (codigo_mec, nome) VALUES (5213103, 'Mineiros');
INSERT INTO area_conhecimento (codigo, nome) VALUES (1, 'Qu�mica');
INSERT INTO area_conhecimento (codigo, nome) VALUES (2, 'F�sica');
INSERT INTO area_conhecimento (codigo, nome) VALUES (3, 'Matem�tica');
INSERT INTO area_conhecimento (codigo, nome) VALUES (4, 'Biologia');
INSERT INTO area_conhecimento (codigo, nome) VALUES (5, 'Ci�ncias');
INSERT INTO area_conhecimento (codigo, nome) VALUES (6, 'L�ngua');
INSERT INTO area_conhecimento (codigo, nome) VALUES (7, 'L�ngua');
INSERT INTO area_conhecimento (codigo, nome) VALUES (8, 'L�ngua');
INSERT INTO area_conhecimento (codigo, nome) VALUES (9, 'L�ngua');
INSERT INTO area_conhecimento (codigo, nome) VALUES (10, 'Arte');
INSERT INTO area_conhecimento (codigo, nome) VALUES (11, 'Educa��o F�sica');
INSERT INTO area_conhecimento (codigo, nome) VALUES (12, 'Hist�ria');
INSERT INTO area_conhecimento (codigo, nome) VALUES (13, 'Geografia');
INSERT INTO area_conhecimento (codigo, nome) VALUES (14, 'Filosofia');
INSERT INTO area_conhecimento (codigo, nome) VALUES (16, 'Inform�tica');
INSERT INTO area_conhecimento (codigo, nome) VALUES (17, '�reas do conhecimento profissionalizantes');
INSERT INTO area_conhecimento (codigo, nome) VALUES (23, 'L�bras');
INSERT INTO area_conhecimento (codigo, nome) VALUES (25, '�reas do conhecimento pedag�gica');
INSERT INTO area_conhecimento (codigo, nome) VALUES (26, 'Ensino Religioso');
INSERT INTO area_conhecimento (codigo, nome) VALUES (27, 'L�ngua ind�gena');
INSERT INTO area_conhecimento (codigo, nome) VALUES (28, 'Estudos sociais');
INSERT INTO area_conhecimento (codigo, nome) VALUES (29, 'Sociologia');
INSERT INTO area_conhecimento (codigo, nome) VALUES (30, 'L�ngua');
INSERT INTO area_conhecimento (codigo, nome) VALUES (31, 'L�ngua Portuguesa como Segunda L�ngua');
INSERT INTO area_conhecimento (codigo, nome) VALUES (32, 'Est�gio curricular supervisionado');
INSERT INTO area_conhecimento (codigo, nome) VALUES (99, 'Outras �reas do conhecimento');
INSERT INTO area_pos_graduacao (codigo, nome)  VALUES (1, 'EDUCA��O');
INSERT INTO area_pos_graduacao (codigo, nome)  VALUES (2, 'HUMANIDADES E ARTES');
INSERT INTO area_pos_graduacao (codigo, nome)  VALUES (3, 'CI�NCIAS SOCIAIS, NEG�CIOS E DIREITOS');
INSERT INTO area_pos_graduacao (codigo, nome)  VALUES (4, 'CI�NCIAS, MATEM�TICA E COMPUTA��O');
INSERT INTO area_pos_graduacao (codigo, nome)  VALUES (5, 'ENGENHARIA, PRODU��O E CONSTRU��O');
INSERT INTO area_pos_graduacao (codigo, nome)  VALUES (6, 'AGRICULTURA E VETERIN�RIA');
INSERT INTO area_pos_graduacao (codigo, nome)  VALUES (7, 'SA�DE E BEM-ESTAR SOCIAL');
INSERT INTO area_pos_graduacao (codigo, nome)  VALUES (8, 'SERVI�OS');
INSERT INTO area_pos_graduacao (codigo, nome)  VALUES (9, 'OUTROS');
INSERT INTO unidade_ensino (codigo_inep, nome)  VALUES (52104346, 'ESCOLA MUNICIPAL MARIA EDUARDA CONDINHO FILGUEIRAS');
--INSERT INTO pessoa (nome,
--                    codigo_unidade_ensino_id,
--                    cpf,
--                    data_nascimento,
--                    nome_mae,
--                    nome_pai,
--                    sexo,
--                    cor_raca,
--                    nacionalidade,
--                    pais_nacionalidade,
--                    municipio_nascimento_id,
--                    numero_matricula_certidao_nascimento,
--                    pais_residencia,
--                    cep,
--                    municipio_residencia_id,
--                    localizacao_zona_residencia,
--                    localizacao_diferenciada_residencia,
--                    maior_nivel_escolaridade_concluido,
--                    tipo_ensino_medio_cursado,
--                    nao_tem_pos_graduacao_concluida,
--                    nao_tem_outros_cursos_especificos,
--                    endereco_eletronico_email,
--                    tipo_filiacao)
--VALUES ('Alex Buttielie',
--        1,
--        '70846792192',
--        '2001-03-16',
--        'Celia',
--        'Jos�',
--        1,
--        2,
--        1,
--        76,
--        1,
--        '00000000',
--        76,
--        '76180000',
--        1,
--        1,
--        4,
--        4,
--        1,
--        true,
--        true,
--        'buttielle3@gmail.com',
--        1
--       );
--insert into tipo_deficiencia_espectro_altas_habilidades(pessoa_com_deficiencia_espectro_autistia_superdotacao,
--                                                        cegueira,
--                                                        baixa_visao,
--                                                        surdez,
--                                                        dificiencia_auditiva,
--                                                        surdo_cegueira,
--                                                        deficiencia_fisica,
--                                                        deficiencia_intelectual,
--                                                        deficiencia_multipla,
--                                                        transtorno_espectro_autista,
--                                                        altas_habilidades_superdotacao)
--values (false,
--        false,
--        false,
--        false,
--        false,
--        false,
--        false,
--        false,
--        false,
--        false,
--        false);
--
--insert into recurso_aluno_para_avaliacao_inep (pessoa_id,
--                                               auxilio_ledor,
--                                               auxilio_transcricao,
--                                               guia_interprete,
--                                               tradutor_interprete_libras,
--                                               leitura_labial,
--                                               prova_ampliada_fonte_18,
--                                               prova_superampliada_fonte_24,
--                                               codigo_audio_deficiente_visual,
--                                               prova_lingua_portuguesa_segunda_linha_surdos_deficiente_auditiv,
--                                               prova_videos_libras,
--                                               materia_didatico_prova_braille,
--                                               nenhum) values (1,
--                                                               false,
--                                                               false,
--                                                               false,
--                                                               false,
--                                                               false,
--                                                               false,
--                                                               false,
--                                                               false,
--                                                               false,
--                                                               false,
--                                                               false,
--                                                               false
--
--                                                              );
--
--INSERT INTO formacao_complementar_pedagogica_professor (id,
--                                                        area_conhecimento_componentes_curriculares1_id,
--                                                        area_conhecimento_componentes_curriculares2_id,
--                                                        area_conhecimento_componentes_curriculares3_id)
--VALUES (1, 1, 2, 3);
--
--INSERT INTO outros_cursos_especificos (creche,
--                                       pre_escola,
--                                       anos_iniciais_ensino_fundamental,
--                                       anos_finais_ensino_fundamental)
--VALUES (true,
--        true,
--        true,
--        true);
--
--INSERT INTO pos_graduacao_concluida_professor (tipo_pos_graduacao,
--                                               area_pos_graduacao_id,
--                                               ano_conclusao)
--VALUES (1,
--        5,
--        2022);
--
--
--