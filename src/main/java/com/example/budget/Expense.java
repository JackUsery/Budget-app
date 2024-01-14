/*

This is the expense class for the Budget app. It creates a new expense object with a name and amount and has getters,
setters

@Author: Jack Usery
@Assignment: Final Project
@Date: 11/15/2023

 */



package com.example.budget;

public class Expense {


    private String name;
    private double amount;

    // constructor
    public Expense(String name, double amount) {
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
