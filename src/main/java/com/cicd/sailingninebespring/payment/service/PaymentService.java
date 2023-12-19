package com.cicd.sailingninebespring.payment.service;

import com.cicd.sailingninebespring.order.entity.Orders;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface PaymentService {
    // 결제 진행
    Long doPayment(Orders order, Long userIdx);

}
