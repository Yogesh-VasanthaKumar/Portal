package com.project.protal.controller;

import com.project.protal.dto.CourseRequest;
import com.project.protal.model.Course;
import com.project.protal.model.Student;
import com.project.protal.service.PortalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    public PortalService portalService;
    @GetMapping("/getCourse")
    public ResponseEntity<List<Course>> getCourse(){
        return new ResponseEntity<>(portalService.getCourse(), HttpStatus.OK);
    }

    @PostMapping("/addCourse")
    public ResponseEntity<String> addCourse(@RequestBody CourseRequest requestBody){
        return new ResponseEntity<>(portalService.addCourse(requestBody),HttpStatus.CREATED);
    }
    @PutMapping("/updateCourse")
    public ResponseEntity<Course> updateCourse(@PathVariable long Id, String courseTitle){
        return new ResponseEntity<>(portalService.updateCourse(Id,courseTitle),HttpStatus.OK);
    }

    @DeleteMapping("/deleteCourse")
    public ResponseEntity<String> deleteCourse(@PathVariable long Id){
        return new ResponseEntity<>(portalService.deleteCourse(Id), HttpStatus.OK);
    }
}
