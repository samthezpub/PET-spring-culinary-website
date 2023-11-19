package com.example.springrecipieswebappnew.Repository;

import com.example.springrecipieswebappnew.Entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
}
