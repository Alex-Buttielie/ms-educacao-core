ALTER TABLE composicao_ensino ADD CONSTRAINT fk_criterio_avaliacao
    FOREIGN KEY (criterio_avaliacao_id)
        REFERENCES public.criterio_avaliacao(id);


