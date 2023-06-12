package com.ProfileManagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name="UserNominees")
public class Nominee {
    @Id
    @Column(name="ID")
    private int ID;
    @Column(name="Fullname")
    private String FullName;
    @Column(name="DateOfBirth")
    private Date DateOfBirth;
    @Column(name="Gender")
    private char Gender;
    @Column(name="Nationality")
    private String Nationality;
    @Column(name="IDProofType")
    private String IDProofType;
    @Column(name="IDProofDocNumber")
    private String IDProofDocNumber;
    @Column(name="NomineeRelationId")
    private int NomineeRelationId;
    @Column(name="Username")
    private String Username;
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public char getGender() {
        return Gender;
    }

    public void setGender(char gender) {
        Gender = gender;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }

    public String getIDProofType() {
        return IDProofType;
    }

    public void setIDProofType(String IDProofType) {
        this.IDProofType = IDProofType;
    }

    public String getIDProofDocNumber() {
        return IDProofDocNumber;
    }

    public void setIDProofDocNumber(String IDProofDocNumber) {
        this.IDProofDocNumber = IDProofDocNumber;
    }

    public int getNomineeRelationId() {
        return NomineeRelationId;
    }

    public void setNomineeRelationId(int nomineeRelationId) {
        NomineeRelationId = nomineeRelationId;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }
}