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
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String author;
    private String description;
    private String price;

    @ManyToOne(cascade = CascadeType.ALL)
    private Student student;


}
