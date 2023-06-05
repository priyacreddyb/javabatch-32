package com.cis.week1;

public class Product {
     //Generating getters and setters
    public Product(){

    }

    public Product(int Quantity){
        this.Quantity=Quantity;
    }

    private double Price;
    int Quantity;

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        this.Price = 10;
    }

    public double getPrice(int Quantity){
        return Quantity*Price;
    }
}
