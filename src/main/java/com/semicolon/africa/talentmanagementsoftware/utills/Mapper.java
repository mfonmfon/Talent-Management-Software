package com.semicolon.africa.talentmanagementsoftware.utills;

import com.semicolon.africa.talentmanagementsoftware.data.model.JobPost;
import com.semicolon.africa.talentmanagementsoftware.dto.request.AddJobPostRequest;
import com.semicolon.africa.talentmanagementsoftware.dto.response.AddJobPostResponse;

import java.time.LocalDateTime;

public class Mapper {
    public static AddJobPostResponse addResponseMapper(AddJobPostResponse response, JobPost jobPost) {
        response.setJobTitle(jobPost.getJobTitle());
        response.setJobDescription(jobPost.getJobDescription());
        response.setFixedPrice(jobPost.getFixedPrice());
        response.setSkills(jobPost.getSkills());
        response.setCompany(jobPost.getCompany());
        response.setLocation(jobPost.getLocation());
        response.setJobLink(jobPost.getJobLink());
        response.setDateCreated(LocalDateTime.now());
        response.setMessage("Job post successfully created");
        return response;
    }

    public static JobPost addPostMapper(AddJobPostRequest request) {
        JobPost jobPost = new JobPost();
        jobPost.setJobDescription(request.getJobDescription());
        jobPost.setJobTitle(request.getJobTitle());
        jobPost.setSkills(request.getSkills());
        jobPost.setFixedPrice(request.getFixedPrice());
        jobPost.setCompany(request.getCompany());
        jobPost.setLocation(request.getLocation());
        jobPost.setJobLink(request.getJobLink());
        jobPost.setDateCreated(LocalDateTime.now());
        return jobPost;
    }
}
