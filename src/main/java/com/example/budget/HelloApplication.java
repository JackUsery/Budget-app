/*

This is the BudgetApplication class for the Budget app. It creates the GUI.

@Author: Jack Usery
@Assignment: Final Project
@Date: 11/1/2023

 */



package com.example.budget;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private Budget budget = new Budget();

    @Override
    public void start(Stage stage) throws Exception {

        GridPane grid = new GridPane();

        // create tabs
        TabPane tabPane = new TabPane();
        Tab tab1 = new Tab("Income");
        Tab tab2 = new Tab("Expense");
        Tab tab3 = new Tab("Savings");
        Tab tab4 = new Tab("Transactions");
        Tab tab5 = new Tab("Summary");
        tabPane.getTabs().add(tab1);
        tabPane.getTabs().add(tab2);
        tabPane.getTabs().add(tab3);
        tabPane.getTabs().add(tab4);
        tabPane.getTabs().add(tab5);
        tabPane.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE);
        grid.add(tabPane, 0, 0);

        // set up income tab
        VBox incomeVBox = new VBox();
        incomeVBox.setPadding(new Insets(10, 10, 10, 10));
        incomeVBox.setSpacing(10);
        HBox incomeHBox = new HBox();
        incomeHBox.setPadding(new Insets(10, 10, 10, 10));
        incomeHBox.setSpacing(10);
        Label incomeNameLabel = new Label("Name");
        TextField incomeNameTextField = new TextField();
        Label incomeAmountLabel = new Label("Amount");
        TextField incomeAmountTextField = new TextField();
        Button incomeAddButton = new Button("Add");
        incomeHBox.getChildren().addAll(incomeNameLabel, incomeNameTextField, incomeAmountLabel, incomeAmountTextField, incomeAddButton);
        incomeVBox.getChildren().add(incomeHBox);
        tab1.setContent(incomeVBox);

        // set up expense tab
        VBox expenseVBox = new VBox();
        expenseVBox.setPadding(new Insets(10, 10, 10, 10));
        expenseVBox.setSpacing(10);
        HBox expenseHBox = new HBox();
        expenseHBox.setPadding(new Insets(10, 10, 10, 10));
        expenseHBox.setSpacing(10);
        Label expenseNameLabel = new Label("Name");
        TextField expenseNameTextField = new TextField();
        Label expenseAmountLabel = new Label("Amount");
        TextField expenseAmountTextField = new TextField();
        Button expenseAddButton = new Button("Add");
        expenseHBox.getChildren().addAll(expenseNameLabel, expenseNameTextField, expenseAmountLabel, expenseAmountTextField, expenseAddButton);
        expenseVBox.getChildren().add(expenseHBox);
        tab2.setContent(expenseVBox);

        // set up savings tab
        VBox savingsVBox = new VBox();
        savingsVBox.setPadding(new Insets(10, 10, 10, 10));
        savingsVBox.setSpacing(10);
        HBox savingsHBox = new HBox();
        savingsHBox.setPadding(new Insets(10, 10, 10, 10));
        savingsHBox.setSpacing(10);
        Label savingsNameLabel = new Label("Name");
        TextField savingsNameTextField = new TextField();
        Label savingsAmountLabel = new Label("Amount");
        TextField savingsAmountTextField = new TextField();
        Button savingsAddButton = new Button("Add");
        savingsHBox.getChildren().addAll(savingsNameLabel, savingsNameTextField, savingsAmountLabel, savingsAmountTextField, savingsAddButton);
        savingsVBox.getChildren().add(savingsHBox);
        tab3.setContent(savingsVBox);

        // set up transactions tab text field
        VBox transactionsVBox = new VBox();
        transactionsVBox.setPadding(new Insets(10, 10, 10, 10));
        transactionsVBox.setSpacing(10);
        HBox transactionsHBox = new HBox();
        transactionsHBox.setPadding(new Insets(10, 10, 10, 10));
        transactionsHBox.setSpacing(10);
        TextArea transactionsTextArea = new TextArea();
        transactionsTextArea.setEditable(false);
        transactionsTextArea.setPrefHeight(200);
        transactionsTextArea.setPrefWidth(400);
        transactionsHBox.getChildren().add(transactionsTextArea);
        transactionsVBox.getChildren().add(transactionsHBox);
        tab4.setContent(transactionsVBox);



        // set up summary tab
        VBox summaryVBox = new VBox();
        summaryVBox.setPadding(new Insets(10, 10, 10, 10));
        summaryVBox.setSpacing(10);
        HBox summaryHBox = new HBox();
        summaryHBox.setPadding(new Insets(10, 10, 10, 10));
        summaryHBox.setSpacing(10);
        Label summaryIncomeLabel = new Label("Income: $");
        Label summaryExpenseLabel = new Label("Expense: $");
        Label summarySavingsLabel = new Label("Savings: $");
        Label summaryTotalLabel = new Label("Total: $");
        summaryHBox.getChildren().addAll(summaryIncomeLabel, summaryExpenseLabel, summarySavingsLabel, summaryTotalLabel);
        summaryVBox.getChildren().add(summaryHBox);
        tab5.setContent(summaryVBox);


        // set up add buttons
        incomeAddButton.setOnAction((event) -> {
            String incomeName = incomeNameTextField.getText();
            double incomeAmount = Double.parseDouble(incomeAmountTextField.getText());
            Income income = new Income(incomeName, incomeAmount);
            budget.addIncome(income);
            incomeNameTextField.clear();
            incomeAmountTextField.clear();
            transactionsTextArea.appendText("Income: " + income.getName() + " - $" + income.getAmount() + "\n");
            summaryIncomeLabel.setText("Income: $" + budget.getIncomeTotal());
            summaryTotalLabel.setText("Total: $" + (budget.getIncomeTotal() - budget.getExpenseTotal() - budget.getSavingTotal()));
        });

        expenseAddButton.setOnAction((event) -> {
            String expenseName = expenseNameTextField.getText();
            double expenseAmount = Double.parseDouble(expenseAmountTextField.getText());
            Expense expense = new Expense(expenseName, expenseAmount);
            budget.addExpense(expense);
            expenseNameTextField.clear();
            expenseAmountTextField.clear();
            transactionsTextArea.appendText("Expense: " + expense.getName() + " - $" + expense.getAmount() + "\n");
            summaryExpenseLabel.setText("Expense: $" + budget.getExpenseTotal());
            summaryTotalLabel.setText("Total: $" + (budget.getIncomeTotal() - budget.getExpenseTotal() - budget.getSavingTotal()));
        });

        savingsAddButton.setOnAction((event) -> {
            String savingsName = savingsNameTextField.getText();
            double savingsAmount = Double.parseDouble(savingsAmountTextField.getText());
            Saving saving = new Saving(savingsName, savingsAmount);
            budget.addSaving(saving);
            savingsNameTextField.clear();
            savingsAmountTextField.clear();
            transactionsTextArea.appendText("Saving: " + saving.getName() + " - $" + saving.getAmount() + "\n");
            summarySavingsLabel.setText("Savings: $" + budget.getSavingTotal());
            summaryTotalLabel.setText("Total: $" + (budget.getIncomeTotal() - budget.getExpenseTotal() - budget.getSavingTotal()));
        });

        // show the pane
        Scene scene = new Scene(grid, 490, 300);
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Budget App");
    }
    public static void main(String[] args) {
        launch();
    }
}