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
    private String idActivityOrder;
    private String idOtherServiceOrder;
    private Timestamp getCarTimeOrder;
    private Timestamp returnCarTimeOrder;
    private Integer idGetCarOrder;
    private Integer idReturnCarOrder;
    private String stateOrder;
    private String payMethodOrder;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderTable that = (OrderTable) o;
        return idOrder == that.idOrder &&
                Objects.equals(orderIdOrder, that.orderIdOrder) &&
                Objects.equals(idUserOrder, that.idUserOrder) &&
                Objects.equals(idActivityOrder, that.idActivityOrder) &&
                Objects.equals(idOtherServiceOrder, that.idOtherServiceOrder) &&
                Objects.equals(getCarTimeOrder, that.getCarTimeOrder) &&
                Objects.equals(returnCarTimeOrder, that.returnCarTimeOrder) &&
                Objects.equals(idGetCarOrder, that.idGetCarOrder) &&
                Objects.equals(idReturnCarOrder, that.idReturnCarOrder) &&
                Objects.equals(stateOrder, that.stateOrder) &&
                Objects.equals(payMethodOrder, that.payMethodOrder);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idOrder, orderIdOrder, idUserOrder, idActivityOrder, idOtherServiceOrder, getCarTimeOrder, returnCarTimeOrder, idGetCarOrder, idReturnCarOrder, stateOrder, payMethodOrder);
    }
}
