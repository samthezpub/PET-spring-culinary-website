package com.example.springrecipieswebappnew.Repository;

import com.example.springrecipieswebappnew.Entity.DishEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DishRepository extends JpaRepository<DishEntity, Long> {
}
