create database UserProfileDB;
use UserProfileDB;
create table UserProfiles
(
	Username varchar(10) constraint username_chk Check(Length(Username)=10) primary key,
    Firstname varchar(20),
    Middlename varchar(20),
    Lastname varchar(20),
    DateOfBirth date constraint dob_chk Check(DATE_SUB('2023-06-10',INTERVAL 18 YEAR)>=DateOfBirth),
    Gender varchar(1) constraint gender_chk Check(Gender like'M'or Gender like 'F'or Gender like 'O'),
    Profession varchar(20),
    CurrentAddress varchar(200),
    Nationality varchar(20),
    IDProofType varchar(20) constraint IDProofType_chk Check(IDProofType like 'Passport'or IDProofType like 'Aadhar'or IDProofType like 'PAN'or IDProofType like 'DrivingLicense'),
    IDProofDocNumber varchar(20),
    PhoneNumber varchar(26),
    EmailAddress varchar(100)
);
create table NomineeRelations(
	ID int(10) primary key,
    Type varchar(10)
);
Create table UserNominees(
	ID int(10) primary key,
    Fullname varchar(50),
    DateOfBirth date constraint dob_chk_nominee Check(DATE_SUB('2023-06-10',INTERVAL 18 YEAR)>=DateOfBirth),
    Gender varchar(1) constraint gender_chk_nominee Check(Gender like'M'or Gender like 'F'or Gender like 'O'),
    IDProofType varchar(20) constraint IDProofType_chk_nominee Check(IDProofType like 'Passport'or IDProofType like 'Aadhar'or IDProofType like 'PAN'or IDProofType like 'DrivingLicense'),
    IDProofDocNumber varchar(20),
    Nationality varchar(20),
    NomineeRelationId int(10) ,
    Username varchar(10),
    foreign key (Username) references UserProfiles(Username),
    foreign key (NomineeRelationId) references NomineeRelations(ID)
);
insert into NomineeRelations values(1,'Parent');
insert into NomineeRelations values(2,'Child');
insert into NomineeRelations values(3,'Sibling');
insert into NomineeRelations values(4,'Spouse');
insert into NomineeRelations values(5,'Cousin');