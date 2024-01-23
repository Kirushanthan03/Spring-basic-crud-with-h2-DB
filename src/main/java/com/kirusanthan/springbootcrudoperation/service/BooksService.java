package com.kirusanthan.springbootcrudoperation.service;


import com.kirusanthan.springbootcrudoperation.entity.Books;
import com.kirusanthan.springbootcrudoperation.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BooksService {

    @Autowired
    private BooksRepository booksRepository;
    public List<Books> getAllBooks() {
       return booksRepository.findAll();
    }

    public Books getBooks(int bookId) {
        return booksRepository.findById(bookId).get();
    }

    public void deleteBooks(int bookId) {
         booksRepository.deleteById(bookId);
    }

    public Books saveBook(Books book) {
        return booksRepository.save(book);
    }

    public Books updateBook(int bookId, Books book) {
        Optional<Books> found = booksRepository.findById(bookId);
        Books ExistingObject = found.get();
        if (found.isPresent()){
            ExistingObject.setBookName(book.getBookName());
            ExistingObject.setAuthor(book.getAuthor());
            ExistingObject.setPrice(book.getPrice());
        }

        return  ExistingObject;
    }
}
