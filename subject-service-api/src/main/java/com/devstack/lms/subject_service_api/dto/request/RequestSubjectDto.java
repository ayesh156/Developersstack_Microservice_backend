package com.devstack.lms.subject_service_api.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RequestSubjectDto {
    private String name;
    private boolean status;
}
