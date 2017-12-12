package com.example.database.dao.postgresql;

import com.example.database.entity.postgresql.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Book repository.
 * 
 * @author Radouane ROUFID.
 *
 */
public interface BookRepository extends CrudRepository<Book, Long> {

}
