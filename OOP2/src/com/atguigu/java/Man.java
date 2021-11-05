package com.atguigu.java;
/*
 * OOPTest08的多态性使用
 */
public class Man extends Person{

	
	boolean isSmoking;
	int id = 1002;
	
	public void eartnMoney(){
		System.out.println("男人挣钱");
	}
	@Override
	public void eat() {
		System.out.println("男人多吃饭");
	}
	@Override
	public void walk() {
		System.out.println("男人霸气的走路");
	}
	
	public Man(String name,int age,int id) {
		super(name,age,id);
	}
	public Man(){
		
	}
}
