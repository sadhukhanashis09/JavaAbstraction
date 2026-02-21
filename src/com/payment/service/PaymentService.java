package com.payment.service;

import com.payment.model.Payment;

public class PaymentService {
    public void makePayment(Payment payment){
        payment.processPayment();
        payment.showPaymentStatus();

    }
}
