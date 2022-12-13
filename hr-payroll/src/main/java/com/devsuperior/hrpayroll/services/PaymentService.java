package com.devsuperior.hrpayroll.services;

import com.devsuperior.hrpayroll.entities.Payment;

public interface PaymentService {
    Payment getPayment(long workerId, int days);
}
