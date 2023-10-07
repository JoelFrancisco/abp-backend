package dev.joelfrancisco.abp.entities;

import java.net.URL;
import java.util.*;

public class Template extends BaseEntity {
    private UUID template_id;
    private int version;
    private String name;
    private String about;
    private URL linkHTML;
    private User user;
    private final Set<Tag> tags = new HashSet<>();

    public Template(String name, String about, URL linkHTML, User user) {
        setName(name);
        setAbout(about);
        setLinkHTML(linkHTML);
        setUser(user);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = Objects.requireNonNull(name, "name should not be null");
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = Objects.requireNonNull(about, "about should not be null");
    }

    public URL getLinkHTML() {
        return linkHTML;
    }

    public void setLinkHTML(URL linkHTML) {
        this.linkHTML = Objects.requireNonNull(linkHTML, "linkHTML should not be null");
    }

    public void addTag(Tag tag) {
        this.tags.add(tag);
    }

    public Set<Tag> getTags() {
        return Set.copyOf(tags);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = Objects.requireNonNull(user, "user should not be null");
    }

    public UUID getTemplate_id() {
        return template_id;
    }

    public void setTemplate_id(UUID template_id) {
        this.template_id = template_id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}