package com.example;

public class TableData {

    private final String plus;
    private final String category;
    private final String date;
    private final String amount;
    private final String note;

    // This class is just where we store the data the user inputted 
    public TableData(String plus, String category, String date, String amount, String note) {
        this.plus = plus;
        this.category = category;
        this.date = date;
        this.amount = amount;
        this.note = note;
    }

    public String getPlus() { return plus; }
    public String getCategory() { return category; }
    public String getDate() { return date; }
    public String getAmt() { return amount; }
    public String getNote() {return note;}
    
}