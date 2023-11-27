ALTER TABLE composicao_ensino
    ADD CONSTRAINT fk_criterio_avaliacao
        FOREIGN KEY (criterio_avaliacao_id)
            REFERENCES criterio_avaliacao (id);


