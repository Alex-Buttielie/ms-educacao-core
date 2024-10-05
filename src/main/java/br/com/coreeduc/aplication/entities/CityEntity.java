package br.com.coreeduc.aplication.entities;


import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "city")
@Entity
public class CityEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name="codigo_mec")
    private Long codigoMec;
    @Basic
    @Column(name="name")
    private String name;
    @Basic
    @Column(name="state")
    private String state;

    public CityEntity() {
    }

    public CityEntity(Long id, Long codigoMec, String name, String state) {
        this.id = id;
        this.codigoMec = codigoMec;
        this.name = name;
        this.state = state;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCodigoMec() {
        return codigoMec;
    }

    public void setCodigoMec(Long codigoMec) {
        this.codigoMec = codigoMec;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
