package com.semicolon.africa.talentmanagementsoftware.data.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Document
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class JobPost {
    private String id;
    private String jobTitle;
    private String jobDescription;
    private String fixedPrice;
    private String skills;
    private String company;
    private String Location;
    private String jobLink;
    private LocalDateTime dateCreated = LocalDateTime.now();
    private LocalDateTime dateUpdated;
}
