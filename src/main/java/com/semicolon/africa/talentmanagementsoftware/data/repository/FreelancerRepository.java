package com.semicolon.africa.talentmanagementsoftware.data.repository;

import com.semicolon.africa.talentmanagementsoftware.data.model.FreeLancers;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FreelancerRepository extends MongoRepository<FreeLancers, String> {
}
