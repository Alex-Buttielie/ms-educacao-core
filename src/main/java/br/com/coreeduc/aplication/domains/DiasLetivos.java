package br.com.coreeduc.aplication.domains;

public class DiasLetivos {
    private Long id;
    private Mes mes;
    private Calendario calendario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Calendario getCalendario() {
        return calendario;
    }

    public void setCalendario(Calendario calendario) {
        this.calendario = calendario;
    }

}
