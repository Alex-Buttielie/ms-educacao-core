ALTER TABLE turma ADD dias_semana_id int NOT NULL;
ALTER TABLE turma ADD CONSTRAINT turma_dias_semana_fk FOREIGN KEY (dias_semana_id) REFERENCES dias_semana_turma(id);
