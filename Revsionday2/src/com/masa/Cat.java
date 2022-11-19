package com.masa;

public class Cat extends Animal{
private String nickname;

public String getNickname() {
	return nickname;
}

public void setNickname(String nickname) {
	this.nickname = nickname;
}

public Cat(String nickname) {
	super("CAt");
	this.nickname = nickname;
}
public Cat() {
	// TODO Auto-generated constructor stub
}

@Override
void MakeNoise() {
	// TODO Auto-generated method stub
	System.out.println(nickname+"is making noise");
	
}

@Override
void Eat() {
	System.out.println("is eating");
	// TODO Auto-generated method stub
	
}


public void Jump() {
	System.out.println("Catis jumping");
}
}
