package com.atguigu.java;
/*
 * 类的结构三：构造器（或构造方法、constructor）的使用
 * 
 * 一、构造器的作用
 * 1.创建对象
 * 2.在创建对象的同时，初始化对象的属性（比如age都是18时，就可以构造一个
 * public Person(){ age = 18}，就不需要每个都去初始化了）
 * 
 * 二、说明
 * 1.如果没有显式的定义类的构造器的话，则系统默认提供一个空参的构造器（该空参构造器的权限跟类的权限相同）
 * 2.定义构造器的格式：权限修饰符 类名(形参列表){}
 * 3.一个类中定义的多个构造器，彼此构成重载
 * 4.一旦我们显式的定义了类的构造器之后，系统将不再提供空参的构造器（也就是如果类中有至少
 * 一个构造器的时候，创建对象时就不能用Person p = new Person(); 除非类中定义了空参的构造器）
 * 5.一个类中，至少有一个构造器
 * 
 * 
 * 练习见TriAngle
 */
public class OOPTest13 {

	public static void main(String[] args) {
		//创建类的对象:  new + 构造器
		Person1 p = new Person1();
		
		p.eat();
		
		Person1 p1 = new Person1("Tom");
		System.out.println(p1.name);
	}
}

class Person1{
	//属性
	String name;
	int age;
	
	//构造器
	public Person1(){
		System.out.println("Person()....");
	}	//如果将该构造器注释，保留下面至少一个构造器时，Person1 p1 = new Person1();就会报错
		//因为我们显式的定义了类的构造器之后，系统将不再提供空参的构造器
	
	public Person1(String n){
		name = n;
		
	}
	
	public Person1(String m, int n){
		name = m;
		age = n;
	}
	
	//方法
	public void eat(){
		System.out.println("干饭");
	}
	
	public void study(){
		System.out.println("人可以学习");
	}
	
}