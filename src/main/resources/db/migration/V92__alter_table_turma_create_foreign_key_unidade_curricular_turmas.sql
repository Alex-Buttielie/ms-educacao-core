ALTER TABLE turma ADD unidade_curricular_turma_id int;
ALTER TABLE turma ADD CONSTRAINT turma_unidade_curricular_fk FOREIGN KEY (unidade_curricular_turma_id) REFERENCES unidade_curricular_turma(id);
