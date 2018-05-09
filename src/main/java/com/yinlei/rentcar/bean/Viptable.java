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
    @Column(name = "idVIP", nullable = false)
    public int getIdVip() {
        return idVip;
    }

    public void setIdVip(int idVip) {
        this.idVip = idVip;
    }

    @Basic
    @Column(name = "scoreVIP", nullable = true)
    public Integer getScoreVip() {
        return scoreVip;
    }

    public void setScoreVip(Integer scoreVip) {
        this.scoreVip = scoreVip;
    }

    @Basic
    @Column(name = "accountVIP", nullable = true)
    public Integer getAccountVip() {
        return accountVip;
    }

    public void setAccountVip(Integer accountVip) {
        this.accountVip = accountVip;
    }

    @Basic
    @Column(name = "nameVIP", nullable = true, length = 50)
    public String getNameVip() {
        return nameVip;
    }

    public void setNameVip(String nameVip) {
        this.nameVip = nameVip;
    }

    @Basic
    @Column(name = "iconVIP", nullable = true, length = 250)
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

    public Viptable(Integer scoreVip, Integer accountVip, String nameVip, String iconVip) {
        this.scoreVip = scoreVip;
        this.accountVip = accountVip;
        this.nameVip = nameVip;
        this.iconVip = iconVip;
    }

    public Viptable() {
    }

    @Override
    public String toString() {
        return "Viptable{" +
                "idVip=" + idVip +
                ", scoreVip=" + scoreVip +
                ", accountVip=" + accountVip +
                ", nameVip='" + nameVip + '\'' +
                ", iconVip='" + iconVip + '\'' +
                '}';
    }
}
