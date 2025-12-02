package com.example;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;



public class QuestView extends BorderPane{
    
    public QuestView(GameSceneManager sceneManager){
        // Top bar with a "Back to Menu" button
    Button backButton = new Button("Back to Menu");
    backButton.setPrefSize(100, 40); 
    backButton.setFont(new Font("Cambria", 14));
    backButton.setOnAction(e -> sceneManager.showMainMenu());

    // HBox topBar = new HBox(backButton);
    // topBar.setAlignment(Pos.CENTER_LEFT);
    //  topBar.setSpacing(10);

    //Button dashboardButton = new Button("Dash");
    //backButton.setOnAction(e -> sceneManager.showMainMenu());
    //backButton.setOnAction(e -> sceneManager.showMainMenu());

    // The three tabs at the top
    Button dashboardButton = new Button("Dashboard");
    dashboardButton.setPrefSize(215, 60); 
    dashboardButton.setFont(new Font("Cambria", 26));
    dashboardButton.setOnAction(e -> sceneManager.showGame());
    dashboardButton.setStyle("-fx-background-color: #6fed6fc3; -fx-border-color: #105b26c8; -fx-border-width: 2");
    dashboardButton.setOnMouseEntered(e ->  dashboardButton.setStyle("-fx-background-color: #6fed6fc3; -fx-border-color: #14973bda; -fx-border-width: 4"));
    dashboardButton.setOnMouseExited(e ->  dashboardButton.setStyle("-fx-background-color: #6fed6fc3; -fx-border-color: #105b26c8; -fx-border-width: 2"));
    
    Button questButton = new Button("Quest");
    questButton.setPrefSize(215, 60); 
    questButton.setFont(new Font("Cambria", 26));
    questButton.setStyle("-fx-background-color: #32df32c3; -fx-border-color: #105b26c8; -fx-border-width: 2");
    

    Button loggingButton = new Button("Logging");
    loggingButton.setPrefSize(215, 60); 
    loggingButton.setFont(new Font("Cambria", 26));
    loggingButton.setOnAction(e -> sceneManager.showLogging());
    loggingButton.setStyle("-fx-background-color: #6fed6fc3; -fx-border-color: #105b26c8; -fx-border-width: 2");
    loggingButton.setOnMouseEntered(e ->  loggingButton.setStyle("-fx-background-color: #6fed6fc3; -fx-border-color: #14973bda; -fx-border-width: 4"));
    loggingButton.setOnMouseExited(e ->  loggingButton.setStyle("-fx-background-color: #6fed6fc3; -fx-border-color: #105b26c8; -fx-border-width: 2"));

    HBox navButtons = new HBox(backButton, dashboardButton, questButton, loggingButton);
    navButtons.setAlignment(Pos.CENTER);
    navButtons.setSpacing(10);


    Button but1 = new Button("1");
    but1.setPrefSize(100, 100); 
    but1.setFont(new Font("Cambria", 16));
    but1.setStyle("-fx-background-color: #19ec3fc3; -fx-border-color: #1b6832be; -fx-border-width: 2");
    but1.setOnAction(e -> sceneManager.showQuest1());
    Button but2 = new Button("2");
    but2.setPrefSize(100, 100); 
    but2.setFont(new Font("Cambria", 16));
    but2.setStyle("-fx-background-color: #19ec78c3; -fx-border-color: #1b6839d4; -fx-border-width: 2");
    but2.setOnAction(e -> sceneManager.showQuest2());
    Button but3 = new Button("3");
    but3.setPrefSize(100, 100); 
    but3.setFont(new Font("Cambria", 16));
    but3.setStyle("-fx-background-color: #19ec98c3; -fx-border-color: #1b6847da; -fx-border-width: 2");
    but3.setOnAction(e -> sceneManager.showQuest3());
    Button but4 = new Button("4");
    but4.setPrefSize(100, 100); 
    but4.setFont(new Font("Cambria", 16));
    but4.setStyle("-fx-background-color: #19ecc2c3; -fx-border-color: #1b6855da; -fx-border-width: 2");
    but4.setOnAction(e -> sceneManager.showQuest4());
    Button but5 = new Button("5");
    but5.setPrefSize(100, 100); 
    but5.setFont(new Font("Cambria", 16));
    but5.setStyle("-fx-background-color: #19e8ecc3; -fx-border-color: #1b6768e1; -fx-border-width: 2");
    but5.setOnAction(e -> sceneManager.showQuest5());
    Button but6 = new Button("6");
    but6.setPrefSize(100, 100); 
    but6.setFont(new Font("Cambria", 16));
    but6.setStyle("-fx-background-color: #19beecc3; -fx-border-color: #1b5768da; -fx-border-width: 2");
    but6.setOnAction(e -> sceneManager.showQuest6());
    Button but7 = new Button("7");
    but7.setPrefSize(100, 100); 
    but7.setFont(new Font("Cambria", 16));
    but7.setStyle("-fx-background-color: #19adecc3; -fx-border-color: #1b5168da; -fx-border-width: 2");
    but7.setOnAction(e -> sceneManager.showQuest7());
    Button but8 = new Button("8");
    but8.setPrefSize(100, 100); 
    but8.setFont(new Font("Cambria", 16));
    but8.setStyle("-fx-background-color: #1990ecc3; -fx-border-color: #1b4968df; -fx-border-width: 2");
    but8.setOnAction(e -> sceneManager.showQuest8());
    Button but9 = new Button("9");
    but9.setPrefSize(100, 100); 
    but9.setFont(new Font("Cambria", 16));
    but9.setStyle("-fx-background-color: #2887f4c3; -fx-border-color: #172b57da; -fx-border-width: 2");
    but9.setOnAction(e -> sceneManager.showQuest9());
    Button but10 = new Button("10");
    but10.setPrefSize(100, 100); 
    but10.setFont(new Font("Cambria", 16));
    but10.setStyle("-fx-background-color: #2952e8c3; -fx-border-color: #1b2168da; -fx-border-width: 2");
    but10.setOnAction(e -> sceneManager.showQuest10());

    HBox row1 = new HBox(but10, but9, but8, but7, but6);
    row1.setAlignment(Pos.CENTER);
    row1.setSpacing(20);
    HBox row2 = new HBox(but1, but2, but3, but4, but5);
    row2.setAlignment(Pos.CENTER);
    row2.setSpacing(20);

    VBox questNums = new VBox(row1, row2);
    questNums.setAlignment(Pos.CENTER);
    questNums.setSpacing(50);

    // Label ho = new Label("quest");    

    // setCenter(ho);
    setTop(navButtons);
    setCenter(questNums);
    
    }
    
    // public void Quest1(GameSceneManager sceneManager){
    //     Button testButton = new Button("Hello");
    //     testButton.setPrefSize(215, 60); 
    //     testButton.setFont(new Font("Cambria", 26));
    //     //questButton.setStyle("-fx-background-color: #32df32c3; -fx-border-color: #105b26c8; -fx-border-width: 2");
    //     HBox Test = new HBox(testButton);
    //     Test.setAlignment(Pos.CENTER);
    //     Test.setSpacing(20);
    // }
}

