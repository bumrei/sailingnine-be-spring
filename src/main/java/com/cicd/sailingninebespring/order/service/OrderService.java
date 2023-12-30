package com.cicd.sailingninebespring.order.service;

import com.cicd.sailingninebespring.order.service.domain.Orders;

public interface OrderService {

    // Order 조회
    Orders getOrder(Long memberId, Long orderId);

    // Order 주문 넣기
    Long requestOrder(Orders order);

}
