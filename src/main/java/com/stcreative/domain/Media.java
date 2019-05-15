package com.stcreative.domain;



import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * A Media.
 */
@Entity
@Table(name = "media")
public class Media implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 200)
    @Column(name = "media_name", length = 200)
    private String mediaName;

    @Size(max = 50)
    @Column(name = "media_type", length = 50)
    private String mediaType;

    @Size(max = 300)
    @Column(name = "media_url", length = 300)
    private String mediaURL;

    @Size(max = 300)
    @Column(name = "media_alt", length = 300)
    private String mediaAlt;

    @Size(max = 500)
    @Column(name = "media_caption", length = 500)
    private String mediaCaption;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMediaName() {
        return mediaName;
    }

    public Media mediaName(String mediaName) {
        this.mediaName = mediaName;
        return this;
    }

    public void setMediaName(String mediaName) {
        this.mediaName = mediaName;
    }

    public String getMediaType() {
        return mediaType;
    }

    public Media mediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public String getMediaURL() {
        return mediaURL;
    }

    public Media mediaURL(String mediaURL) {
        this.mediaURL = mediaURL;
        return this;
    }

    public void setMediaURL(String mediaURL) {
        this.mediaURL = mediaURL;
    }

    public String getMediaAlt() {
        return mediaAlt;
    }

    public Media mediaAlt(String mediaAlt) {
        this.mediaAlt = mediaAlt;
        return this;
    }

    public void setMediaAlt(String mediaAlt) {
        this.mediaAlt = mediaAlt;
    }

    public String getMediaCaption() {
        return mediaCaption;
    }

    public Media mediaCaption(String mediaCaption) {
        this.mediaCaption = mediaCaption;
        return this;
    }

    public void setMediaCaption(String mediaCaption) {
        this.mediaCaption = mediaCaption;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Media)) {
            return false;
        }
        return id != null && id.equals(((Media) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "Media{" +
            "id=" + getId() +
            ", mediaName='" + getMediaName() + "'" +
            ", mediaType='" + getMediaType() + "'" +
            ", mediaURL='" + getMediaURL() + "'" +
            ", mediaAlt='" + getMediaAlt() + "'" +
            ", mediaCaption='" + getMediaCaption() + "'" +
            "}";
    }
}
