ALTER TABLE public.CONFIG_ATIV_COMPLEMENTAR ADD CONSTRAINT fk_matriz_curricular
    FOREIGN KEY (fk_id_matriz_curricular)
        REFERENCES public.MATRIZ_CURRICULAR(id);

