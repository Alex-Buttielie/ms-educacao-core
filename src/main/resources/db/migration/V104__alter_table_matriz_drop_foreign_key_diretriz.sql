ALTER TABLE public.matriz_curricular DROP COLUMN if exists diretriz_id;
ALTER TABLE public.matriz_curricular DROP CONSTRAINT if exists fk_diretriz;
