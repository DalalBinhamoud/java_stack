package com.dalal.web.models;

public  class Cat  extends Animal implements Pet{

	public Cat(String name, String breed, double weight) {
		super(name, breed, weight);
		// TODO Auto-generated constructor stub
	}
	
	public String showAffection() {
		
		return "your"+this.breed+"cat, " +this.name+" looked at you with someaffection. You Think";
		
	}

}
