package com.devstack.lms.registration_service_api.service;

import com.devstack.lms.registration_service_api.dto.request.RequestRegistrationDto;

public interface RegistrationService {
    public void registerStudent(RequestRegistrationDto dto);
}
