package com.semicolon.africa.talentmanagementsoftware.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class AddJobPostRequest {
    private String userId;
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
