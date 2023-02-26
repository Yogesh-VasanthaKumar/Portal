package com.project.protal.dto;

import com.project.protal.model.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor(staticName = "Build")
@NoArgsConstructor
public class CourseRequest {
    private long id;
    private String courseTitle;
    private String description;
    private String duration;
    List<Student> studentList = new ArrayList<>();
}
