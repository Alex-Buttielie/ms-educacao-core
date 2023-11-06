ALTER TABLE public.composicao_ensino ADD CONSTRAINT fk_criterio_avaliacao
    FOREIGN KEY (fk_id_criterio)
        REFERENCES public.criterio_avaliacao(id);


