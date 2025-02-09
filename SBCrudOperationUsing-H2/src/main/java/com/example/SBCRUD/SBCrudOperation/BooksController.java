package com.example.SBCRUD.SBCrudOperation;

import com.example.SBCRUD.SBCrudOperation.model.Books;
import com.example.SBCRUD.SBCrudOperation.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/Books")
public class BooksController {
    @Autowired
    BooksService booksService;

    @GetMapping("/Books")
    public List<Books> getAllBooks(){
        return booksService.listAllBooks();
    }

    @GetMapping("/Books/{bookid}")
    public Books getBook(@PathVariable("bookid") int bookid){
         return booksService.getBooksById(bookid);
    }

    @DeleteMapping("/Books/{bookid}")
    public void deleteBook(@PathVariable("bookid") int bookid){
     booksService.deleteBooksById(bookid);
    }
    @PostMapping("/Books")
    public void saveBooks(@RequestBody Books books){
        booksService.saveBook(books);
    }

    @PutMapping("/Books/{bookid}")
    public ResponseEntity< Books > updateProduct(@PathVariable int bookid, @RequestBody Books books) {
        books.setBookid(bookid);
        return ResponseEntity.ok().body(this.booksService.updateBook(books));
    }
}
