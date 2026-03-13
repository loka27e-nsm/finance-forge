package com.example;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class Quest extends BorderPane {
    // QUEST NINE NOT FINISHED

    //static boolean Quest6Finish = false;
    static boolean Quest7Finish = false;
    private static boolean quest6Finish = false;

    public static boolean getQuest6Finish() {
        return quest6Finish;
    }

    public static void setQuest9Finish(boolean value) {
        // Optional: validate or trigger events here
        quest9Finish = value;
    }
    
    private static boolean quest10Finish = false;
    
    public static boolean getQuest10Finish() {
        return quest10Finish;
    }

    // Placeholder for Quest 9 completion — static for now
        private static boolean quest9Finish = false;

        // Getter for Quest 9 completion
        public static boolean getQuest9Finish() {
            return quest9Finish;
    }

    public Quest(GameSceneManager sceneManager, int questNum){
        
        if (questNum == 1) {
            Label Welcome = new Label("Welcome to Quest 1: The Starter Fund (25 Points)");
            Welcome.setPrefSize(800, 60); 
            Welcome.setFont(new Font("Cambria", 24));
            Welcome.setAlignment(Pos.CENTER);
            //questButton.setStyle("-fx-background-color: #32df32c3; -fx-border-color: #105b26c8; -fx-border-width: 2");
            HBox Title = new HBox(Welcome);
            Title.setAlignment(Pos.TOP_CENTER);
            Title.setSpacing(20);

            setTop(Title);

            Label instructions = new Label ("Go to the logging screen and record your first income source!");
            instructions.setFont(new Font("Cambria", 18));
            VBox descriptionBox = new VBox(instructions);
            descriptionBox.setAlignment(Pos.CENTER);
            setCenter(descriptionBox);
            //setCenter(Test);
            Button backQuestButton = new Button("Back to Quests");
            backQuestButton.setPrefSize(150, 40); 
            backQuestButton.setFont(new Font("Cambria", 14));
            backQuestButton.setOnAction(e -> sceneManager.showQuest());
            HBox questButtons = new HBox(backQuestButton);
            questButtons.setAlignment(Pos.CENTER_LEFT);
            questButtons.setSpacing(10);

            setBottom(questButtons);


        }
        if (questNum == 2) {
            Label Welcome2 = new Label("Welcome to Quest 2: First Deduction (30 points)");
            Welcome2.setPrefSize(800, 60); 
            Welcome2.setFont(new Font("Cambria", 24));
            //questButton.setStyle("-fx-background-color: #32df32c3; -fx-border-color: #105b26c8; -fx-border-width: 2");
            Welcome2.setAlignment(Pos.CENTER);
            //questButton.setStyle("-fx-background-color: #32df32c3; -fx-border-color: #105b26c8; -fx-border-width: 2");
            HBox Title2 = new HBox(Welcome2);
            Title2.setAlignment(Pos.TOP_CENTER);
            Title2.setSpacing(20);

            setTop(Title2);

            Label instructions2 = new Label ("Go to the logging screen and record your first monthly expense of your choice!");
            instructions2.setFont(new Font("Cambria", 18));
            VBox descriptionBox2 = new VBox(instructions2);
            descriptionBox2.setAlignment(Pos.CENTER);
            setCenter(descriptionBox2);
            //setCenter(Test);
            Button backQuestButton1 = new Button("Back to Quests");
            backQuestButton1.setPrefSize(150, 40); 
            backQuestButton1.setFont(new Font("Cambria", 14));
            backQuestButton1.setOnAction(e -> sceneManager.showQuest());
            HBox questButtons = new HBox(backQuestButton1);
            questButtons.setAlignment(Pos.CENTER_LEFT);
            questButtons.setSpacing(10);

            setBottom(questButtons);
            
        }
        if (questNum == 3) {
            Label Welcome3 = new Label("Welcome to Quest 3: The King of Food (40 points)");
            Welcome3.setPrefSize(800, 60); 
            Welcome3.setFont(new Font("Cambria", 24));
            //questButton.setStyle("-fx-background-color: #32df32c3; -fx-border-color: #105b26c8; -fx-border-width: 2");
            Welcome3.setAlignment(Pos.CENTER);
            //questButton.setStyle("-fx-background-color: #32df32c3; -fx-border-color: #105b26c8; -fx-border-width: 2");
            HBox Title3 = new HBox(Welcome3);
            Title3.setAlignment(Pos.TOP_CENTER);
            Title3.setSpacing(20);

            setTop(Title3);

            Label instructions3 = new Label ("Go to the logging screen and record three food expenses of your choice!");
            instructions3.setFont(new Font("Cambria", 18));
            VBox descriptionBox3 = new VBox(instructions3);
            descriptionBox3.setAlignment(Pos.CENTER);
            setCenter(descriptionBox3);
            //setCenter(Test);
            Button backQuestButton2 = new Button("Back to Quests");
            backQuestButton2.setPrefSize(150, 40); 
            backQuestButton2.setFont(new Font("Cambria", 14));
            backQuestButton2.setOnAction(e -> sceneManager.showQuest());
            HBox questButtons = new HBox(backQuestButton2);
            questButtons.setAlignment(Pos.CENTER_LEFT);
            questButtons.setSpacing(10);

            setBottom(questButtons);

        }
        if (questNum == 4) {
            Label Welcome3 = new Label("Welcome to Quest 4: Category Master (50 points)");
            Welcome3.setPrefSize(800, 60); 
            Welcome3.setFont(new Font("Cambria", 24));
            Welcome3.setAlignment(Pos.CENTER);
            HBox Title3 = new HBox(Welcome3);
            Title3.setAlignment(Pos.TOP_CENTER);
            Title3.setSpacing(20);

            setTop(Title3);

            Label instructions3 = new Label ("Log an expense in 5 separate categories!");
            instructions3.setFont(new Font("Cambria", 18));
            VBox descriptionBox3 = new VBox(instructions3);
            descriptionBox3.setAlignment(Pos.CENTER);
            setCenter(descriptionBox3);

            Button backQuestButton3 = new Button("Back to Quests");
            backQuestButton3.setPrefSize(150, 40);
            backQuestButton3.setFont(new Font("Cambria", 14));
            backQuestButton3.setOnAction(e -> sceneManager.showQuest());
            HBox questButtons = new HBox(backQuestButton3);
            questButtons.setAlignment(Pos.CENTER_LEFT);
            questButtons.setSpacing(10);


            setBottom(questButtons); 
        }
        if (questNum == 5) {
            Label Welcome5 = new Label("Welcome to Quest 5: The Journeyman (30 points)");
            Welcome5.setPrefSize(800, 60); 
            Welcome5.setFont(new Font("Cambria", 24));
            //questButton.setStyle("-fx-background-color: #32df32c3; -fx-border-color: #105b26c8; -fx-border-width: 2");
            Welcome5.setAlignment(Pos.CENTER);
            //questButton.setStyle("-fx-background-color: #32df32c3; -fx-border-color: #105b26c8; -fx-border-width: 2");
            HBox Title5 = new HBox(Welcome5);
            Title5.setAlignment(Pos.TOP_CENTER);
            Title5.setSpacing(20);

            setTop(Title5);

            Label instructions3 = new Label ("Log transportation expenses for a total at least $400!");
            instructions3.setFont(new Font("Cambria", 18));
            VBox descriptionBox3 = new VBox(instructions3);
            descriptionBox3.setAlignment(Pos.CENTER);
            setCenter(descriptionBox3);
            Button backQuestButton4 = new Button("Back to Quests");
            backQuestButton4.setPrefSize(150, 40);
            backQuestButton4.setFont(new Font("Cambria", 14));
            backQuestButton4.setOnAction(e -> sceneManager.showQuest());
            HBox questButtons = new HBox(backQuestButton4);
            questButtons.setAlignment(Pos.CENTER_LEFT);
            questButtons.setSpacing(10);


            setBottom(questButtons);
        }
        if (questNum == 6) {
            Label Welcome3 = new Label("Welcome to Quest 6: Budgeting Quiz (50 points)");
            Welcome3.setPrefSize(800, 60); 
            Welcome3.setFont(new Font("Cambria", 24));
            Welcome3.setAlignment(Pos.CENTER);
            HBox Title6 = new HBox(Welcome3);
            Title6.setAlignment(Pos.TOP_CENTER);
            Title6.setSpacing(20);

            setTop(Title6);

            Label instructions3 = new Label ("Answer these 3 questions correctly to get credit!");
            instructions3.setFont(new Font("Cambria", 18));
            //VBox descriptionBox3 = new VBox(instructions3);
            //descriptionBox3.setAlignment(Pos.CENTER);
            //setCenter(descriptionBox3);
            
            Label question1 = new Label ("According to the 50/30/20 rule for budgeting, how much take home income goes towards needs?");
            question1.setFont(new Font ("Cambria", 16));
            RadioButton optionA1 = new RadioButton("30%");
            RadioButton optionB1 = new RadioButton("20%");
            RadioButton optionC1 = new RadioButton("50%");
            RadioButton optionD1 = new RadioButton("70%");
            ToggleGroup group1 = new ToggleGroup();
            optionA1.setToggleGroup(group1);
            optionB1.setToggleGroup(group1);
            optionC1.setToggleGroup(group1);
            optionD1.setToggleGroup(group1);
            HBox choicesBox1 = new HBox (40, optionA1,optionB1,optionC1,optionD1);
            choicesBox1.setAlignment(Pos.CENTER);

            Label question2 = new Label ("Which of the Following is a Fixed Expense?");
            question2.setFont(new Font ("Cambria", 16));
            RadioButton optionA2 = new RadioButton("Rent");
            RadioButton optionB2 = new RadioButton("Gas");
            RadioButton optionC2 = new RadioButton("Clothing");
            RadioButton optionD2 = new RadioButton("Food");
            ToggleGroup group2 = new ToggleGroup();
            optionA2.setToggleGroup(group2);
            optionB2.setToggleGroup(group2);
            optionC2.setToggleGroup(group2);
            optionD2.setToggleGroup(group2);
            HBox choicesBox2 = new HBox (40, optionA2,optionB2,optionC2,optionD2);
            choicesBox2.setAlignment(Pos.CENTER);

            Label question3 = new Label ("What is the main purpose for having a budget?");
            question3.setFont(new Font ("Cambria", 16));
            RadioButton optionA3 = new RadioButton("Tracking only income");
            RadioButton optionB3 = new RadioButton("Predicting stock market returns");
            RadioButton optionC3 = new RadioButton("Saving money");
            RadioButton optionD3 = new RadioButton("Planning how to use your money");
            ToggleGroup group3 = new ToggleGroup();
            optionA3.setToggleGroup(group3);
            optionB3.setToggleGroup(group3);
            optionC3.setToggleGroup(group3);
            optionD3.setToggleGroup(group3);

            HBox choicesBox3 = new HBox (40, optionA3,optionB3,optionC3,optionD3);
            choicesBox3.setAlignment(Pos.CENTER);

            Button submitQuestionsButton = new Button ("Submit Your Answers");
            submitQuestionsButton.setPrefSize(150, 40);
            question3.setFont(new Font ("Cambria", 14));

            Label accuracyLabel = new Label("");
            accuracyLabel.setFont(new Font ("Cambria", 16));

            VBox quizInformationDisplay = new VBox(instructions3,question1, choicesBox1,
            question2, choicesBox2, question3, choicesBox3, submitQuestionsButton, accuracyLabel);
            quizInformationDisplay.setAlignment(Pos.CENTER);
            quizInformationDisplay.setSpacing (10);
            
            setCenter(quizInformationDisplay);

            submitQuestionsButton.setOnAction(e -> {
                int correctAnswerCount = 0;
                if (group1.getSelectedToggle () == optionC1) {
                    correctAnswerCount++;
                }
                if (group2.getSelectedToggle () == optionA2) {
                    correctAnswerCount++;
                }
                if (group3.getSelectedToggle () == optionD3) {
                    correctAnswerCount++;
                }
                if (correctAnswerCount == 3){
                    accuracyLabel.setText ("Great Job, You got all questions right! 3/3! Now apply these answers in your personal finance journey!");
                    accuracyLabel.setStyle("-fx-text-fill: green;");
                    submitQuestionsButton.setDisable(true);
                    if (quest6Finish == false) {
                        quest6Finish = true;
                        GameMenuView.addProgress(50);
                        GameMenuView.addPoints(50);
                    }
                }
                else{
                    accuracyLabel.setText ("You have " +correctAnswerCount+"/3 Correct. Keep trying, you are almost there!");
                }
            });


            Button backQuestButton5 = new Button("Back to Quests");
            backQuestButton5.setPrefSize(150, 40);
            backQuestButton5.setFont(new Font("Cambria", 14));
            backQuestButton5.setOnAction(e -> sceneManager.showQuest());
            HBox questButtons = new HBox(backQuestButton5);
            questButtons.setAlignment(Pos.CENTER_LEFT);
            questButtons.setSpacing(10);


            setBottom(questButtons);
        }
        if (questNum == 7) {
            Label Welcome7 = new Label("Welcome to Quest 7: Budgeting Master (60 points)");
            Welcome7.setPrefSize(800, 60); 
            Welcome7.setFont(new Font("Cambria", 24));
            //questButton.setStyle("-fx-background-color: #32df32c3; -fx-border-color: #105b26c8; -fx-border-width: 2");
            Welcome7.setAlignment(Pos.CENTER);
            //questButton.setStyle("-fx-background-color: #32df32c3; -fx-border-color: #105b26c8; -fx-border-width: 2");
            HBox Title7 = new HBox(Welcome7);
            Title7.setAlignment(Pos.TOP_CENTER);
            Title7.setSpacing(20);

            setTop(Title7);

            Label instructions7 = new Label ("Now that you a bit about budgeting, set a budgeting goal for yourself!");
            instructions7.setFont(new Font("Cambria", 18));

            Label budgetingLabel = new Label("Set Max Budget: $");
            TextField budgetAmountInput = new TextField();
            budgetAmountInput.setMaxWidth(250);

            Button setGoalButton = new Button("Set Your Goal");
            setGoalButton.setPrefSize(150, 25);

            Label errorLabel = new Label("");
            errorLabel.setFont(new Font("Cambria", 14));

            HBox budgetGoals = new HBox(10, budgetingLabel,budgetAmountInput,setGoalButton);
            budgetGoals.setAlignment(Pos.CENTER);

            setGoalButton.setOnAction(e -> {
                try {
                    double newBudgetGoal = Double.parseDouble(budgetAmountInput.getText());
                    if (newBudgetGoal>0){
                        Main.getAccount().getBudget().changeBudget(newBudgetGoal);
                        GameMenuView.addProgress(60);
                        GameMenuView.addPoints(60);

                        errorLabel.setText("You successfully set your budget to $" + newBudgetGoal +"! Quest 7 is now complete!");
                        errorLabel.setStyle("-fx-text-fill: green;");
                        setGoalButton.setDisable(true);
                        budgetAmountInput.setDisable(true);
                        Quest.Quest7Finish = true;
                        //public static boolean getQuest7Finish() {return quest7Finish;};
                    }
                } catch (NumberFormatException ex) {
                    errorLabel.setText("Invalid Input for goal. Please provide a valid amount.");
                }
            });

            VBox descriptionBox7 = new VBox(20, instructions7, budgetGoals, errorLabel);
            descriptionBox7.setAlignment(Pos.CENTER);
            setCenter(descriptionBox7);

            Button backQuestButton7 = new Button("Back to Quests");
            backQuestButton7.setPrefSize(150, 40);
            backQuestButton7.setFont(new Font("Cambria", 14));
            backQuestButton7.setOnAction(e -> sceneManager.showQuest());
            HBox questButtons = new HBox(backQuestButton7);
            questButtons.setAlignment(Pos.CENTER_LEFT);
            questButtons.setSpacing(10);


            setBottom(questButtons);
        }
        if (questNum == 8) {
            Label Welcome8 = new Label("Welcome to Quest 8: Transaction Train! (70 points)");
            Welcome8.setPrefSize(800, 60); 
            Welcome8.setFont(new Font("Cambria", 24));
            //questButton.setStyle("-fx-background-color: #32df32c3; -fx-border-color: #105b26c8; -fx-border-width: 2");
            Welcome8.setAlignment(Pos.CENTER);
            //questButton.setStyle("-fx-background-color: #32df32c3; -fx-border-color: #105b26c8; -fx-border-width: 2");
            HBox Title8 = new HBox(Welcome8);
            Title8.setAlignment(Pos.TOP_CENTER);
            Title8.setSpacing(20);

            setTop(Title8);

            Label instructions8 = new Label ("Log a total of 8 transactions (revenue or expense) ending at a total balance of $1100. \nThen check the Dashboard Pie Chart!");
            instructions8.setFont(new Font("Cambria", 18));
            VBox descriptionBox8 = new VBox(instructions8);
            descriptionBox8.setAlignment(Pos.CENTER);
            setCenter(descriptionBox8);

            Button backQuestButton8 = new Button("Back to Quests");
            backQuestButton8.setPrefSize(150, 40);
            backQuestButton8.setFont(new Font("Cambria", 14));
            backQuestButton8.setOnAction(e -> sceneManager.showQuest());
            HBox questButtons = new HBox(backQuestButton8);
            questButtons.setAlignment(Pos.CENTER_LEFT);
            questButtons.setSpacing(10);


            setBottom(questButtons);
        }
        if (questNum == 9) {
            Label Welcome9 = new Label("Welcome to Quest 9: Reach the Peak! (80 points)");
            Welcome9.setPrefSize(800, 60); 
            Welcome9.setFont(new Font("Cambria", 24));
            //questButton.setStyle("-fx-background-color: #32df32c3; -fx-border-color: #105b26c8; -fx-border-width: 2");
            Welcome9.setAlignment(Pos.CENTER);
            //questButton.setStyle("-fx-background-color: #32df32c3; -fx-border-color: #105b26c8; -fx-border-width: 2");
            HBox Title9 = new HBox(Welcome9);
            Title9.setAlignment(Pos.TOP_CENTER);
            Title9.setSpacing(20);

            setTop(Title9);

            Label instructions9 = new Label ("Complete your budgeting goal from Quest 7!");
            instructions9.setFont(new Font("Cambria", 18));
            VBox descriptionBox9 = new VBox(instructions9);
            descriptionBox9.setAlignment(Pos.CENTER);
            setCenter(descriptionBox9);
            
            Button backQuestButton9 = new Button("Back to Quests");
            backQuestButton9.setPrefSize(150, 40);
            backQuestButton9.setFont(new Font("Cambria", 14));
            backQuestButton9.setOnAction(e -> sceneManager.showQuest());
            HBox questButtons = new HBox(backQuestButton9);
            questButtons.setAlignment(Pos.CENTER_LEFT);
            questButtons.setSpacing(10);
            

            setBottom(questButtons);
        }
        if (questNum == 10) {
            Label Welcome10 = new Label("Welcome to Quest 10: Final Challenge! (100 points)");
            Welcome10.setPrefSize(800, 60); 
            Welcome10.setFont(new Font("Cambria", 24));
            Welcome10.setAlignment(Pos.CENTER);
            HBox Title10 = new HBox(Welcome10);
            Title10.setAlignment(Pos.TOP_CENTER);
            Title10.setSpacing(20);

            setTop(Title10);

            Label instructions3 = new Label ("Answer these 8 questions correctly to get credit!");
            instructions3.setFont(new Font("Cambria", 18));
            //VBox descriptionBox3 = new VBox(instructions3);
            //descriptionBox3.setAlignment(Pos.CENTER);
            //setCenter(descriptionBox3);
            
            Label question1 = new Label ("Your monthly income is $4000. You aim to save 24%. What is the most you can spend?");
            question1.setFont(new Font ("Cambria", 14));
            RadioButton optionA1 = new RadioButton("$3000");
            RadioButton optionB1 = new RadioButton("$1000");
            RadioButton optionC1 = new RadioButton("$1040");
            RadioButton optionD1 = new RadioButton("$3040");
            ToggleGroup group1 = new ToggleGroup();
            optionA1.setToggleGroup(group1);
            optionB1.setToggleGroup(group1);
            optionC1.setToggleGroup(group1);
            optionD1.setToggleGroup(group1);
            HBox choicesBox1 = new HBox (40, optionA1,optionB1,optionC1,optionD1);
            choicesBox1.setAlignment(Pos.CENTER);

            Label question2 = new Label ("You had budgeted $60 for transportation. $39 has been spent. What percent remains?");
            question2.setFont(new Font ("Cambria", 14));
            RadioButton optionA2 = new RadioButton("65%");
            RadioButton optionB2 = new RadioButton("35%");
            RadioButton optionC2 = new RadioButton("71%");
            RadioButton optionD2 = new RadioButton("55%");
            ToggleGroup group2 = new ToggleGroup();
            optionA2.setToggleGroup(group2);
            optionB2.setToggleGroup(group2);
            optionC2.setToggleGroup(group2);
            optionD2.setToggleGroup(group2);
            HBox choicesBox2 = new HBox (40, optionA2,optionB2,optionC2,optionD2);
            choicesBox2.setAlignment(Pos.CENTER);

            Label question3 = new Label ("Which of the following is a variable expense?");
            question3.setFont(new Font ("Cambria", 14));
            RadioButton optionA3 = new RadioButton("Rent");
            RadioButton optionB3 = new RadioButton("Phone Bills");
            RadioButton optionC3 = new RadioButton("Groceries");
            RadioButton optionD3 = new RadioButton("College Tuition");
            ToggleGroup group3 = new ToggleGroup();
            optionA3.setToggleGroup(group3);
            optionB3.setToggleGroup(group3);
            optionC3.setToggleGroup(group3);
            optionD3.setToggleGroup(group3);

            HBox choicesBox3 = new HBox (40, optionA3,optionB3,optionC3,optionD3);
            choicesBox3.setAlignment(Pos.CENTER);

            Label question4 = new Label ("You want $500 in savings in 5 months. So far, you have $180 saved. How much per month saving to stay on track?");
            question4.setFont(new Font ("Cambria", 14));
            RadioButton optionA4 = new RadioButton("$64");
            RadioButton optionB4 = new RadioButton("$80");
            RadioButton optionC4 = new RadioButton("$72");
            RadioButton optionD4 = new RadioButton("$100");
            ToggleGroup group4 = new ToggleGroup();
            optionA4.setToggleGroup(group4);
            optionB4.setToggleGroup(group4);
            optionC4.setToggleGroup(group4);
            optionD4.setToggleGroup(group4);

            HBox choicesBox4 = new HBox (40, optionA4,optionB4,optionC4,optionD4);
            choicesBox4.setAlignment(Pos.CENTER);

            
            Label question5 = new Label ("A balanced budget means which of the following?");
            question5.setFont(new Font ("Cambria", 14));
            RadioButton optionA5 = new RadioButton("Spending = Income");
            RadioButton optionB5 = new RadioButton("Savings > Income");
            RadioButton optionC5 = new RadioButton("Spending < Income");
            RadioButton optionD5 = new RadioButton("Income < Expenses");
            ToggleGroup group5 = new ToggleGroup();
            optionA5.setToggleGroup(group5);
            optionB5.setToggleGroup(group5);
            optionC5.setToggleGroup(group5);
            optionD5.setToggleGroup(group5);
            HBox choicesBox5 = new HBox (40, optionA5,optionB5,optionC5,optionD5);
            choicesBox5.setAlignment(Pos.CENTER);

            Label question6 = new Label ("You track weekly expenses. If one week is $82, the next is $68, and the third is $78, what is your average weekly spending?");
            question6.setFont(new Font ("Cambria", 14));
            RadioButton optionA6 = new RadioButton("$70");
            RadioButton optionB6 = new RadioButton("$72");
            RadioButton optionC6 = new RadioButton("$76");
            RadioButton optionD6 = new RadioButton("$74");
            ToggleGroup group6 = new ToggleGroup();
            optionA6.setToggleGroup(group6);
            optionB6.setToggleGroup(group6);
            optionC6.setToggleGroup(group6);
            optionD6.setToggleGroup(group6);
            HBox choicesBox6 = new HBox (40, optionA6,optionB6,optionC6,optionD6);
            choicesBox6.setAlignment(Pos.CENTER);

            Label question7 = new Label ("What is the best reason to categorize your expenses?");
            question7.setFont(new Font ("Cambria", 14));
            RadioButton optionA7 = new RadioButton("Looks Interesting");
            RadioButton optionB7 = new RadioButton("Helps Spot Overspending");
            RadioButton optionC7 = new RadioButton("Reduces Taxes");
            RadioButton optionD7 = new RadioButton("Raises Income");
            ToggleGroup group7 = new ToggleGroup();
            optionA7.setToggleGroup(group7);
            optionB7.setToggleGroup(group7);
            optionC7.setToggleGroup(group7);
            optionD7.setToggleGroup(group7);

            HBox choicesBox7 = new HBox (40, optionA7,optionB7,optionC7,optionD7);
            choicesBox7.setAlignment(Pos.CENTER);

            Label question8 = new Label ("You have saved 18% of your $350 goal so far. How much have you saved in dollars?");
            question8.setFont(new Font ("Cambria", 14));
            RadioButton optionA8 = new RadioButton("$61");
            RadioButton optionB8 = new RadioButton("$63");
            RadioButton optionC8 = new RadioButton("$64");
            RadioButton optionD8 = new RadioButton("$68");
            ToggleGroup group8 = new ToggleGroup();
            optionA8.setToggleGroup(group8);
            optionB8.setToggleGroup(group8);
            optionC8.setToggleGroup(group8);
            optionD8.setToggleGroup(group8);

            HBox choicesBox8 = new HBox (40, optionA8,optionB8,optionC8,optionD8);
            choicesBox8.setAlignment(Pos.CENTER);

            Button submitQuestionsButton = new Button ("Submit Your Answers");
            submitQuestionsButton.setPrefSize(150, 40);
            question3.setFont(new Font ("Cambria", 14));

            Label accuracyLabel = new Label("");
            accuracyLabel.setFont(new Font ("Cambria", 16));

            VBox quizInformationDisplay = new VBox(instructions3,question1, choicesBox1,
            question2, choicesBox2, question3, choicesBox3, question4, choicesBox4,question5, choicesBox5, 
            question6, choicesBox6, question7, choicesBox7, question8, choicesBox8,submitQuestionsButton, accuracyLabel);
            quizInformationDisplay.setAlignment(Pos.CENTER);
            quizInformationDisplay.setSpacing (8);
            
            setCenter(quizInformationDisplay);

            submitQuestionsButton.setOnAction(e -> {
                int correctAnswerCount = 0;
                if (group1.getSelectedToggle () == optionD1) {
                    correctAnswerCount++;
                }
                if (group2.getSelectedToggle () == optionB2) {
                    correctAnswerCount++;
                }
                if (group3.getSelectedToggle () == optionC3) {
                    correctAnswerCount++;
                }
                if (group4.getSelectedToggle () == optionA4) {
                    correctAnswerCount++;
                }
                if (group5.getSelectedToggle () == optionA5) {
                    correctAnswerCount++;
                }
                if (group6.getSelectedToggle () == optionC6) {
                    correctAnswerCount++;
                }
                if (group7.getSelectedToggle () == optionB7) {
                    correctAnswerCount++;
                }
                if (group8.getSelectedToggle () == optionB8) {
                    correctAnswerCount++;
                }

                if (correctAnswerCount == 8){
                    accuracyLabel.setText ("Fantastic, You got all questions right! 8/8! Remember to apply these lessons managing your finances!");
                    accuracyLabel.setStyle("-fx-text-fill: green;");
                    submitQuestionsButton.setDisable(true);
                    if (quest10Finish == false) {
                        quest10Finish = true;
                        GameMenuView.addProgress(100);
                        GameMenuView.addPoints(100);
                    }
                }
                else{
                    accuracyLabel.setText ("You have " +correctAnswerCount+"/8 Correct. Keep trying, you are almost there!");
                }
            });

            Button backQuestButton10 = new Button("Back to Quests");
            backQuestButton10.setPrefSize(150, 40);
            backQuestButton10.setFont(new Font("Cambria", 14));
            backQuestButton10.setOnAction(e -> sceneManager.showQuest());
            HBox questButtons = new HBox(backQuestButton10);
            questButtons.setAlignment(Pos.CENTER_LEFT);
            questButtons.setSpacing(10);
            //questButtons.setPadding(new Insets(0,0,100,0));


            setBottom(questButtons);
        }
    }
}
