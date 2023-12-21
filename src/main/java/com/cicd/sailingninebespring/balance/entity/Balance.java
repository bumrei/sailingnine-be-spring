package com.cicd.sailingninebespring.balance.entity;

import com.cicd.sailingninebespring.user.entity.Member;
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
    @GeneratedValue
    @Column(name = "balance_id")
    private Long balanceId;

    @OneToOne
    @JoinColumn(name = "user_id")
    private Member user;

    private Long amounts;

    @UpdateTimestamp
    private LocalDateTime topUpDate;

    @CreationTimestamp
    private LocalDateTime firstTopUpDate;
}
