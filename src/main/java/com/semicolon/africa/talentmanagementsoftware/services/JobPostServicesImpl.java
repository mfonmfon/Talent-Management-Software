package com.semicolon.africa.talentmanagementsoftware.services;

import com.semicolon.africa.talentmanagementsoftware.data.model.JobPost;
import com.semicolon.africa.talentmanagementsoftware.data.repository.JobPostRepository;
import com.semicolon.africa.talentmanagementsoftware.dto.request.AddJobPostRequest;
import com.semicolon.africa.talentmanagementsoftware.dto.request.UpdateJobPostRequest;
import com.semicolon.africa.talentmanagementsoftware.dto.response.AddJobPostResponse;
import com.semicolon.africa.talentmanagementsoftware.dto.response.DeleteJobPostResponse;
import com.semicolon.africa.talentmanagementsoftware.dto.response.UpdateJobPostResponse;
import com.semicolon.africa.talentmanagementsoftware.exception.FindPostByIdException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

import static com.semicolon.africa.talentmanagementsoftware.utills.Mapper.addPostMapper;
import static com.semicolon.africa.talentmanagementsoftware.utills.Mapper.addResponseMapper;

@Service
public class JobPostServicesImpl implements  JobPostService{
    
    @Autowired
    private JobPostRepository jobPostRepository;

    @Override
    public AddJobPostResponse createPost(AddJobPostRequest request) {
        JobPost jobPost = addPostMapper(request);
        jobPost =  jobPostRepository.save(jobPost);
        AddJobPostResponse response = new AddJobPostResponse();
        return addResponseMapper(response, jobPost);
    }

    @Override
    public UpdateJobPostResponse updateJobPost(UpdateJobPostRequest request) {
        JobPost jobPost = new JobPost();
        jobPost.setJobTitle(request.getJobTitle());
        jobPost.setJobDescription(request.getJobDescription());
        jobPost.setFixedPrice(request.getFixedPrice());
        jobPost.setSkills(request.getSkills());
        jobPost.setJobLink(request.getJobLink());
        jobPost.setCompany(request.getCompany());
        jobPost.setLocation(request.getJobLocation());
        jobPost.setDateUpdated(request.getDateUpdated());
        jobPostRepository.save(jobPost);
        UpdateJobPostResponse response = new UpdateJobPostResponse();
        response.setJobTitle(jobPost.getJobTitle());
        response.setJobDescription(jobPost.getJobDescription());
        response.setFixedPrice(jobPost.getFixedPrice());
        response.setSkills(jobPost.getSkills());
        response.setCompany(jobPost.getCompany());
        response.setJobLocation(jobPost.getLocation());
        response.setDateUpdated(LocalDateTime.now());
        response.setMessage("Post Updated");
        return response;
    }
    @Override
    public DeleteJobPostResponse deletePost(AddJobPostRequest request) {
        JobPost jobPost = findPostById(request.getUserId());
        jobPost.setJobTitle(request.getJobTitle());
        jobPost.setJobDescription(request.getJobDescription());
        jobPost.setFixedPrice(request.getFixedPrice());
        jobPost.setSkills(request.getSkills());
        jobPost.setJobLink(request.getJobLink());
        jobPost.setCompany(request.getCompany());
        jobPost.setLocation(request.getLocation());
        jobPost.setDateUpdated(request.getDateUpdated());
        jobPostRepository.save(jobPost);
        DeleteJobPostResponse response = new DeleteJobPostResponse();
        response.setMessage("Post Deleted");
        return response;
    }
    private JobPost findPostById(String userId) {
        return jobPostRepository.findById(userId).
                orElseThrow(()-> new FindPostByIdException("Post Id Not Found"));
    }
}