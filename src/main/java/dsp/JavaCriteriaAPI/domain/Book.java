package dsp.JavaCriteriaAPI.domain;

import jakarta.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @ManyToOne
    private Author author;
}
