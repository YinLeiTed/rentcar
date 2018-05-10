package com.yinlei.rentcar.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "activity_table", schema = "rent_car", catalog = "")
public class ActivityTable {
    private int idActivity;
    private String nameActivity;
    private Integer achieveActivity;
    private Integer subActivity;

    @Id
    @Column(name = "id_activity", nullable = false)
    public int getIdActivity() {
        return idActivity;
    }

    public void setIdActivity(int idActivity) {
        this.idActivity = idActivity;
    }

    @Basic
    @Column(name = "name_activity", nullable = true, length = 50)
    public String getNameActivity() {
        return nameActivity;
    }

    public void setNameActivity(String nameActivity) {
        this.nameActivity = nameActivity;
    }

    @Basic
    @Column(name = "achieve_activity", nullable = true)
    public Integer getAchieveActivity() {
        return achieveActivity;
    }

    public void setAchieveActivity(Integer achieveActivity) {
        this.achieveActivity = achieveActivity;
    }

    @Basic
    @Column(name = "sub_activity", nullable = true)
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
        ActivityTable that = (ActivityTable) o;
        return idActivity == that.idActivity &&
                Objects.equals(nameActivity, that.nameActivity) &&
                Objects.equals(achieveActivity, that.achieveActivity) &&
                Objects.equals(subActivity, that.subActivity);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idActivity, nameActivity, achieveActivity, subActivity);
    }
}
