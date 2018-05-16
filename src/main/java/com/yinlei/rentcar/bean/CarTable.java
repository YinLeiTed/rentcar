package com.yinlei.rentcar.bean;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "car_table", schema = "rent_car", catalog = "")
public class CarTable {
    private int idCar;
    private String nameCar;
    private String describeCar;
    private String licenseCar;
    private String carTypeCar;
    private String brandTypeCar;
    private Integer dailyRentCar;
    private Integer weeklyRentCar;
    private Integer monthlyRentCar;
    private String imgCar;
    private Integer idCarStoreCar;
    private Integer idLocationCar;
    private Integer usingCar;
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
    @Column(name = "id_car", nullable = false)
    public int getIdCar() {
        return idCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }

    @Basic
    @Column(name = "name_car", nullable = true, length = 50)
    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    @Basic
    @Column(name = "describe_car", nullable = true, length = 250)
    public String getDescribeCar() {
        return describeCar;
    }

    public void setDescribeCar(String describeCar) {
        this.describeCar = describeCar;
    }

    @Basic
    @Column(name = "license_car", nullable = true, length = 50)
    public String getLicenseCar() {
        return licenseCar;
    }

    public void setLicenseCar(String licenseCar) {
        this.licenseCar = licenseCar;
    }

    @Basic
    @Column(name = "car_type_car", nullable = true, length = 50)
    public String getCarTypeCar() {
        return carTypeCar;
    }

    public void setCarTypeCar(String carTypeCar) {
        this.carTypeCar = carTypeCar;
    }

    @Basic
    @Column(name = "brand_type_car", nullable = true, length = 50)
    public String getBrandTypeCar() {
        return brandTypeCar;
    }

    public void setBrandTypeCar(String brandTypeCar) {
        this.brandTypeCar = brandTypeCar;
    }

    @Basic
    @Column(name = "daily_rent_car", nullable = true)
    public Integer getDailyRentCar() {
        return dailyRentCar;
    }

    public void setDailyRentCar(Integer dailyRentCar) {
        this.dailyRentCar = dailyRentCar;
    }

    @Basic
    @Column(name = "weekly_rent_car", nullable = true)
    public Integer getWeeklyRentCar() {
        return weeklyRentCar;
    }

    public void setWeeklyRentCar(Integer weeklyRentCar) {
        this.weeklyRentCar = weeklyRentCar;
    }

    @Basic
    @Column(name = "monthly_rent_car", nullable = true)
    public Integer getMonthlyRentCar() {
        return monthlyRentCar;
    }

    public void setMonthlyRentCar(Integer monthlyRentCar) {
        this.monthlyRentCar = monthlyRentCar;
    }

    @Basic
    @Column(name = "img_car", nullable = true, length = 100)
    public String getImgCar() {
        return imgCar;
    }

    public void setImgCar(String imgCar) {
        this.imgCar = imgCar;
    }

    @Basic
    @Column(name = "id_car_store_car", nullable = true)
    public Integer getIdCarStoreCar() {
        return idCarStoreCar;
    }

    public void setIdCarStoreCar(Integer idCarStoreCar) {
        this.idCarStoreCar = idCarStoreCar;
    }

    @Basic
    @Column(name = "id_location_car", nullable = true)
    public Integer getIdLocationCar() {
        return idLocationCar;
    }

    public void setIdLocationCar(Integer idLocationCar) {
        this.idLocationCar = idLocationCar;
    }

    @Basic
    @Column(name = "using_car", nullable = true)
    public Integer getUsingCar() {
        return usingCar;
    }

    public void setUsingCar(Integer usingCar) {
        this.usingCar = usingCar;
    }

    @Basic
    @Column(name = "use_property_car", nullable = true, length = 50)
    public String getUsePropertyCar() {
        return usePropertyCar;
    }

    public void setUsePropertyCar(String usePropertyCar) {
        this.usePropertyCar = usePropertyCar;
    }

    @Basic
    @Column(name = "owner_car", nullable = true, length = 50)
    public String getOwnerCar() {
        return ownerCar;
    }

    public void setOwnerCar(String ownerCar) {
        this.ownerCar = ownerCar;
    }

    @Basic
    @Column(name = "purchase_time_car", nullable = true)
    public Timestamp getPurchaseTimeCar() {
        return purchaseTimeCar;
    }

