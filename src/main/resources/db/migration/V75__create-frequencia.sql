CREATE SEQUENCE FREQUENCIA_ID_SEQ;

CREATE TABLE IF  NOT EXISTS FREQUENCIA (id INTEGER UNIQUE DEFAULT nextval('FREQUENCIA_ID_SEQ'),
                                     is_presente BOOLEAN,
                                     data_registro DATE,
                                     fk_id_chamada integer,
                                     fk_id_alu_turma integer,
                                     fk_id_conteudo_planejado INTEGER,
                                     CONSTRAINT fk_chamada FOREIGN KEY (fk_id_chamada)
                                         REFERENCES chamada (id),
                                     CONSTRAINT fk_alu_turma FOREIGN KEY (fk_id_alu_turma)
                                         REFERENCES aluno_turma (id),
                                     CONSTRAINT fk_conteudo_planejado FOREIGN KEY (fk_id_conteudo_planejado)
                                         REFERENCES conteudo_planejado (id)
);

ALTER SEQUENCE FREQUENCIA_ID_SEQ
    OWNED BY FREQUENCIA.ID;