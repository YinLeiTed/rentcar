package com.yinlei.rentcar.bean;

import javax.persistence.*;
import java.sql.Date;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "user_table", schema = "rent_car", catalog = "")
public class UserTable {
    private int idUser;
    private String nicknameUser;
    private String phoneUser;
    private String emailUser;
    private String passwordUser;
    private String idcardUser;
    private String sexUser;
    private Date birthdayUser;
    private String provicneUser;
    private String cityUser;
    private String townUser;
    private String areaUser;
    private Integer crimeUser;
    private String crimeInfoUser;
    private Integer amountUser;
    private Integer scoreUser;

    @Id
    @Column(name = "id_user", nullable = false)
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Basic
    @Column(name = "nickname_user", nullable = true, length = 50)
    public String getNicknameUser() {
        return nicknameUser;
    }

    public void setNicknameUser(String nicknameUser) {
        this.nicknameUser = nicknameUser;
    }

    @Basic
    @Column(name = "phone_user", nullable = true, length = 11)
    public String getPhoneUser() {
        return phoneUser;
    }

    public void setPhoneUser(String phoneUser) {
        this.phoneUser = phoneUser;
    }

    @Basic
    @Column(name = "email_user", nullable = true, length = 50)
    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    @Basic
    @Column(name = "password_user", nullable = true, length = 20)
    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }

    @Basic
    @Column(name = "idcard_user", nullable = true, length = 20)
    public String getIdcardUser() {
        return idcardUser;
    }

    public void setIdcardUser(String idcardUser) {
        this.idcardUser = idcardUser;
    }

    @Basic
    @Column(name = "sex_user", nullable = true)
    public String getSexUser() {
        return sexUser;
    }

    public void setSexUser(String sexUser) {
        this.sexUser = sexUser;
    }

    @Basic
    @Column(name = "birthday_user", nullable = true)
    public Date getBirthdayUser() {
        return birthdayUser;
    }

    public void setBirthdayUser(Date birthdayUser) {
        this.birthdayUser = birthdayUser;
    }

    @Basic
    @Column(name = "provicne_user", nullable = true)
    public String getProvicneUser() {
        return provicneUser;
    }

    public void setProvicneUser(String provicneUser) {
        this.provicneUser = provicneUser;
    }

    @Basic
    @Column(name = "city_user", nullable = true)
    public String getCityUser() {
        return cityUser;
    }

    public void setCityUser(String cityUser) {
        this.cityUser = cityUser;
    }

    @Basic
    @Column(name = "town_user", nullable = true)
    public String getTownUser() {
        return townUser;
    }

    public void setTownUser(String townUser) {
        this.townUser = townUser;
    }

    @Basic
    @Column(name = "area_user", nullable = true)
    public String getAreaUser() {
        return areaUser;
    }

    public void setAreaUser(String areaUser) {
        this.areaUser = areaUser;
    }

    @Basic
    @Column(name = "crime_user", nullable = true)
    public Integer getCrimeUser() {
        return crimeUser;
    }

    public void setCrimeUser(Integer crimeUser) {
        this.crimeUser = crimeUser;
    }

    @Basic
    @Column(name = "crime_info_user", nullable = true, length = 250)
    public String getCrimeInfoUser() {
        return crimeInfoUser;
    }

    public void setCrimeInfoUser(String crimeInfoUser) {
        this.crimeInfoUser = crimeInfoUser;
    }

    @Basic
    @Column(name = "amount_user", nullable = true)
    public Integer getAmountUser() {
        return amountUser;
    }

    public void setAmountUser(Integer amountUser) {
        this.amountUser = amountUser;
    }

    @Basic
    @Column(name = "score_user", nullable = true)
    public Integer getScoreUser() {
        return scoreUser;
    }

    public void setScoreUser(Integer scoreUser) {
        this.scoreUser = scoreUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserTable)) return false;
        UserTable userTable = (UserTable) o;
        return getIdUser() == userTable.getIdUser() &&
                Objects.equals(getNicknameUser(), userTable.getNicknameUser()) &&
                Objects.equals(getPhoneUser(), userTable.getPhoneUser()) &&
                Objects.equals(getEmailUser(), userTable.getEmailUser()) &&
                Objects.equals(getPasswordUser(), userTable.getPasswordUser()) &&
                Objects.equals(getIdcardUser(), userTable.getIdcardUser()) &&
                Objects.equals(getSexUser(), userTable.getSexUser()) &&
                Objects.equals(getBirthdayUser(), userTable.getBirthdayUser()) &&
                Objects.equals(getProvicneUser(), userTable.getProvicneUser()) &&
                Objects.equals(getCityUser(), userTable.getCityUser()) &&
                Objects.equals(getTownUser(), userTable.getTownUser()) &&
                Objects.equals(getAreaUser(), userTable.getAreaUser()) &&
                Objects.equals(getCrimeUser(), userTable.getCrimeUser()) &&
                Objects.equals(getCrimeInfoUser(), userTable.getCrimeInfoUser()) &&
                Objects.equals(getAmountUser(), userTable.getAmountUser()) &&
                Objects.equals(getScoreUser(), userTable.getScoreUser());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdUser(), getNicknameUser(), getPhoneUser(), getEmailUser(), getPasswordUser(), getIdcardUser(), getSexUser(), getBirthdayUser(), getProvicneUser(), getCityUser(), getTownUser(), getAreaUser(), getCrimeUser(), getCrimeInfoUser(), getAmountUser(), getScoreUser());
    }

    @Override
    public String toString() {
        return "UserTable{" +
                "idUser=" + idUser +
                ", nicknameUser='" + nicknameUser + '\'' +
                ", phoneUser='" + phoneUser + '\'' +
                ", emailUser='" + emailUser + '\'' +
                ", passwordUser='" + passwordUser + '\'' +
                ", idcardUser='" + idcardUser + '\'' +
                ", sexUser='" + sexUser + '\'' +
                ", birthdayUser=" + birthdayUser +
                ", provicneUser='" + provicneUser + '\'' +
                ", cityUser='" + cityUser + '\'' +
                ", townUser='" + townUser + '\'' +
                ", areaUser='" + areaUser + '\'' +
                ", crimeUser=" + crimeUser +
                ", crimeInfoUser='" + crimeInfoUser + '\'' +
                ", amountUser=" + amountUser +
                ", scoreUser=" + scoreUser +
                '}';
    }
}
