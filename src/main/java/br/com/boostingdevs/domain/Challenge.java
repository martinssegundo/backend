package br.com.boostingdevs.domain;

import java.util.List;

public class Challenge {
    private String name;
    private String subtitle;
    private String description;
    private List<String> tags;
    private String level;
    private String figma;
    private String ideas;
    private String github;
    private List<String> userStories;
    private String iframe;
    private List<String> areas;
    private String image;
    private List<String> categorie;

    public Challenge(String name,
                     String subtitle,
                     String description,
                     List<String> tags,
                     String level,
                     String figma,
                     String ideas,
                     String github,
                     List<String> userStories,
                     String iframe,
                     List<String> areas,
                     String image,
                     List<String> categorie) {
        this.name = name;
        this.subtitle = subtitle;
        this.description = description;
        this.tags = tags;
        this.level = level;
        this.figma = figma;
        this.ideas = ideas;
        this.github = github;
        this.userStories = userStories;
        this.iframe = iframe;
        this.areas = areas;
        this.image = image;
        this.categorie = categorie;
    }

    public String getName() {
        return name;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getTags() {
        return tags;
    }

    public String getLevel() {
        return level;
    }

    public String getFigma() {
        return figma;
    }

    public String getIdeas() {
        return ideas;
    }

    public String getGithub() {
        return github;
    }

    public List<String> getUserStories() {
        return userStories;
    }

    public String getIframe() {
        return iframe;
    }

    public List<String> getAreas() {
        return areas;
    }

    public String getImage() {
        return image;
    }

    public List<String> getCategorie() {
        return categorie;
    }
}
