package com.cicd.sailingninebespring.balance.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BalanceDTO {

    private Long balanceIdx;
    private Long userIdx;
    private Long amounts;
    private LocalDateTime topUpDate;

    private LocalDateTime firstTopUpDate;
}
