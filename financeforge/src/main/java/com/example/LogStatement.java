package com.example;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
// Import
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.ComboBox;


public class LogStatement extends BorderPane {

    public LogStatement(GameSceneManager sceneManager) {
        

        Label plusLabel = new Label("(+/-):");
        ComboBox plusInput = new ComboBox();
        plusInput.getItems().addAll("+","-");
        HBox plusBox = new HBox(plusLabel, plusInput);
        plusBox.setAlignment(Pos.CENTER);
        plusBox.setSpacing(10);
        
        Label categoryLabel = new Label("Category:");
        ComboBox categoryInput = new ComboBox();
        categoryInput.getItems().addAll("Food","Transportation","Utilities","Entertainment","Clothing","Miscellaneous", "Paycheck", "Gift", "Bonus");
        HBox categoryBox = new HBox(categoryLabel, categoryInput);
        categoryBox.setAlignment(Pos.CENTER);
        categoryBox.setSpacing(10);

        Label dateLabel = new Label("Date (M/D/Y):");
        TextField dateInput = new TextField();
        //dateInput.getItems().addAll("Food","Transportation","Utilities","Entertainment","Clothing","Miscellaneous", "Paycheck", "Gift", "Bonus");
        HBox dateBox = new HBox(dateLabel, dateInput);
        dateBox.setAlignment(Pos.CENTER);
        dateBox.setSpacing(10);

        Label amountLabel = new Label("Amount: $");
        TextField amountInput = new TextField();
        //dateInput.getItems().addAll("Food","Transportation","Utilities","Entertainment","Clothing","Miscellaneous", "Paycheck", "Gift", "Bonus");
        HBox amountBox = new HBox(amountLabel, amountInput);
        amountBox.setAlignment(Pos.CENTER);
        amountBox.setSpacing(10);
        

        VBox inputBox = new VBox(plusBox,categoryBox, dateBox, amountBox);
        inputBox.setPrefSize(100,150);
        inputBox.setAlignment(Pos.CENTER);
        inputBox.setSpacing(30);

        Button toLogButton = new Button("Back");
        toLogButton.setPrefSize(100, 40); 
        toLogButton.setMaxSize(100,40);
        toLogButton.setFont(new Font("Cambria", 21));
        toLogButton.setOnAction(e -> sceneManager.showLogging());

        HBox backBox = new HBox(toLogButton);
        backBox.setAlignment(Pos.CENTER);
        backBox.setPadding(new Insets(0,0,50,0));

        Button submitButton = new Button("Submit");
        submitButton.setPrefSize(100, 40); 
        submitButton.setMaxSize(100,40);
        submitButton.setFont(new Font("Cambria", 21));
        submitButton.setOnAction(e -> {
            // Enter code to be executed
            try{
                // Values for user inputs
                String plusValue = plusInput.getValue().toString();
                String categoryValue = categoryInput.getValue().toString();
                String dateValue = dateInput.getText();
                double amountValue = Double.parseDouble(amountInput.getText());

            
            } catch (NullPointerException n) {
                // Code if user doesn't complete the statement
            }
        }); 

        HBox submitBox = new HBox(submitButton);
        submitBox.setAlignment(Pos.CENTER);

        VBox leaveBox = new VBox(submitBox, backBox);
        leaveBox.setSpacing(20);

        setCenter(inputBox);
        setBottom(leaveBox);
        
        
    }
}