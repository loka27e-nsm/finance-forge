package com.example;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
// import java.util.ArrayList;
import javafx.scene.text.Font;



public class GameMenuView extends BorderPane {

  public GameMenuView(GameSceneManager sceneManager) {
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
    dashboardButton.setStyle("-fx-background-color: #32df32c3; -fx-border-color: #105b26c8; -fx-border-width: 2");
    Button questButton = new Button("Quest");
    questButton.setPrefSize(215, 60); 
    questButton.setFont(new Font("Cambria", 26));
    questButton.setOnAction(e -> sceneManager.showQuest());
    questButton.setStyle("-fx-background-color: #6fed6fc3; -fx-border-color: #105b26c8; -fx-border-width: 2");
    Button loggingButton = new Button("Logging");
    loggingButton.setPrefSize(215, 60); 
    loggingButton.setFont(new Font("Cambria", 26));
    loggingButton.setOnAction(e -> sceneManager.showLogging());
    loggingButton.setStyle("-fx-background-color: #6fed6fc3; -fx-border-color: #105b26c8; -fx-border-width: 2");

    HBox navButtons = new HBox(backButton, dashboardButton, questButton, loggingButton);
    navButtons.setAlignment(Pos.CENTER);
    navButtons.setSpacing(10);

    Button recordStatementButton = new Button ("Record Statement");
    recordStatementButton.setPrefSize(325, 70); 
    recordStatementButton.setFont(new Font("Cambria", 30));
    //recordStatementButton.setStyle("-fx-background-color: #66d1ff89");
    recordStatementButton.setStyle("-fx-background-color: #66d1ff89; -fx-border-color: #669cff89; -fx-border-width: 2");
    recordStatementButton.setOnAction(e -> sceneManager.showLogging());
    Button balance = new Button("Current Balance:");
    balance.setFont(new Font("Helvetica", 30));
    balance.setFont(new Font("Cambria", 30));
    
    //recordStatementButton.setStyle("-fx-background-color: #66d1ff89");
    // PieChart budgetChart = new PieChart(new ArrayList<Integer>());
    // bu//dgetChart.setPrefSize(30, 30);

// , budgetChartnceBox =// new HBox(balance, budgetChart);
//     bala//nceBox.setAlignment(Pos.CENTER);
//     balanceBox.setSpacing(320);
    
    balance.setStyle("-fx-background-color: #66d1ff89; -fx-border-color: #669cff89; -fx-border-width: 2");
    Button points = new Button("Points Earned:");
    points.setFont(new Font("Helvetica", 30));


    points.setFont(new Font("Cambria", 30));
    //recordStatementButton.setStyle("-fx-background-color: #66d1ff89");
    points.setStyle("-fx-background-color: #66d1ff89; -fx-border-color: #669cff89; -fx-border-width: 2");    
    VBox dashboardActions = new VBox(recordStatementButton, balance, points);
    dashboardActions.setAlignment(Pos.CENTER_LEFT);
    dashboardActions.setStyle("-fx-padding: 0 0 0 40;");
    dashboardActions.setSpacing(50);

    

    // Label ho = new Label("dash");    

    // setCenter(ho);

    
    setTop(navButtons);
    setCenter(dashboardActions);
    //setCenter(budgetChart);

    
}

}