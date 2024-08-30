package cn.jonhyu.dao;

import cn.jonhyu.entity.Book;

import java.util.List;

public interface BookDao {
    List<Book> findAll();
    int addBook(Book book);

}
