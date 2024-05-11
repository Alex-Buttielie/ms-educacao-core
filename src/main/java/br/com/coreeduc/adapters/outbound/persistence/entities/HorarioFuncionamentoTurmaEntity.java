package br.com.coreeduc.adapters.outbound.persistence.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "horario_funcionamento")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HorarioFuncionamentoTurmaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idUser;
    @Basic
    @Column(name = "hora_inicial")
    private String horaInicial;
    @Basic
    @Column(name = "hora_final")
    private String horaFinal;
    @Basic
    @Column(name = "minuto_inicial")
    private String minutoInicial;
    @Basic
    @Column(name = "minuto_final")
    private String minutoFinal;


}
