package com.example.user.model;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
/*
 * This is a Entity class which creates table in database the given information
 */
@Entity
public class User_Registration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String email;
	
	
	@Column(nullable = false ,unique = true)
	private long mobile;
	@Column(nullable = false)
	private String location;
	@Column(nullable = false)
	private String date;
	@Lob
	@Column(length = 8874878)
	private byte[] doc;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public byte[] getDoc() {
		return doc;
	}
	public void setDoc(byte[] doc) {
		this.doc = doc;
	}
	
}
