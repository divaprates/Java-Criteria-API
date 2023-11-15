package dsp.JavaCriteriaAPI.service.impl;

import dsp.JavaCriteriaAPI.domain.Author;
import dsp.JavaCriteriaAPI.domain.Book;
import dsp.JavaCriteriaAPI.repository.BookRepository;
import dsp.JavaCriteriaAPI.service.BookService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {


    @Autowired
    private EntityManager entityManager;

    @Autowired
    private BookRepository repository;

    @Override
    public void insert(Book book) {
        repository.save(book);
    }

    @Override
    public List<Book> bookFindAll() {
        CriteriaBuilder criteriaBuilder = this.entityManager.getCriteriaBuilder();
        CriteriaQuery<Book> query = criteriaBuilder.createQuery(Book.class);
        Root<Book> from = query.from(Book.class);
        query.select(from);

        List<Book> result = this.entityManager.createQuery(query).getResultList();

        return result;
    }

}
