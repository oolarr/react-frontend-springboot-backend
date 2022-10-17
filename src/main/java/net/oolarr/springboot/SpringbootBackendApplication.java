package net.oolarr.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.oolarr.springboot.model.User;
import net.oolarr.springboot.repository.UserRepo;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public void run(String... args) throws Exception {
		this.userRepo.save(new User("Ola", "Ololade", "ololade@gmail.com"));
		this.userRepo.save(new User("Bukayo", "Saka", "Saka@gmail.com"));
		this.userRepo.save(new User("Fikayo", "Tomori", "Tomori@gmail.com"));
		
	}

}
