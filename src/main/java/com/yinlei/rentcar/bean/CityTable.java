package com.yinlei.rentcar.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "city_table", schema = "rent_car", catalog = "")
public class CityTable {
    private int idCity;
    private Integer idProvinceCity;
    private String nameCity;

    @Id
    @Column(name = "id_city", nullable = false)
    public int getIdCity() {
        return idCity;
    }

    public void setIdCity(int idCity) {
        this.idCity = idCity;
    }

    @Basic
    @Column(name = "id_province_city", nullable = true)
    public Integer getIdProvinceCity() {
        return idProvinceCity;
    }

    public void setIdProvinceCity(Integer idProvinceCity) {
        this.idProvinceCity = idProvinceCity;
    }

    @Basic
    @Column(name = "name_city", nullable = true, length = 100)
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
        CityTable cityTable = (CityTable) o;
        return idCity == cityTable.idCity &&
                Objects.equals(idProvinceCity, cityTable.idProvinceCity) &&
                Objects.equals(nameCity, cityTable.nameCity);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idCity, idProvinceCity, nameCity);
    }
}
