ALTER TABLE CONFIG_ATIV_COMPLEMENTAR
    ADD CONSTRAINT fk_matriz_curricular
        FOREIGN KEY (matriz_curricular_id)
            REFERENCES MATRIZ_CURRICULAR (id);

