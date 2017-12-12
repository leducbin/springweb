package com.example.database.dao.mysql;

import com.example.database.entity.mysql.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Author Repository.
 * 
 * @author Radouane ROUFID.
 *
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
