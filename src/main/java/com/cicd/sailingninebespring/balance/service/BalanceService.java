package com.cicd.sailingninebespring.balance.service;

import com.cicd.sailingninebespring.balance.entity.Balance;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface BalanceService {

    // 잔액 조회
    Balance getBalance(Long userIdx);

    // 잔액 충전
    Long topUpBalance(Long userIdx, Long amounts);
}
