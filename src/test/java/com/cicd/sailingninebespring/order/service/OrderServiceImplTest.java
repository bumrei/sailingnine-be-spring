package com.cicd.sailingninebespring.order.service;

import com.cicd.sailingninebespring.order.constant.OrderStatus;
import com.cicd.sailingninebespring.order.repository.OrderRepository;
import com.cicd.sailingninebespring.order.service.domain.OrderProduct;
import com.cicd.sailingninebespring.order.service.domain.Orders;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.willDoNothing;

@SpringBootTest
class OrderServiceImplTest {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    OrderService orderService;

    @Test
    @DisplayName("상품 주문")
    public void requestOrder() {
        // given
        Orders order = getMockOrder();
        given(orderRepository.save(any())).willReturn(order.getOrderId());
        given(orderRepository.findById(anyLong())).willReturn(order);

        // when
        Long orderId = orderService.requestOrder(order);
        Orders newOrder = orderService.getOrder(order.getMemberId(), orderId);

        // then
        assertThat(newOrder.getOrderId()).isEqualTo(orderId);
        assertThat(newOrder.getStatus()).isEqualTo(OrderStatus.REQUEST);
    }

    private Orders getMockOrder() {
        return Orders.builder()
                .orderId(1L)
                .memberId(1L)
                .products(getMockOrderProducts())
                .status(OrderStatus.REQUEST)
                .build();
    }

    private List<OrderProduct> getMockOrderProducts() {
        return List.of(
                OrderProduct.builder().productId(1L).quantity(2).build(),
                OrderProduct.builder().productId(2L).quantity(5).build(),
                OrderProduct.builder().productId(3L).quantity(3).build()
        );
    }
}