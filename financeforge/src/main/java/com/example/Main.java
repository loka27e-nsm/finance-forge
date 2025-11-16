package com.example;
import javafx.application.Application;
import javafx.scene.Scene; // yellow line means we haven't used the module.
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.*;

public class Main extends Application {

    static Scanner sc = new Scanner(System.in);

    @Override
    public void start(Stage stage) {
        
    }

    public static void main(String[] args) {
        launch(args);
    }

    // Quickens the input process to just one line
    public static String getStrInput(String input) {
    System.out.print("\n");
    System.out.print(input);
    
    return sc.nextLine();
  }

    // Quickens the input process to just one line (for integer)
    public static int getIntInput(String input) {
        while (true){
        System.out.print("\n");
        System.out.print(input);

        try {
        return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
        System.out.println("\nThis is not an integer");
        } 
    }
    }

    // Quickens the input process to just one line (for integer)
    public static double getDoubleInput(String input) {
        while (true){
        System.out.print("\n");
        System.out.print(input);

        try {
        return (double) Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
        System.out.println("\nThis is NOT a number vro");
        } 
    }
    }
}
