package com.springboot.maven.jsp.dao;

import com.springboot.maven.jsp.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Description BookDao
 *
 * @author aji gojali
 */
@Repository
public interface BookDao extends CrudRepository<Book,String>, PagingAndSortingRepository<Book, String> {
//    Book findOne(String id);
}
