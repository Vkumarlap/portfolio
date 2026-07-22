package com.vanga.portfolio.model;

import java.util.List;

public class Project {
    private String title;
    private String githubUrl;
    private List<String> highlights;
    private List<String> techStack;

    public Project(String title, String githubUrl, List<String> highlights, List<String> techStack) {
        this.title = title;
        this.githubUrl = githubUrl;
        this.highlights = highlights;
        this.techStack = techStack;
    }

    public String getTitle() { return title; }
    public String getGithubUrl() { return githubUrl; }
    public List<String> getHighlights() { return highlights; }
    public List<String> getTechStack() { return techStack; }
}