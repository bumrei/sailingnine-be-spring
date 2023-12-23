package com.cicd.sailingninebespring.balance.service;

import com.cicd.sailingninebespring.balance.entity.Balance;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BalanceServiceImpl implements BalanceService {

    private final ModelMapper modelMapper;

    @Override
    public Balance getBalance(Long userIdx) {

        return null;
    }

    @Override
    public Long topUpBalance(Long userIdx, Long amounts) {
        return null;
    }
}
