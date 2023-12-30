package com.cicd.sailingninebespring.order.controller.response;

import lombok.Builder;

@Builder
public record OrderResponse(

        Long orderId

) {
}
