package com.masa;

 abstract class Animal {

	private String name;
	
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Animal(String name) {
		super();
		this.name = name;
	}
	
	
	abstract void MakeNoise();
	
	
	abstract void Eat();
	
	
	public void Sleep() {
		System.out.println(this.name+"is sleeping");
	}
}
