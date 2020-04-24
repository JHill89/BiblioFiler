package com.Bibliofiler.BiblioFiler.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("books")
public class BookController {

    public static List<String> allBooks = new ArrayList<>();

    //displays all books
    @GetMapping("allBooks")
    public String displayAllBooksPage(Model model) {
        model.addAttribute("allBooks", allBooks);
        return "books/allBooks";
    }

    @GetMapping("create")
    public String createNewBook() {
        return "books/create";
    }

//    @PostMapping("create")
    @RequestMapping(value = "createBook", method = {RequestMethod.GET, RequestMethod.POST})
    public String addNewBookToAllBooksPage(@RequestParam String title, Model model) {
        allBooks.add(title);
        model.addAttribute("allBooks", allBooks);
        return "books/allBooks";
    }

}
