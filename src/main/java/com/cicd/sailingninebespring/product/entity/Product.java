package com.cicd.sailingninebespring.product.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {

    @Id
    @GeneratedValue
    @Column(name = "product_id")
    private Long productId;

    private String productName;

    private String description;

    private Long quantity;
}
