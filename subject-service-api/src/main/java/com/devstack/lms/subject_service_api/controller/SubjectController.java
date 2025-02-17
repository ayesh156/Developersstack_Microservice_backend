package com.devstack.lms.subject_service_api.controller;
import com.devstack.lms.subject_service_api.dto.request.RequestSubjectDto;
import com.devstack.lms.subject_service_api.service.SubjectService;
import com.devstack.lms.subject_service_api.util.StandardResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/subjects")
@RequiredArgsConstructor
public class SubjectController {
    private final SubjectService subjectService;

    @PostMapping
    private ResponseEntity<StandardResponse> createSubject(
            @RequestBody RequestSubjectDto requestSubjectDto){
        subjectService.createSubject(requestSubjectDto);
        return new ResponseEntity<>(
                new StandardResponse(201,"Subject was Saved!", requestSubjectDto.getName()),
                HttpStatus.CREATED
        );
    }
}
