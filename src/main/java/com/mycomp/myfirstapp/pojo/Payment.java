package com.mycomp.myfirstapp.pojo;

public class Payment {
    private long id;
    private double amount;
    private String currency;

    public Payment(long id, double amount, String currency) {
        this.id = id;
        this.amount = amount;
        this.currency = currency;
    }

    // Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
