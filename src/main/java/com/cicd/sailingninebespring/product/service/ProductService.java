package com.cicd.sailingninebespring.product.service;

import com.cicd.sailingninebespring.product.entity.Product;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ProductService {

    // 상품 조회
    List<Product> getProductList();

    // 상품 상세 조회
    Product getProductDetail(Long productIdx);
}
