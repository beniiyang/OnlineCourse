package com.security.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.security.dao.entity.User;
import com.security.repository.UserRepository;
import com.security.service.UserService;

@Service
@Transactional
public class UserServicelmpl implements UserService {
	
	@Autowired 
	UserRepository userRepository;

	public User findUserById(Long id) {
		return userRepository.getOne(id);
	}
	
	public User findByUserName(String name) {
		return userRepository.findByName(name);
	}
	
	public void saveUser(User user) {
		userRepository.save(user);
	}
	
	public User loginUser(String name, String password) {
		User user = userRepository.loginUser(name, password);
		return user;
	}

}
