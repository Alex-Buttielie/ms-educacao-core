CREATE SEQUENCE PROFESSOR_ID_SEQ;

CREATE TABLE IF  NOT EXISTS PROFESSOR (id INTEGER UNIQUE DEFAULT nextval('PROFESSOR_ID_SEQ'),
                                      fk_id_pessoa INTEGER,
                                       CONSTRAINT fk_pessoa FOREIGN KEY (fk_id_pessoa)
                                           REFERENCES pessoa (id)
);

ALTER SEQUENCE PROFESSOR_ID_SEQ
    OWNED BY PROFESSOR.ID;
