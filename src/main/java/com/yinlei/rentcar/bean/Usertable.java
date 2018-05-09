package com.yinlei.rentcar.bean;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Arrays;
import java.util.Objects;

@Entity
public class Usertable {
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
    @Column(name = "idUser")
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Basic
    @Column(name = "nicknameUser")
    public String getNicknameUser() {
        return nicknameUser;
    }

    public void setNicknameUser(String nicknameUser) {
        this.nicknameUser = nicknameUser;
    }

    @Basic
    @Column(name = "phoneUser")
    public String getPhoneUser() {
        return phoneUser;
    }

    public void setPhoneUser(String phoneUser) {
        this.phoneUser = phoneUser;
    }

    @Basic
    @Column(name = "emailUser")
    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    @Basic
    @Column(name = "passwordUser")
    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }

    @Basic
    @Column(name = "idcardUser")
    public String getIdcardUser() {
        return idcardUser;
    }

    public void setIdcardUser(String idcardUser) {
        this.idcardUser = idcardUser;
    }

    @Basic
    @Column(name = "sexUser")
    public byte[] getSexUser() {
        return sexUser;
    }

    public void setSexUser(byte[] sexUser) {
        this.sexUser = sexUser;
    }

    @Basic
    @Column(name = "birthdayUser")
    public Date getBirthdayUser() {
        return birthdayUser;
    }

    public void setBirthdayUser(Date birthdayUser) {
        this.birthdayUser = birthdayUser;
    }

    @Basic
    @Column(name = "provicneUser")
    public byte[] getProvicneUser() {
        return provicneUser;
    }

    public void setProvicneUser(byte[] provicneUser) {
        this.provicneUser = provicneUser;
    }

    @Basic
    @Column(name = "cityUser")
    public byte[] getCityUser() {
        return cityUser;
    }

    public void setCityUser(byte[] cityUser) {
        this.cityUser = cityUser;
    }

    @Basic
    @Column(name = "townUser")
    public byte[] getTownUser() {
        return townUser;
    }

    public void setTownUser(byte[] townUser) {
        this.townUser = townUser;
    }

    @Basic
    @Column(name = "areaUser")
    public byte[] getAreaUser() {
        return areaUser;
    }

    public void setAreaUser(byte[] areaUser) {
        this.areaUser = areaUser;
    }

    @Basic
    @Column(name = "crimeUser")
    public Integer getCrimeUser() {
        return crimeUser;
    }

    public void setCrimeUser(Integer crimeUser) {
        this.crimeUser = crimeUser;
    }

    @Basic
    @Column(name = "crimeInfoUser")
    public String getCrimeInfoUser() {
        return crimeInfoUser;
    }

    public void setCrimeInfoUser(String crimeInfoUser) {
        this.crimeInfoUser = crimeInfoUser;
    }

    @Basic
    @Column(name = "amountUser")
    public Integer getAmountUser() {
        return amountUser;
    }

    public void setAmountUser(Integer amountUser) {
        this.amountUser = amountUser;
    }

    @Basic
    @Column(name = "scoreUser")
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
        Usertable usertable = (Usertable) o;
        return idUser == usertable.idUser &&
                Objects.equals(nicknameUser, usertable.nicknameUser) &&
                Objects.equals(phoneUser, usertable.phoneUser) &&
                Objects.equals(emailUser, usertable.emailUser) &&
                Objects.equals(passwordUser, usertable.passwordUser) &&
                Objects.equals(idcardUser, usertable.idcardUser) &&
                Arrays.equals(sexUser, usertable.sexUser) &&
                Objects.equals(birthdayUser, usertable.birthdayUser) &&
                Arrays.equals(provicneUser, usertable.provicneUser) &&
                Arrays.equals(cityUser, usertable.cityUser) &&
                Arrays.equals(townUser, usertable.townUser) &&
                Arrays.equals(areaUser, usertable.areaUser) &&
                Objects.equals(crimeUser, usertable.crimeUser) &&
                Objects.equals(crimeInfoUser, usertable.crimeInfoUser) &&
                Objects.equals(amountUser, usertable.amountUser) &&
                Objects.equals(scoreUser, usertable.scoreUser);
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
