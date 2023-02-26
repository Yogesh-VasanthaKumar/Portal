package com.project.protal.controller;

import com.project.protal.dto.LaptopRequest;
import com.project.protal.model.Laptop;
import com.project.protal.model.Student;
import com.project.protal.service.PortalService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {
    @Autowired
    public PortalService portalService;
    @GetMapping("/getLaptop")
    public ResponseEntity<List<Laptop>> getLaptop(){
        return new ResponseEntity<>(portalService.getLaptop(), HttpStatus.OK);
    }

    @PostMapping("/addLaptop")
    public ResponseEntity<String> addLaptop(@RequestBody LaptopRequest requestBody){
        return new ResponseEntity<>(portalService.addLaptop(requestBody),HttpStatus.CREATED);
    }
    @PutMapping("/updateLaptop/{laptopId}")
    public ResponseEntity<Laptop> updateLaptop(@PathVariable long laptopId, @RequestParam String laptopName){
        return new ResponseEntity<>(portalService.updateLaptop(laptopId,laptopName),HttpStatus.OK);
    }

    @DeleteMapping("/deleteLaptop/{laptopId}")
    public ResponseEntity<String> deleteLaptop(@PathVariable long laptopId){
        return new ResponseEntity<>(portalService.deleteLaptop(laptopId), HttpStatus.OK);
    }
}
