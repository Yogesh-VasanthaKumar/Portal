package com.project.protal.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
public class Address {
private String landmark;
private String zipcode;
private String district;
private String state;
private String country;
}
