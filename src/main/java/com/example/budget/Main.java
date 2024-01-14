/*

This is the main class for the Budget app. It creates a new GUI object and starts it.

@Author: Jack Usery
@Assignment: Final Project
@Date: 11/1/2023

 */




package com.example.budget;

import javafx.application.Application;
import javafx.stage.Stage;



public class Main extends Application {


    public static void main(String[] args) {
        // start the javaFX application
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        // create a new GUI
        HelloApplication gui = new HelloApplication();
        // start the GUI
        gui.start(stage);
    }
}
