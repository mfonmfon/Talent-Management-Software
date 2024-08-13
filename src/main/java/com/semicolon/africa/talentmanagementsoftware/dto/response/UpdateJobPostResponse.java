package com.semicolon.africa.talentmanagementsoftware.dto.response;

import com.fasterxml.jackson.annotation.JsonGetter;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
public class UpdateJobPostResponse {
    private String jobTitle;
    private String jobDescription;
    private String skills;
    private String fixedPrice;
    private String company;
    private String jobLocation;
    private String jobLink;
    private String location;
    private LocalDateTime dateUpdated;
    private String message;
}