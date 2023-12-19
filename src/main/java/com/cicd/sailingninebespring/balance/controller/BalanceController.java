package com.cicd.sailingninebespring.balance.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/balance")
@RequiredArgsConstructor
public class BalanceController {

    // GET 잔액 조회 - /api/balance
    @GetMapping("/api/balance")
    public void myBalance() {
        System.out.println("잔액 조회 API");
    }

    // POST 잔액 충전 - /api/balance
    @PostMapping("/api/balance")
    public void topUpBalance() {
        System.out.println("잔액 충전");
    }

}
