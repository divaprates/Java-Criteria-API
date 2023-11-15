package dsp.JavaCriteriaAPI.controller;

import dsp.JavaCriteriaAPI.domain.Book;
import dsp.JavaCriteriaAPI.record.AuthorDTO;
import dsp.JavaCriteriaAPI.record.BookDTO;
import dsp.JavaCriteriaAPI.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/book")
@RestController
public class BookController {
    @Autowired
    private BookService service;

    @PostMapping()
    public void insert(@RequestBody Book book) {
        service.insert(book);
    }

    @GetMapping()
    public ResponseEntity<List<BookDTO>> findAll() {

        List<BookDTO> response = service.bookFindAll().stream()
                .map(BookDTO::new)
                .toList();

        return ResponseEntity.ok(response);
    }
}
