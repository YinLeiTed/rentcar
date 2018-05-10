package com.yinlei.rentcar.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "province_table", schema = "rent_car", catalog = "")
public class ProvinceTable {
    private int idProvince;
    private String nameProvince;

    @Id
    @Column(name = "id_province", nullable = false)
    public int getIdProvince() {
        return idProvince;
    }

    public void setIdProvince(int idProvince) {
        this.idProvince = idProvince;
    }

    @Basic
    @Column(name = "name_province", nullable = true, length = 50)
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
        ProvinceTable that = (ProvinceTable) o;
        return idProvince == that.idProvince &&
                Objects.equals(nameProvince, that.nameProvince);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idProvince, nameProvince);
    }
}
