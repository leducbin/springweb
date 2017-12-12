package com.example.database.service;

import com.example.database.dao.cassandra.CustomerRepository;
import com.example.database.dao.postgresql.BookRepository;
import com.example.database.entity.cassandrasql.Customer;
import com.example.database.entity.postgresql.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllBook(){
        List<Customer> customer = new ArrayList<>();
        customerRepository.findAll().forEach(customer::add);
        return customer;
    }

    public Customer getBook(Long id)
    {
        return customerRepository.findOne(id);
    }

    public void addBook(Customer customer)
    {
        customerRepository.save(customer);
    }

    public void updateBook(Long id, Customer customer)
    {
        customerRepository.save(customer);
    }

    public void deleteBook(Long id)
    {
        customerRepository.delete(id);
    }
}
