package com.yinlei.rentcar.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "advise_table", schema = "rent_car", catalog = "")
public class AdviseTable {
    private int idAdvise;
    private Integer idUserAdvise;
    private String contentAdvise;
    private String replyAdvise;

    @Id
    @Column(name = "id_advise", nullable = false)
    public int getIdAdvise() {
        return idAdvise;
    }

    public void setIdAdvise(int idAdvise) {
        this.idAdvise = idAdvise;
    }

    @Basic
    @Column(name = "id_user_advise", nullable = true)
    public Integer getIdUserAdvise() {
        return idUserAdvise;
    }

    public void setIdUserAdvise(Integer idUserAdvise) {
        this.idUserAdvise = idUserAdvise;
    }

    @Basic
    @Column(name = "content_advise", nullable = true, length = -1)
    public String getContentAdvise() {
        return contentAdvise;
    }

    public void setContentAdvise(String contentAdvise) {
        this.contentAdvise = contentAdvise;
    }

    @Basic
    @Column(name = "reply_advise", nullable = true, length = 250)
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
        AdviseTable that = (AdviseTable) o;
        return idAdvise == that.idAdvise &&
                Objects.equals(idUserAdvise, that.idUserAdvise) &&
                Objects.equals(contentAdvise, that.contentAdvise) &&
                Objects.equals(replyAdvise, that.replyAdvise);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idAdvise, idUserAdvise, contentAdvise, replyAdvise);
    }
}
