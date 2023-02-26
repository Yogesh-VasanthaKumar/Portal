package com.project.protal.service;

import com.project.protal.dao.BookRepository;
import com.project.protal.dao.CourseRepository;
import com.project.protal.dao.LaptopRepository;
import com.project.protal.dao.StudentRepository;
import com.project.protal.dto.BookRequest;
import com.project.protal.dto.CourseRequest;
import com.project.protal.dto.LaptopRequest;
import com.project.protal.dto.StudentRequest;
import com.project.protal.model.Book;
import com.project.protal.model.Course;
import com.project.protal.model.Laptop;
import com.project.protal.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class PortalService {
@Autowired
    StudentRepository studentRepository;

@Autowired
    BookRepository bookRepository;
@Autowired
    LaptopRepository laptopRepository;

@Autowired
    CourseRepository courseRepository;


    public List<Student> getStudent(){
        return studentRepository.findAll();
    }

    public List<Course> getCourse(){
        return courseRepository.findAll();
    }

    public List<Book> getBook(){
        return bookRepository.findAll();
    }
    public List<Laptop> getLaptop(){
        return laptopRepository.findAll();
    }



public String addStudent(StudentRequest request){
    Student student =Student.Build(request.getStudentId(),request.getStudentName(),request.getStudentAge(),request.getStudentPhoneNumber(),request.getStudentBranch(),request.getStudentDepartment(),request.getAddress());
    studentRepository.save(student);
    return "Added";
}

    public String addBook(BookRequest request){
        Book book = Book.build(request.getId(),request.getAuthor(),request.getDescription(),request.getPrice(),request.getStudent());
        bookRepository.save(book);
        return "Added";
    }

    public String addCourse(CourseRequest request){
        Course course = Course.build(request.getId(),request.getCourseTitle(),request.getDescription(),request.getDuration(),request.getStudentList());
        courseRepository.save(course);
        return "Added";
    }

    public String addLaptop(LaptopRequest request){
        Laptop laptop = Laptop.build(request.getLaptopId(),request.getLaptopName(),request.getLaptopBrand(),request.getPrice(),request.getStudent());
        laptopRepository.save(laptop);
        return "Added";
    }



    public Student updateStudent(long studentId, String studentName){
        List<Student> studentList = studentRepository.findAll();
        for(Student i: studentList){
            if(i.getStudentId()==studentId){
                return i;
            }
        }
        return null;
    }

    public Book updateBook(long bookId, String authorName){
        List<Book> bookList = bookRepository.findAll();
        for(Book i: bookList){
            if(i.getId()==bookId){
                return i;
            }
        }
        return null;
    }
    public Course updateCourse(long courseId, String courseTitle){
        List<Course> courseList = courseRepository.findAll();
        for(Course i: courseList){
            if(i.getId()==courseId){
                return i;
            }
        }
        return null;
    }
    public Laptop updateLaptop(long laptopId, String laptopName){
        List<Laptop> laptopList = laptopRepository.findAll();
        for(Laptop i: laptopList){
            if(i.getLaptopId()==laptopId){
                i.setLaptopName(laptopName);
                return i;
            }
        }
        return null;
    }

    public String deleteStudent(long studentId){
        studentRepository.deleteById(studentId);
        return "Deleted";
    }
    public String deleteCourse(long courseId){
        courseRepository.deleteById(courseId);
        return "Deleted";
    }
    public String deleteBook(long bookId){
        bookRepository.deleteById(bookId);
        return "Deleted";
    }
    public String deleteLaptop(long laptopId){
        laptopRepository.deleteById(laptopId);
        return "Deleted";
    }
}
