package com.wipro.learning.jpa.jpabasicsteps.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.wipro.learning.jpa.jpabasicsteps.entity.User;

@Repository
@Transactional
public class UserDAOSerivce {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public long insert(User user) {
		entityManager.persist(user);
		return user.getId();
	}
}
