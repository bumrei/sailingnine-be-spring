package com.cicd.sailingninebespring.order.repository;

import com.cicd.sailingninebespring.order.service.domain.Orders;

public interface OrderRepository {

    // Order 조회
    Orders findById(Long orderId);

    // Order 주문 넣기
    Long save(Orders orders);

}
