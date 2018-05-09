package com.yinlei.rentcar.bean;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Brandcartable {
    private int idBrandCar;
    private String brandBrandCar;

    @Id
    @Column(name = "idBrandCar")
    public int getIdBrandCar() {
        return idBrandCar;
    }

    public void setIdBrandCar(int idBrandCar) {
        this.idBrandCar = idBrandCar;
    }

    @Basic
    @Column(name = "brandBrandCar")
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
        Brandcartable that = (Brandcartable) o;
        return idBrandCar == that.idBrandCar &&
                Objects.equals(brandBrandCar, that.brandBrandCar);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idBrandCar, brandBrandCar);
    }
}
