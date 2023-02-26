package com.project.protal.dto;

import com.project.protal.model.Student;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "Build")
@NoArgsConstructor
public class LaptopRequest {
    private long laptopId;
    private String laptopName;
    private String laptopBrand;
    private int price;
    private Student student;

}

