package com.Bibliofiler.BiblioFiler.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @RequestMapping(value = "index", method = {RequestMethod.GET, RequestMethod.POST})
    public String home(@RequestParam String title, String author, String notes, Model model){
        String byAuthor = "by " + author;
        model.addAttribute("title", title);
        model.addAttribute("byAuthor", byAuthor);
        model.addAttribute("notes", notes);
        return "index";
    }

}

