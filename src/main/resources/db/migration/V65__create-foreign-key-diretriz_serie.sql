ALTER TABLE public.diretriz ADD CONSTRAINT fk_serie
    FOREIGN KEY (fk_id_serie)
        REFERENCES public.serie(id);


