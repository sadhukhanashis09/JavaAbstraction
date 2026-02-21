package com.payment.model;

public abstract class Payment{
    protected final double amount;

    protected Payment(double amount){
        this.amount=amount;
    }

    public abstract  void processPayment();
    public void showPaymentStatus(){
        System.out.println("Payment of ₹" + amount + " completed successfully.");
    }
}