package com.example;
import javafx.application.Application;
import javafx.scene.Scene; // yellow line means we haven't used the module
import javafx.stage.Stage;

public class Main extends Application {

    private Scene scene;
    private GameSceneManager sceneManager;
    private final static BankAccount userAccount = new BankAccount("User", 3000.00);

    @Override
    public void start(Stage startStage) {
        sceneManager = new GameSceneManager();
        //Start on the main menu screen
        var initialRoot = sceneManager.createMenuView();

        //Create one Scene and reuse it
        scene = new Scene(initialRoot, 800, 600);
        // Give the Scene to the manager so it can swap roots later
        sceneManager.setScene(scene);
        startStage.setTitle("Scene Switching Example");
        startStage.setScene(scene);
        startStage.show();
   }

    public static void main(String[] args) {
        launch(args);
    }

    public static BankAccount getAccount() {
        return userAccount;
    }
}

// package jfx_examples;

// import javafx.application.Application;
// import javafx.scene.Scene;
// import javafx.stage.Stage;

// public class _14Main extends Application {

//   private Scene scene;
//   private _14SceneManager sceneManager;

//   @Override
//   public void start(Stage primaryStage) {
//     sceneManager = new _14SceneManager();

//     // Start on the main menu screen
//     var initialRoot = sceneManager.createMenuView();

//     // Create one Scene and reuse it
//     scene = new Scene(initialRoot, 800, 600);

//     // Give the Scene to the manager so it can swap roots later
//     sceneManager.setScene(scene);

//     primaryStage.setTitle("Scene Switching Example");
//     primaryStage.setScene(scene);
//     primaryStage.show();
//   }

//   public static void main(String[] args) {
//     launch(args);
//   }
// }
