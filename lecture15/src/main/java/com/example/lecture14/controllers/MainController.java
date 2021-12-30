package com.example.lecture14.controllers;

import com.example.lecture14.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    PersonService personService;

    @GetMapping("/home")
    public String home() {
        return "home.html";
    }

    @GetMapping("/name")
    public String name(Model page) {
        page.addAttribute("username","Viktor");
        return "name.html";
    }

    @GetMapping("/name/{nameParam}")
    public String namePath(Model page, @PathVariable String nameParam) {
        page.addAttribute("username",nameParam);
        return "name.html";
    }

    @GetMapping("/nameparam")
    public String nameParam(Model page, @RequestParam String name) {
        page.addAttribute("username",name);
        return "name.html";
    }

    @GetMapping("/family/{familyPath}")
    public String familyPath(Model page, @PathVariable String familyPath) {
        page.addAttribute("username",familyPath);
        return "family.html";
    }

    @GetMapping("/family/{familyParam}")
    public String familyParam(Model page, @RequestParam String familyParam, @RequestParam String familyParam2) {
        page.addAttribute("username",familyParam);
        page.addAttribute("secondName",familyParam2);
        return "family.html";
    }

    @GetMapping("/listNames")
    public String listNames(Model page) {
        List<String> names = new ArrayList<>();
        names.add("Viktor");
        names.add("Yavor");
        page.addAttribute("listNames",names);
        return "listNames.html";
    }
}
