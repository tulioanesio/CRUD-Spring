package com.tulioanesio.crud_spring.repositories;

import com.tulioanesio.crud_spring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
