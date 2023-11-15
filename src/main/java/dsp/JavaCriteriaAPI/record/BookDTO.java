package dsp.JavaCriteriaAPI.record;

import dsp.JavaCriteriaAPI.domain.Author;
import dsp.JavaCriteriaAPI.domain.Book;

public record BookDTO(
        Integer id,
        String title,
        String author
) {
    public BookDTO(Book entity) {
        this(entity.getId(), entity.getTitle(), entity.getAuthor().getName());
    }
}
