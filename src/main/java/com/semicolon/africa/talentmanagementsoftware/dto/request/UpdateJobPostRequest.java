package com.semicolon.africa.talentmanagementsoftware.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class UpdateJobPostRequest {
    private String jobTitle;
    private String jobDescription;
    private String skills;
    private String fixedPrice;
    private String company;
    private String jobLocation;
    private String jobLink;
    private LocalDateTime dateUpdated;
}
