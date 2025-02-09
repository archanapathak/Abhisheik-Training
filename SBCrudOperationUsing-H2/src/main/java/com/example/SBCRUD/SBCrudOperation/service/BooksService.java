package com.example.SBCRUD.SBCrudOperation.service;

import com.example.SBCRUD.SBCrudOperation.model.Books;
import com.example.SBCRUD.SBCrudOperation.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class BooksService {
    @Autowired
    BooksRepository booksRepository;

    public List<Books> listAllBooks(){
       List<Books> books = new ArrayList<Books>();
        books = booksRepository.findAll();
       return books;
    }

    public Books getBooksById(int id){
        return booksRepository.findById(id).get();
    }

    public void deleteBooksById(int id){
         booksRepository.deleteById(id);
    }

    public void saveBook(Books books){
        booksRepository.save(books);
    }


    public Books updateBook(Books books) {
        Optional < Books > booksdb = this.booksRepository.findById(books.getBookid());

        if (booksdb.isPresent()) {
            Books bookUpdate = booksdb.get();
            bookUpdate.setBookid(books.getBookid());
            bookUpdate.setBookname(books.getBookname());
            bookUpdate.setBookauthor(books.getBookauthor());
            bookUpdate.setPrice(books.getPrice());
            booksRepository.save(bookUpdate);
            return bookUpdate;
        } else {
            throw new RuntimeException("Record not found with id : " + books.getBookid());
        }
    }



}
