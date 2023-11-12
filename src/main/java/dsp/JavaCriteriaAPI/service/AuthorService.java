package dsp.JavaCriteriaAPI.service;

import dsp.JavaCriteriaAPI.domain.Author;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AuthorService{
    public void insert(Author author);
    public List<Author> authorFindAll();
}
