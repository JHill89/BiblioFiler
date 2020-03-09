package com.Bibliofiler.BiblioFiler.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {

    @GetMapping("books/create")
    public String createNewBook() {
        return "books/create";
    }

}
