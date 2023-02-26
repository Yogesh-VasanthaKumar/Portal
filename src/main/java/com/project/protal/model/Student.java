package com.project.protal.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor(staticName = "Build")
@NoArgsConstructor
@Entity
@Table
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long studentId;

    private String studentName;
    private String studentAge;
    private String studentPhoneNumber;
    private String studentBranch;
    private String studentDepartment;
    @Embedded
    private Address address;
}
