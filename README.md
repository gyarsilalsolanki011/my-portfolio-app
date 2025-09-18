# 🌐 My Portfolio Application

A **Spring Boot + Thymeleaf** powered personal portfolio application designed to showcase projects, skills, and contact details.  
The application supports **email contact form** via Gmail SMTP and is fully **containerized** for deployment with Docker.

<br>

## 📂 Project Structure

```bash
Portfolio/
├── src/
│   ├── main/
│   │   ├── java/com.gyarsilalsolanki011.portfolio/
│   │   │   ├── controller/        # Controllers for web pages (Home, About, Contact)
│   │   │   ├── model/             # Data models (Certification, Contact)
│   │   │   └── PortfolioApplication.java
│   │   └── resources/
│   │       ├── static/            # CSS, JS, Images
│   │       ├── templates/         # Thymeleaf HTML templates
│   │       └── application.yml    # Spring Boot configuration
│   └── test/                      # Unit & integration tests
├── .env                           # Environment variables (mail config, etc.)
├── docker-compose.yml             # Multi-container orchestration
├── Dockerfile                     # Container build instructions
├── pom.xml                        # Maven dependencies & build configuration
└── README.md                      # Project documentation (this file)
```

<br>

## ✨ Features
- ✅ Responsive UI built with Thymeleaf and CSS
- 📧 Contact Form with Mail Support (Gmail SMTP)
- 🐳 Dockerized Deployment using Dockerfile & docker-compose.yml
- 🔒 Environment Variables for sensitive data (.env file support)
-⚡ Fast Startup with Spring Boot 3.x

<br>

## ⚙️ Tech Stack
- `Java`: 21
- `Spring Boot`: 3.5.3 (compatible with Java 21)
- `Thymeleaf`: For server-side templating
- `Maven`: Build & dependency management
- `Docker`: Containerized deployment

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
> ⚠️ Security Note:
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
| Version | Description                                                                                   |
|---------|-----------------------------------------------------------------------------------------------|
| `0.0.1` | First working Docker image, verified application starts and responds on port 8080.            |
| `1.0.0` | Stable production-ready release with `.env` support, `docker-compose.yml`, and documentation. |



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



