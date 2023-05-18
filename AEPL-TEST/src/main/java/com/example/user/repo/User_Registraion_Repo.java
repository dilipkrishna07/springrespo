package com.example.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.user.model.User_Registration;
/*
 * this interface is used for functionality of jpaRepository
 */
public interface User_Registraion_Repo extends JpaRepository<User_Registration, Integer>{
	/*
	 * Getting  user data using email 
	 */
	@Query(value="select * from User_Registration where email=?1",nativeQuery = true)
	public User_Registration emailValidation(String email);
	
	/*
	 * Getting  user data using mobile number  
	 */
	@Query(value="select * from User_Registration where mobile=?1",nativeQuery = true)
	public User_Registration mobileValidation(long mobile);
	

}
