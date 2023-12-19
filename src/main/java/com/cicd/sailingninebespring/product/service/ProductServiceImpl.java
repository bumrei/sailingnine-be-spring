package com.cicd.sailingninebespring.product.service;

import com.cicd.sailingninebespring.product.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{
    @Override
    public List<Product> getProductList() {
        return null;
    }

    @Override
    public Product getProductDetail(Long productIdx) {
        return null;
    }

}
