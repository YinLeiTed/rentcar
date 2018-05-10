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
    private byte[] sexUser;
    private Date birthdayUser;
    private byte[] provicneUser;
    private byte[] cityUser;
    private byte[] townUser;
    private byte[] areaUser;
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
    public byte[] getSexUser() {
        return sexUser;
    }

    public void setSexUser(byte[] sexUser) {
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
    public byte[] getProvicneUser() {
        return provicneUser;
    }

    public void setProvicneUser(byte[] provicneUser) {
        this.provicneUser = provicneUser;
    }

    @Basic
    @Column(name = "city_user", nullable = true)
    public byte[] getCityUser() {
        return cityUser;
    }

    public void setCityUser(byte[] cityUser) {
        this.cityUser = cityUser;
    }

    @Basic
    @Column(name = "town_user", nullable = true)
    public byte[] getTownUser() {
        return townUser;
    }

    public void setTownUser(byte[] townUser) {
        this.townUser = townUser;
    }

    @Basic
    @Column(name = "area_user", nullable = true)
    public byte[] getAreaUser() {
        return areaUser;
    }

    public void setAreaUser(byte[] areaUser) {
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
        if (o == null || getClass() != o.getClass()) return false;
        UserTable userTable = (UserTable) o;
        return idUser == userTable.idUser &&
                Objects.equals(nicknameUser, userTable.nicknameUser) &&
                Objects.equals(phoneUser, userTable.phoneUser) &&
                Objects.equals(emailUser, userTable.emailUser) &&
                Objects.equals(passwordUser, userTable.passwordUser) &&
                Objects.equals(idcardUser, userTable.idcardUser) &&
                Arrays.equals(sexUser, userTable.sexUser) &&
                Objects.equals(birthdayUser, userTable.birthdayUser) &&
                Arrays.equals(provicneUser, userTable.provicneUser) &&
                Arrays.equals(cityUser, userTable.cityUser) &&
                Arrays.equals(townUser, userTable.townUser) &&
                Arrays.equals(areaUser, userTable.areaUser) &&
                Objects.equals(crimeUser, userTable.crimeUser) &&
                Objects.equals(crimeInfoUser, userTable.crimeInfoUser) &&
                Objects.equals(amountUser, userTable.amountUser) &&
                Objects.equals(scoreUser, userTable.scoreUser);
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(idUser, nicknameUser, phoneUser, emailUser, passwordUser, idcardUser, birthdayUser, crimeUser, crimeInfoUser, amountUser, scoreUser);
        result = 31 * result + Arrays.hashCode(sexUser);
        result = 31 * result + Arrays.hashCode(provicneUser);
        result = 31 * result + Arrays.hashCode(cityUser);
        result = 31 * result + Arrays.hashCode(townUser);
        result = 31 * result + Arrays.hashCode(areaUser);
        return result;
    }
}