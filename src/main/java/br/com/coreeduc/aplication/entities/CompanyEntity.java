package br.com.coreeduc.aplication.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "company")
@Entity
public class CompanyEntity {

    @Id
    @Basic
    @Column(name="id")
    private Long id;
    @Basic
    @Column(name="name")
    private String name;

    public CompanyEntity() {
    }

    public CompanyEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
