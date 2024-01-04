package com.duru.fighting.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.duru.fighting.domain.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
