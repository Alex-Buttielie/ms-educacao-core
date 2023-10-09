package br.com.coreeduc.aplication.domains;

public class QuantidadeComputadoresEmUsoAlunos {

    private Long id;
    private Long computadoresMesaDesktop;
    private Long computadoresPortateis;
    private Long tablets;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getComputadoresMesaDesktop() {
        return computadoresMesaDesktop;
    }

    public void setComputadoresMesaDesktop(Long computadoresMesaDesktop) {
        this.computadoresMesaDesktop = computadoresMesaDesktop;
    }

    public Long getComputadoresPortateis() {
        return computadoresPortateis;
    }

    public void setComputadoresPortateis(Long computadoresPortateis) {
        this.computadoresPortateis = computadoresPortateis;
    }

    public Long getTablets() {
        return tablets;
    }

    public void setTablets(Long tablets) {
        this.tablets = tablets;
    }
}
