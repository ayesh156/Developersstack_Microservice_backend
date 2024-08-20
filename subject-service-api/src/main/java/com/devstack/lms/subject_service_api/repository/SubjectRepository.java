package com.devstack.lms.subject_service_api.repository;

import com.devstack.lms.subject_service_api.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
