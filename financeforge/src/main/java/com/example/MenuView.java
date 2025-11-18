package com.example;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;


public class MenuView extends VBox {

  public MenuView(GameSceneManager sceneManager) {
    // Basic layout setup
    setSpacing(90);
    setAlignment(Pos.CENTER);

    // Create UI controls
    Button startButton = new Button("Start Game");
    startButton.setPrefSize(250, 80); 
    startButton.setFont(new Font("Cambria", 30));
    Button exitButton = new Button("Quit");
    exitButton.setPrefSize(250, 80); 
    exitButton.setFont(new Font("Cambria", 30));
    Label title = new Label("Finance Forge");
    title.setFont(new Font("Helvetica", 50));

    // Hook up behavior
    startButton.setOnAction(e -> sceneManager.showGame());
    exitButton.setOnAction(e -> System.exit(0));

    // Add controls to this layout
    getChildren().addAll(title, startButton, exitButton);
  }
}