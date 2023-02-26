package com.project.protal.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
@Entity
@Table
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String courseTitle;
    private String description;
    private String duration;

    @ManyToMany(cascade = CascadeType.ALL)
    List<Student> studentList = new ArrayList<>();

}
