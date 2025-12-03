package com.example;

import org.netbeans.api.db.explorer.DatabaseMetaDataTransfer.Table;

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

  // In case there is no tableData, we have a seperate one. This basically allows us to input any new data into the table
  public Parent createLogViewWithTable(TableData newData) {
    return new LogView(this,newData);
  }

  public Parent createQuestView() {
    return new QuestView(this);
  }

  public Parent createStatementView() {
    return new LogStatement(this);
  }

  public Parent createQuest1() {
    return new Quest(this,1);
  }

  public Parent createQuest2() {
    return new Quest(this,2);
  }
  
  public Parent createQuest3() {
    return new Quest(this,3);
  }

  public Parent createQuest4() {
    return new Quest(this,4);
  }

  public Parent createQuest5() {
    return new Quest(this,5);
  }

  public Parent createQuest6() {
    return new Quest(this,6);
  }

  public Parent createQuest7() {
    return new Quest(this,7);
  }

  public Parent createQuest8() {
    return new Quest(this,8);
  }

  public Parent createQuest9() {
    return new Quest(this,9);
  }

  public Parent createQuest10() {
    return new Quest(this,10);
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

  public void showLoggingWithTable(TableData newData) {
    ensureSceneInitialized();
    scene.setRoot(createLogViewWithTable(newData));
  }

  public void showStatement() {
    ensureSceneInitialized();
    scene.setRoot(createStatementView());
  }

  public void showQuest1() {
    ensureSceneInitialized();
    scene.setRoot(createQuest1());
  }
  public void showQuest2() {
    ensureSceneInitialized();
    scene.setRoot(createQuest2());
  }
  public void showQuest3() {
    ensureSceneInitialized();
    scene.setRoot(createQuest3());
  }
  public void showQuest4() {
    ensureSceneInitialized();
    scene.setRoot(createQuest4());
  }
  public void showQuest5() {
    ensureSceneInitialized();
    scene.setRoot(createQuest5());
  }
  public void showQuest6() {
    ensureSceneInitialized();
    scene.setRoot(createQuest6());
  }
  public void showQuest7() {
    ensureSceneInitialized();
    scene.setRoot(createQuest7());
  }
  public void showQuest8() {
    ensureSceneInitialized();
    scene.setRoot(createQuest8());
  }
  public void showQuest9() {
    ensureSceneInitialized();
    scene.setRoot(createQuest9());
  }
  public void showQuest10() {
    ensureSceneInitialized();
    scene.setRoot(createQuest10());
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