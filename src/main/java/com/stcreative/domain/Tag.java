package com.stcreative.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A Tag.
 */
@Entity
@Table(name = "tag")
public class Tag implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 300)
    @Column(name = "tag_name", length = 300)
    private String tagName;

    @Size(max = 300)
    @Column(name = "tag_slug", length = 300)
    private String tagSlug;

    @Size(max = 500)
    @Column(name = "tag_description", length = 500)
    private String tagDescription;

    @ManyToMany(mappedBy = "tags")
    @JsonIgnore
    private Set<Post> posts = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTagName() {
        return tagName;
    }

    public Tag tagName(String tagName) {
        this.tagName = tagName;
        return this;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getTagSlug() {
        return tagSlug;
    }

    public Tag tagSlug(String tagSlug) {
        this.tagSlug = tagSlug;
        return this;
    }

    public void setTagSlug(String tagSlug) {
        this.tagSlug = tagSlug;
    }

    public String getTagDescription() {
        return tagDescription;
    }

    public Tag tagDescription(String tagDescription) {
        this.tagDescription = tagDescription;
        return this;
    }

    public void setTagDescription(String tagDescription) {
        this.tagDescription = tagDescription;
    }

    public Set<Post> getPosts() {
        return posts;
    }

    public Tag posts(Set<Post> posts) {
        this.posts = posts;
        return this;
    }

    public Tag addPost(Post post) {
        this.posts.add(post);
        post.getTags().add(this);
        return this;
    }

    public Tag removePost(Post post) {
        this.posts.remove(post);
        post.getTags().remove(this);
        return this;
    }

    public void setPosts(Set<Post> posts) {
        this.posts = posts;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Tag)) {
            return false;
        }
        return id != null && id.equals(((Tag) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "Tag{" +
            "id=" + getId() +
            ", tagName='" + getTagName() + "'" +
            ", tagSlug='" + getTagSlug() + "'" +
            ", tagDescription='" + getTagDescription() + "'" +
            "}";
    }
}
