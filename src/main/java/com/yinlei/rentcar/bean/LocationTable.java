package com.yinlei.rentcar.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "location_table", schema = "rent_car", catalog = "")
public class LocationTable {
    private int idLocation;
    private Double longitudeLocation;
    private Double latitudeLocation;
    private Integer idCarLocation;
    private Integer idCarStoreLocation;

    @Id
    @Column(name = "id_location", nullable = false)
    public int getIdLocation() {
        return idLocation;
    }

    public void setIdLocation(int idLocation) {
        this.idLocation = idLocation;
    }

    @Basic
    @Column(name = "longitude_location", nullable = true, precision = 0)
    public Double getLongitudeLocation() {
        return longitudeLocation;
    }

    public void setLongitudeLocation(Double longitudeLocation) {
        this.longitudeLocation = longitudeLocation;
    }

    @Basic
    @Column(name = "latitude_location", nullable = true, precision = 0)
    public Double getLatitudeLocation() {
        return latitudeLocation;
    }

    public void setLatitudeLocation(Double latitudeLocation) {
        this.latitudeLocation = latitudeLocation;
    }

    @Basic
    @Column(name = "id_car_location", nullable = true)
    public Integer getIdCarLocation() {
        return idCarLocation;
    }

    public void setIdCarLocation(Integer idCarLocation) {
        this.idCarLocation = idCarLocation;
    }

    @Basic
    @Column(name = "id_car_store_location", nullable = true)
    public Integer getIdCarStoreLocation() {
        return idCarStoreLocation;
    }

    public void setIdCarStoreLocation(Integer idCarStoreLocation) {
        this.idCarStoreLocation = idCarStoreLocation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocationTable that = (LocationTable) o;
        return idLocation == that.idLocation &&
                Objects.equals(longitudeLocation, that.longitudeLocation) &&
                Objects.equals(latitudeLocation, that.latitudeLocation) &&
                Objects.equals(idCarLocation, that.idCarLocation) &&
                Objects.equals(idCarStoreLocation, that.idCarStoreLocation);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idLocation, longitudeLocation, latitudeLocation, idCarLocation, idCarStoreLocation);
    }
}
