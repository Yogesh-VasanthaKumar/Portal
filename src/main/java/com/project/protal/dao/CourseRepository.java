package com.project.protal.dao;

import com.project.protal.model.Course;
import com.project.protal.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
