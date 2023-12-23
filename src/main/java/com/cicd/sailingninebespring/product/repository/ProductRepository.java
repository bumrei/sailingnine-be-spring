package com.cicd.sailingninebespring.product.repository;

import com.cicd.sailingninebespring.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
