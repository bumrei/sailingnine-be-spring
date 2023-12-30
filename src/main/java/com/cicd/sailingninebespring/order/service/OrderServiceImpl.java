package com.cicd.sailingninebespring.order.service;

import com.cicd.sailingninebespring.order.repository.OrderRepository;
import com.cicd.sailingninebespring.order.service.domain.Orders;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(rollbackFor = Exception.class) // 모든 오류나 Exception including Custom Exception 발생시 RollBack
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    
    // Order 조회
    @Override
    @Transactional(readOnly = true)
    public Orders getOrder(Long memberId, Long orderId) {
        return orderRepository.findById(orderId);
    }
    
    // Order 주문 넣기
    @Override
    public Long requestOrder(Orders orders) {

        return orderRepository.save(orders);
    }
}
