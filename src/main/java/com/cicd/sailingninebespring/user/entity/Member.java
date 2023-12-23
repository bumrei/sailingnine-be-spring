package com.cicd.sailingninebespring.user.entity;

import com.cicd.sailingninebespring.balance.entity.Balance;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Long userId;

    private String userName;

}
