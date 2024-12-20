package br.com.coreeduc.aplication.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "public_place")
@Entity
public class PublicPlaceEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "description ")
    private String description;
    @Basic
    @Column(name = "postal_code  ")
    private String postalCode;
    @OneToOne
    @JoinColumn
    @JsonFormat
    private NeighbordhoodEntity neighbordhood;


    public PublicPlaceEntity() {
    }

    public PublicPlaceEntity(Long id, String description, String postalCode) {
        this.id = id;
        this.description = description;
        this.postalCode = postalCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public NeighbordhoodEntity getNeighbordhood() {
        return neighbordhood;
    }

    public void setNeighbordhood(NeighbordhoodEntity neighbordhood) {
        this.neighbordhood = neighbordhood;
    }

}
