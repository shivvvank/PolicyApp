package com.ProfileManagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="NomineeRelations")
public class NomineeRelation {
    public NomineeRelation() {
    }

    public NomineeRelation(int ID, String type) {
        this.ID = ID;
        Type = type;
    }

    @Id
    @Column(name="ID")
    private int ID;
    @Column(name="Type")
    private String Type;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getType() {
        return Type;
    }
}