package com.yinlei.rentcar.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "address_table", schema = "rent_car", catalog = "")
public class AddressTable {
    private int idAddress;
    private String provicneAddress;
    private String cityAddress;
    private String countryAddress;

    @Id
    @Column(name = "id_address", nullable = false)
    public int getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(int idAddress) {
        this.idAddress = idAddress;
    }

    @Basic
    @Column(name = "provicne_address", nullable = true, length = 50)
    public String getProvicneAddress() {
        return provicneAddress;
    }

    public void setProvicneAddress(String provicneAddress) {
        this.provicneAddress = provicneAddress;
    }

    @Basic
    @Column(name = "city_address", nullable = true, length = 50)
    public String getCityAddress() {
        return cityAddress;
    }

    public void setCityAddress(String cityAddress) {
        this.cityAddress = cityAddress;
    }

    @Basic
    @Column(name = "country_address", nullable = true, length = 50)
    public String getCountryAddress() {
        return countryAddress;
    }

    public void setCountryAddress(String countryAddress) {
        this.countryAddress = countryAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressTable that = (AddressTable) o;
        return idAddress == that.idAddress &&
                Objects.equals(provicneAddress, that.provicneAddress) &&
                Objects.equals(cityAddress, that.cityAddress) &&
                Objects.equals(countryAddress, that.countryAddress);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idAddress, provicneAddress, cityAddress, countryAddress);
    }
}
