package com.payment.methods;

import com.payment.model.Payment;

public class CreditCardPayment extends Payment {

    public CreditCardPayment(double amount){
        super(amount);
    }
    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment of ₹" + amount);
    }
}
