ALTER TABLE turma ADD unidade_id int NOT NULL;
ALTER TABLE turma ADD codigo_turma int NOT NULL;
ALTER TABLE turma ADD CONSTRAINT turma_fk FOREIGN KEY (unidade_id) REFERENCES unidade_ensino(id);
