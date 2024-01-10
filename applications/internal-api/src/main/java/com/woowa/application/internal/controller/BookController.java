package com.woowa.application.internal.controller;

import com.woowa.application.internal.service.BookQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BookController {
    private final BookQueryService bookQueryService;

    @GetMapping("/books/{bookId}")
    public Long findBookById(@PathVariable("bookId") Long bookId) {
        return bookQueryService.findBookById(bookId);
    }
}
