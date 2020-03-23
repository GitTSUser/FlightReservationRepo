package com.infospan.reservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.infospan.reservation.entities.User;
import com.infospan.reservation.repos.UserRepository;

@Controller
public class UserController {

	@Autowired
	private UserRepository repository;

	@RequestMapping("/showReg")
	public String showRegistrationPage() {
		return "login/register-user";
	}

	@RequestMapping("/showLogin")
	public String showLoginPage() {
		return "login/login-user";
	}

	@RequestMapping("/regUser")
	public String registerUser(@ModelAttribute("user") User user, ModelMap modelMap) {
		repository.save(user);
		return "login/login-user";
	}

	@RequestMapping("/loginUser")
	public String loginUser(@RequestParam("email") String email, @RequestParam("password") String pwd,
			ModelMap modelMap) {
		User user = repository.findByEmail(email);

		if (user.getPassword().equals(pwd)) {
			return "login/find-flight";
		}
		modelMap.addAttribute("msg", "Invalid credentials..!");

		return "login/login-user";
	}
}