package com.cicd.sailingninebespring.product.controller;

import com.cicd.sailingninebespring.product.domain.ProductDTO;
import com.cicd.sailingninebespring.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    // GET 상품 조회 - /api/products
    @GetMapping("/api/products")
    public List<ProductDTO> productList() {
        return productService.getProductList();
    }

    // GET 상품 상세 조회 - /api/products/{productIdx}
    @GetMapping("/api/products/{productId}")
    public ProductDTO productDetail(@PathVariable Long productId) {
        return productService.getProductDetail(productId);
    }
}
