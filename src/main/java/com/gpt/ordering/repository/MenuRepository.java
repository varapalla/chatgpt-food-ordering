package com.gpt.ordering.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gpt.ordering.model.MenuItem;

@Repository
public interface MenuRepository extends JpaRepository<MenuItem, Long> {

}
