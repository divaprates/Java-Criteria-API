package dsp.JavaCriteriaAPI.repository;

import dsp.JavaCriteriaAPI.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
