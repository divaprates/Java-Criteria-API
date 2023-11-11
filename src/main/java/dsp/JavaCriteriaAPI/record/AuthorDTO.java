package dsp.JavaCriteriaAPI.record;

import dsp.JavaCriteriaAPI.domain.Author;

public record AuthorDTO(
        Integer id,
        String name) {
    public AuthorDTO(Author entity) {
        this(entity.getId(), entity.getName());
    }
}
