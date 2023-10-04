package com.example.TodoApplication.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public Boolean authenticate(String name, String password) {
		Boolean vname = "Prathamesh".equalsIgnoreCase(name);
		Boolean vpassword = "dummy".equalsIgnoreCase(password);
		
		return vname && vpassword;
	}

}
