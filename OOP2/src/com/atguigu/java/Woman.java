package com.atguigu.java;
/*
 * OOPTest08的多态性使用
 */
public class Woman extends Person {

	boolean isBeauty;
	
	public void goShopping(){
		System.out.println("逛街");
	}
	
	public void eat(){
		System.out.println("减肥");
	}
	
	public void walk(){
		System.out.println("走路窈窕");
	}
}
