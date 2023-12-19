package com.cicd.sailingninebespring.payment.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/payment")
@RequiredArgsConstructor
public class PaymentController {

    // POST 결제 - /api/payments
    @PostMapping("/api/payments")
    public void doPayment() {
        System.out.println("결제 진행 api");
    }
}
