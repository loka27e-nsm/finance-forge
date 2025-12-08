package com.example;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class LogView extends BorderPane{
    
    static boolean quest3Finish = false;
    
    private static boolean quest4Finish = false;
    public static boolean getQuest4Finish() {return quest4Finish;};

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

    

    // TableRow 
    // table is 640 width 
    
    table.getColumns().addAll(changeCol, catCol, dateCol, amtCol);
    
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
    for(int x = 0; x < data.size(); x++){
        // Checking if there is an income source logged to confirm quest 1
        if (data.get(x).getPlus().equals("+")) {
            quest1Check = true;
        } else if (data.get(x).getPlus().equals("-")) {
            quest2Check = true;
        }

        // q3GoToCount is the place after quest 1 and 2 is done, and is when we starting counting food for quest 3
        if (quest1Check && quest2Check) {q3goToCount = x;}
        if (quest1Check && quest2Check && quest3Check) {q4goToCount = x;}
    }

    // Quest 3-- checking out how many entries of "food" are there
    if (checkQuest3(q3goToCount, data) == 3) {
        if (quest3Finish == false) {
            quest3Finish = true;
            GameMenuView.addProgress(40);
            GameMenuView.addPoints(40);
        }
    }
    

    //Quest 4: Record 5 separate expenses
    int expenseCount = 0;
    // ArrayList<String> usedCats = new ArrayList<String>();

    // TableData is a row (list) -- contains values for the four columns for each row.
    for (TableData row:data){
        // copy + paste in the for loop 
        if (row.getPlus().equals("-")) {
            expenseCount++;
            
        }
    }

    // check if we have the 5 separate expenses required. 
    if (expenseCount == 5){
        if (quest4Finish == false) {
            quest4Finish = true;
            GameMenuView.addProgress(50);
            GameMenuView.addPoints(50);
        }
    }
    
    // the propertyValueFactory uses a getProperty (if property was "plus", it would be getPlus())
    // Allows us to properly set each value in their correct column
        changeCol.setCellValueFactory(new PropertyValueFactory<>("plus"));
        catCol.setCellValueFactory(new PropertyValueFactory<>("category"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        amtCol.setCellValueFactory(new PropertyValueFactory<>("amt"));

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

        // TableRow 
        // table is 640 width 
            
        table.getColumns().addAll(changeCol, catCol, dateCol, amtCol);

        changeCol.setCellValueFactory(new PropertyValueFactory<>("plus"));
        catCol.setCellValueFactory(new PropertyValueFactory<>("category"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        amtCol.setCellValueFactory(new PropertyValueFactory<>("amt"));

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

    public static int checkQuest3(int q3goToCount, ObservableList<TableData> data) {
        int foodCount = 0;
        if (q3goToCount != 0) {
            for (TableData a:data) {
                if (a.getCategory().equals("Food")) {
                    if(data.indexOf(a) >= q3goToCount)
                        foodCount += 1;
                }
            }
        }
        return foodCount;
    }
    
    public static int checkQuest4(int q4goToCount, ObservableList<TableData> data) {
        return 1;
    }
}
