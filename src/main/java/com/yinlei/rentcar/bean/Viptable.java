package com.yinlei.rentcar.bean;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Viptable {
    private int idVip;
    private Integer scoreVip;
    private Integer accountVip;
    private String nameVip;
    private String iconVip;

    @Id
    @Column(name = "idVIP")
    public int getIdVip() {
        return idVip;
    }

    public void setIdVip(int idVip) {
        this.idVip = idVip;
    }

    @Basic
    @Column(name = "scoreVIP")
    public Integer getScoreVip() {
        return scoreVip;
    }

    public void setScoreVip(Integer scoreVip) {
        this.scoreVip = scoreVip;
    }

    @Basic
    @Column(name = "accountVIP")
    public Integer getAccountVip() {
        return accountVip;
    }

    public void setAccountVip(Integer accountVip) {
        this.accountVip = accountVip;
    }

    @Basic
    @Column(name = "nameVIP")
    public String getNameVip() {
        return nameVip;
    }

    public void setNameVip(String nameVip) {
        this.nameVip = nameVip;
    }

    @Basic
    @Column(name = "iconVIP")
    public String getIconVip() {
        return iconVip;
    }

    public void setIconVip(String iconVip) {
        this.iconVip = iconVip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Viptable viptable = (Viptable) o;
        return idVip == viptable.idVip &&
                Objects.equals(scoreVip, viptable.scoreVip) &&
                Objects.equals(accountVip, viptable.accountVip) &&
                Objects.equals(nameVip, viptable.nameVip) &&
                Objects.equals(iconVip, viptable.iconVip);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idVip, scoreVip, accountVip, nameVip, iconVip);
    }
}