package com.java.main.callsign.authentication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PasswordEncoderSvc {
	
	@Autowired
	private PasswordEncoder bCryptPasswordEncoder;
	
	public String getEncryptPassword(String plainPassword) {
		
		return bCryptPasswordEncoder.encode(plainPassword);
		
	}
	
	

}
