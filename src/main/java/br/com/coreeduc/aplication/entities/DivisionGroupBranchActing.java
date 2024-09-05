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

@Table(name = "division_group_branch_acting")
@Entity
public class DivisionGroupBranchActing implements Serializable {

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
    private SessionBranchActing sessionBranchActing;

    public DivisionGroupBranchActing() {
    }

    public DivisionGroupBranchActing(Long id, String description, String code, SessionBranchActing sessionBranchActing) {
        this.id = id;
        this.description = description;
        this.code = code;
        this.sessionBranchActing = sessionBranchActing;
    }

    public DivisionGroupBranchActing(String code, String description, SessionBranchActing sessionBranchActing) {
        this.code = code;
        this.description = description;
        this.sessionBranchActing = sessionBranchActing;
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

    public SessionBranchActing getSessionBranchActing() {
        return sessionBranchActing;
    }

    public void setSessionBranchActing(SessionBranchActing sessionBranchActing) {
        this.sessionBranchActing = sessionBranchActing;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
