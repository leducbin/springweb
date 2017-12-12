package com.example.database.service;

import com.example.database.dao.cassandra.CustomerRepository;
import com.example.database.dao.mysql.AuthorRepository;
import com.example.database.dao.postgresql.BookRepository;
import com.example.database.entity.postgresql.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBook(){
        List<Book> book = new ArrayList<>();
        bookRepository.findAll().forEach(book::add);
        return book;
    }

    public Book getBook(Long id)
    {
        return bookRepository.findOne(id);
    }

    public void addBook(Book book)
    {
        bookRepository.save(book);
    }

    public void updateBook(Long id, Book book)
    {
        bookRepository.save(book);
    }

    public void deleteBook(Long id)
    {
        bookRepository.delete(id);
    }
}
