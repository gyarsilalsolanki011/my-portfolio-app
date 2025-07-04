package com.gyarsilalsolanki011.portfolio.controller;

import com.gyarsilalsolanki011.portfolio.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactController {

    @Autowired
    private JavaMailSender mailSender;

    @GetMapping("/contact")
    public String showContactPage(Model model) {
        model.addAttribute("title", "Contact");
        model.addAttribute("contact", new Contact());
        return "index";
    }

    @PostMapping("/contact")
    public String submitContactForm(@ModelAttribute Contact contact, Model model) {
        model.addAttribute("title", "Contact");
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo("gyarsilals105@gmail.com"); // your receiving Gmail
            message.setSubject("New Contact Form Submission from " + contact.getName());
            message.setText(
                    "Name: " + contact.getName() + "\n" +
                            "Email: " + contact.getEmail() + "\n" +
                            "Phone: " + contact.getPhone() + "\n" +
                            "Message:\n" + contact.getMessage()
            );
            mailSender.send(message);

            model.addAttribute("success", true);
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("error", true);
        }

        return "index";
    }
}
