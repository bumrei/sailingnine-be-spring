package com.cicd.sailingninebespring.order.service;

import com.cicd.sailingninebespring.order.entity.OrderProduct;
import com.cicd.sailingninebespring.order.entity.Orders;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    @Override
    public Long doOrders(Orders orders) {
        return null;
    }

    @Override
    public OrderProduct getOrderDetail(Long orderIdx) {
        return null;
    }
}
