ALTER TABLE diretriz
    ADD CONSTRAINT fk_serie
        FOREIGN KEY (serie_id)
            REFERENCES serie (id);


