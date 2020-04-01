package com.Bibliofiler.BiblioFiler.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FavoritesListController {

    //TODO: should I have the favorites list in it's own controller or in a "HomeController" for everything that displays on the home screen?
    //TODO: make it a Hashmap/ArrayList to rep title and author

    @GetMapping("fav-list")
    public String favBooksList(Model model) {
        List<String> favBooks = new ArrayList<>();
        favBooks.add("Sabriel");
        favBooks.add("Lirael");
        favBooks.add("Wizards First Rule");
        favBooks.add("The Atlantis Gene");
        favBooks.add("The Horse and His Boy");
        model.addAttribute("favBooks", favBooks);
        return "favorites-list";
    }
}
