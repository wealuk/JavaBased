package com.atguigu.supertest;

public class Person {

	String name;
	int age;
	int id = 1001;
	
	public Person(){
		System.out.println("super父类无处不在");
	}
	
	public Person(String name){
		this.name = name;
	}
	
	public Person(String name,int age){
		this(name);
		this.age = age;
	}
	
	public void eat(){
		System.out.println("人，可以吃饭");
	}
	public void walk(){
		System.out.println("人走路");
	}
}
