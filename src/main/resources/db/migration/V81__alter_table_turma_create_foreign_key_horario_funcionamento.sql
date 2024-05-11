ALTER TABLE turma ADD horario_funcionamento_id int NOT NULL;
ALTER TABLE turma ADD CONSTRAINT turma_horario_funcionamento_fk FOREIGN KEY (horario_funcionamento_id) REFERENCES horario_funcionamento(id);
