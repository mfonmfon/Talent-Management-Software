package com.semicolon.africa.talentmanagementsoftware.data.repository;

import com.semicolon.africa.talentmanagementsoftware.data.model.JobPost;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JobPostRepository extends MongoRepository<JobPost, String> {
}
