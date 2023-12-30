package com.cicd.sailingninebespring.order.repository.entity;

import com.cicd.sailingninebespring.order.service.domain.OrderProduct;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
@Table(name = "order_product")
public class OrderProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_product_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private OrderEntity order;

    @Column
    private Long productId;

    @Column
    private String name;

    @Column
    private Integer price;

    @Column
    private Integer quantity;

    @Column
    private Long creator;

    @Column
    private Long lastModifier;

    public static OrderProductEntity create(OrderProduct orderProduct) {
        return OrderProductEntity.builder()
                .productId(orderProduct.getProductId())
                .name(orderProduct.getName())
                .price(orderProduct.getPrice())
                .quantity(orderProduct.getQuantity())
                .build();
    }

    public void setOrder(OrderEntity order) {
        this.order = order;
    }
}
