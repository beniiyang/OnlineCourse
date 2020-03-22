package com.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.security.dao.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	@Query(value = "select * from users where user_name = ?", nativeQuery = true)
	User findByName (String name);
	
	@Query(value = "select * from users where user_name = ?1 and password = ?2", nativeQuery = true)
	User loginUser(String name, String password);
	
}
