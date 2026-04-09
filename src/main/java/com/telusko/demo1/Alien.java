package com.telusko.demo1;

public class Alien {

	int age ;
	public Alien() {
		System.out.println("Object created");
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		System.out.println("Setting age");
		this.age = age;
	}
	public void code() {
		System.out.println("Coding");
	}
	
}