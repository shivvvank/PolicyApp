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
    private String Username;
    @Column(name="Firstname")
    private String FirstName;
    @Column(name="Middlename")
    private String Middlename;
    @Column(name="Lastname")
    private String Lastname;
    @Column(name="DateOfBirth")
    private Date DateOfBirth;
    @Column(name="Gender")
    private char Gender;
    @Column(name="Profession")
    private String Profession;
    @Column(name="CurrentAddress")
    private String CurrentAddress;
    @Column(name="Nationality")
    private String Nationality;
    @Column(name="IDProofType")
    private String IDProofType;
    @Column(name="IDProofDocNumber")
    private String IDProofDocNumber;
    @Column(name="PhoneNumber")
    private String PhoneNumber;
    @Column(name="EmailAddress")
    private String EmailAddress;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getMiddlename() {
        return Middlename;
    }

    public void setMiddlename(String middlename) {
        Middlename = middlename;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
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

    public String getProfession() {
        return Profession;
    }

    public void setProfession(String profession) {
        Profession = profession;
    }

    public String getCurrentAddress() {
        return CurrentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        CurrentAddress = currentAddress;
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

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }

    public User(String username, String firstName, String middlename, String lastname, Date dateOfBirth, char gender, String profession, String currentAddress, String nationality, String IDProofType, String IDProofDocNumber, String phoneNumber, String emailAddress) {
        Username = username;
        FirstName = firstName;
        Middlename = middlename;
        Lastname = lastname;
        DateOfBirth = dateOfBirth;
        Gender = gender;
        Profession = profession;
        CurrentAddress = currentAddress;
        Nationality = nationality;
        this.IDProofType = IDProofType;
        this.IDProofDocNumber = IDProofDocNumber;
        PhoneNumber = phoneNumber;
        EmailAddress = emailAddress;
    }
}