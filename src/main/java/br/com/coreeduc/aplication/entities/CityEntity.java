package br.com.coreeduc.aplication.entities;


import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.UUID;

@Table(name = "city")
@Entity
public class CityEntity implements Serializable {

    private static final long serialVersionUID =  1L;

    @Id
    @Basic
    @Column(name="codigo_mec")
    private Long codigoMec;
    @Basic
    @Column(name="id")
    private String id = UUID.randomUUID().toString();
    @Basic
    @Column(name="name")
    private String name;
    @Basic
    @Column(name="state")
    private String state;

    public CityEntity() {
    }

    public CityEntity(Long codigoMec) {
        this.codigoMec = codigoMec;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
