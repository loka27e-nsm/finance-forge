package com.example;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class Quest extends BorderPane {
    
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
            VBox descriptionBox3 = new VBox(instructions3);
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
                }
                else{
                    accuracyLabel.setText ("You have" +correctAnswerCount+"/3 Correct. Keep trying, you are almost there!");
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
            Button backQuestButton6 = new Button("Back to Quests");
            backQuestButton6.setPrefSize(150, 40);
            backQuestButton6.setFont(new Font("Cambria", 14));
            backQuestButton6.setOnAction(e -> sceneManager.showQuest());
            HBox questButtons = new HBox(backQuestButton6);
            questButtons.setAlignment(Pos.CENTER_LEFT);
            questButtons.setSpacing(10);


            setBottom(questButtons);
        }
        if (questNum == 8) {
            Button backQuestButton7 = new Button("Back to Quests");
            backQuestButton7.setPrefSize(150, 40);
            backQuestButton7.setFont(new Font("Cambria", 14));
            backQuestButton7.setOnAction(e -> sceneManager.showQuest());
            HBox questButtons = new HBox(backQuestButton7);
            questButtons.setAlignment(Pos.CENTER_LEFT);
            questButtons.setSpacing(10);


            setBottom(questButtons);
        }
        if (questNum == 9) {
            Button backQuestButton8 = new Button("Back to Quests");
            backQuestButton8.setPrefSize(150, 40);
            backQuestButton8.setFont(new Font("Cambria", 14));
            backQuestButton8.setOnAction(e -> sceneManager.showQuest());
            HBox questButtons = new HBox(backQuestButton8);
            questButtons.setAlignment(Pos.CENTER_LEFT);
            questButtons.setSpacing(10);


            setBottom(questButtons);
        }
        if (questNum == 10) {
            Button backQuestButton9 = new Button("Back to Quests");
            backQuestButton9.setPrefSize(150, 40);
            backQuestButton9.setFont(new Font("Cambria", 14));
            backQuestButton9.setOnAction(e -> sceneManager.showQuest());
            HBox questButtons = new HBox(backQuestButton9);
            questButtons.setAlignment(Pos.CENTER_LEFT);
            questButtons.setSpacing(10);


            setBottom(questButtons);
        }
    }
}
