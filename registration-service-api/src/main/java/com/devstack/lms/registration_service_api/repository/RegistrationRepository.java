package com.devstack.lms.registration_service_api.repository;

import com.devstack.lms.registration_service_api.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {
}
