package com.devstack.lms.subject_service_api.service;

import com.devstack.lms.subject_service_api.dto.request.RequestSubjectDto;

public interface SubjectService {
    public void createSubject(RequestSubjectDto dto);
}
