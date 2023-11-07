package br.com.coreeduc.aplication.domains;

public class ConteudoPlanejado {

    private Long id;
    private DiasLetivos diasLetivos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DiasLetivos getDiasLetivos() {
        return diasLetivos;
    }

    public void setDiasLetivos(DiasLetivos diasLetivos) {
        this.diasLetivos = diasLetivos;
    }

}
