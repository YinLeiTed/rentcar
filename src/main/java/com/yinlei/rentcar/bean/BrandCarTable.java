package com.yinlei.rentcar.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "brand_car_table", schema = "rent_car", catalog = "")
public class BrandCarTable {
    private int idBrandCar;
    private String brandBrandCar;

    @Id
    @Column(name = "id_brand_car", nullable = false)
    public int getIdBrandCar() {
        return idBrandCar;
    }

    public void setIdBrandCar(int idBrandCar) {
        this.idBrandCar = idBrandCar;
    }

    @Basic
    @Column(name = "brand_brand_car", nullable = true, length = 50)
    public String getBrandBrandCar() {
        return brandBrandCar;
    }

    public void setBrandBrandCar(String brandBrandCar) {
        this.brandBrandCar = brandBrandCar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BrandCarTable that = (BrandCarTable) o;
        return idBrandCar == that.idBrandCar &&
                Objects.equals(brandBrandCar, that.brandBrandCar);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idBrandCar, brandBrandCar);
    }
}
