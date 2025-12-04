package com.example;


public class BankAccount {    
    private Budget userBudget;
    private String userid;
    private double accountBalance;

    public BankAccount(String userid, double accountBalance) {
        this.userid = userid;
        this.accountBalance = accountBalance;
        this.userBudget = new Budget(1000.00);
    }

    // All the basic methods associated with this class
    public double getBalance() {return this.accountBalance;}
    public String getId() {return this.userid;}
    public boolean checkId(String inputId) {return inputId.equals(userid);}
    public void changeId(String id) {this.userid = id;}

    // To Change the Balance of the account
    public void addToBalance(double money) {this.accountBalance += money;}
    public void removeFromBalance(double money) {
        if (money > this.accountBalance) 
            {this.accountBalance = 0;} 
        else 
            {this.accountBalance -= money;}
    }
    public Budget getBudget(){
        return userBudget;
    }
    // These two are just in case we end up doing something involving it. We might not use it but I put it here just in case
    public void multiplyBalance(double multiplier) {this.accountBalance = Math.round(this.accountBalance * multiplier);}
    public void divideBalance(double divider) {this.accountBalance = Math.round(this.accountBalance / divider);}

}
