package com.yinlei.rentcar.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "share_table", schema = "rent_car", catalog = "")
public class ShareTable {
    private int idShare;
    private Integer idUserShare;
    private String contentShare;
    private String imagesShare;

    @Id
    @Column(name = "id_share", nullable = false)
    public int getIdShare() {
        return idShare;
    }

    public void setIdShare(int idShare) {
        this.idShare = idShare;
    }

    @Basic
    @Column(name = "id_user_share", nullable = true)
    public Integer getIdUserShare() {
        return idUserShare;
    }

    public void setIdUserShare(Integer idUserShare) {
        this.idUserShare = idUserShare;
    }

    @Basic
    @Column(name = "content_share", nullable = true, length = -1)
    public String getContentShare() {
        return contentShare;
    }

    public void setContentShare(String contentShare) {
        this.contentShare = contentShare;
    }

    @Basic
    @Column(name = "images_share", nullable = true, length = -1)
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
        ShareTable that = (ShareTable) o;
        return idShare == that.idShare &&
                Objects.equals(idUserShare, that.idUserShare) &&
                Objects.equals(contentShare, that.contentShare) &&
                Objects.equals(imagesShare, that.imagesShare);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idShare, idUserShare, contentShare, imagesShare);
    }
}
