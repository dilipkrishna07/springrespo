package com.example.user.controller;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.user.model.User_Registration;
import com.example.user.repo.User_Registraion_Repo;
import com.example.user.service.User_Registration_Service;

import jakarta.servlet.http.HttpSession;
/*
 * This is a controller class where we can connct to the web 
 */
@Controller
public class User_Registration_Controller {
	/*
	 * This is Repo interface with help Autowired annotation creating a object of Repo interface
	 */
	@Autowired
	User_Registraion_Repo repo;
	
	/*
	 * This is Logical class with help auto wired annotation creating a object of Logical class
	 */
	@Autowired(required = true)
	User_Registration_Service logic;
	
	/*
	 * This API is used for display the From in browser
	 * URL(localhost:8080/form)
	 */
	@RequestMapping("form")
	public String form(HttpSession h)
	{
		h.setAttribute("msg", " ");
		return "form.jsp";
	}
	/*
	 * This APL is used Validate the given information
	 */
	@RequestMapping("Validation")
	public String validation(User_Registration user,HttpSession h1) {
		if(logic.nameValidation(user.getName()) && logic.emailValidation(user.getEmail()) && logic.numberValidation(user.getMobile()) && logic.checkAge(user.getDate())) {
			h1.setAttribute("msg", "User Registration successful");
			user.setDate(logic.dateFormate(user.getDate()));
			repo.save(user);
			return "form.jsp";
		}
		else {
			h1.setAttribute("msg", "User Registration unsuccessful");
			return "form.jsp";
		}
		
	}
	
	

}
