package com.cicd.sailingninebespring.order.repository.entity;

import com.cicd.sailingninebespring.order.constant.OrderStatus;
import com.cicd.sailingninebespring.order.service.domain.OrderProduct;
import com.cicd.sailingninebespring.order.service.domain.Orders;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
@Table(name = "orders")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long orderId;

    @Enumerated(value = EnumType.STRING)
    private OrderStatus status;

    @Column
    private Long memberId;

    @Builder.Default
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderProductEntity> products = new ArrayList<>();

    @Column
    private Long creator;

    @Column
    private Long lastModifier;

    // class - 메모리 위에서 주소값 가지고 놀기.
    public static OrderEntity create(Orders orders) {
        OrderEntity newOrder = OrderEntity.builder()
                .status(orders.getStatus())
                .memberId(orders.getMemberId())
                .creator(orders.getMemberId())
                .build();
        newOrder.addProducts(orders.getProducts());
        return newOrder;
    }

    public Orders toOrder() {
        return Orders.builder()
                .orderId(orderId)
                .status(status)
                .memberId(memberId)
                .build();
    }

    private void addProducts(List<OrderProduct> products) {
        for(OrderProduct orderProduct : products) {
            OrderProductEntity product = OrderProductEntity.create(orderProduct);
            this.products.add(product);
            // 여긴 Entity level. 연관 관계 챙기기.
            product.setOrder(this);
        }
    }
}
