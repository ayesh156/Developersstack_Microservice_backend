package com.devstack.lms.program_service_api.controller;

import com.devstack.lms.program_service_api.dto.request.RequestProgramDto;
import com.devstack.lms.program_service_api.service.ProgramService;
import com.devstack.lms.program_service_api.util.StandardResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/programs")
@RequiredArgsConstructor
public class ProgramController {

    /*
    *
    {
        "name":"Fullstack Development Program",
            "price":50000,
            "startDate":"2024-08-13",
            "subjects":[
        {"id":1,"name":"Java"},
        {"id":2,"name":"HTML"},
        {"id":3,"name":"CSS"},
        {"id":4,"name":"JavaScript"},
        {"id":5,"name":"C#"}
    ]
    }
    *
    * */

    private final ProgramService programService;

    @PostMapping
    private ResponseEntity<StandardResponse> createProgram(
            @RequestBody RequestProgramDto requestProgramDto){
        programService.createProgram(requestProgramDto);
         return new ResponseEntity<>(
                 new StandardResponse(201,"Program was Saved!", requestProgramDto.getName()),
                 HttpStatus.CREATED
         );
    }
}
