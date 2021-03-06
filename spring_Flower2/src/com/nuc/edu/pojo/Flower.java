package com.nuc.edu.pojo;

import java.io.Serializable;

public class Flower implements Serializable {
     private int id;
     private String name;
     private int price;
     private String production;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public Flower() {
    }

    public Flower(int id, String name, int price, String production) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.production = production;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", production='" + production + '\'' +
                '}';
    }
}
