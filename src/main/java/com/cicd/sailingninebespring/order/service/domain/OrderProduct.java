package com.cicd.sailingninebespring.order.service.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class OrderProduct {

    private Long productId;
    private String name;
    private Integer price;
    private Integer quantity;


}
