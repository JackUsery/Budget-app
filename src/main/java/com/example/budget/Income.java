/*

This is the income class for the Budget app. It creates a new income object with a name and amount.

@Author: Jack Usery
@Assignment: Final Project
@Date: 11/3/2023

 */



package com.example.budget;

public class Income {

    private String name;
    private double amount;

    // constructor
    public Income(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }
    // getters
    public String getName() {
        return this.name;
    }

    public double getAmount() {
        return this.amount;
    }
    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    // toString
    @Override
    public String toString() {
        return this.name + ": " + this.amount;
    }


}
