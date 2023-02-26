package com.project.protal.dto;

import com.project.protal.model.Address;
import jakarta.persistence.Embedded;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "Build")
@NoArgsConstructor
public class StudentRequest {
    private long studentId;

    private String studentName;
    private String studentAge;
    private String studentPhoneNumber;
    private String studentBranch;
    private String studentDepartment;

    private Address address;


}
