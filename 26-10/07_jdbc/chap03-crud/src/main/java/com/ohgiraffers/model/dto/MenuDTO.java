package com.ohgiraffers.model.dto;

public class MenuDTO {

    private int code;
    private String name;
    private int price;
    private int categoryCode;
    private String orderableStatus;

    public MenuDTO() {
    }

    public MenuDTO(int categoryCode, int code, String name, String orderableStatus, int price) {
        this.categoryCode = categoryCode;
        this.code = code;
        this.name = name;
        this.orderableStatus = orderableStatus;
        this.price = price;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrderableStatus() {
        return orderableStatus;
    }

    public void setOrderableStatus(String orderableStatus) {
        this.orderableStatus = orderableStatus;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MenuDTO{" +
                "categoryCode=" + categoryCode +
                ", code=" + code +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", orderableStatus='" + orderableStatus + '\'' +
                '}';
    }
}
