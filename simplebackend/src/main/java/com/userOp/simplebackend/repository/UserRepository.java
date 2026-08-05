package com.userOp.simplebackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userOp.simplebackend.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
