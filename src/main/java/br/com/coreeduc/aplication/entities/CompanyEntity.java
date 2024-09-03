package br.com.coreeduc.aplication.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "company")
@Entity
public class CompanyEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Basic
    @Column(name="fantasy_name")
    private String fantasyName;
    @Basic
    @Column(name="name_company")
    private String nameCompany;

    public CompanyEntity() {
    }

    public CompanyEntity(Long id, String fantasyName) {
        this.id = id;
        this.fantasyName = fantasyName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFantasyName() {
        return fantasyName;
    }

    public void setFantasyName(String name) {
        this.fantasyName = name;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }
}
