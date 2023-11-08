package com.springboot.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enums.Role;
import com.springboot.main.model.Hr;
import com.springboot.main.model.User;
import com.springboot.main.service.HrService;
import com.springboot.main.service.UserService;

@RestController
@RequestMapping("/hr")
public class HrController {
	@Autowired
	HrService hrService;
	@Autowired
	UserService userService;
	@Autowired
	private PasswordEncoder passwordEncoder;
	@PostMapping("/add")
	public Hr insertHr(@RequestBody Hr hr) {
		User user=hr.getUser();
		String passwordPlain=user.getPassword();
		String encodedPassword=passwordEncoder.encode(passwordPlain);
		user.setPassword(encodedPassword);
		
		user.setRole(Role.HR);
		user=userService.insert(user);
		
		hr.setUser(user);
		
		return hrService.insert(hr);
	}
	
	

}
