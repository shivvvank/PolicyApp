package com.ProfileManagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name="UserProfiles")
public class User {
    @Id
    @Column(name="Username")
    private String username;
    @Column(name="Firstname")
    private String firstname;
    @Column(name="Middlename")
    private String middlename;
    @Column(name="Lastname")
    private String lastname;
    @Column(name="DateOfBirth")
    private Date dateOfBirth;
    @Column(name="Gender")
    private String gender;
    @Column(name="Profession")
    private String profession;
    @Column(name="CurrentAddress")
    private String currentAddress;
    @Column(name="Nationality")
    private String nationality;
    @Column(name="IDProofType")
    private String idProofType;
    @Column(name="IDProofDocNumber")
    private String idProofDocNumber;
    @Column(name="PhoneNumber")
    private String phoneNumber;
    @Column(name="EmailAddress")
    private String emailAddress;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstName) {
        this.firstname = firstName;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getIdProofType() {
        return idProofType;
    }

    public void setIdProofType(String IDProofType) {
        this.idProofType = IDProofType;
    }

    public String getIdProofDocNumber() {
        return idProofDocNumber;
    }

    public void setIdProofDocNumber(String IDProofDocNumber) {
        this.idProofDocNumber = IDProofDocNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}