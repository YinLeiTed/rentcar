package com.yinlei.rentcar.bean;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Provincetable {
    private int idProvince;
    private String nameProvince;

    @Id
    @Column(name = "idProvince", nullable = false)
    public int getIdProvince() {
        return idProvince;
    }

    public void setIdProvince(int idProvince) {
        this.idProvince = idProvince;
    }

    @Basic
    @Column(name = "nameProvince", nullable = true, length = 50)
    public String getNameProvince() {
        return nameProvince;
    }

    public void setNameProvince(String nameProvince) {
        this.nameProvince = nameProvince;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Provincetable that = (Provincetable) o;
        return idProvince == that.idProvince &&
                Objects.equals(nameProvince, that.nameProvince);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idProvince, nameProvince);
    }

    @Override
    public String toString() {
        return "Provincetable{" +
                "idProvince=" + idProvince +
                ", nameProvince='" + nameProvince + '\'' +
                '}';
    }

    public Provincetable() {
    }

    public Provincetable(String nameProvince) {

        this.nameProvince = nameProvince;
    }
}
