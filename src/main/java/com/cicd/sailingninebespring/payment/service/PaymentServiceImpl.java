package com.cicd.sailingninebespring.payment.service;

import com.cicd.sailingninebespring.order.entity.Orders;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {
    @Override
    public Long doPayment(Orders order, Long userIdx) {
        return null;
    }
}
