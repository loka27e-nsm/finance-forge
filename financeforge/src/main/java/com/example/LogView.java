package com.example;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class LogView extends BorderPane{
    
    static boolean quest3Finish = false;
    //static boolean quest8Finish = false;
    static int q3Final;
    
    private static boolean quest4Finish = false;
    public static boolean getQuest4Finish() {return quest4Finish;};

    private static boolean quest5Finish = false;
    public static boolean getQuest5Finish() {return quest5Finish;};

    private static boolean quest8Finish = false;
    public static boolean getQuest8Finish() {return quest8Finish;};

    private static ObservableList<TableData> data = FXCollections.observableArrayList();

    public LogView(GameSceneManager sceneManager, TableData newData){
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
    questButton.setOnAction(e -> sceneManager.showQuest());
    questButton.setStyle("-fx-background-color: #6fed6fc3; -fx-border-color: #105b26c8; -fx-border-width: 2");
    questButton.setOnMouseEntered(e ->  questButton.setStyle("-fx-background-color: #6fed6fc3; -fx-border-color: #14973bda; -fx-border-width: 4"));
    questButton.setOnMouseExited(e ->  questButton.setStyle("-fx-background-color: #6fed6fc3; -fx-border-color: #105b26c8; -fx-border-width: 2"));

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
    logStatementButton.setOnAction(e -> sceneManager.showStatement());

    HBox logStateBox = new HBox(logStatementButton);
    logStateBox.setAlignment(Pos.CENTER);

    VBox topButtons = new VBox(navButtons,logStateBox);
    topButtons.setSpacing(20);

    // TABLE  
    TableView<TableData> table = new TableView<>();
    table.setEditable(true);
    table.setPlaceholder(new Label("No data collected"));
    

    TableColumn changeCol = new TableColumn("(+/-)");
    changeCol.setMinWidth(70);
    changeCol.setPrefWidth(70);
    changeCol.setMaxWidth(70);
    TableColumn catCol = new TableColumn("Category");
    catCol.setMinWidth(190);
    catCol.setPrefWidth(190);
    catCol.setMaxWidth(190);
    TableColumn dateCol = new TableColumn("Date");
    dateCol.setMinWidth(120);
    dateCol.setPrefWidth(120);
    dateCol.setMaxWidth(120);
    TableColumn amtCol = new TableColumn("Amount");
    amtCol.setMinWidth(120);
    amtCol.setPrefWidth(120);
    amtCol.setMaxWidth(120);
    TableColumn noteCol = new TableColumn("Note");
    noteCol.setMinWidth(140);
    noteCol.setPrefWidth(140);
    noteCol.setMaxWidth(140);

    

    // TableRow 
    // table is 640 width 
    
    table.getColumns().addAll(changeCol, catCol, dateCol, amtCol,noteCol);
    
    // data is the table of all the rows-- the rows contain the four columns
    data.add(newData); // Add the data the user inputted

    // Checking that quest 1 and 2 are done

    // Initialize all variables
    int q3goToCount = 0;
    int q4goToCount = 0;
    boolean quest1Check = false;
    boolean quest2Check = false;
    boolean quest3Check = false;
    int foodCount = 0;
    

    // Ensuring quest1 and quest2 done before it starts counting the food
    quest1Check = false;
    quest2Check = false;
    foodCount = 0;
    for(int x = 0; x < data.size(); x++){
        // Checking if there is an income source logged to confirm quest 1
        if (data.get(x).getPlus().equals("+")) {
            quest1Check = true;
            // System.out.println("--------------------------------------\nQuest 1 done");
        } else if (data.get(x).getPlus().equals("-")) {
            quest2Check = true;
            // System.out.println("Quest 2 done");
        }

        // q3GoToCount is the place after quest 1 and 2 is done, and is when we starting counting food for quest 3
        if (quest1Check && quest2Check) {q3goToCount = x+1;break;}
        // if (quest1Check && quest2Check && foodCount >=3) {q4goToCount = x+1;break;}
    }

    for(int x = 0; x < data.size(); x++){
        // Checking if there is an income source logged to confirm quest 1
        if (data.get(x).getPlus().equals("+")) {
            quest1Check = true;
            // System.out.println("--------------------------------------\nQuest 1 done");
        } else if (data.get(x).getPlus().equals("-")) {
            quest2Check = true;
            // System.out.println("Quest 2 done");
        } 
        if (data.get(x).getCategory().equals("Food") && x >= q3Final && q3Final != 0) {
            foodCount += 1;
            
        }

        // q3GoToCount is the place after quest 1 and 2 is done, and is when we starting counting food for quest 3
        // if (quest1Check && quest2Check) {q3goToCount = x+1;break;}
        if (quest1Check && quest2Check && foodCount >=3) {q4goToCount = x+1;break;}
    }

    

    // Quest 3-- checking out how many entries of "food" are there
    if (checkFoodCount(q3goToCount, data) == 3 && q3goToCount > 0) {
        if (quest3Finish == false) {
            quest3Finish = true;
            GameMenuView.addProgress(40);
            GameMenuView.addPoints(40);
            q3Final = q3goToCount;
        }
    }
    

    //Quest 4: Record 5 separate expenses
    int expenseCount = 0;
    // ArrayList<String> usedCats = new ArrayList<String>();

    // TableData is a row (list) -- contains values for the four columns for each row.
    for (int i = q4goToCount; i < data.size(); i++){
        // copy + paste in the for loop 
        if (data.get(i).getPlus().equals("-")) {
            expenseCount++;
            
        }
    }

    // check if we have the 5 seperate expenses required.
    if (expenseCount == 5 && q4goToCount > 0){
        if (quest4Finish == false) {
            quest4Finish = true;
            GameMenuView.addProgress(45);
            GameMenuView.addPoints(45);
        }
    }

    //Quest 5: Transportation expenses greater than $400
    double transportationCost = 0.0;
    for (TableData row:data){
        if (row.getPlus().equals("-") && row.getCategory().equals("Transportation")){
            transportationCost += Double.parseDouble(row.getAmt());

        }
    }

    
    if(!quest5Finish && transportationCost >= 400.0){
        quest5Finish = true;
        GameMenuView.addProgress(50);
        GameMenuView.addPoints(50);
    }


    // Quest 8: 8+ total transactions and total balance of 1100
    if (LogStatement.totalTransactions >= 8 && Main.getAccount().getBalance() == 1100 && !quest8Finish) {
        quest8Finish = true;
        GameMenuView.addPoints(80);
        GameMenuView.addProgress(80);
    }

    
    // the propertyValueFactory uses a getProperty (if property was "plus", it would be getPlus())
    // Allows us to properly set each value in their correct column
            // 1. Tell the column WHERE to get the data (Property Name)
        changeCol.setCellValueFactory(new PropertyValueFactory<>("plus"));
        // Change Transaction to TableData here:
        changeCol.setCellFactory(column -> new TableCell<TableData, String>() { 
            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);

                if (empty || item == null) {
                    setText(null);
                    setStyle(""); 
                } else {
                    setText(item);

                    if (item.contains("-")) {
                        setTextFill(Color.RED);
                        setStyle("-fx-font-weight: bold;");
                    } else if (item.contains("+")) {
                        setTextFill(Color.GREEN);
                        setStyle("-fx-font-weight: bold;");
                    } else {
                        setTextFill(Color.BLACK);
                        setStyle("");
                    }
                }
            }
        });
        catCol.setCellValueFactory(new PropertyValueFactory<>("category"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        amtCol.setCellValueFactory(new PropertyValueFactory<>("amt"));
        noteCol.setCellValueFactory(new PropertyValueFactory<>("note"));

    // Add the data to the table
    table.setItems(data);


    VBox tableBox = new VBox(table);
    tableBox.setSpacing(5);
    tableBox.setPadding(new Insets(30, 80, 10, 80));
    tableBox.setPrefHeight(100);
    tableBox.setPrefWidth(100);
    
    // table.getItems(new observableArrayList());
    
    setTop(topButtons);
    setCenter(tableBox);
    }

    public static ObservableList<TableData> getData(){
        return data;
    }

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
        dashboardButton.setOnMouseEntered(e ->  dashboardButton.setStyle("-fx-background-color: #6fed6fc3; -fx-border-color: #14973bda; -fx-border-width: 4"));
        dashboardButton.setOnMouseExited(e ->  dashboardButton.setStyle("-fx-background-color: #6fed6fc3; -fx-border-color: #105b26c8; -fx-border-width: 2"));

        Button questButton = new Button("Quest");
        questButton.setPrefSize(215, 60); 
        questButton.setFont(new Font("Cambria", 26));
        questButton.setOnAction(e -> sceneManager.showQuest());
        questButton.setStyle("-fx-background-color: #6fed6fc3; -fx-border-color: #105b26c8; -fx-border-width: 2");
        questButton.setOnMouseEntered(e ->  questButton.setStyle("-fx-background-color: #6fed6fc3; -fx-border-color: #14973bda; -fx-border-width: 4"));
        questButton.setOnMouseExited(e ->  questButton.setStyle("-fx-background-color: #6fed6fc3; -fx-border-color: #105b26c8; -fx-border-width: 2"));

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
        logStatementButton.setOnAction(e -> sceneManager.showStatement());

        HBox logStateBox = new HBox(logStatementButton);
        logStateBox.setAlignment(Pos.CENTER);

        VBox topButtons = new VBox(navButtons,logStateBox);
        topButtons.setSpacing(20);

        // TABLE  
        TableView<TableData> table = new TableView<>();
        table.setEditable(true);
        table.setPlaceholder(new Label("No data collected"));

        TableColumn changeCol = new TableColumn("(+/-)");
        changeCol.setMinWidth(70);
        changeCol.setPrefWidth(70);
        changeCol.setMaxWidth(60);
        TableColumn catCol = new TableColumn("Category");
        catCol.setMinWidth(190);
        catCol.setPrefWidth(190);
        catCol.setMaxWidth(190);
        TableColumn dateCol = new TableColumn("Date");
        dateCol.setMinWidth(120);
        dateCol.setPrefWidth(120);
        dateCol.setMaxWidth(120);
        TableColumn amtCol = new TableColumn("Amount");
        amtCol.setMinWidth(120);
        amtCol.setPrefWidth(120);
        amtCol.setMaxWidth(120);
        TableColumn noteCol = new TableColumn("Note");
        noteCol.setMinWidth(140);
        noteCol.setPrefWidth(140);
        noteCol.setMaxWidth(140);

        // TableRow 
        // table is 640 width 
            
        table.getColumns().addAll(changeCol, catCol, dateCol, amtCol, noteCol);

        // 1. Tell the column WHERE to get the data (Property Name)
        changeCol.setCellValueFactory(new PropertyValueFactory<>("plus"));
        changeCol.setCellFactory(column -> new TableCell<TableData, String>() { 
            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);

                if (empty || item == null) {
                    setText(null);
                    setStyle(""); 
                } else {
                    setText(item);

                    if (item.contains("-")) {
                        setTextFill(Color.RED);
                        setStyle("-fx-font-weight: bold;");
                    } else if (item.contains("+")) {
                        setTextFill(Color.GREEN);
                        setStyle("-fx-font-weight: bold;");
                    } else {
                        setTextFill(Color.BLACK);
                        setStyle("");
                    }
                }
            }
        });
        
        catCol.setCellValueFactory(new PropertyValueFactory<>("category"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        amtCol.setCellValueFactory(new PropertyValueFactory<>("amt"));
        noteCol.setCellValueFactory(new PropertyValueFactory<>("note"));

        table.setItems(data); 


        VBox tableBox = new VBox(table);
        tableBox.setSpacing(5);
        tableBox.setPadding(new Insets(30, 80, 10, 80));
        tableBox.setPrefHeight(100);
        tableBox.setPrefWidth(100);
        
        // table.getItems(new observableArrayList());
        
        setTop(topButtons);
        setCenter(tableBox);
    }

    public static int checkFoodCount(int q3goToCount, ObservableList<TableData> data) {
        int foodCount = 0;
        for (int i = q3goToCount; i < data.size(); i++) {
            if (data.get(i).getCategory().equals("Food")) {
                foodCount++;
            }
}
        
        return foodCount;
    }
    
    
}
