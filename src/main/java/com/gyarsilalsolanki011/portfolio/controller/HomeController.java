package com.gyarsilalsolanki011.portfolio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class HomeController {

    @GetMapping({"/", "", "/home"})
    public String showHomePage(Model model) {
        model.addAttribute("title", "Home");
        return "index";
    }

    @GetMapping("/about")
    public String showAboutPage(Model model) {
        model.addAttribute("title", "About");
        return "index";
    }

    @GetMapping("/projects")
    public String showProjectPage(Model model) {
        model.addAttribute("title", "Projects");
        return "index";
    }

    @GetMapping("/service")
    public String showServicePage(Model model) {
        model.addAttribute("title", "Service");
        return "index";
    }
}
