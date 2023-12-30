package com.cicd.sailingninebespring.order.repository;

import com.cicd.sailingninebespring.constant.CustomExceptionStatus;
import com.cicd.sailingninebespring.exception.CustomException;
import com.cicd.sailingninebespring.order.repository.entity.OrderEntity;
import com.cicd.sailingninebespring.order.service.domain.Orders;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
@RequiredArgsConstructor
public class OrderRepositoryImpl implements OrderRepository {

    private final OrderJpaRepository repository;

    @Override
    public Orders findById(Long orderId) {
        return repository.findById(orderId)
                .orElseThrow(() -> new CustomException(CustomExceptionStatus.ORDER_NOT_FOUND))
                .toOrder();
    }

    // Order 주문 넣기
    @Override
    public Long save(Orders orders) {
        log.info("=================== api check >>> {} " , orders);
        // OrderEntity 만듬
        OrderEntity orderEntity =  OrderEntity.create(orders);
        // DB 에 save
        repository.save(orderEntity);
        return orderEntity.getOrderId();

    }
}
