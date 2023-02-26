package com.project.protal.dao;

import com.project.protal.model.Book;
import com.project.protal.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
