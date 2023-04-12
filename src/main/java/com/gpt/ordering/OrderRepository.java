package com.gpt.ordering.repository;

import com.gpt.ordering.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
