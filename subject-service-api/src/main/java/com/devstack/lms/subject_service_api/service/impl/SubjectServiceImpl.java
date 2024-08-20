package com.devstack.lms.subject_service_api.service.impl;

import com.devstack.lms.subject_service_api.dto.request.RequestSubjectDto;
import com.devstack.lms.subject_service_api.entity.Subject;
import com.devstack.lms.subject_service_api.repository.SubjectRepository;
import com.devstack.lms.subject_service_api.service.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjectService {
    private final SubjectRepository subjectRepository;
    @Override
    public void createSubject(RequestSubjectDto dto) {
        Subject subject = Subject.builder()
                .name(dto.getName())
                .status(dto.isStatus()).build();
        subjectRepository.save(subject);
    }
}
