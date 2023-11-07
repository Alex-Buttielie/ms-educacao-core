ALTER TABLE dias_letivos ADD CONSTRAINT fk_mes
    FOREIGN KEY (mes_id)
        REFERENCES public.mes(id);

