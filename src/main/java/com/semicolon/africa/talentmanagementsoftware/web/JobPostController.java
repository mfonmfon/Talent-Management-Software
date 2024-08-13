package com.semicolon.africa.talentmanagementsoftware.web;

import com.semicolon.africa.talentmanagementsoftware.dto.request.AddJobPostRequest;
import com.semicolon.africa.talentmanagementsoftware.dto.response.AddJobPostResponse;
import com.semicolon.africa.talentmanagementsoftware.dto.response.ApiResponse;
import com.semicolon.africa.talentmanagementsoftware.services.JobPostService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/job")
@RestController
@AllArgsConstructor
public class JobPostController {

    private final JobPostService jobPostService;

    @PostMapping("createPost")
    public ResponseEntity<?> createPost(AddJobPostRequest request){
        try {
            AddJobPostResponse response = jobPostService.createPost(request);
            return new ResponseEntity<>(new ApiResponse(true, response), HttpStatus.CREATED);
        }
        catch (Exception exception){
            return new ResponseEntity<>(new ApiResponse(false, exception), HttpStatus.BAD_REQUEST);
        }

    }
}
