package com.matenagy.example;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private int age;
	private transient double weight;
	
	public Person(String firstName, String lastName , int age , double weight ){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.weight = weight;
		System.out.println("A person was created : " + this.toString());
	}
	
	@Override
	public String toString(){
		return firstName + " " + lastName + " " + age + " years " + weight + " kg";
	}
	
	
}
