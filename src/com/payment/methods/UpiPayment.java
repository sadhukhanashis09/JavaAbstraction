package com.payment.methods;

import com.payment.model.Payment;

public class UpiPayment extends Payment {

    public UpiPayment(double amount){
        super(amount);
    }
    @Override
    public void processPayment() {
        System.out.println("Processing UPI payment of ₹" + amount);
    }
}
