package com.cicd.sailingninebespring.payment.entity;

import com.cicd.sailingninebespring.order.entity.Orders;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Payment {

    @Id
    @GeneratedValue
    @Column(name = "payment_id")
    private Long paymentId;

    private String paymentStatus;

    private int totalPrice;

    @OneToOne
    @JoinColumn(name = "order_id")
    private Orders order;

}
