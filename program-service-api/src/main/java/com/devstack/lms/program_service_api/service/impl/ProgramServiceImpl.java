package com.devstack.lms.program_service_api.service.impl;

import com.devstack.lms.program_service_api.dto.request.RequestProgramDto;
import com.devstack.lms.program_service_api.entity.Program;
import com.devstack.lms.program_service_api.repo.ProgramRepository;
import com.devstack.lms.program_service_api.service.ProgramService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProgramServiceImpl implements ProgramService {

    private final ProgramRepository programRepository;
    @Override
    public void createProgram(RequestProgramDto programDto) {

        Program program = Program.builder()
                .name(programDto.getName())
                .price(programDto.getPrice())
                .startDate(programDto.getStartDate())
                .subjects(programDto.getSubjects())
                .build();

        programRepository.save(program);

    }
}
