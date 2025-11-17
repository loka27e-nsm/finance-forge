package com.example;

public class Budget {
    private double budgetGoal;

    public Budget(double budgetGoal){
        this.budgetGoal = budgetGoal;
    }
    
    public double getBudget() {return this.budgetGoal;}

    // Basically, since we don't have the code for showing information, we will keep it true/false
    // if it is false, we can let the user know they can't make the new budget (ex. if it is -1, we cant have that as a budget)
    public boolean changeBudget(double newBudget) {
        if (newBudget > 0) {
            this.budgetGoal = newBudget;
            return true;
        } else {
            return false;
        }
    }

    public boolean checkBudgetProgress(double expenses) {
        if (expenses > this.budgetGoal) {
            return false;
        } else {
            return true;
        }
    }
}