package net.oolarr.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.oolarr.springboot.model.User;
import net.oolarr.springboot.repository.UserRepo;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class UserController {
	@Autowired
	private UserRepo userRepo;
	
	@GetMapping("users")
	public List<User> getUsers(){
		return this.userRepo.findAll();
	}

}
