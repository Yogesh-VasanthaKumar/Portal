package com.project.protal.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
@Entity
@Table
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long laptopId;
    private String laptopName;
    private String laptopBrand;
    private int price;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn( referencedColumnName = "studentId")
    private Student student;
}
