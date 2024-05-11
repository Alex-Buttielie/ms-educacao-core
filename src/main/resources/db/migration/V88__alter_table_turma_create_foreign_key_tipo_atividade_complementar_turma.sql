ALTER TABLE turma ADD tipo_atividade_complementar_id int;
ALTER TABLE turma ADD CONSTRAINT turma_atividade_complementar_fk FOREIGN KEY (tipo_atividade_complementar_id) REFERENCES tipo_atividade_complementar(id);
