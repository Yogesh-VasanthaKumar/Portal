package com.project.protal.controller;

import com.project.protal.dto.BookRequest;
import com.project.protal.model.Book;
import com.project.protal.service.PortalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    public PortalService portalService;
    @GetMapping("/getBook")
    public ResponseEntity<List<Book>> getBook(){
        return new ResponseEntity<>(portalService.getBook(), HttpStatus.OK);
    }

    @PostMapping("/addBook")
    public ResponseEntity<String> addBook(@RequestBody BookRequest bookRequest){
        return new ResponseEntity<>(portalService.addBook(bookRequest), HttpStatus.CREATED);
    }
    @PutMapping("/updateBook")
    public ResponseEntity<Book> updateBook(@PathVariable long bookId, String author){
        return new ResponseEntity<>(portalService.updateBook(bookId,author), HttpStatus.OK);
    }

    @DeleteMapping("/deleteBook")
    public ResponseEntity<String> deleteBook(@PathVariable long bookId){
        return new ResponseEntity<>(portalService.deleteBook(bookId), HttpStatus.OK);
    }

}
