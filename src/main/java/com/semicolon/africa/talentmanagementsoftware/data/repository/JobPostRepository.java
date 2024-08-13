package com.semicolon.africa.talentmanagementsoftware.data.repository;

import com.semicolon.africa.talentmanagementsoftware.data.model.JobPost;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Repository
public interface JobPostRepository extends MongoRepository<JobPost, String> {
}
