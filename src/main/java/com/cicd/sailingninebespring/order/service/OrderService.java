package com.cicd.sailingninebespring.order.service;

import com.cicd.sailingninebespring.order.entity.OrderProduct;
import com.cicd.sailingninebespring.order.entity.Orders;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface OrderService {

    // 주문 진행
    Long doOrders(Orders orders);

    // 주문 상세 조회 - OrderProduct
    OrderProduct getOrderDetail(Long orderIdx);
}
