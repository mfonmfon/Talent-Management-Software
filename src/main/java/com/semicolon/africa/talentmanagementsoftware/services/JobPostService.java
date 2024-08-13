package com.semicolon.africa.talentmanagementsoftware.services;

import com.semicolon.africa.talentmanagementsoftware.dto.request.AddJobPostRequest;
import com.semicolon.africa.talentmanagementsoftware.dto.request.UpdateJobPostRequest;
import com.semicolon.africa.talentmanagementsoftware.dto.response.AddJobPostResponse;
import com.semicolon.africa.talentmanagementsoftware.dto.response.DeleteJobPostResponse;
import com.semicolon.africa.talentmanagementsoftware.dto.response.UpdateJobPostResponse;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
public interface JobPostService {

    AddJobPostResponse createPost(AddJobPostRequest request);

    UpdateJobPostResponse updateJobPost(UpdateJobPostRequest request);

    DeleteJobPostResponse deletePost(AddJobPostRequest request);
}
