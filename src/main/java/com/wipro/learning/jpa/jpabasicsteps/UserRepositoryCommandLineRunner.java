package com.wipro.learning.jpa.jpabasicsteps;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.wipro.learning.jpa.jpabasicsteps.entity.User;
import com.wipro.learning.jpa.jpabasicsteps.service.UserRepository;


@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner{
	private static final Logger log =
			LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... arg0) throws Exception {
		User user = new User("Ankita", "Developer");
		userRepository.save(user);
		log.info("New User is created : " + user);
		
		Optional<User> userWithIdOne= userRepository.findById(1L);
		log.info("User is retrieved : " + userWithIdOne);
		
		List<User> users = userRepository.findAll();
		log.info("All Users : " + users);
	}
}
