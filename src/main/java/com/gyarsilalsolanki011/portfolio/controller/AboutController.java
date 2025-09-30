package com.gyarsilalsolanki011.portfolio.controller;

import com.gyarsilalsolanki011.portfolio.model.Certification;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class AboutController {
    @GetMapping("/about")
    public String showAboutPage(Model model){
        List<Certification> certifications = List.of(
                new Certification(
                        "Career Essentials in GitHub Professional Certificate",
                        "LinkedIn Learning",
                        "August 14, 2025",
                        "30bc416d905dc4bee7d237d645553826554edb8f8ea7a738d8ca8f8122d3a64f",
                        "https://www.linkedin.com/learning/certificates/30bc416d905dc4bee7d237d645553826554edb8f8ea7a738d8ca8f8122d3a64f",
                        "/images/certicate_github.png"
                ),
                new Certification(
                        "Docker Foundations Professional Certificate",
                        "LinkedIn Learning",
                        "August 30, 2025",
                        "f85d0185e63c3c5b2f0c35b1f0ebc5c01b8a8793186581f1054abffaed65c66c",
                        "https://www.linkedin.com/learning/certificates/f85d0185e63c3c5b2f0c35b1f0ebc5c01b8a8793186581f1054abffaed65c66c?trk=share_certificate",
                        "/images/certificate_docker.png"
                ),
                new Certification(
                        "Java(Basic) Certificate",
                        "HackerRank",
                        "July 23, 2025",
                        "C11EE42E6A21",
                        "https://www.hackerrank.com/certificates/iframe/c11ee42e6a21",
                        "/images/certificate_javaBasic.png"
                ),
                new Certification(
                        "SQL(Basic) Certificate",
                        "HackerRank",
                        "July 11, 2025",
                        "885A66081A52",
                        "https://www.hackerrank.com/certificates/iframe/885a66081a52",
                        "/images/certificate_sqlBasic.png"
                ),
                new Certification(
                        "Software Engineer Intern Certificate",
                        "HackerRank",
                        "July 23, 2025",
                        "C18374C8D922",
                        "https://www.hackerrank.com/certificates/iframe/c18374c8d922",
                        "/images/certificate_softwareEngineer.png"
                )
                // 👉 Add more certifications here
        );
        model.addAttribute("title", "About");
        model.addAttribute("certifications", certifications);
        return "index";
    }
}
