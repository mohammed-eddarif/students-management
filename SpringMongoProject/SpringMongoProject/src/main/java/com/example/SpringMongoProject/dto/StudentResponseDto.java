package com.example.SpringMongoProject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class StudentResponseDto {
    private String _id;
    private String studentName;
    private String studentAddress;
    private String mobile;
}
