package com.example.user.service;

/*
 * This is a service interface it is used to achieve abstraction 
 */
public interface User_Registration_Service {
	/*
	 * This is used to validate the given Email 
	 * This checks the given email is valid or not 
	 */
	boolean emailValidation(String email);
	
	/*
	 * This is used check given name valid or not 
	 */
	public boolean nameValidation(String name);

	/*
	 * It check given mobile number valid or not
	 */
	public boolean numberValidation(long number);

	/*
	 * It check the given age is above 21 or not 
	 */
	public boolean checkAge(String s);

	/*
	 * It changes the given date format(yyyy-MM-dd) into this format(dd-MM-yyyy)
	 */
	public String dateFormate(String s);
}
