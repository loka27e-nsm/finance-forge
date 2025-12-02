package com.example;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.control.Label;

public class Quest extends BorderPane {
    
    public Quest(GameSceneManager sceneManager, int questNum){
        
        if (questNum == 1) {
            Label Welcome = new Label("Welcome to Quest 1: Introductory Pop Quiz");
            Welcome.setPrefSize(800, 60); 
            Welcome.setFont(new Font("Cambria", 24));
            //questButton.setStyle("-fx-background-color: #32df32c3; -fx-border-color: #105b26c8; -fx-border-width: 2");
            HBox Test = new HBox(Welcome);
            Test.setAlignment(Pos.CENTER);
            Test.setSpacing(20);

            //setTop(Test);
            setCenter(Test);
        }
        if (questNum == 2) {
            
        }
        if (questNum == 3) {
            
        }
        if (questNum == 4) {
            
        }
        if (questNum == 5) {
            
        }
        if (questNum == 6) {
            
        }
        if (questNum == 7) {
            
        }
        if (questNum == 8) {
            
        }
        if (questNum == 9) {
            
        }
        if (questNum == 10) {
            
        }
    }
}
