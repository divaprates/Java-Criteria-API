package dsp.JavaCriteriaAPI.service;


import dsp.JavaCriteriaAPI.domain.Author;
import dsp.JavaCriteriaAPI.domain.Book;

import java.util.List;

public interface BookService {
    public void insert(Book book);
    public List<Book> findAll();
    public List<Book> findBookToId(Integer id);
}
