# =========================
# 1️⃣ Build Stage (Maven)
# =========================
FROM maven:3.9.6-eclipse-temurin-17 AS build

# Set working directory
WORKDIR /app

# Copy Maven wrapper & pom.xml first (for caching dependencies)
COPY mvnw* pom.xml ./
COPY .mvn .mvn

# Pre-download dependencies (cached layer)
RUN ./mvnw dependency:go-offline -B

# Copy source code
COPY src src

# Build the Spring Boot app (skip tests for faster build)
RUN ./mvnw clean package -DskipTests


# =========================
# 2️⃣ Runtime Stage (JDK lightweight)
# =========================
FROM eclipse-temurin:17-jdk-alpine AS runtime

# Set working directory
WORKDIR /app

# Copy only the built jar from build stage
COPY --from=build /app/target/spring-boot-portfolio.jar app.jar

# Expose port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]

