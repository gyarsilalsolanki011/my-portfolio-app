# 🌐 My Portfolio Application

A **Spring Boot + Thymeleaf** based personal portfolio website designed to showcase my projects, skills, and achievements.  
The application supports **email contact form (via Gmail SMTP)**, is fully **Dockerized**, and now deployed on **AWS EC2** and **Render** using **GitHub Actions CI/CD**.

## 🚀 Deployments
### 🟦 Render Deployment (Live)
Your portfolio is publicly available here:  

[![Live Demo](https://img.shields.io/badge/Live-Demo-blue?style=for-the-badge&logo=appveyor)](https://gyarsilalsolanki.onrender.com)


### 🟧 AWS EC2 Deployment
Spring Boot application deployed using:
- GitHub Actions CI/CD
- Docker Image pushed from GitHub
- EC2 t2.micro instance
- Exposed on port 8080

[![Live Demo](https://img.shields.io/badge/Live-Demo-blue?style=for-the-badge&logo=appveyor)](http://13.239.241.167/)

##### 🐳 Docker Hub

[![Docker Image Version](https://img.shields.io/docker/v/gyarsilalsolanki011/my-portfolio-app?sort=semver&style=for-the-badge)](https://hub.docker.com/r/gyarsilalsolanki011/my-portfolio-app)
[![Docker Pulls](https://img.shields.io/docker/pulls/gyarsilalsolanki011/my-portfolio-app?style=for-the-badge)](https://hub.docker.com/r/gyarsilalsolanki011/my-portfolio-app)


<br>

## 📂 Project Structure

```bash
Portfolio/
├── .github/workflows/        # GitHub Actions CI/CD pipeline
├── src/main/java/com.gyarsilalsolanki011.portfolio/
│   ├── controller/           # Home, About, Contact controllers
│   ├── model/                # Certification & Contact models
│   └── PortfolioApplication.java
├── src/main/resources/
│   ├── static/               # CSS, JS, Images
│   ├── templates/            # Thymeleaf templates
│   └── application.yml
├── .env                      # Environment variables (ignored from Git)
├── docker-compose.yml
├── Dockerfile
└── pom.xml
```

<br>

## ✨ Features
- ✅ Modern, responsive UI built with Thymeleaf & CSS
- 📧 Contact Form with Gmail SMTP
- 🐳 Fully containerized using Docker
- 🔒 `.env` environment variable support
- ⚡ CI/CD pipeline (Build → Push → Deploy)

<br>

## ⚙️ Tech Stack
- `Java`: 21
- `Spring Boot`: 3.5.3 (compatible with Java 21)
- `Thymeleaf`: Server-side rendering
- `Maven`: Build & dependency management
- `Docker`: Packaging & Deployment
- `Render`: Hosting on render
- `AWS EC2` : Hosting on AWS EC2 (Ubuntu Server)

<br>

## 📧 Environment Variables
Create a `.env` file in the root directory (already present in this repo) with the following:
```.env
# Server & Spring Profiles
PORT=8080
SPRING_PROFILES_ACTIVE=prod

# Gmail SMTP for JavaMailSender
MAIL_USERNAME=your-email@gmail.com
MAIL_PASSWORD=your-app-password
```
> [!WARNING]
> - Use an App Password instead of your Gmail login password.
> - Never commit .env to a public repository.

<br>

## 🐳 Docker Setup
#### 1️⃣ Build Image
```bash
docker build -t gyarsilalsolanki011/my-portfolio-app:latest .
```

#### 2️⃣ Run with Docker Compose
```
docker-compose up -d
```
This will:
- Start the portfolio application container
- Load environment variables from .env
- Map port 8080 to your host
- Visit: http://localhost:8080

## 🛠️ Development Setup (Without Docker)

**Prerequisites**
- Java 21+
- Maven 3.9+
- (Optional) Docker for containerized build

**Run Locally**
```bash
mvn spring-boot:run
```

<br>

## 🔧 CI/CD & Future Improvements
- GitHub Actions pipeline for CI/CD
- Automatic Docker image publishing on new release tags
- Add test coverage reports
- Deploy on Render / Railway / Fly.io or any preferred cloud service
- Implement SSL/TLS for secure email sending

<br>

## 📦 Version History(Docker Image)
| Version | Description                                           |
| ------- | ----------------------------------------------------- |
| `0.0.1` | Initial Dockerized build                              |
| `1.0.0` | Production-ready release with `.env` & Docker Compose |
| `1.0.x` | Automated CI/CD version tags                          |


<br>

## 👨‍💻 Author/Developer

`Gyarsilal Solanki`
- [![LinkedIn](https://img.shields.io/badge/LinkedIn-%230A66C2.svg?logo=LinkedIn&logoColor=white)](https://www.linkedin.com/in/gyarsilal-solanki) [![GitHub](https://img.shields.io/badge/GitHub-%23121011.svg?logo=github&logoColor=white)](https://github.com/gyarsilalsolanki011) [![Instagram](https://img.shields.io/badge/Instagram-%23E4405F.svg?logo=Instagram&logoColor=white)](https://instagram.com/itz_gsl_tiger)
- [![WhatsApp](https://img.shields.io/badge/WhatsApp-%2325D366.svg?logo=whatsapp&logoColor=white)](https://api.whatsapp.com/send/?phone=919111852267) [![Gmail](https://img.shields.io/badge/Email-D14836?logo=gmail&logoColor=white)](mailto:gyarsilalsolanki011@gmail.com)


Join us to discuss ideas, share feedback, and coordinate contributions:  
[![Join Discord](https://img.shields.io/discord/1405808666179014697?color=4CBB17&label=Join%20Us%20on%20Discord&logo=discord&logoColor=blue)](https://discord.gg/Zrc9x3ts)

<br>

## 📜 License
This project is licensed under the MIT License - see the [`LICENSE.md`](LICENSE.md)file for details.

***If you find this project helpful, consider giving it a ⭐ to support!***



