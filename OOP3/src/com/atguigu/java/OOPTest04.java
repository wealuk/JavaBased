package com.atguigu.java;
/*
 * 单例设计模式(singleton)：
 * 1.所谓的单例设计模式，就是采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例
 * 
 * 2.如何实现？
 * 	饿汉式 vs 懒汉式
 * 
 * 3.区分饿汉式和懒汉式
 * 		饿汉式：
 * 			坏处：对象加载时间过长
 * 			好处：饿汉式是线程安全的
 * 
 * 		懒汉式：
 * 			好处：延迟对象的创建
 * 			目前的写法坏处：线程不安全。--->到多线程内容时，再具体修改
 * 
 */
public class OOPTest04 {

	public static void main(String[] args) {
//		Bank b1 = new Bank();
//		Bank b2 = new Bank();
		
		Bank b1 = Bank.getInstance();
		Bank b2 = Bank.getInstance();
		
		System.out.println(b1 == b2);//true，表明b1和b2是同指向一个对象
	}
}
//饿汉式
class Bank{
	
	//1.私有化类的构造器
	private Bank(){
		
	}
	
	//2.内部创建类的对象
	//4.要求此对象也必须声明为静态的
	private static Bank instance = new Bank();
	
	//3.提供公共的静态的方法，返回类的对象
	public static Bank getInstance(){//如果是非static的那么调用该方法就要创建对象，但构造器
		return instance;	//以及istance都私有化，只有该方法可以返回对象，就无法实现。
	}						//所以就static化，直接通过类就可以调用该方法。同时静态里面只能放
							//静态属性，所以需要将instance也静态化
}	

//懒汉式
class Order{
	
	//1.私有化类的构造器
	private Order(){
		
	}
	
	//2.声明当前类对象，但没有初始化(初始化了就是饿汉式)
	//4.此对象也必须声明为static的
	private static Order instance = null;//主要区别，懒汉是用的时候造对象，饿汉开始就造了
	
	//3.声明public、static的返回当前类对象的方法
	public static Order getInstance(){
		if(instance == null){	//有多个线程时，一个线程刚进入if在条件判断中，另一个线程也进来了
			instance = new Order();//此时还为null。就会开辟两个对象
		}
		return instance;
	}
	
}
