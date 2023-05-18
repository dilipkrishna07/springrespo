package com.example.user.logic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.user.repo.User_Registraion_Repo;
import com.example.user.service.User_Registration_Service;
/*
 * This class is for internal logic of the user validation of the program
 */
@Component
public class User_Registration_Logic implements User_Registration_Service {
	/*
	 * This referencer type is used access the functionality of User_Registraion_Repo interface
	 */
	@Autowired
	User_Registraion_Repo repo;
	
	@Override
	public boolean emailValidation(String email) {
		Pattern p = Pattern.compile("[a-z]{4,15}_*[0-9]*@gmail[.]com");
		Matcher m = p.matcher(email);
		if (repo.emailValidation(email) != null) {
			return false;
		}
		boolean ans = m.matches();
		return ans;
	}

	@Override
	public boolean nameValidation(String name) {
		Pattern p = Pattern.compile("[A-Z,a-z]*");
		Matcher m = p.matcher(name);
		boolean ans = m.matches();
		return ans;
	}

	@Override
	public boolean numberValidation(long number) {
		String s = "";
		s = s + number;
		Pattern p = Pattern.compile("[6-9]{1}[0-9]{9}");
		Matcher m = p.matcher(s);
		if (repo.mobileValidation(number) != null) {
			return false;
		}
		boolean ans = m.matches();
		return ans;
	}

	@Override
	public boolean checkAge(String s) {
		try {
			Date date = new SimpleDateFormat("yyyy-MM-dd").parse(s);
			Instant instant = date.toInstant();
			ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
			LocalDate date2 = zone.toLocalDate();
			Period period = Period.between(date2, LocalDate.now());
			if (period.getYears() > 21) {
				return true;
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public String dateFormate(String s) {
		Date currentformat = null;
		SimpleDateFormat format = null;
		try {
			currentformat = new SimpleDateFormat("yyyy-MM-dd").parse(s);
			format = new SimpleDateFormat("dd-MM-yyyy");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return format.format(currentformat);
	}

}
