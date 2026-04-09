package com.telusko.demo1;

public class Alien {

	int age ;
	private Laptop laptop = new Laptop();
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

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	public void code() {
		System.out.println("Coding");
		laptop.compile();
	}
	
}