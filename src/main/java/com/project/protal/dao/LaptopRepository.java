package com.project.protal.dao;

import com.project.protal.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop,Long> {
}
