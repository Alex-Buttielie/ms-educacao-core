ALTER TABLE public.dias_letivos ADD CONSTRAINT fk_mes
    FOREIGN KEY (fk_id_mes)
        REFERENCES public.mes(id);

