package com.devstack.lms.program_service_api.service;

import com.devstack.lms.program_service_api.dto.request.RequestProgramDto;

public interface ProgramService {
    public void createProgram(RequestProgramDto programDto);
}
