package com.anudip;

import com.anudip.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnudipApplication implements CommandLineRunner {
	@Autowired
	private UserRepo userRepo;
	public static void main(String[] args) {
		SpringApplication.run(AnudipApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Student s = new Student();
//		s.setName("Abhishek Srivastava");
//		s.setUserName("abhi.srivastava7631@gmail.com");
//		s.setPassword("Abhi7631@");
//		this.studentRepo.save(s);
	}
}
