package com.example.SBCRUD.SBCrudOperation.repository;

import com.example.SBCRUD.SBCrudOperation.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BooksRepository extends JpaRepository<Books,Integer> {

}
