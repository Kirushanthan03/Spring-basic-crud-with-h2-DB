package com.kirusanthan.springbootcrudoperation.controller;

import com.kirusanthan.springbootcrudoperation.entity.Books;
import com.kirusanthan.springbootcrudoperation.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BooksController {


    @Autowired
    private BooksService booksService;


    @GetMapping("/book")
    public List<Books> getAllBooks(){
       return booksService.getAllBooks();
    }

    @GetMapping("/book/{bookId}")
    public Books getBooks(@PathVariable int bookId){
        return booksService.getBooks(bookId);
    }

    @DeleteMapping("/book/{bookId}")
    public void deleteBooks(@PathVariable int bookId){
         booksService.deleteBooks(bookId);
    }


    @PostMapping("/books")
    public Books saveBook(@RequestBody Books book){
        return booksService.saveBook(book);
    }
    @PutMapping("/books/{bookId}")
    public Books updateBook(@PathVariable int bookId,@RequestBody Books book){
        return booksService.updateBook(bookId,book);
    }


}
