package com.cicd.sailingninebespring.order.controller;

import com.cicd.sailingninebespring.CommonResponse;
import com.cicd.sailingninebespring.order.controller.request.OrderRequest;
import com.cicd.sailingninebespring.order.controller.response.OrderResponse;
import com.cicd.sailingninebespring.order.service.OrderService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/v1/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @GetMapping("/hello")
    public String haha() {
        return "hello world";
    }

    @PostMapping("/request")
    public ResponseEntity<?> requestOrders(@Valid @RequestBody OrderRequest request) {
        Long orderId = orderService.requestOrder(request.toOrder());
        return ResponseEntity.ok(CommonResponse.ok(OrderResponse.builder().orderId(orderId).build()));
    }
}
