package com.kaisar.models;

public class OrderItems {
    private int orderNum;
    private int orderItem;
    private int productId;
    private int quantity;
    private double itemPrice;

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public int getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(int orderItem) {
        this.orderItem = orderItem;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public OrderItems(int orderNum, int orderItem, int productId, int quantity, double itemPrice) {
        this.orderNum = orderNum;
        this.orderItem = orderItem;
        this.productId = productId;
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }
}
