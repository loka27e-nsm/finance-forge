package com.example;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;


public class LogView extends BorderPane{
    
    public LogView(GameSceneManager sceneManager){
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

    Button questButton = new Button("Quest");
    questButton.setPrefSize(215, 60); 
    questButton.setFont(new Font("Cambria", 26));
    questButton.setOnAction(e -> sceneManager.showQuest());
    questButton.setStyle("-fx-background-color: #6fed6fc3; -fx-border-color: #105b26c8; -fx-border-width: 2");

    Button loggingButton = new Button("Logging");
    loggingButton.setPrefSize(215, 60); 
    loggingButton.setFont(new Font("Cambria", 26));
    loggingButton.setStyle("-fx-background-color: #32df32c3; -fx-border-color: #105b26c8; -fx-border-width: 2");


    HBox navButtons = new HBox(backButton, dashboardButton, questButton, loggingButton);
    navButtons.setAlignment(Pos.CENTER);
    navButtons.setSpacing(10);

    Button logStatementButton = new Button("Log Statement");
    logStatementButton.setPrefSize(200,30);
    logStatementButton.setFont(new Font("Cambria", 21));

    HBox logStateBox = new HBox(logStatementButton);
    logStateBox.setAlignment(Pos.CENTER);

    VBox topButtons = new VBox(navButtons,logStateBox);
    topButtons.setSpacing(20);

    // Label ho = new Label("log");  
    TableView table = new TableView();
    table.setEditable(true);

    TableColumn changeCol = new TableColumn("(+/-)");
    changeCol.setMinWidth(80);
    changeCol.setPrefWidth(80);
    changeCol.setMaxWidth(80);
    TableColumn catCol = new TableColumn("Category");
    catCol.setMinWidth(240);
    catCol.setPrefWidth(240);
    catCol.setMaxWidth(240);
    TableColumn dateCol = new TableColumn("Date");
    dateCol.setMinWidth(160);
    dateCol.setPrefWidth(160);
    dateCol.setMaxWidth(160);
    TableColumn amtCol = new TableColumn("Amount");
    amtCol.setMinWidth(160);
    amtCol.setPrefWidth(160);
    amtCol.setMaxWidth(160);
    // table is 640 width 
        
    table.getColumns().addAll(changeCol, catCol, dateCol, amtCol);

    VBox tableBox = new VBox(table);
    tableBox.setSpacing(5);
    tableBox.setPadding(new Insets(30, 80, 10, 80));
    tableBox.setPrefHeight(100);
    tableBox.setPrefWidth(100);
    // setCenter(ho);

    
    setTop(topButtons);
    setCenter(tableBox);
    }
}
