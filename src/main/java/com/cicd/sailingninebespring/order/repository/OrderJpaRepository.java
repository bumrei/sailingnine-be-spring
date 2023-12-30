package com.cicd.sailingninebespring.order.repository;

import com.cicd.sailingninebespring.order.repository.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderJpaRepository extends JpaRepository<OrderEntity, Long> {
}
