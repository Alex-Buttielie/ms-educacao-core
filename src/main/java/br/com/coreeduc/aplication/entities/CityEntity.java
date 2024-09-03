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

    public CityEntity() {
    }

    public CityEntity(Long id, Long codigoMec, String name) {
        this.id = id;
        this.codigoMec = codigoMec;
        this.name = name;
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
}
