ALTER TABLE diretriz ADD matriz_id int;
ALTER TABLE diretriz ADD CONSTRAINT matriz_fk FOREIGN KEY (matriz_id) REFERENCES matriz_curricular(id);
