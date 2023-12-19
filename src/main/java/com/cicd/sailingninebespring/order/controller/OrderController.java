package com.cicd.sailingninebespring.order.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/order")
@RequiredArgsConstructor
public class OrderController {

    // POST 주문 진행 - /api/orders
    @PostMapping("/api/orders")
    public void doOrder() {
        System.out.println("주문 api 발생");
    }

}
