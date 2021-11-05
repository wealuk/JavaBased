package com.atguigu.contact;

public class HelloWorld {
	public static void main(String[] args) {
		method();
	}
	public static void method(){
		A a = new A();
		a.method1();
	}
}
class A{
	public void method1(){
		System.out.println("杂鱼");
	}
}
