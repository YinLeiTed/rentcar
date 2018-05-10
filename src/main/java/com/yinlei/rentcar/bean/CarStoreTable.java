package com.yinlei.rentcar.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "car_store_table", schema = "rent_car", catalog = "")
public class CarStoreTable {
    private int idCarStore;
    private String nameCarStore;
    private String addressCarStore;
    private String phoneCarStore;
    private Integer startWorkCarStore;
    private Integer endWorkCarStore;
    private String imageCarStore;
    private Integer idLocationCarStore;

    @Id
    @Column(name = "id_car_store", nullable = false)
    public int getIdCarStore() {
        return idCarStore;
    }

    public void setIdCarStore(int idCarStore) {
        this.idCarStore = idCarStore;
    }

    @Basic
    @Column(name = "name_car_store", nullable = true, length = 50)
    public String getNameCarStore() {
        return nameCarStore;
    }

    public void setNameCarStore(String nameCarStore) {
        this.nameCarStore = nameCarStore;
    }

    @Basic
    @Column(name = "address_car_store", nullable = true, length = 100)
    public String getAddressCarStore() {
        return addressCarStore;
    }

    public void setAddressCarStore(String addressCarStore) {
        this.addressCarStore = addressCarStore;
    }

    @Basic
    @Column(name = "phone_car_store", nullable = true, length = 50)
    public String getPhoneCarStore() {
        return phoneCarStore;
    }

    public void setPhoneCarStore(String phoneCarStore) {
        this.phoneCarStore = phoneCarStore;
    }

    @Basic
    @Column(name = "start_work_car_store", nullable = true)
    public Integer getStartWorkCarStore() {
        return startWorkCarStore;
    }

    public void setStartWorkCarStore(Integer startWorkCarStore) {
        this.startWorkCarStore = startWorkCarStore;
    }

    @Basic
    @Column(name = "end_work_car_store", nullable = true)
    public Integer getEndWorkCarStore() {
        return endWorkCarStore;
    }

    public void setEndWorkCarStore(Integer endWorkCarStore) {
        this.endWorkCarStore = endWorkCarStore;
    }

    @Basic
    @Column(name = "image_car_store", nullable = true, length = -1)
    public String getImageCarStore() {
        return imageCarStore;
    }

    public void setImageCarStore(String imageCarStore) {
        this.imageCarStore = imageCarStore;
    }

    @Basic
    @Column(name = "id_location_car_store", nullable = true)
    public Integer getIdLocationCarStore() {
        return idLocationCarStore;
    }

    public void setIdLocationCarStore(Integer idLocationCarStore) {
        this.idLocationCarStore = idLocationCarStore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarStoreTable that = (CarStoreTable) o;
        return idCarStore == that.idCarStore &&
                Objects.equals(nameCarStore, that.nameCarStore) &&
                Objects.equals(addressCarStore, that.addressCarStore) &&
                Objects.equals(phoneCarStore, that.phoneCarStore) &&
                Objects.equals(startWorkCarStore, that.startWorkCarStore) &&
                Objects.equals(endWorkCarStore, that.endWorkCarStore) &&
                Objects.equals(imageCarStore, that.imageCarStore) &&
                Objects.equals(idLocationCarStore, that.idLocationCarStore);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idCarStore, nameCarStore, addressCarStore, phoneCarStore, startWorkCarStore, endWorkCarStore, imageCarStore, idLocationCarStore);
    }
}
