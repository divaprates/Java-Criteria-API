package dsp.JavaCriteriaAPI.repository;

import dsp.JavaCriteriaAPI.domain.Author;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.hibernate.Session;
import org.springframework.data.jpa.provider.HibernateUtils;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
