package com.yinlei.rentcar.bean;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Sharetable {
    private int idShare;
    private Integer userShare;
    private String contentShare;
    private String imagesShare;

    @Id
    @Column(name = "idShare", nullable = false)
    public int getIdShare() {
        return idShare;
    }

    public void setIdShare(int idShare) {
        this.idShare = idShare;
    }

    @Basic
    @Column(name = "userShare", nullable = true)
    public Integer getUserShare() {
        return userShare;
    }

    public void setUserShare(Integer userShare) {
        this.userShare = userShare;
    }

    @Basic
    @Column(name = "contentShare", nullable = true, length = -1)
    public String getContentShare() {
        return contentShare;
    }

    public void setContentShare(String contentShare) {
        this.contentShare = contentShare;
    }

    @Basic
    @Column(name = "imagesShare", nullable = true, length = -1)
    public String getImagesShare() {
        return imagesShare;
    }

    public void setImagesShare(String imagesShare) {
        this.imagesShare = imagesShare;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sharetable that = (Sharetable) o;
        return idShare == that.idShare &&
                Objects.equals(userShare, that.userShare) &&
                Objects.equals(contentShare, that.contentShare) &&
                Objects.equals(imagesShare, that.imagesShare);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idShare, userShare, contentShare, imagesShare);
    }

    public Sharetable(Integer userShare, String contentShare, String imagesShare) {
        this.userShare = userShare;
        this.contentShare = contentShare;
        this.imagesShare = imagesShare;
    }

    @Override
    public String toString() {
        return "Sharetable{" +
                "idShare=" + idShare +
                ", userShare=" + userShare +
                ", contentShare='" + contentShare + '\'' +
                ", imagesShare='" + imagesShare + '\'' +
                '}';
    }

    public Sharetable() {
    }
}
