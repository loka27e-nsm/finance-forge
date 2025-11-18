package com.example;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class GameMenuView extends BorderPane {

  public GameMenuView(GameSceneManager sceneManager) {
    // Top bar with a "Back to Menu" button
    Button backButton = new Button("Back to Menu");
    backButton.setOnAction(e -> sceneManager.showMainMenu());

    HBox topBar = new HBox(backButton);
    topBar.setAlignment(Pos.CENTER_LEFT);
    topBar.setSpacing(10);

    setTop(topBar);

    // Center content - placeholder
    Label gameLabel = new Label("Game Screen Placeholder");
    setCenter(gameLabel);
  }
}