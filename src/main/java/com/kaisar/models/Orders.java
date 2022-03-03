package com.kaisar.models;

import java.util.Date;

public class Orders {
    private int orderNum;
    private Date orderDate;
    private int custId;

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public Orders(int orderNum, Date orderDate, int custId) {
        this.orderNum = orderNum;
        this.orderDate = orderDate;
        this.custId = custId;
    }
}
