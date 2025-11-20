package com.example;

import javafx.scene.Parent;
import javafx.scene.Scene;

public class GameSceneManager {

  private Scene scene;

  // Called once after the Scene is created
  public void setScene(Scene scene) {
    this.scene = scene;
  }

  // Screen factory methods (create new screens as needed)
  public Parent createMenuView() {
    return new MenuView(this);
  }

  public Parent createGameView() {
    return new GameMenuView(this);
  }

  public Parent createLogView() {
    return new LogView(this);
  }

  public Parent createQuestView() {
    return new QuestView(this);
  }

  // Public navigation methods:

  public void showMainMenu() {
    ensureSceneInitialized();
    scene.setRoot(createMenuView());
  }

  public void showGame() {
    ensureSceneInitialized();
    scene.setRoot(createGameView());
  }

  public void showLogging() {
    ensureSceneInitialized();
    scene.setRoot(createLogView());
  }

  // public void showDashboard() {
  //   ensureSceneInitialized();
  //   scene.setRoot(createLogView());
  // }

  public void showQuest() {
    ensureSceneInitialized();
    scene.setRoot(createQuestView());
  }

  private void ensureSceneInitialized() {
    if (scene == null) {
      throw new IllegalStateException("Scene has not been set on SceneManager.");
    }
  }
}