package dsp.JavaCriteriaAPI.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Book {

    private Integer id;
    private String name;

    @ManyToOne
    private Author author;
}
