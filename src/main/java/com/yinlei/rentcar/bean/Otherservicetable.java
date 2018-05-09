package com.yinlei.rentcar.bean;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Otherservicetable {
    private int idOtherService;
    private String nameOtherService;
    private Integer priceOtherService;

    @Id
    @Column(name = "idOtherService")
    public int getIdOtherService() {
        return idOtherService;
    }

    public void setIdOtherService(int idOtherService) {
        this.idOtherService = idOtherService;
    }

    @Basic
    @Column(name = "nameOtherService")
    public String getNameOtherService() {
        return nameOtherService;
    }

    public void setNameOtherService(String nameOtherService) {
        this.nameOtherService = nameOtherService;
    }

    @Basic
    @Column(name = "priceOtherService")
    public Integer getPriceOtherService() {
        return priceOtherService;
    }

    public void setPriceOtherService(Integer priceOtherService) {
        this.priceOtherService = priceOtherService;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Otherservicetable that = (Otherservicetable) o;
        return idOtherService == that.idOtherService &&
                Objects.equals(nameOtherService, that.nameOtherService) &&
                Objects.equals(priceOtherService, that.priceOtherService);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idOtherService, nameOtherService, priceOtherService);
    }
}
