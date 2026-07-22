package com.vanga.portfolio.controller;

import com.vanga.portfolio.model.*;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api")
public class PortfolioController {

    @GetMapping("/profile")
    public Profile getProfile() {
        Map<String, List<String>> skills = new LinkedHashMap<>();
        skills.put("Languages", List.of("Java", "Kotlin", "C"));
        skills.put("Backend", List.of("Spring Boot", "Spring MVC", "Spring Data JPA", "Hibernate",
                "Spring Security", "RESTful APIs", "Spring Cloud", "Microservices", "Eureka Server",
                "OpenFeign", "Spring Cloud Gateway", "Maven", "Apache Tomcat"));
        skills.put("Frontend", List.of("React.js", "HTML", "CSS"));
        skills.put("Database", List.of("MySQL"));
        skills.put("Cloud & Tools", List.of("AWS (Fundamentals)", "GitHub", "Postman", "VS Code"));
        skills.put("Core CS", List.of("Data Structures & Algorithms", "OOP", "SQL", "Operating Systems (Basics)"));
        skills.put("Mobile", List.of("Android (Kotlin, Jetpack Compose)"));

        return new Profile(
                "Vanga Kumar",
                "Java Full Stack Developer | Spring Boot • Microservices • React.js • MySQL",
                "Hyderabad, Telangana",
                "+91-7569167808",
                "vangakumarvk@gmail.com",
                "linkedin.com/in/vanga-kumar",
                "github.com/Vkumarlap",
                "Java Full Stack Developer with hands-on experience building a complete e-commerce " +
                "application (Spring Boot, Spring Security, Hibernate/JPA, React.js, MySQL) and a " +
                "microservices-based quiz platform using Spring Cloud, Eureka Server, OpenFeign, and " +
                "API Gateway. Java-certified (Oracle Academy) and completed Wipro TalentNext's Java " +
                "Full Stack readiness program. Seeking an entry-level Software Developer / Java Full Stack role.",
                skills
        );
    }

    @GetMapping("/projects")
    public List<Project> getProjects() {
        Project quiz = new Project(
                "Quiz Application",
                "https://github.com/Vkumarlap",
                List.of(
                    "Built a quiz application backend with Spring Boot, migrating from a monolith into independent microservices (quiz, user, score) using Spring Data JPA and MySQL.",
                    "Implemented service discovery with Netflix Eureka Server and OpenFeign for declarative inter-service REST communication.",
                    "Set up Spring Cloud Gateway as a centralized API Gateway for routing and load balancing."
                ),
                List.of("Spring Boot", "Spring Cloud", "Eureka", "OpenFeign", "MySQL")
        );

        Project ecommerce = new Project(
                "E-Commerce Web Application",
                "https://github.com/Vkumarlap",
                List.of(
                    "Built a full-stack e-commerce platform with Spring Boot REST APIs and a React.js SPA, connected to a normalized MySQL schema (products, users, orders, cart).",
                    "Implemented Spring Security for authentication and role-based access control across customer and admin endpoints.",
                    "Designed CRUD operations for product catalog and order management using Spring Data JPA/Hibernate, with pagination and search.",
                    "Built responsive React UI components (product listing, cart, checkout) consuming REST APIs and managing shopping-flow state."
                ),
                List.of("Spring Boot", "Spring Security", "Hibernate", "React.js", "MySQL")
        );

        return List.of(quiz, ecommerce);
    }

    @GetMapping("/certifications")
    public List<String> getCertifications() {
        return List.of(
                "Java Full Stack Developer — Wipro TalentNext Digital Skills Readiness Program",
                "Java Programming — Oracle Academy",
                "SQL — HackerRank",
                "Python Essentials 1 — Cisco"
        );
    }

    @GetMapping("/education")
    public List<Map<String, String>> getEducation() {
        return List.of(
                Map.of("school", "Geethanjali College of Engineering and Technology",
                        "years", "2022 – 2026",
                        "detail", "B.Tech, Computer Science Engineering (Data Science) — CGPA: 7.23"),
                Map.of("school", "Narayana Junior College",
                        "years", "2020 – 2022",
                        "detail", "Board of Intermediate Education, MPC — 86.8%"),
                Map.of("school", "Sri Sai Model High School",
                        "years", "2019 – 2020",
                        "detail", "Board of Secondary Education, SSC — 10.0 CGPA")
        );
    }

    @PostMapping("/contact")
    public ResponseEntity<Map<String, String>> sendMessage(@Valid @RequestBody ContactMessage msg) {
        // Hook up JavaMailSender here later if you want real email delivery.
        System.out.println("New contact message from " + msg.getName() + " <" + msg.getEmail() + ">: " + msg.getMessage());
        return ResponseEntity.ok(Map.of("status", "success", "message", "Message received!"));
    }
}