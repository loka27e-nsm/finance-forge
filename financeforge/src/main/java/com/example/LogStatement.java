package com.example;

import javafx.scene.control.Button;
// Import
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;



public class LogStatement extends BorderPane {

    public LogStatement(GameSceneManager sceneManager) {
        Button toLogButton = new Button("Back");
        toLogButton.setPrefSize(100, 40); 
        toLogButton.setMaxSize(100,40);
        toLogButton.setFont(new Font("Cambria", 21));
        toLogButton.setOnAction(e -> sceneManager.showLogging());

        HBox backBox = new HBox(toLogButton);
        backBox.setAlignment(Pos.CENTER);
        backBox.setStyle("-fx-padding: 0 0 50 0");

        setBottom(backBox);
        
    }
}