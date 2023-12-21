package com.cicd.sailingninebespring.order.entity;

import com.cicd.sailingninebespring.payment.entity.Payment;
import com.cicd.sailingninebespring.user.entity.Member;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Orders {

    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private Long orderId;

    private LocalDateTime orderDate;

    @OneToMany(mappedBy = "order")
    private List<OrderProduct> orderProducts = new ArrayList<>();

    @OneToOne(mappedBy = "order")
    private Payment payment;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Member user;

    private String orderStatus;
}
