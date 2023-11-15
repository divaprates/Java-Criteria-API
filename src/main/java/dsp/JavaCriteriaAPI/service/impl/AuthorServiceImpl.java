package dsp.JavaCriteriaAPI.service.impl;

import dsp.JavaCriteriaAPI.domain.Author;
import dsp.JavaCriteriaAPI.repository.AuthorRepository;
import dsp.JavaCriteriaAPI.service.AuthorService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private EntityManager entityManager;

    @Autowired
    private AuthorRepository repository;

    @Override
    public void insert(Author author) {
        repository.save(author);
    }

    @Override
    public List<Author> authorFindAll() {
        CriteriaBuilder criteriaBuilder = this.entityManager.getCriteriaBuilder();
        CriteriaQuery<Author> query = criteriaBuilder.createQuery(Author.class);
        Root<Author> from = query.from(Author.class);
        query.select(from);

        List<Author> result = this.entityManager.createQuery(query).getResultList();

        return result;
    }
}
