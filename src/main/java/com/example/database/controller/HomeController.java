package com.example.database.controller;

import com.example.database.entity.cassandrasql.Customer;
import com.example.database.entity.postgresql.Book;
import com.example.database.entity.postgresql.Course;
import com.example.database.service.BookService;
import com.example.database.service.CourseService;
import com.example.database.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    private BookService bookService;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private CourseService courseService;

    private Long bookId = 1L;

    //Book with Postgresql API

    @RequestMapping("/books")
    public List<Book> getAllBook()
    {
        System.out.print("Alooooooooooo");
        return bookService.getAllBook();
    }

    @RequestMapping("/books/{id}")
    public Book getBook(@PathVariable Long id)
    {
        return bookService.getBook(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/books")
    public void addBook(@RequestBody Book book)
    {
        bookService.addBook(book);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/books/{id}")
    public void addBook(@RequestBody Book book,@PathVariable Long id)
    {
        bookService.updateBook(id,book);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/books/{id}")
    public void deleteBook(@PathVariable Long id)
    {
        bookService.deleteBook(id);
    }

    //Customer with Cassandrasqp API

    @RequestMapping("/customers")
    public List<Customer> getAllCustomer()
    {
        return customerService.getAllBook();
    }

    @RequestMapping("/customers/{id}")
    public Customer getCustomer(@PathVariable Long id)
    {
        return customerService.getBook(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/customers")
    public void addCustomer(@RequestBody Customer book)
    {
        customerService.addBook(book);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/customers/{id}")
    public void updateCustomer(@RequestBody Customer book,@PathVariable Long id)
    {
        customerService.updateBook(id,book);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/customers/{id}")
    public void deleteCustomer(@PathVariable Long id)
    {
        customerService.deleteBook(id);
    }

    //Add Cource Relation DATABASE

    @RequestMapping("/books/{id}/courses")
    public Course getAllSourse(@PathVariable Long id)
    {
        return courseService.getAllCourse(id);
    }

    @RequestMapping("/books/{bookId}/courses/{courseId}")
    public Object[] getSourse(@PathVariable Long bookId,@PathVariable Long courseId)
    {
        return courseService.getCourse(bookId,courseId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/books/{bookId}/courses")
    public void addCourse(@RequestBody Course course,@PathVariable Long bookId)
    {
        courseService.addCourse(course);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/books/{bookId}/courses/{courseId}")
    public void updateSourse(@RequestBody Course course,@PathVariable Long bookId,@PathVariable Long courseId)
    {
        courseService.updateCourse(bookId,course);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/books/{bookId}/courses/{courseId}")
    public void deleteSourse(@PathVariable Long bookId,@PathVariable Long courseId)
    {
        courseService.deleteCourse(bookId);
    }
}
