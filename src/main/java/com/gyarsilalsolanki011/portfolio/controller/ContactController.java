package com.gyarsilalsolanki011.portfolio.controller;

import com.gyarsilalsolanki011.portfolio.model.Contact;
import com.sendgrid.*;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;
import com.sendgrid.helpers.mail.objects.Personalization;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactController {

    @Value("${sendgrid.api.key}")
    private String sendGridApiKey;

    @Value("${sendgrid.from.email}")
    private String sendGridFromEmail;

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
            Email from = new Email(sendGridFromEmail); // Verified sender
            String subject = "Let's work together!";
            Mail mail = getMail(contact, from, subject);

            SendGrid sg = new SendGrid(sendGridApiKey);
            Request request = new Request();
            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody(mail.build());

            Response response = sg.api(request);

            if (response.getStatusCode() >= 200 && response.getStatusCode() < 300) {
                model.addAttribute("success", true);
            } else {
                model.addAttribute("error", true);
                System.err.println("SendGrid Error: " + response.getBody());
            }

        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("error", true);
        }

        return "index";
    }

    private static Mail getMail(Contact contact, Email from, String subject) {
        Email to = new Email("gyarsilalsolanki011@gmail.com"); // Receiving email

        String htmlContent = """
            <h2 style="color:#333;">New Form Received</h2>
            <p><strong>Name:</strong> %s</p>
            <p><strong>Email:</strong> %s</p>
            <p><strong>Phone:</strong> %s</p>
            <p><strong>Message:</strong></p>
            <div style="background:#f9f9f9;border-left:4px solid #007bff;padding:10px;margin-top:5px;">
                %s
            </div>
            <p style="font-size:12px;color:#999;margin-top:20px;">
                        Sent from your <a href="https://gyarsilalsolanki.onrender.com/"\s
                        style="color:#007bff;text-decoration:none;">portfolio application</a>.
                    </p>
        """.formatted(
                contact.getName(),
                contact.getEmail(),
                contact.getPhone(),
                contact.getMessage().replace("\n", "<br>")
        );

        Content content = new Content("text/html", htmlContent);
        Mail mail = new Mail();
        mail.setFrom(from);
        mail.setSubject(subject);
        mail.addContent(content);
        mail.setReplyTo(new Email(contact.getEmail())); // Correct place for reply-to

        Personalization personalization = new Personalization();
        personalization.addTo(to);
        mail.addPersonalization(personalization);
        return mail;
    }
}
