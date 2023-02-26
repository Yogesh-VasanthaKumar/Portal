package com.project.protal.controller;

import com.project.protal.dto.StudentRequest;
import com.project.protal.model.Student;
import com.project.protal.service.PortalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class   StudentController {

    @Autowired
    public PortalService portalService;
    @GetMapping("/getStudent")
    public ResponseEntity<List<Student>> getStudent(){
        return new ResponseEntity<>(portalService.getStudent(), HttpStatus.OK);
    }

    @PostMapping("/addStudent")
    public ResponseEntity<String> addStudent(@RequestBody StudentRequest studentRequest){
        return new ResponseEntity<>(portalService.addStudent(studentRequest), HttpStatus.CREATED);
        }
    @PutMapping("/updateStudent")
    public ResponseEntity<Student> updateStudent(@PathVariable long studentId, String studentName){
        return new ResponseEntity<>(portalService.updateStudent(studentId,studentName),HttpStatus.OK);
    }

    @DeleteMapping("/deleteStudent")
    public ResponseEntity<String> deleteMapping(@PathVariable long studentId){
        return new ResponseEntity<>(portalService.deleteStudent(studentId), HttpStatus.OK);
    }
}
