package com.dalal.web.models;

public  class Animal {
		String name;
		String breed;
		double weight;
		
		public Animal(String name, String breed,double weight) {
			this.name=name;
			this.breed=breed;
			this.weight=weight;
		}
		
		public void setName(String name) {
			this.name=name;
		}
		
		public void setBreed(String breed) {
			this.breed=breed;
		}
		
		public void setWeight(double weight) {
			this.weight=weight;
		}
		
		public String getName() {
			return this.name;
		}
		
		public String getBreed() {
			return this.breed;
		}
		public double getWeight() {
			return this.weight;
		}

}
