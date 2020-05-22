package com.wipro.learning.jpa.jpabasicsteps.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.learning.jpa.jpabasicsteps.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
