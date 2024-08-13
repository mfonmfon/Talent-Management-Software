package com.semicolon.africa.talentmanagementsoftware.data.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
@AllArgsConstructor
@NoArgsConstructor
public class FreeLancers {
    private String Id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String skills;
    private String password;
    private String chooseUserName;
    private String formerCompany;
    private String homeAddress;
    private String expectedPrice;
    private String yearsOfExperiences;

}
