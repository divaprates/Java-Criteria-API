package dsp.JavaCriteriaAPI.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Author {

    private int id;
    private String name;

    @OneToMany(mappedBy = "book")
    private List<Book> books;

}
