ALTER TABLE public.unidade_ensino ADD CONSTRAINT esfera_administrativa_id
    FOREIGN KEY (esfera_administrativa_id) REFERENCES public.esfera_administrativa(id);

ALTER TABLE public.unidade_ensino ADD CONSTRAINT endereco_unidade_id
    FOREIGN KEY (endereco_unidade_id) REFERENCES public.endereco_unidade(id);

ALTER TABLE public.unidade_ensino ADD CONSTRAINT mantenedora_escola_privada_id
    FOREIGN KEY (mantenedora_escola_privada_id) REFERENCES public.mantenedora_escola_privada(id);

ALTER TABLE public.unidade_ensino ADD CONSTRAINT formas_contratacao_id
    FOREIGN KEY (formas_contratacao_id) REFERENCES public.formas_contratacao(id);

ALTER TABLE public.unidade_ensino ADD CONSTRAINT numero_matriculas_atendidas_parceria_convenio_id
    FOREIGN KEY (numero_matriculas_atendidas_parceria_convenio_id) REFERENCES public.numero_matriculas_atendidas_parceria_convenio(id);