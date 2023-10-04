package com.example.TodoApplication.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	private AuthenticationService authenticateService;
	
	public LoginController(AuthenticationService authenticationService) {
		super();
		this.authenticateService = authenticationService;
	}
	
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String loginPage() {
		return "login_page";
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String welcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
		
		if(authenticateService.authenticate(name, password)) {
			model.put("name", name);
			return "welcome";
		}
		model.put("error_msg", "Invalid Credentials. Try Again!");
		return "login_page";
	}
}
