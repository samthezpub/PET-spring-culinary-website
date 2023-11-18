package com.example.springrecipieswebappnew.Repository;

import com.example.springrecipieswebappnew.Entity.UserEntity;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Primary
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
