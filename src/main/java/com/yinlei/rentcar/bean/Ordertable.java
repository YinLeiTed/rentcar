package com.yinlei.rentcar.bean;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Ordertable {
    private int idOrder;
    private String orderIdOrder;
    private Integer userIdOrder;
    private String activityIdOrder;
    private String otherServiceIdOrder;
    private Timestamp getCarTimeOrder;
    private Timestamp returnCarTimeOrder;
    private Integer getCarIdOrder;
    private Integer returnCarIdOrder;
    private String stateOrder;
    private String payMethodOrder;

    @Id
    @Column(name = "idOrder", nullable = false)
    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    @Basic
    @Column(name = "orderIdOrder", nullable = true, length = 50)
    public String getOrderIdOrder() {
        return orderIdOrder;
    }

    public void setOrderIdOrder(String orderIdOrder) {
        this.orderIdOrder = orderIdOrder;
    }

    @Basic
    @Column(name = "userIdOrder", nullable = true)
    public Integer getUserIdOrder() {
        return userIdOrder;
    }

    public void setUserIdOrder(Integer userIdOrder) {
        this.userIdOrder = userIdOrder;
    }

    @Basic
    @Column(name = "activityIdOrder", nullable = true, length = 250)
    public String getActivityIdOrder() {
        return activityIdOrder;
    }

    public void setActivityIdOrder(String activityIdOrder) {
        this.activityIdOrder = activityIdOrder;
    }

    @Basic
    @Column(name = "otherServiceIdOrder", nullable = true, length = 250)
    public String getOtherServiceIdOrder() {
        return otherServiceIdOrder;
    }

    public void setOtherServiceIdOrder(String otherServiceIdOrder) {
        this.otherServiceIdOrder = otherServiceIdOrder;
    }

    @Basic
    @Column(name = "getCarTimeOrder", nullable = true)
    public Timestamp getGetCarTimeOrder() {
        return getCarTimeOrder;
    }

    public void setGetCarTimeOrder(Timestamp getCarTimeOrder) {
        this.getCarTimeOrder = getCarTimeOrder;
    }

    @Basic
    @Column(name = "returnCarTimeOrder", nullable = true)
    public Timestamp getReturnCarTimeOrder() {
        return returnCarTimeOrder;
    }

    public void setReturnCarTimeOrder(Timestamp returnCarTimeOrder) {
        this.returnCarTimeOrder = returnCarTimeOrder;
    }

    @Basic
    @Column(name = "getCarIdOrder", nullable = true)
    public Integer getGetCarIdOrder() {
        return getCarIdOrder;
    }

    public void setGetCarIdOrder(Integer getCarIdOrder) {
        this.getCarIdOrder = getCarIdOrder;
    }

    @Basic
    @Column(name = "returnCarIdOrder", nullable = true)
    public Integer getReturnCarIdOrder() {
        return returnCarIdOrder;
    }

    public void setReturnCarIdOrder(Integer returnCarIdOrder) {
        this.returnCarIdOrder = returnCarIdOrder;
    }

    @Basic
    @Column(name = "stateOrder", nullable = true, length = 50)
    public String getStateOrder() {
        return stateOrder;
    }

    public void setStateOrder(String stateOrder) {
        this.stateOrder = stateOrder;
    }

    @Basic
    @Column(name = "payMethodOrder", nullable = true, length = 50)
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
        Ordertable that = (Ordertable) o;
        return idOrder == that.idOrder &&
                Objects.equals(orderIdOrder, that.orderIdOrder) &&
                Objects.equals(userIdOrder, that.userIdOrder) &&
                Objects.equals(activityIdOrder, that.activityIdOrder) &&
                Objects.equals(otherServiceIdOrder, that.otherServiceIdOrder) &&
                Objects.equals(getCarTimeOrder, that.getCarTimeOrder) &&
                Objects.equals(returnCarTimeOrder, that.returnCarTimeOrder) &&
                Objects.equals(getCarIdOrder, that.getCarIdOrder) &&
                Objects.equals(returnCarIdOrder, that.returnCarIdOrder) &&
                Objects.equals(stateOrder, that.stateOrder) &&
                Objects.equals(payMethodOrder, that.payMethodOrder);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idOrder, orderIdOrder, userIdOrder, activityIdOrder, otherServiceIdOrder, getCarTimeOrder, returnCarTimeOrder, getCarIdOrder, returnCarIdOrder, stateOrder, payMethodOrder);
    }
}
