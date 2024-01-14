/*

This is the saving class for the Budget app. It creates a new saving object with a name and amount and has getters, setters
and a toString method.

@Author: Jack Usery
@Assignment: Final Project
@Date: 11/10/2023

 */



package com.example.budget;

public class Saving {

    private String name;
    private double amount;
    // constructor
    public Saving(String name, double amount) {
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