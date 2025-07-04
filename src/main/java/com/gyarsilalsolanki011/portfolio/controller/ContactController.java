package com.gyarsilalsolanki011.portfolio.controller;

import com.gyarsilalsolanki011.portfolio.model.Contact;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
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
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);

            helper.setTo("gyarsilals105@gmail.com"); // your receiving Gmail
            helper.setSubject("Let's work together!" + contact.getName());

            String htmlBody = """
                <h2 style="color:#333;">New Form Received</h2>
                <p><strong>Name:</strong> %s</p>
                <p><strong>Email:</strong> %s</p>
                <p><strong>Phone:</strong> %s</p>
                <p><strong>Message:</strong></p>
                <div style="background:#f9f9f9;border-left:4px solid #007bff;padding:10px;margin-top:5px;">
                    %s
                </div>
                <p style="font-size:12px;color:#999;margin-top:20px;">Sent from portfolio-production-808d.up.railway.app</p>
            """.formatted(
                    contact.getName(),
                    contact.getEmail(),
                    contact.getPhone(),
                    contact.getMessage().replace("\n", "<br>")
            );

            helper.setText(htmlBody, true); // true enables HTML

            mailSender.send(message);

            model.addAttribute("success", true);
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("error", true);
        }

        return "index";
    }
}
