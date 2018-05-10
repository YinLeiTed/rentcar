package com.yinlei.rentcar.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "vip_table", schema = "rent_car", catalog = "")
public class VipTable {
    private int idVip;
    private Integer scoreVip;
    private Integer accountVip;
    private String nameVip;
    private String iconVip;

    @Id
    @Column(name = "id_vip", nullable = false)
    public int getIdVip() {
        return idVip;
    }

    public void setIdVip(int idVip) {
        this.idVip = idVip;
    }

    @Basic
    @Column(name = "score_vip", nullable = true)
    public Integer getScoreVip() {
        return scoreVip;
    }

    public void setScoreVip(Integer scoreVip) {
        this.scoreVip = scoreVip;
    }

    @Basic
    @Column(name = "account_vip", nullable = true)
    public Integer getAccountVip() {
        return accountVip;
    }

    public void setAccountVip(Integer accountVip) {
        this.accountVip = accountVip;
    }

    @Basic
    @Column(name = "name_vip", nullable = true, length = 50)
    public String getNameVip() {
        return nameVip;
    }

    public void setNameVip(String nameVip) {
        this.nameVip = nameVip;
    }

    @Basic
    @Column(name = "icon_vip", nullable = true, length = 250)
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
        VipTable vipTable = (VipTable) o;
        return idVip == vipTable.idVip &&
                Objects.equals(scoreVip, vipTable.scoreVip) &&
                Objects.equals(accountVip, vipTable.accountVip) &&
                Objects.equals(nameVip, vipTable.nameVip) &&
                Objects.equals(iconVip, vipTable.iconVip);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idVip, scoreVip, accountVip, nameVip, iconVip);
    }
}
