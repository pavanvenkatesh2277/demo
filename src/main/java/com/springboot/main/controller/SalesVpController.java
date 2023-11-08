package com.springboot.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enums.Role;
import com.springboot.main.model.Company;
import com.springboot.main.model.SalesVp;
import com.springboot.main.model.User;
import com.springboot.main.service.SalesVpService;
import com.springboot.main.service.UserService;

@RestController
@RequestMapping("/salesvp")
public class SalesVpController {

	@Autowired
	SalesVpService saleVpService;
	@Autowired
	UserService userService;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@PostMapping("/add")
	public SalesVp insertSalesVp(@RequestBody SalesVp salesVp) {
		/*save user info in db*/
		User user=salesVp.getUser();
		String passwordPlain=user.getPassword();
		String encodedPassword=passwordEncoder.encode(passwordPlain);
		user.setPassword(encodedPassword);
		
		user.setRole(Role.SALESVP);
		user=userService.insert(user);
		
		salesVp.setUser(user);
		
		return salesVpService.insert(salesVp);
	}
}