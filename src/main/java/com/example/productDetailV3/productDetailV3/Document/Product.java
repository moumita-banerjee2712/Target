package com.example.productDetailV3.productDetailV3.Document;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
@Document
public class Product {

    @Id
    public String id;
    public float price;




    public String getId() {
        return id;
    }

   public void setId(String id) { this.id = id; }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {this.price = price;}
}
