package com.cicd.sailingninebespring.product.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/product")
@RequiredArgsConstructor
public class ProductController {

    // GET 상품 조회 - /api/products
    @GetMapping("/api/products")
    public void productList() {
        System.out.println("product List API 호출");
    }

    // GET 상품 상세 조회 - /api/products/{productIdx}
    @GetMapping("/api/products/{productIdx}")
    public void productDetail(@PathVariable Long productIdx) {
        System.out.println("상품 상세 정보 조회 API >> " + productIdx);
    }
}
