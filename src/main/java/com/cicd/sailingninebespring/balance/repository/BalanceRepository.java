package com.cicd.sailingninebespring.balance.repository;

import com.cicd.sailingninebespring.balance.entity.Balance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BalanceRepository extends JpaRepository<Balance, Long> {
}
