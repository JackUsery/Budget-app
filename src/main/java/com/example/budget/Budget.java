/*

This is the Budget class for the Budget app. It creates a new budget object with an arraylist of incomes, expenses,
and savings and methods to add incomes, expenses, and savings to the arraylists and methods to get the total income,
expense, saving, and balance.

@Author: Jack Usery
@Assignment: Final Project
@Date: 11/3/2023

 */





package com.example.budget;

import java.util.ArrayList;

public class Budget {


    private ArrayList<Income> incomes;
    private ArrayList<Expense> expenses;
    private ArrayList<Saving> savings;

    // constructor
    public Budget() {
        this.incomes = new ArrayList<>();
        this.expenses = new ArrayList<>();
        this.savings = new ArrayList<>();
    }

    // setters
    public void addIncome(Income income) {
        this.incomes.add(income);
    }

    public void addExpense(Expense expense) {
        this.expenses.add(expense);
    }

    public void addSaving(Saving saving) {
        this.savings.add(saving);
    }

    // getters
    public ArrayList<Income> getIncomes() {
        return this.incomes;
    }

    public ArrayList<Expense> getExpenses() {
        return this.expenses;
    }

    public ArrayList<Saving> getSavings() {
        return this.savings;
    }


    public double getIncomeTotal() {
        double total = 0;
        for (Income income : this.incomes) {
            total += income.getAmount();
        }
        return total;
    }

    public double getExpenseTotal() {
        double total = 0;
        for (Expense expense : this.expenses) {
            total += expense.getAmount();
        }
        return total;
    }

    public double getSavingTotal() {
        double total = 0;
        for (Saving saving : this.savings) {
            total += saving.getAmount();
        }
        return total;
    }

    public double getBalance() {
        return this.getIncomeTotal() - this.getExpenseTotal() - this.getSavingTotal();
    }

    // toString
    @Override
    public String toString() {
        return "Income: " + this.getIncomeTotal() + "\n" +
                "Expense: " + this.getExpenseTotal() + "\n" +
                "Saving: " + this.getSavingTotal() + "\n" +
                "Balance: " + this.getBalance();
    }



}
