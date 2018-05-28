package com.yinlei.rentcar.bean;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "order_table", schema = "rent_car", catalog = "")
public class OrderTable {
    private int idOrder;
    private String orderIdOrder;
    private Integer idUserOrder;
    private Integer idCarOrder;
    private String idActivityOrder;
    private String idOtherServiceOrder;
    private Timestamp getCarTimeOrder;
    private Timestamp returnCarTimeOrder;
    private Integer idGetCarOrder;
    private Integer idReturnCarOrder;
    private String stateOrder;
    private String payMethodOrder;
    private Integer dayOrder;
    private Integer priceOrder;

    @Id
    @Column(name = "id_order", nullable = false)
    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    @Basic
    @Column(name = "order_id_order", nullable = true, length = 50)
    public String getOrderIdOrder() {
        return orderIdOrder;
    }

    public void setOrderIdOrder(String orderIdOrder) {
        this.orderIdOrder = orderIdOrder;
    }

    @Basic
    @Column(name = "id_user_order", nullable = true)
    public Integer getIdUserOrder() {
        return idUserOrder;
    }

    public void setIdUserOrder(Integer idUserOrder) {
        this.idUserOrder = idUserOrder;
    }

    @Basic
    @Column(name = "id_car_order", nullable = true)
    public Integer getIdCarOrder() {
        return idCarOrder;
    }

    public void setIdCarOrder(Integer idCarOrder) {
        this.idCarOrder = idCarOrder;
    }

    @Basic
    @Column(name = "id_activity_order", nullable = true, length = 250)
    public String getIdActivityOrder() {
        return idActivityOrder;
    }

    public void setIdActivityOrder(String idActivityOrder) {
        this.idActivityOrder = idActivityOrder;
    }

    @Basic
    @Column(name = "id_other_service_order", nullable = true, length = 250)
    public String getIdOtherServiceOrder() {
        return idOtherServiceOrder;
    }

    public void setIdOtherServiceOrder(String idOtherServiceOrder) {
        this.idOtherServiceOrder = idOtherServiceOrder;
    }

    @Basic
    @Column(name = "get_car_time_order", nullable = true)
    public Timestamp getGetCarTimeOrder() {
        return getCarTimeOrder;
    }

    public void setGetCarTimeOrder(Timestamp getCarTimeOrder) {
        this.getCarTimeOrder = getCarTimeOrder;
    }

    @Basic
    @Column(name = "return_car_time_order", nullable = true)
    public Timestamp getReturnCarTimeOrder() {
        return returnCarTimeOrder;
    }

    public void setReturnCarTimeOrder(Timestamp returnCarTimeOrder) {
        this.returnCarTimeOrder = returnCarTimeOrder;
    }

    @Basic
    @Column(name = "id_get_car_order", nullable = true)
    public Integer getIdGetCarOrder() {
        return idGetCarOrder;
    }

    public void setIdGetCarOrder(Integer idGetCarOrder) {
        this.idGetCarOrder = idGetCarOrder;
    }

    @Basic
    @Column(name = "id_return_car_order", nullable = true)
    public Integer getIdReturnCarOrder() {
        return idReturnCarOrder;
    }

    public void setIdReturnCarOrder(Integer idReturnCarOrder) {
        this.idReturnCarOrder = idReturnCarOrder;
    }

    @Basic
    @Column(name = "state_order", nullable = true, length = 50)
    public String getStateOrder() {
        return stateOrder;
    }

    public void setStateOrder(String stateOrder) {
        this.stateOrder = stateOrder;
    }

    @Basic
    @Column(name = "pay_method_order", nullable = true, length = 50)
    public String getPayMethodOrder() {
        return payMethodOrder;
    }

    public void setPayMethodOrder(String payMethodOrder) {
        this.payMethodOrder = payMethodOrder;
    }

    @Basic
    @Column(name = "day_order", nullable = true)
    public Integer getDayOrder() {
        return dayOrder;
    }

    public void setDayOrder(Integer dayOrder) {
        this.dayOrder = dayOrder;
    }

    @Basic
    @Column(name = "price_order", nullable = true)
    public Integer getPriceOrder() {
        return priceOrder;
    }

    public void setPriceOrder(Integer priceOrder) {
        this.priceOrder = priceOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderTable)) return false;
        OrderTable that = (OrderTable) o;
        return getIdOrder() == that.getIdOrder() &&
                Objects.equals(getOrderIdOrder(), that.getOrderIdOrder()) &&
                Objects.equals(getIdUserOrder(), that.getIdUserOrder()) &&
                Objects.equals(getIdCarOrder(), that.getIdCarOrder()) &&
                Objects.equals(getIdActivityOrder(), that.getIdActivityOrder()) &&
                Objects.equals(getIdOtherServiceOrder(), that.getIdOtherServiceOrder()) &&
                Objects.equals(getGetCarTimeOrder(), that.getGetCarTimeOrder()) &&
                Objects.equals(getReturnCarTimeOrder(), that.getReturnCarTimeOrder()) &&
                Objects.equals(getIdGetCarOrder(), that.getIdGetCarOrder()) &&
                Objects.equals(getIdReturnCarOrder(), that.getIdReturnCarOrder()) &&
                Objects.equals(getStateOrder(), that.getStateOrder()) &&
                Objects.equals(getPayMethodOrder(), that.getPayMethodOrder()) &&
                Objects.equals(getDayOrder(), that.getDayOrder()) &&
                Objects.equals(getPriceOrder(), that.getPriceOrder());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getIdOrder(), getOrderIdOrder(), getIdUserOrder(), getIdCarOrder(), getIdActivityOrder(), getIdOtherServiceOrder(), getGetCarTimeOrder(), getReturnCarTimeOrder(), getIdGetCarOrder(), getIdReturnCarOrder(), getStateOrder(), getPayMethodOrder(), getDayOrder(), getPriceOrder());
    }

    @Override
    public String toString() {
        return "OrderTable{" +
                "idOrder=" + idOrder +
                ", orderIdOrder='" + orderIdOrder + '\'' +
                ", idUserOrder=" + idUserOrder +
                ", idCarOrder=" + idCarOrder +
                ", idActivityOrder='" + idActivityOrder + '\'' +
                ", idOtherServiceOrder='" + idOtherServiceOrder + '\'' +
                ", getCarTimeOrder=" + getCarTimeOrder +
                ", returnCarTimeOrder=" + returnCarTimeOrder +
                ", idGetCarOrder=" + idGetCarOrder +
                ", idReturnCarOrder=" + idReturnCarOrder +
                ", stateOrder='" + stateOrder + '\'' +
                ", payMethodOrder='" + payMethodOrder + '\'' +
                ", dayOrder=" + dayOrder +
                ", priceOrder=" + priceOrder +
                '}';
    }
}
