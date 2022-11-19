package com.masa;

public class Dog extends Animal{

	
	
	private String breed;

	public Dog() {
	// TODO Auto-generated constructor stub
}
public String getBreed() {
	return breed;
}
public void setBreed(String breed) {
	this.breed = breed;
}
public Dog(String breed) {
	super("dog");
	this.breed = breed;
}
@Override
void MakeNoise() {
	// TODO Auto-generated method stub
	
}
@Override
void Eat() {
	// TODO Auto-generated method stub
	
}
public void Play() {
	System.out.println("Dog is playing");
}

}
