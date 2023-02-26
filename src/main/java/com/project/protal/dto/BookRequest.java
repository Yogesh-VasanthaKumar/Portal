package com.project.protal.dto;

import com.project.protal.model.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "Build")
@NoArgsConstructor
public class BookRequest {
    private long id;
    private String author;
    private String description;
    private String price;
    private Student student;
}
