ALTER TABLE turma ADD unidade_ensino_codigo_inep int;
ALTER TABLE turma ADD CONSTRAINT turma_unidade_fk FOREIGN KEY (unidade_ensino_codigo_inep) REFERENCES unidade_ensino(codigo_inep);
