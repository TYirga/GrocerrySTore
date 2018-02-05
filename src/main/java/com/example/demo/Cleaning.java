package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Cleaning {
    @Id

    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String strength;
    private String cleaning_items;
    private double cleaning_price;
    private double cleaning_total=0;
private int cleaning_count;

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public String getCleaning_items() {
        cleaning_count++;
        return cleaning_items;
    }

    public void setCleaning_items(String cleaning_items) {
        this.cleaning_items = cleaning_items;
    }

    public double getCleaning_price() {
        return cleaning_price;
    }

    public void setCleaning_price(double cleaning_price) {
        cleaning_total+=cleaning_price;
        this.cleaning_price = cleaning_price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getCleaning_total() {
        return cleaning_total;
    }

    public void setCleaning_total(double cleaning_total) {
        this.cleaning_total = cleaning_total;
    }

    public int getCleaning_count() {
        return cleaning_count;
    }

    public void setCleaning_count(int cleaning_count) {
        this.cleaning_count = cleaning_count;
    }
}
