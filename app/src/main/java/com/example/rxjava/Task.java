package com.example.rxjava;

public class Task {

    private String brand;
    private  String model;
    private  int price;

    public Task(String brand, String model, int price){
        this.brand = brand;
        this.model= model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
