package com.yinlei.rentcar.bean;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Citytable {
    private int idCity;
    private Integer provinceIdCity;
    private String nameCity;

    @Id
    @Column(name = "idCity", nullable = false)
    public int getIdCity() {
        return idCity;
    }

    public void setIdCity(int idCity) {
        this.idCity = idCity;
    }

    @Basic
    @Column(name = "provinceIdCity", nullable = true)
    public Integer getProvinceIdCity() {
        return provinceIdCity;
    }

    public void setProvinceIdCity(Integer provinceIdCity) {
        this.provinceIdCity = provinceIdCity;
    }

    @Basic
    @Column(name = "nameCity", nullable = true, length = 100)
    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Citytable citytable = (Citytable) o;
        return idCity == citytable.idCity &&
                Objects.equals(provinceIdCity, citytable.provinceIdCity) &&
                Objects.equals(nameCity, citytable.nameCity);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idCity, provinceIdCity, nameCity);
    }
}
