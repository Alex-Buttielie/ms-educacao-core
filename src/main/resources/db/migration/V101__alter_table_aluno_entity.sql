ALTER TABLE aluno_turma ADD aluno_id int NOT NULL;
ALTER TABLE aluno_turma ADD CONSTRAINT aluno_fk
    FOREIGN KEY (aluno_id) REFERENCES aluno(id);
