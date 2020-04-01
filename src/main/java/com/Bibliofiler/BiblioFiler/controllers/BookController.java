package com.Bibliofiler.BiblioFiler.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {

    @GetMapping("books/allBooks")
    public String allBooksPage(Model model) {
        List<String> allBooks = new ArrayList<>();
        allBooks.add("Year One");
        allBooks.add("The Rise of Magicks");
        allBooks.add("Harry Potter and the Sorcerers Stone");
        allBooks.add("Lunatic Cafe");
        allBooks.add("The Horse and His Boy");
        allBooks.add("The Solar War");
        model.addAttribute("allBooks", allBooks);
        return "books/allBooks";
    }

    @GetMapping("books/create")
    public String createNewBook() {
        return "books/create";
    }

}
