package com.stcreative.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * A Comment.
 */
@Entity
@Table(name = "comment")
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 1000)
    @Column(name = "title", length = 1000)
    private String title;

    @Size(max = 2000)
    @Column(name = "comment_content", length = 2000)
    private String commentContent;

    @Size(max = 500)
    @Column(name = "comment_by", length = 500)
    private String commentBy;

    @Size(max = 500)
    @Column(name = "comment_status", length = 500)
    private String commentStatus;

    @Column(name = "is_active")
    private Boolean isActive;

    @ManyToOne
    @JsonIgnoreProperties("comments")
    private Post post;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public Comment title(String title) {
        this.title = title;
        return this;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public Comment commentContent(String commentContent) {
        this.commentContent = commentContent;
        return this;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getCommentBy() {
        return commentBy;
    }

    public Comment commentBy(String commentBy) {
        this.commentBy = commentBy;
        return this;
    }

    public void setCommentBy(String commentBy) {
        this.commentBy = commentBy;
    }

    public String getCommentStatus() {
        return commentStatus;
    }

    public Comment commentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
        return this;
    }

    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
    }

    public Boolean isIsActive() {
        return isActive;
    }

    public Comment isActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Post getPost() {
        return post;
    }

    public Comment post(Post post) {
        this.post = post;
        return this;
    }

    public void setPost(Post post) {
        this.post = post;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Comment)) {
            return false;
        }
        return id != null && id.equals(((Comment) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "Comment{" +
            "id=" + getId() +
            ", title='" + getTitle() + "'" +
            ", commentContent='" + getCommentContent() + "'" +
            ", commentBy='" + getCommentBy() + "'" +
            ", commentStatus='" + getCommentStatus() + "'" +
            ", isActive='" + isIsActive() + "'" +
            "}";
    }
}
