package com.restapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.restapi.dto.bookDto;
import com.restapi.service.bookService;

import java.util.List;

@RestController
@RequestMapping("books")
@RequiredArgsConstructor
public class bookController {

    private final bookService bookService;

    @PostMapping("")
    public ResponseEntity<bookDto> save(@RequestBody bookDto book) {
        return ResponseEntity.ok(bookService.save(book));
    }

    @GetMapping("/{id}")
    public ResponseEntity<bookDto> get(@PathVariable Long id) {
        // Todo service içerisine findById yazılmalı.
        return null;
    }
    @GetMapping("")
    public ResponseEntity<List<bookDto>> get() {
        return ResponseEntity.ok(bookService.getAll());
    }
}
