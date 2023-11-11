package dsp.JavaCriteriaAPI.controller;

import dsp.JavaCriteriaAPI.domain.Author;
import dsp.JavaCriteriaAPI.record.AuthorDTO;
import dsp.JavaCriteriaAPI.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/author")
@RestController
public class AuthorController {

    @Autowired
    private AuthorService service;

    @PostMapping()
    public void insert(@RequestBody Author author) {
        service.insert(author);
    }

    @GetMapping()
    public ResponseEntity<List<AuthorDTO>> findAll() {

        List<AuthorDTO> response = service.findAll().stream()
                .map(AuthorDTO::new)
                .toList();

        return ResponseEntity.ok(response);
    }
}
