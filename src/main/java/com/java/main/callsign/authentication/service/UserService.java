package com.java.main.callsign.authentication.service;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.java.main.callsign.authentication.model.JwtUserBean;

@Service
public class UserService {

	@Autowired
	PasswordEncoderSvc passwordEncoder;
	
	
	private Map<String, JwtUserBean> usersMap;
	
	@PostConstruct
	public void fillUser(){
		
		if(usersMap == null)
			usersMap = new HashMap<>();
		
		fillUserMap(usersMap);
		
	}
	
	public JwtUserBean getUserByUserName(String username) {
		
		if(usersMap.get(username) != null)
			return usersMap.get(username);
		
		return null;
	}
	
	private void fillUserMap(Map<String, JwtUserBean> usersMap) {
		
		usersMap.put("callsign", new JwtUserBean("callsign", passwordEncoder.getEncryptPassword("callsign") ));
		
		for(int i=0; i<10; i++) {
			usersMap.put("user"+i, new JwtUserBean("user"+i, passwordEncoder.getEncryptPassword("password"+i) ));
		}
		
	}
	
}
