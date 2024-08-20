package com.devstack.lms.registration_service_api.service.impl;

import com.devstack.lms.registration_service_api.dto.request.RequestRegistrationDto;
import com.devstack.lms.registration_service_api.entity.Registration;
import com.devstack.lms.registration_service_api.repository.RegistrationRepository;
import com.devstack.lms.registration_service_api.service.RegistrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class RegistrationServiceImpl implements RegistrationService {

    private final RegistrationRepository repository;
    @Override
    public void registerStudent(RequestRegistrationDto dto) {
        Registration registration = Registration.builder()
                .registerDate(dto.getRegisterDate())
                .studentId(dto.getStudentId())
                .programId(String.valueOf(dto.getStudentId()))
                .programId(dto.getProgramId())
                .intake(dto.getIntake())
                .build();
        repository.save(registration);
    }
}
