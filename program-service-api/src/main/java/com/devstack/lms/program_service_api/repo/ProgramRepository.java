package com.devstack.lms.program_service_api.repo;

import com.devstack.lms.program_service_api.entity.Program;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProgramRepository extends MongoRepository<Program, String> {

}
