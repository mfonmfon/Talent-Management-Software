package com.semicolon.africa.talentmanagementsoftware.dto.response;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Setter
@Getter
public class AddJobPostResponse {
    private String postId;
    private String jobTitle;
    private String jobDescription;
    private String fixedPrice;
    private String skills;
    private String company;
    private String Location;
    private String jobLink;
    private LocalDateTime dateCreated = LocalDateTime.now();
    private LocalDateTime dateUpdated;
    private String message;
}
