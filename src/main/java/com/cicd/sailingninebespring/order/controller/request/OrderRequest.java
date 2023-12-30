package com.cicd.sailingninebespring.order.controller.request;


import com.cicd.sailingninebespring.order.constant.OrderStatus;
import com.cicd.sailingninebespring.order.service.domain.Orders;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record OrderRequest(

        @NotNull
        Long memberId,

        List<OrderProductRequest> products

) {

    public Orders toOrder() {
        return Orders.builder()
                .memberId(memberId)
                .status(OrderStatus.REQUEST)
                .products(products.stream().map(OrderProductRequest::toOrderProduct).toList())
                .build();
    }

}
