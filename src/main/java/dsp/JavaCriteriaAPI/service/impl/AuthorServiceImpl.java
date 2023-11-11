package dsp.JavaCriteriaAPI.service.impl;

import dsp.JavaCriteriaAPI.domain.Author;
import dsp.JavaCriteriaAPI.repository.AuthorRepository;
import dsp.JavaCriteriaAPI.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    private AuthorRepository repository;

    @Override
    public void insert(Author author) {
        repository.save(author);
    }

    @Override
    public List<Author> findAll() {
        return repository.findAll();
    }
}
