package com.example;

import javafx.animation.PauseTransition;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.util.Duration;


public class LogStatement extends BorderPane {

    private static boolean quest1Finish;
    private static boolean quest2Finish;
    static int totalTransactions;

    public static boolean getQuest1Finish() {return quest1Finish;}
    public static boolean getQuest2Finish() {return quest2Finish;}

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
        // TextField dateInput = new TextField();
        ComboBox dateInput = new ComboBox();
        dateInput.getItems().addAll("1","2","3","4","5","6","7","8","9","10","11","12");
        Label slash1 = new Label("/");
        ComboBox dayInput = new ComboBox();
        dayInput.getItems().addAll("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30");
        Label slash2 = new Label("/");
        ComboBox yearInput = new ComboBox();
        yearInput.getItems().addAll("Later","2030","2029","2028","2027","2026","2025","2024","2023","2022","2021","2020","2019","2018","2017","2016","2015","2014","2013","2012","2011","2010","Earlier");


        HBox dateBox = new HBox(dateLabel, dateInput, slash1,dayInput, slash2, yearInput);
        dateBox.setAlignment(Pos.CENTER);
        dateBox.setSpacing(10);

        Label amountLabel = new Label("Amount: $");
        TextField amountInput = new TextField();
        //dateInput.getItems().addAll("Food","Transportation","Utilities","Entertainment","Clothing","Miscellaneous", "Paycheck", "Gift", "Bonus");
        HBox amountBox = new HBox(amountLabel, amountInput);
        amountBox.setAlignment(Pos.CENTER);
        amountBox.setSpacing(10);

        // This will allow the user to input a note to remind themselves of the expense/revenue
        Label noteLabel = new Label("Add a note");
        TextField noteInput = new TextField();
        HBox noteBox = new HBox(noteLabel, noteInput);
        noteBox.setAlignment(Pos.CENTER);
        noteBox.setSpacing(10);
        

        VBox inputBox = new VBox(plusBox,categoryBox, dateBox, amountBox, noteBox);
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
                String dateValue = dateInput.getValue().toString();
                String dayValue = dayInput.getValue().toString();
                String yearValue = yearInput.getValue().toString();
                String amountValue = amountInput.getText();
                String noteValue = noteInput.getText();

                String dateFinal = dateValue + "/" + dayValue + "/" + yearValue;

                TableData dataValues = new TableData(plusValue,categoryValue,dateFinal,amountValue, noteValue);

                if (plusValue.equals("+")) {
                    Main.getAccount().addToBalance(Double.parseDouble(amountValue));
                    if (quest1Finish == false) {
                        quest1Finish = true;
                        GameMenuView.addProgress(25);
                        GameMenuView.addPoints(25);
                    }
                } else if (plusValue.equals("-")) {
                    Main.getAccount().removeFromBalance(Double.parseDouble(amountValue));
                    if (quest2Finish == false) {
                        quest2Finish = true;
                        GameMenuView.addProgress(30);
                        GameMenuView.addPoints(30);
                    }
                }

                // Increment total transactions regardless of +/-
                totalTransactions++;

                
                sceneManager.showLoggingWithTable(dataValues);
                
                
            
            } catch (Exception n) {
                submitButton.setText("Error");
                PauseTransition pause = new PauseTransition(Duration.seconds(1));

                pause.setOnFinished(a -> submitButton.setText("Submit"));

                pause.play();
                
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