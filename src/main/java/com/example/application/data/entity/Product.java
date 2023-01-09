package com.example.application.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;

@Entity
public class Product extends AbstractEntity {

    private String nameProduct;
    private String nameCategory;
    private String priceProduct;
    private String soldProduct;
    private String madeOn;
    @Lob
    @Column(length = 1000000)
    private byte[] thumnailProduct;

    public String getNameProduct() {
        return nameProduct;
    }
    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }
    public String getNameCategory() {
        return nameCategory;
    }
    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }
    public String getPriceProduct() {
        return priceProduct;
    }
    public void setPriceProduct(String priceProduct) {
        this.priceProduct = priceProduct;
    }
    public String getSoldProduct() {
        return soldProduct;
    }
    public void setSoldProduct(String soldProduct) {
        this.soldProduct = soldProduct;
    }
    public String getMadeOn() {
        return madeOn;
    }
    public void setMadeOn(String madeOn) {
        this.madeOn = madeOn;
    }
    public byte[] getThumnailProduct() {
        return thumnailProduct;
    }
    public void setThumnailProduct(byte[] thumnailProduct) {
        this.thumnailProduct = thumnailProduct;
    }

}
