package com.security.service;

import com.security.dao.entity.User;

public interface UserService {

    User findUserById(Long id);
 
    void saveUser(User user);
    
    User findByUserName(String name);
    
    User loginUser(String name, String password);

}
