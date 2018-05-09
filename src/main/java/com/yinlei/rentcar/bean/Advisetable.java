package com.yinlei.rentcar.bean;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Advisetable {
    private int idAdvise;
    private Integer userIdAdvise;
    private String contentAdvise;
    private String replyAdvise;

    @Id
    @Column(name = "idAdvise")
    public int getIdAdvise() {
        return idAdvise;
    }

    public void setIdAdvise(int idAdvise) {
        this.idAdvise = idAdvise;
    }

    @Basic
    @Column(name = "userIdAdvise")
    public Integer getUserIdAdvise() {
        return userIdAdvise;
    }

    public void setUserIdAdvise(Integer userIdAdvise) {
        this.userIdAdvise = userIdAdvise;
    }

    @Basic
    @Column(name = "contentAdvise")
    public String getContentAdvise() {
        return contentAdvise;
    }

    public void setContentAdvise(String contentAdvise) {
        this.contentAdvise = contentAdvise;
    }

    @Basic
    @Column(name = "replyAdvise")
    public String getReplyAdvise() {
        return replyAdvise;
    }

    public void setReplyAdvise(String replyAdvise) {
        this.replyAdvise = replyAdvise;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Advisetable that = (Advisetable) o;
        return idAdvise == that.idAdvise &&
                Objects.equals(userIdAdvise, that.userIdAdvise) &&
                Objects.equals(contentAdvise, that.contentAdvise) &&
                Objects.equals(replyAdvise, that.replyAdvise);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idAdvise, userIdAdvise, contentAdvise, replyAdvise);
    }
}
