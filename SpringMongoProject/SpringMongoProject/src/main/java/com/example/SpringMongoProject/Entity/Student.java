package com.example.SpringMongoProject.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Document(collection ="students")
public class Student {

    @Id
    private String _id;
    private String studentName;
    private String studentAddress;
    private String mobile;


}