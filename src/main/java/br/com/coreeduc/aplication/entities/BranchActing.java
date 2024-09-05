package br.com.coreeduc.aplication.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "branch_acting")
@Entity
public class BranchActing implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name="code")
    private String code;
    @Basic
    @Column(name="description")
    private String description;
    @Basic
    @Column(name="observation")
    private String observation;
    @ManyToOne
    @JoinColumn()
    @JsonFormat
    private GroupBranchActing groupBranchActing;

    public BranchActing() {
    }

    public BranchActing(Long id,
                        String code,
                        String description,
                        String observation,
                        GroupBranchActing groupBranchActing) {
        this.id = id;
        this.code = code;
        this.description = description;
        this.observation = observation;
        this.groupBranchActing = groupBranchActing;
    }

    public BranchActing(String code,
                        String description,
                        String observation,
                        GroupBranchActing groupBranchActing) {
        this.code = code;
        this.description = description;
        this.observation = observation;
        this.groupBranchActing = groupBranchActing;
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

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public GroupBranchActing getGroupBranchActing() {
        return groupBranchActing;
    }

    public void setGroupBranchActing(GroupBranchActing groupBranchActing) {
        this.groupBranchActing = groupBranchActing;
    }
}
