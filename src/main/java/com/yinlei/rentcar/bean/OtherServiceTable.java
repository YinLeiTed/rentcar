package com.yinlei.rentcar.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "other_service_table", schema = "rent_car", catalog = "")
public class OtherServiceTable {
    private int idOtherService;
    private String nameOtherService;
    private Integer priceOtherService;
    private String describeOtherService;

    @Id
    @Column(name = "id_other_service", nullable = false)
    public int getIdOtherService() {
        return idOtherService;
    }

    public void setIdOtherService(int idOtherService) {
        this.idOtherService = idOtherService;
    }

    @Basic
    @Column(name = "name_other_service", nullable = true, length = 50)
    public String getNameOtherService() {
        return nameOtherService;
    }

    public void setNameOtherService(String nameOtherService) {
        this.nameOtherService = nameOtherService;
    }

    @Basic
    @Column(name = "price_other_service", nullable = true)
    public Integer getPriceOtherService() {
        return priceOtherService;
    }

    public void setPriceOtherService(Integer priceOtherService) {
        this.priceOtherService = priceOtherService;
    }

    @Basic
    @Column(name = "describe_other_service", nullable = true, length = -1)
    public String getDescribeOtherService() {
        return describeOtherService;
    }

    public void setDescribeOtherService(String describeOtherService) {
        this.describeOtherService = describeOtherService;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OtherServiceTable that = (OtherServiceTable) o;
        return idOtherService == that.idOtherService &&
                Objects.equals(nameOtherService, that.nameOtherService) &&
                Objects.equals(priceOtherService, that.priceOtherService) &&
                Objects.equals(describeOtherService, that.describeOtherService);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idOtherService, nameOtherService, priceOtherService, describeOtherService);
    }
}
