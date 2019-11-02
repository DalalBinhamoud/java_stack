package com.dalal.web.models;

public class Player {
	String first_name;
	String last_name;
	int age;
	
	
	public Player() {
		
	}
	public Player(String first_name,String last_name,int age) {
		
		this.first_name = first_name;
		this.last_name = last_name;
		this.age=age;
	}
	
	public void setFName(String fName) {
		this.first_name = fName;
	}
	
	public void setLName(String LName) {
		this.last_name = LName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getFName() {
		return this.first_name;
	}
	
	public String getLName() {
		return this.last_name;
	}
	
	public int getAge() {
		return this.age;
	}
	
}
