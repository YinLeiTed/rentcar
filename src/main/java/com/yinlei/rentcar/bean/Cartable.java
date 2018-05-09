package com.yinlei.rentcar.bean;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Cartable {
    private int idCar;
    private String licenseCar;
    private String carTypeCar;
    private String brandTypeCar;
    private Integer dailyRentCar;
    private Integer weeklyRentCar;
    private Integer monthlyRentCar;
    private String imgCar;
    private Integer carStoreCar;
    private String usePropertyCar;
    private String ownerCar;
    private Timestamp purchaseTimeCar;
    private String buyingUnitCar;
    private Integer engineDisplacementCar;
    private Integer fuelTankCapacityCar;
    private String colorCar;
    private Integer totalWeightCar;
    private String transmissionTypeCar;
    private String turboCar;
    private Integer maintenanceCycleCar;

    @Id
    @Column(name = "idCar", nullable = false)
    public int getIdCar() {
        return idCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }

    @Basic
    @Column(name = "licenseCar", nullable = true, length = 50)
    public String getLicenseCar() {
        return licenseCar;
    }

    public void setLicenseCar(String licenseCar) {
        this.licenseCar = licenseCar;
    }

    @Basic
    @Column(name = "carTypeCar", nullable = true, length = 50)
    public String getCarTypeCar() {
        return carTypeCar;
    }

    public void setCarTypeCar(String carTypeCar) {
        this.carTypeCar = carTypeCar;
    }

    @Basic
    @Column(name = "brandTypeCar", nullable = true, length = 50)
    public String getBrandTypeCar() {
        return brandTypeCar;
    }

    public void setBrandTypeCar(String brandTypeCar) {
        this.brandTypeCar = brandTypeCar;
    }

    @Basic
    @Column(name = "dailyRentCar", nullable = true)
    public Integer getDailyRentCar() {
        return dailyRentCar;
    }

    public void setDailyRentCar(Integer dailyRentCar) {
        this.dailyRentCar = dailyRentCar;
    }

    @Basic
    @Column(name = "weeklyRentCar", nullable = true)
    public Integer getWeeklyRentCar() {
        return weeklyRentCar;
    }

    public void setWeeklyRentCar(Integer weeklyRentCar) {
        this.weeklyRentCar = weeklyRentCar;
    }

    @Basic
    @Column(name = "monthlyRentCar", nullable = true)
    public Integer getMonthlyRentCar() {
        return monthlyRentCar;
    }

    public void setMonthlyRentCar(Integer monthlyRentCar) {
        this.monthlyRentCar = monthlyRentCar;
    }

    @Basic
    @Column(name = "imgCar", nullable = true, length = 100)
    public String getImgCar() {
        return imgCar;
    }

    public void setImgCar(String imgCar) {
        this.imgCar = imgCar;
    }

    @Basic
    @Column(name = "carStoreCar", nullable = true)
    public Integer getCarStoreCar() {
        return carStoreCar;
    }

    public void setCarStoreCar(Integer carStoreCar) {
        this.carStoreCar = carStoreCar;
    }

    @Basic
    @Column(name = "usePropertyCar", nullable = true, length = 50)
    public String getUsePropertyCar() {
        return usePropertyCar;
    }

    public void setUsePropertyCar(String usePropertyCar) {
        this.usePropertyCar = usePropertyCar;
    }

    @Basic
    @Column(name = "ownerCar", nullable = true, length = 50)
    public String getOwnerCar() {
        return ownerCar;
    }

    public void setOwnerCar(String ownerCar) {
        this.ownerCar = ownerCar;
    }

    @Basic
    @Column(name = "purchaseTimeCar", nullable = true)
    public Timestamp getPurchaseTimeCar() {
        return purchaseTimeCar;
    }

    public void setPurchaseTimeCar(Timestamp purchaseTimeCar) {
        this.purchaseTimeCar = purchaseTimeCar;
    }

    @Basic
    @Column(name = "buyingUnitCar", nullable = true, length = 50)
    public String getBuyingUnitCar() {
        return buyingUnitCar;
    }

    public void setBuyingUnitCar(String buyingUnitCar) {
        this.buyingUnitCar = buyingUnitCar;
    }

    @Basic
    @Column(name = "engineDisplacementCar", nullable = true)
    public Integer getEngineDisplacementCar() {
        return engineDisplacementCar;
    }

    public void setEngineDisplacementCar(Integer engineDisplacementCar) {
        this.engineDisplacementCar = engineDisplacementCar;
    }

    @Basic
    @Column(name = "fuelTankCapacityCar", nullable = true)
    public Integer getFuelTankCapacityCar() {
        return fuelTankCapacityCar;
    }

    public void setFuelTankCapacityCar(Integer fuelTankCapacityCar) {
        this.fuelTankCapacityCar = fuelTankCapacityCar;
    }

    @Basic
    @Column(name = "colorCar", nullable = true, length = 50)
    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    @Basic
    @Column(name = "totalWeightCar", nullable = true)
    public Integer getTotalWeightCar() {
        return totalWeightCar;
    }

    public void setTotalWeightCar(Integer totalWeightCar) {
        this.totalWeightCar = totalWeightCar;
    }

    @Basic
    @Column(name = "transmissionTypeCar", nullable = true, length = 50)
    public String getTransmissionTypeCar() {
        return transmissionTypeCar;
    }

    public void setTransmissionTypeCar(String transmissionTypeCar) {
        this.transmissionTypeCar = transmissionTypeCar;
    }

    @Basic
    @Column(name = "turboCar", nullable = true, length = 50)
    public String getTurboCar() {
        return turboCar;
    }

    public void setTurboCar(String turboCar) {
        this.turboCar = turboCar;
    }

    @Basic
    @Column(name = "maintenanceCycleCar", nullable = true)
    public Integer getMaintenanceCycleCar() {
        return maintenanceCycleCar;
    }

    public void setMaintenanceCycleCar(Integer maintenanceCycleCar) {
        this.maintenanceCycleCar = maintenanceCycleCar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cartable cartable = (Cartable) o;
        return idCar == cartable.idCar &&
                Objects.equals(licenseCar, cartable.licenseCar) &&
                Objects.equals(carTypeCar, cartable.carTypeCar) &&
                Objects.equals(brandTypeCar, cartable.brandTypeCar) &&
                Objects.equals(dailyRentCar, cartable.dailyRentCar) &&
                Objects.equals(weeklyRentCar, cartable.weeklyRentCar) &&
                Objects.equals(monthlyRentCar, cartable.monthlyRentCar) &&
                Objects.equals(imgCar, cartable.imgCar) &&
                Objects.equals(carStoreCar, cartable.carStoreCar) &&
                Objects.equals(usePropertyCar, cartable.usePropertyCar) &&
                Objects.equals(ownerCar, cartable.ownerCar) &&
                Objects.equals(purchaseTimeCar, cartable.purchaseTimeCar) &&
                Objects.equals(buyingUnitCar, cartable.buyingUnitCar) &&
                Objects.equals(engineDisplacementCar, cartable.engineDisplacementCar) &&
                Objects.equals(fuelTankCapacityCar, cartable.fuelTankCapacityCar) &&
                Objects.equals(colorCar, cartable.colorCar) &&
                Objects.equals(totalWeightCar, cartable.totalWeightCar) &&
                Objects.equals(transmissionTypeCar, cartable.transmissionTypeCar) &&
                Objects.equals(turboCar, cartable.turboCar) &&
                Objects.equals(maintenanceCycleCar, cartable.maintenanceCycleCar);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idCar, licenseCar, carTypeCar, brandTypeCar, dailyRentCar, weeklyRentCar, monthlyRentCar, imgCar, carStoreCar, usePropertyCar, ownerCar, purchaseTimeCar, buyingUnitCar, engineDisplacementCar, fuelTankCapacityCar, colorCar, totalWeightCar, transmissionTypeCar, turboCar, maintenanceCycleCar);
    }

    @Override
    public String toString() {
        return "Cartable{" +
                "idCar=" + idCar +
                ", licenseCar='" + licenseCar + '\'' +
                ", carTypeCar='" + carTypeCar + '\'' +
                ", brandTypeCar='" + brandTypeCar + '\'' +
                ", dailyRentCar=" + dailyRentCar +
                ", weeklyRentCar=" + weeklyRentCar +
                ", monthlyRentCar=" + monthlyRentCar +
                ", imgCar='" + imgCar + '\'' +
                ", carStoreCar=" + carStoreCar +
                ", usePropertyCar='" + usePropertyCar + '\'' +
                ", ownerCar='" + ownerCar + '\'' +
                ", purchaseTimeCar=" + purchaseTimeCar +
                ", buyingUnitCar='" + buyingUnitCar + '\'' +
                ", engineDisplacementCar=" + engineDisplacementCar +
                ", fuelTankCapacityCar=" + fuelTankCapacityCar +
                ", colorCar='" + colorCar + '\'' +
                ", totalWeightCar=" + totalWeightCar +
                ", transmissionTypeCar='" + transmissionTypeCar + '\'' +
                ", turboCar='" + turboCar + '\'' +
                ", maintenanceCycleCar=" + maintenanceCycleCar +
                '}';
    }

    public Cartable(String licenseCar, String carTypeCar, String brandTypeCar, Integer dailyRentCar, Integer weeklyRentCar, Integer monthlyRentCar, String imgCar, Integer carStoreCar, String usePropertyCar, String ownerCar, Timestamp purchaseTimeCar, String buyingUnitCar, Integer engineDisplacementCar, Integer fuelTankCapacityCar, String colorCar, Integer totalWeightCar, String transmissionTypeCar, String turboCar, Integer maintenanceCycleCar) {
        this.licenseCar = licenseCar;
        this.carTypeCar = carTypeCar;
        this.brandTypeCar = brandTypeCar;
        this.dailyRentCar = dailyRentCar;
        this.weeklyRentCar = weeklyRentCar;
        this.monthlyRentCar = monthlyRentCar;
        this.imgCar = imgCar;
        this.carStoreCar = carStoreCar;
        this.usePropertyCar = usePropertyCar;
        this.ownerCar = ownerCar;
        this.purchaseTimeCar = purchaseTimeCar;
        this.buyingUnitCar = buyingUnitCar;
        this.engineDisplacementCar = engineDisplacementCar;
        this.fuelTankCapacityCar = fuelTankCapacityCar;
        this.colorCar = colorCar;
        this.totalWeightCar = totalWeightCar;
        this.transmissionTypeCar = transmissionTypeCar;
        this.turboCar = turboCar;
        this.maintenanceCycleCar = maintenanceCycleCar;
    }

    public Cartable() {

    }
}
