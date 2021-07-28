package com.bibliorest.questspringbibliorest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bibliorest.questspringbibliorest.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{
    List<Book> findByTitleContainingOrDescriptionContaining(String text, String textAgain);
}
