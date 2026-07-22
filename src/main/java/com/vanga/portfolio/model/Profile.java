package com.vanga.portfolio.model;

import java.util.List;
import java.util.Map;

public class Profile {
    private String name;
    private String title;
    private String location;
    private String phone;
    private String email;
    private String linkedin;
    private String github;
    private String summary;
    private Map<String, List<String>> skills;

    public Profile(String name, String title, String location, String phone, String email,
                    String linkedin, String github, String summary, Map<String, List<String>> skills) {
        this.name = name;
        this.title = title;
        this.location = location;
        this.phone = phone;
        this.email = email;
        this.linkedin = linkedin;
        this.github = github;
        this.summary = summary;
        this.skills = skills;
    }

    public String getName() { return name; }
    public String getTitle() { return title; }
    public String getLocation() { return location; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }
    public String getLinkedin() { return linkedin; }
    public String getGithub() { return github; }
    public String getSummary() { return summary; }
    public Map<String, List<String>> getSkills() { return skills; }
}