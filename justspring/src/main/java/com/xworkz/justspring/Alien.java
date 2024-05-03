package com.xworkz.justspring;

public class Alien {
	Computer com;
	Bag bag;
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public Alien(int age) {
		this.age=age;
	}
//	public Alien() {
//		System.out.println("running no-arg constructor of Alien");
//	}
public Bag getBag() {
		return bag;
	}
	public void setBag(Bag bag) {
		this.bag = bag;
	}
public Computer getCom() {
		return com;
	}
	public void setCom(Computer com) {
		this.com = com;
	}
public void code() {
	System.out.println("im coding....");
	System.out.println(age);
	com.compile();
	bag.carry();
}

}
