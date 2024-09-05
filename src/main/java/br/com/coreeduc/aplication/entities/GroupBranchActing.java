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

@Table(name = "group_branch_acting")
@Entity
public class GroupBranchActing implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name="description")
    private String description;
    @Basic
    @Column(name="code")
    private String code;
    @ManyToOne
    @JoinColumn()
    @JsonFormat
    private DivisionGroupBranchActing divisionGroupBranchActing;

    public GroupBranchActing() {
    }

    public GroupBranchActing(Long id, String description, String code, DivisionGroupBranchActing divisionGroupBranchActing) {
        this.id = id;
        this.description = description;
        this.code = code;
        this.divisionGroupBranchActing = divisionGroupBranchActing;
    }

    public GroupBranchActing(String code, String description, DivisionGroupBranchActing divisionGroupBranchActing) {
        this.code = code;
        this.description = description;
        this.divisionGroupBranchActing = divisionGroupBranchActing;
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

    public DivisionGroupBranchActing getDivisionGroupBranchActing() {
        return divisionGroupBranchActing;
    }

    public void setDivisionGroupBranchActing(DivisionGroupBranchActing divisionGroupBranchActing) {
        this.divisionGroupBranchActing = divisionGroupBranchActing;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
