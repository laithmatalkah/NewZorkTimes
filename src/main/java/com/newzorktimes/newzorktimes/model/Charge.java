package com.newzorktimes.newzorktimes.model;

public class Charge {

    private int amount;
    private String currency;
    private String source;
    private String customer;


    public Charge(){};

    public Charge(int amount, String currency, String source, String customer) {
        this.amount = amount;
        this.currency = currency;
        this.source = source;
        this.customer = customer;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
}
