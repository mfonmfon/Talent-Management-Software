package com.semicolon.africa.talentmanagementsoftware.services;

import com.semicolon.africa.talentmanagementsoftware.data.repository.JobPostRepository;
import com.semicolon.africa.talentmanagementsoftware.dto.request.AddJobPostRequest;
import com.semicolon.africa.talentmanagementsoftware.dto.request.UpdateJobPostRequest;
import com.semicolon.africa.talentmanagementsoftware.dto.response.AddJobPostResponse;
import com.semicolon.africa.talentmanagementsoftware.dto.response.DeleteJobPostResponse;
import com.semicolon.africa.talentmanagementsoftware.dto.response.UpdateJobPostResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class JobPostServicesImplTest {

    @Autowired
    private JobPostService jobPostService;
    @Autowired
    private JobPostRepository jobPostRepository;

    @BeforeEach
    void setUp() {
        jobPostRepository.deleteAll();
    }

    @Test
    public void testThatJobsCanBePost(){
        AddJobPostRequest request =  new AddJobPostRequest();
        addDetails(request);
        AddJobPostResponse response = jobPostService.createPost(request);
        assertThat(response.getMessage()).contains("Job post successfully created");
    }

    private static void addDetails(AddJobPostRequest request) {
        request.setJobTitle(" Backend-Software-Engineer");
        request.setJobDescription("must be an expert and can write all our software");
        request.setSkills("Backend Engineer");
        request.setCompany("Chartered Standard Bank");
        request.setFixedPrice("50000");
        request.setLocation("Lagos");
        request.setDateCreated(LocalDateTime.now());
    }
    @Test
    public void testThatJobsCanBeUpdated(){
        UpdateJobPostRequest request = new UpdateJobPostRequest();
        request.setJobTitle(" Backend-Software-Engineer");
        request.setJobDescription("must be an expert and can write all our software");
        request.setSkills("Backend Engineer");
        request.setCompany("Chartered Standard Bank");
        request.setFixedPrice("50000");
        request.setJobLocation("Lagos");
        request.setDateUpdated(LocalDateTime.now());
        UpdateJobPostResponse response = jobPostService.updateJobPost(request);
        assertThat(response.getMessage()).contains("Post Updated");
    }


    @Test
    public void testThatJobPostCanBeDeleted(){
        AddJobPostRequest request = new AddJobPostRequest();
        request.setJobTitle(" Backend-Software-Engineer");
        request.setJobDescription("must be an expert and can write all our software");
        request.setSkills("Backend Engineer");
        request.setCompany("Chartered Standard Bank");
        request.setFixedPrice("50000");
        request.setLocation("Lagos");
        request.setDateCreated(LocalDateTime.now());
        DeleteJobPostResponse response = jobPostService.deletePost(request);
        assertThat(response.getMessage()).contains("Post Deleted");
    }

    @Test
    public void testThat_findJobPostByTitle(){
        AddJobPostRequest request = new AddJobPostRequest();

    }
}