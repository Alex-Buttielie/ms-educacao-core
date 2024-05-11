package br.com.coreeduc.aplication.domains;

public class HorarioFuncionamentoTurma {

    private Long idUser;
    private String horaInicial;
    private String horaFinal;
    private String minutoInicial;
    private String minutoFinal;

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getHoraInicial() {
        return horaInicial;
    }

    public void setHoraInicial(String horaInicial) {
        this.horaInicial = horaInicial;
    }

    public String getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }

    public String getMinutoInicial() {
        return minutoInicial;
    }

    public void setMinutoInicial(String minutoInicial) {
        this.minutoInicial = minutoInicial;
    }

    public String getMinutoFinal() {
        return minutoFinal;
    }

    public void setMinutoFinal(String minutoFinal) {
        this.minutoFinal = minutoFinal;
    }

}
