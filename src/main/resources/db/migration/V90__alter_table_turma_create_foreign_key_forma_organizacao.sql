ALTER TABLE turma ADD forma_organizacao_turma_id int;
ALTER TABLE turma ADD CONSTRAINT turma_forma_organizacao_fk FOREIGN KEY (forma_organizacao_turma_id) REFERENCES forma_organizacao(id);
