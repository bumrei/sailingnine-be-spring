package com.cicd.sailingninebespring.order.controller.request;

import com.cicd.sailingninebespring.order.service.domain.OrderProduct;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record OrderProductRequest(

        @NotNull
        Long productId,

        @NotNull @Positive
        Integer amount
) {
    public OrderProduct toOrderProduct() {
        return OrderProduct.builder()
                .productId(productId)
                .quantity(amount)
                .build();
    }
}