    public void setPurchaseTimeCar(Timestamp purchaseTimeCar) {
        this.purchaseTimeCar = purchaseTimeCar;
    }

    @Basic
    @Column(name = "buying_unit_car", nullable = true, length = 50)
    public String getBuyingUnitCar() {
        return buyingUnitCar;
    }

    public void setBuyingUnitCar(String buyingUnitCar) {
        this.buyingUnitCar = buyingUnitCar;
    }

    @Basic
    @Column(name = "engine_displacement_car", nullable = true)
    public Integer getEngineDisplacementCar() {
        return engineDisplacementCar;
    }

    public void setEngineDisplacementCar(Integer engineDisplacementCar) {
        this.engineDisplacementCar = engineDisplacementCar;
    }

    @Basic
    @Column(name = "fuel_tank_capacity_car", nullable = true)
    public Integer getFuelTankCapacityCar() {
        return fuelTankCapacityCar;
    }

    public void setFuelTankCapacityCar(Integer fuelTankCapacityCar) {
        this.fuelTankCapacityCar = fuelTankCapacityCar;
    }

    @Basic
    @Column(name = "color_car", nullable = true, length = 50)
    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    @Basic
    @Column(name = "total_weight_car", nullable = true)
    public Integer getTotalWeightCar() {
        return totalWeightCar;
    }

    public void setTotalWeightCar(Integer totalWeightCar) {
        this.totalWeightCar = totalWeightCar;
    }

    @Basic
    @Column(name = "transmission_type_car", nullable = true, length = 50)
    public String getTransmissionTypeCar() {
        return transmissionTypeCar;
    }

    public void setTransmissionTypeCar(String transmissionTypeCar) {
        this.transmissionTypeCar = transmissionTypeCar;
    }

    @Basic
    @Column(name = "turbo_car", nullable = true, length = 50)
    public String getTurboCar() {
        return turboCar;
    }

    public void setTurboCar(String turboCar) {
        this.turboCar = turboCar;
    }

    @Basic
    @Column(name = "maintenance_cycle_car", nullable = true)
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
        CarTable carTable = (CarTable) o;
        return idCar == carTable.idCar &&
                Objects.equals(nameCar, carTable.nameCar) &&
                Objects.equals(describeCar, carTable.describeCar) &&
                Objects.equals(licenseCar, carTable.licenseCar) &&
                Objects.equals(carTypeCar, carTable.carTypeCar) &&
                Objects.equals(brandTypeCar, carTable.brandTypeCar) &&
                Objects.equals(dailyRentCar, carTable.dailyRentCar) &&
                Objects.equals(weeklyRentCar, carTable.weeklyRentCar) &&
                Objects.equals(monthlyRentCar, carTable.monthlyRentCar) &&
                Objects.equals(imgCar, carTable.imgCar) &&
                Objects.equals(idCarStoreCar, carTable.idCarStoreCar) &&
                Objects.equals(idLocationCar, carTable.idLocationCar) &&
                Objects.equals(usingCar, carTable.usingCar) &&
                Objects.equals(usePropertyCar, carTable.usePropertyCar) &&
                Objects.equals(ownerCar, carTable.ownerCar) &&
                Objects.equals(purchaseTimeCar, carTable.purchaseTimeCar) &&
                Objects.equals(buyingUnitCar, carTable.buyingUnitCar) &&
                Objects.equals(engineDisplacementCar, carTable.engineDisplacementCar) &&
                Objects.equals(fuelTankCapacityCar, carTable.fuelTankCapacityCar) &&
                Objects.equals(colorCar, carTable.colorCar) &&
                Objects.equals(totalWeightCar, carTable.totalWeightCar) &&
                Objects.equals(transmissionTypeCar, carTable.transmissionTypeCar) &&
                Objects.equals(turboCar, carTable.turboCar) &&
                Objects.equals(maintenanceCycleCar, carTable.maintenanceCycleCar);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idCar, nameCar, describeCar, licenseCar, carTypeCar, brandTypeCar, dailyRentCar, weeklyRentCar, monthlyRentCar, imgCar, idCarStoreCar, idLocationCar, usingCar, usePropertyCar, ownerCar, purchaseTimeCar, buyingUnitCar, engineDisplacementCar, fuelTankCapacityCar, colorCar, totalWeightCar, transmissionTypeCar, turboCar, maintenanceCycleCar);
    }
}
