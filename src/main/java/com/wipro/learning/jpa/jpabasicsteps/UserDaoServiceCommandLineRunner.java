package com.wipro.learning.jpa.jpabasicsteps;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.wipro.learning.jpa.jpabasicsteps.entity.User;
import com.wipro.learning.jpa.jpabasicsteps.service.UserDAOSerivce;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner{
	
	private static final Logger log =
			LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
	
	@Autowired
	private UserDAOSerivce userDaoService;
	
	@Override
	public void run(String... arg0) throws Exception {
		User user = new User("Anant", "Developer");
		userDaoService.insert(user);
		log.info("New User is created : " + user);
	}
}
