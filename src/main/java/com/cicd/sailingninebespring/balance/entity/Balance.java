package com.cicd.sailingninebespring.balance.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Balance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long balanceIdx;

    private Long userIdx;

    private Long amounts;

    @UpdateTimestamp
    private LocalDateTime topUpDate;

    @CreationTimestamp
    private LocalDateTime firstTopUpDate;
}
