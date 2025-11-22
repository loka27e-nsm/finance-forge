package com.example;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
// import java.util.ArrayList;
import javafx.scene.text.Font;
import javafx.scene.chart.*;



public class GameMenuView extends BorderPane {

  static int progressPercent; 
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
    balance.setStyle("-fx-background-color: #66d1ff89; -fx-border-color: #669cff89; -fx-border-width: 2");

    ObservableList<PieChart.Data> pieChartData =
      FXCollections.observableArrayList(
      );
    final PieChart budgetChart = new PieChart(pieChartData);
    budgetChart.setPrefSize(400,600);

    Label chartLabel = new Label("Budget Visual");
    chartLabel.setStyle("-fx-padding: 0 160 0 0");
    chartLabel.setFont(new Font("Cambria", 18));

    VBox balanceBox = new VBox(chartLabel, budgetChart);
    balanceBox.setAlignment(Pos.CENTER_RIGHT);
    balanceBox.setStyle("-fx-padding: 100 0 100 0");
    
    Button points = new Button("Points Earned:");
    points.setFont(new Font("Helvetica", 30));


    points.setFont(new Font("Cambria", 30));
    //recordStatementButton.setStyle("-fx-background-color: #66d1ff89");
    points.setStyle("-fx-background-color: #66d1ff89; -fx-border-color: #669cff89; -fx-border-width: 2");    
    VBox dashboardActions = new VBox(recordStatementButton, balance, points);
    dashboardActions.setAlignment(Pos.CENTER_LEFT);
    dashboardActions.setStyle("-fx-padding: 0 0 0 0;");
    dashboardActions.setSpacing(50);
    
    progressPercent = 0;
    ProgressBar questBar = new ProgressBar(progressPercent/100.0);
    questBar.setPrefWidth(560);
    questBar.setStyle("-fx-accent: #ee0d0db7; -fx-border-color: #1ccf3aff; -fx-border-width: 1");
    
    Label questLabel = new Label("Quest Progress");

    VBox questBox = new VBox(questLabel, questBar);
    questBox.setAlignment(Pos.CENTER);
    questBox.setStyle("-fx-padding: 0 0 10 0");


    
    setTop(navButtons);
    setCenter(dashboardActions);
    if (!budgetChart.getData().isEmpty()) {setRight(balanceBox);}
    setBottom(questBox);


    
}

}