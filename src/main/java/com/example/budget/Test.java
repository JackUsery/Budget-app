/*

This is the test class for the Budget app. It creates a new budget object and adds incomes, expenses and savings to it.

@Author: Jack Usery
@Assignment: Final Project
@Date: 11/20/2023

 */

package com.example.budget;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        // crate a new scanner
        Scanner scanner = new Scanner(System.in);
        // create a budget object
        Budget budget = new Budget();

        System.out.println("Welcome to Budget App!");
        System.out.println("Please enter your incomes, expenses and savings.");
        System.out.println("When you are done, enter 'done' to see your budget.");
        System.out.println("");

        // add incomes
        while (true) {
            System.out.print("Enter income name: ");
            String name = scanner.nextLine();
            if (name.equals("done")) {
                break;
            }
            System.out.print("Enter income amount: ");
            double amount = Double.valueOf(scanner.nextLine());
            budget.addIncome(new Income(name, amount));
        }
        // add expenses
        while (true) {
            System.out.print("Enter expense name: ");
            String name = scanner.nextLine();
            if (name.equals("done")) {
                break;
            }
            System.out.print("Enter expense amount: ");
            double amount = Double.valueOf(scanner.nextLine());
            budget.addExpense(new Expense(name, amount));
        }
        // add savings
        while (true) {
            System.out.print("Enter saving name: ");
            String name = scanner.nextLine();
            if (name.equals("done")) {
                break;
            }
            System.out.print("Enter saving amount: ");
            double amount = Double.valueOf(scanner.nextLine());
            budget.addSaving(new Saving(name, amount));
        }
        // print budget
        System.out.println("");
        System.out.println("Your budget:");
        System.out.println(budget.toString());
    }
}
