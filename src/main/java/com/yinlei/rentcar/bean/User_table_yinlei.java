package com.yinlei.rentcar.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class User_table_yinlei {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String nameUser;
    private String phone_yinlei;
    private String email_yinlei;
    private String password_yinlei;
    private String idcard_yinlei;
    private String sex_yinlei;
    private Date birthday_yinlei;
    private String province_yinlei;
    private String city_yinlei;
    private String town_yinlei;
    private String area_yinlei;
    private Integer crime_yinlei;
    private String crimeInfo_yinlei;
    private Integer amount_yinlei;
    private Integer score_yinlei;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getPhone_yinlei() {
        return phone_yinlei;
    }

    public void setPhone_yinlei(String phone_yinlei) {
        this.phone_yinlei = phone_yinlei;
    }

    public String getEmail_yinlei() {
        return email_yinlei;
    }

    public void setEmail_yinlei(String email_yinlei) {
        this.email_yinlei = email_yinlei;
    }

    public String getPassword_yinlei() {
        return password_yinlei;
    }

    public void setPassword_yinlei(String password_yinlei) {
        this.password_yinlei = password_yinlei;
    }

    public String getIdcard_yinlei() {
        return idcard_yinlei;
    }

    public void setIdcard_yinlei(String idcard_yinlei) {
        this.idcard_yinlei = idcard_yinlei;
    }

    public String getSex_yinlei() {
        return sex_yinlei;
    }

    public void setSex_yinlei(String sex_yinlei) {
        this.sex_yinlei = sex_yinlei;
    }

    public Date getBirthday_yinlei() {
        return birthday_yinlei;
    }

    public void setBirthday_yinlei(Date birthday_yinlei) {
        this.birthday_yinlei = birthday_yinlei;
    }

    public String getProvince_yinlei() {
        return province_yinlei;
    }

    public void setProvince_yinlei(String province_yinlei) {
        this.province_yinlei = province_yinlei;
    }

    public String getCity_yinlei() {
        return city_yinlei;
    }

    public void setCity_yinlei(String city_yinlei) {
        this.city_yinlei = city_yinlei;
    }

    public String getTown_yinlei() {
        return town_yinlei;
    }

    public void setTown_yinlei(String town_yinlei) {
        this.town_yinlei = town_yinlei;
    }

    public String getArea_yinlei() {
        return area_yinlei;
    }

    public void setArea_yinlei(String area_yinlei) {
        this.area_yinlei = area_yinlei;
    }

    public Integer getCrime_yinlei() {
        return crime_yinlei;
    }

    public void setCrime_yinlei(Integer crime_yinlei) {
        this.crime_yinlei = crime_yinlei;
    }

    public String getCrimeInfo_yinlei() {
        return crimeInfo_yinlei;
    }

    public void setCrimeInfo_yinlei(String crimeInfo_yinlei) {
        this.crimeInfo_yinlei = crimeInfo_yinlei;
    }

    public Integer getAmount_yinlei() {
        return amount_yinlei;
    }

    public void setAmount_yinlei(Integer amount_yinlei) {
        this.amount_yinlei = amount_yinlei;
    }

    public Integer getScore_yinlei() {
        return score_yinlei;
    }

    public void setScore_yinlei(Integer score_yinlei) {
        this.score_yinlei = score_yinlei;
    }
}
