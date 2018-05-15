package com.yinlei.rentcar.bean;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "share_table", schema = "rent_car", catalog = "")
public class ShareTable {
    private int idShare;
    private Integer idUserShare;
    private String contentShare;
    private String imagesShare;
    private Date timeShare;
    private String phoneShare;

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

    @Basic
    @Column(name = "time_share", nullable = true)
    public Date getTimeShare() {
        return timeShare;
    }

    public void setTimeShare(Date timeShare) {
        this.timeShare = timeShare;
    }

    @Basic
    @Column(name = "phone_share", nullable = true, length = 50)
    public String getPhoneShare() {
        return phoneShare;
    }

    public void setPhoneShare(String phoneShare) {
        this.phoneShare = phoneShare;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ShareTable)) return false;
        ShareTable that = (ShareTable) o;
        return getIdShare() == that.getIdShare() &&
                Objects.equals(getIdUserShare(), that.getIdUserShare()) &&
                Objects.equals(getContentShare(), that.getContentShare()) &&
                Objects.equals(getImagesShare(), that.getImagesShare()) &&
                Objects.equals(getTimeShare(), that.getTimeShare()) &&
                Objects.equals(getPhoneShare(), that.getPhoneShare());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getIdShare(), getIdUserShare(), getContentShare(), getImagesShare(), getTimeShare(), getPhoneShare());
    }

    @Override
    public String toString() {
        return "ShareTable{" +
                "idShare=" + idShare +
                ", idUserShare=" + idUserShare +
                ", contentShare='" + contentShare + '\'' +
                ", imagesShare='" + imagesShare + '\'' +
                ", timeShare=" + timeShare +
                ", phoneShare='" + phoneShare + '\'' +
                '}';
    }
}
