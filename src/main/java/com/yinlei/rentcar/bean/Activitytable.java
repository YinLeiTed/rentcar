package com.yinlei.rentcar.bean;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Activitytable {
    private int idActivity;
    private String nameActivity;
    private Integer achieveActivity;
    private Integer subActivity;

    @Id
    @Column(name = "idActivity", nullable = false)
    public int getIdActivity() {
        return idActivity;
    }

    public void setIdActivity(int idActivity) {
        this.idActivity = idActivity;
    }

    @Basic
    @Column(name = "nameActivity", nullable = true, length = 50)
    public String getNameActivity() {
        return nameActivity;
    }

    public void setNameActivity(String nameActivity) {
        this.nameActivity = nameActivity;
    }

    @Basic
    @Column(name = "achieveActivity", nullable = true)
    public Integer getAchieveActivity() {
        return achieveActivity;
    }

    public void setAchieveActivity(Integer achieveActivity) {
        this.achieveActivity = achieveActivity;
    }

    @Basic
    @Column(name = "subActivity", nullable = true)
    public Integer getSubActivity() {
        return subActivity;
    }

    public void setSubActivity(Integer subActivity) {
        this.subActivity = subActivity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Activitytable that = (Activitytable) o;
        return idActivity == that.idActivity &&
                Objects.equals(nameActivity, that.nameActivity) &&
                Objects.equals(achieveActivity, that.achieveActivity) &&
                Objects.equals(subActivity, that.subActivity);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idActivity, nameActivity, achieveActivity, subActivity);
    }

    @Override
    public String toString() {
        return "Activitytable{" +
                "idActivity=" + idActivity +
                ", nameActivity='" + nameActivity + '\'' +
                ", achieveActivity=" + achieveActivity +
                ", subActivity=" + subActivity +
                '}';
    }

    public Activitytable(String nameActivity, Integer achieveActivity, Integer subActivity) {
        this.nameActivity = nameActivity;
        this.achieveActivity = achieveActivity;
        this.subActivity = subActivity;
    }

    public Activitytable() {
    }
}
