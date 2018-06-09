package com.example.productDetailV3.productDetailV3.Document;

public class Uproductdetail extends Product {

    String name;
    String Uid = super.id;
    Float Uprice =super.price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
