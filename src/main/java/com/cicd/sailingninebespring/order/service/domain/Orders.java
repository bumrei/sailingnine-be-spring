package com.cicd.sailingninebespring.order.service.domain;

import com.cicd.sailingninebespring.order.constant.OrderStatus;
import com.cicd.sailingninebespring.order.repository.entity.OrderEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@Builder
@ToString
public class Orders {


    private Long orderId;
    private OrderStatus status;
    private Long memberId;
    private List<OrderProduct> products;
    private Long creator;
    private Long lastModifier;



}
