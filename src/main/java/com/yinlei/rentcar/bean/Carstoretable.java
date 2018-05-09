package com.yinlei.rentcar.bean;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Carstoretable {
    private int idCarStore;
    private String nameCarStore;
    private String addressCarStore;
    private String phoneCarStore;
    private Integer startWorkCarStore;
    private Integer endWorkCarStore;

    @Id
    @Column(name = "idCarStore", nullable = false)
    public int getIdCarStore() {
        return idCarStore;
    }

    public void setIdCarStore(int idCarStore) {
        this.idCarStore = idCarStore;
    }

    @Basic
    @Column(name = "nameCarStore", nullable = true, length = 50)
    public String getNameCarStore() {
        return nameCarStore;
    }

    public void setNameCarStore(String nameCarStore) {
        this.nameCarStore = nameCarStore;
    }

    @Basic
    @Column(name = "addressCarStore", nullable = true, length = 100)
    public String getAddressCarStore() {
        return addressCarStore;
    }

    public void setAddressCarStore(String addressCarStore) {
        this.addressCarStore = addressCarStore;
    }

    @Basic
    @Column(name = "phoneCarStore", nullable = true, length = 50)
    public String getPhoneCarStore() {
        return phoneCarStore;
    }

    public void setPhoneCarStore(String phoneCarStore) {
        this.phoneCarStore = phoneCarStore;
    }

    @Basic
    @Column(name = "startWorkCarStore", nullable = true)
    public Integer getStartWorkCarStore() {
        return startWorkCarStore;
    }

    public void setStartWorkCarStore(Integer startWorkCarStore) {
        this.startWorkCarStore = startWorkCarStore;
    }

    @Basic
    @Column(name = "endWorkCarStore", nullable = true)
    public Integer getEndWorkCarStore() {
        return endWorkCarStore;
    }

    public void setEndWorkCarStore(Integer endWorkCarStore) {
        this.endWorkCarStore = endWorkCarStore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carstoretable that = (Carstoretable) o;
        return idCarStore == that.idCarStore &&
                Objects.equals(nameCarStore, that.nameCarStore) &&
                Objects.equals(addressCarStore, that.addressCarStore) &&
                Objects.equals(phoneCarStore, that.phoneCarStore) &&
                Objects.equals(startWorkCarStore, that.startWorkCarStore) &&
                Objects.equals(endWorkCarStore, that.endWorkCarStore);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idCarStore, nameCarStore, addressCarStore, phoneCarStore, startWorkCarStore, endWorkCarStore);
    }
}
