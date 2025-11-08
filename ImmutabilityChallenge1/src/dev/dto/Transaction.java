package dev.dto;

import java.util.Random;

public class Transaction {
    private int routingNumber;
    private String customerId;
    private long transactionId;
    private double transactionAmount;

    public Transaction(int routingNumber, String customerId, double transactionAmount) {
        this.routingNumber = routingNumber;
        this.customerId = customerId;
        this.transactionId = new Random().nextLong();
        this.transactionAmount = transactionAmount;
    }

    public int getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(int routingNumber) {
        this.routingNumber = routingNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public long getTransactionId() {
        return transactionId;
    }


    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }
}
