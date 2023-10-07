INSERT INTO municipio (codigo_mec, nome) VALUES (5213103, 'Mineiros');
INSERT INTO area_conhecimento (codigo, nome) VALUES (1, 'Química');
INSERT INTO area_conhecimento (codigo, nome) VALUES (2, 'Física');
INSERT INTO area_conhecimento (codigo, nome) VALUES (3, 'Matemática');
INSERT INTO area_conhecimento (codigo, nome) VALUES (4, 'Biologia');
INSERT INTO area_conhecimento (codigo, nome) VALUES (5, 'Ciências');
INSERT INTO area_conhecimento (codigo, nome) VALUES (6, 'Língua');
INSERT INTO area_conhecimento (codigo, nome) VALUES (7, 'Língua');
INSERT INTO area_conhecimento (codigo, nome) VALUES (8, 'Língua');
INSERT INTO area_conhecimento (codigo, nome) VALUES (9, 'Língua');
INSERT INTO area_conhecimento (codigo, nome) VALUES (10, 'Arte');
INSERT INTO area_conhecimento (codigo, nome) VALUES (11, 'Educação Física');
INSERT INTO area_conhecimento (codigo, nome) VALUES (12, 'História');
INSERT INTO area_conhecimento (codigo, nome) VALUES (13, 'Geografia');
INSERT INTO area_conhecimento (codigo, nome) VALUES (14, 'Filosofia');
INSERT INTO area_conhecimento (codigo, nome) VALUES (16, 'Informática');
INSERT INTO area_conhecimento (codigo, nome) VALUES (17, 'Áreas do conhecimento profissionalizantes');
INSERT INTO area_conhecimento (codigo, nome) VALUES (23, 'Líbras');
INSERT INTO area_conhecimento (codigo, nome) VALUES (25, 'Áreas do conhecimento pedagógica');
INSERT INTO area_conhecimento (codigo, nome) VALUES (26, 'Ensino Religioso');
INSERT INTO area_conhecimento (codigo, nome) VALUES (27, 'Língua indígena');
INSERT INTO area_conhecimento (codigo, nome) VALUES (28, 'Estudos sociais');
INSERT INTO area_conhecimento (codigo, nome) VALUES (29, 'Sociologia');
INSERT INTO area_conhecimento (codigo, nome) VALUES (30, 'Língua');
INSERT INTO area_conhecimento (codigo, nome) VALUES (31, 'Língua Portuguesa como Segunda Língua');
INSERT INTO area_conhecimento (codigo, nome) VALUES (32, 'Estágio curricular supervisionado');
INSERT INTO area_conhecimento (codigo, nome) VALUES (99, 'Outras áreas do conhecimento');
INSERT INTO area_pos_graduacao (codigo, nome)  VALUES (1, 'EDUCAÇÃO');
INSERT INTO area_pos_graduacao (codigo, nome)  VALUES (2, 'HUMANIDADES E ARTES');
INSERT INTO area_pos_graduacao (codigo, nome)  VALUES (3, 'CIÊNCIAS SOCIAIS, NEGÓCIOS E DIREITOS');
INSERT INTO area_pos_graduacao (codigo, nome)  VALUES (4, 'CIÊNCIAS, MATEMÁTICA E COMPUTAÇÃO');
INSERT INTO area_pos_graduacao (codigo, nome)  VALUES (5, 'ENGENHARIA, PRODUÇÃO E CONSTRUÇÃO');
INSERT INTO area_pos_graduacao (codigo, nome)  VALUES (6, 'AGRICULTURA E VETERINÁRIA');
INSERT INTO area_pos_graduacao (codigo, nome)  VALUES (7, 'SAÚDE E BEM-ESTAR SOCIAL');
INSERT INTO area_pos_graduacao (codigo, nome)  VALUES (8, 'SERVIÇOS');
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
--        'José',
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