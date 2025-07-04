# 👨‍💻 Gyarsilal Solanki – Portfolio Website

Welcome to my personal portfolio website – built with passion to showcase my Android, Java, and Full Stack development skills. This site highlights my projects, skills, and contact information in a clean and responsive design.

🌐 **Live Demo**: [portfolio-production-808d.up.railway.app](https://portfolio-production-808d.up.railway.app)

---

## 🧩 Tech Stack

| Layer        | Technology                        |
|--------------|------------------------------------|
| Frontend     | HTML5, CSS3, Bootstrap 5, JavaScript |
| Backend      | Spring Boot                        |
| Template     | Thymeleaf                          |
| Contact Form | JavaMailSender (Gmail SMTP)        |
| Deployment   | Railway                             |

---

## ✨ Features

- 📱 Responsive UI across devices (mobile, tablet, desktop)
- 🧠 About, Projects, Skills, and Contact sections
- 📬 Contact form that emails submissions to Gmail
- 🔐 Secure mail configuration using Gmail App Password
- 🔗 Social media integration (LinkedIn, GitHub, WhatsApp)
- ⚡ Optimized for performance and accessibility

---

## 📬 Contact Form Flow

- User fills in **Name**, **Email**, **Phone**, and **Message**
- On submit, the form data is emailed directly to:

- Implemented using Spring Boot's `JavaMailSender` with HTML formatting
- Validation with Bootstrap and custom error messages

---

## 📸 Screenshots

> Add your own screenshots or UI previews in `/assets/img/` and reference them here:

![Home Page](assets/img/home.png)
![Projects Section](assets/img/projects.png)
![Contact Form](assets/img/contact.png)

---

## 🚀 Deployment

Deployed on **Railway** using the Spring Boot JAR.

```bash
# To build locally:
./mvnw clean package

# To run:
java -jar target/portfolio-0.0.1-SNAPSHOT.jar
```

## 🛡️ Security

- Uses Gmail App Password for safe SMTP authentication
- Input validations via Bootstrap and HTML5
- No user data is stored on the server or database
- Form submissions are sent securely to: gyarsilalsolanki011@gmail.com

## 🙋‍♂️ Author

Gyarsilal Solanki
📧 gyarsilalsolanki011@gmail.com
🔗 LinkedIn
🔗 GitHub

## 🤝 Contributing
If you'd like to contribute:
# 1. Fork this repo
# 2. Clone your fork
git clone https://github.com/your-username/your-portfolio.git

# 3. Create your branch
git checkout -b feature/your-feature

# 4. Commit & Push
git commit -m "Add new feature"
git push origin feature/your-feature

