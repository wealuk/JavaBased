package com.atguigu.exer;

public class Student extends Person{

	String major;

	public Student() {

	}

	public Student(String major) {
		this.major = major;
	}
	
	public void study(){
		System.out.println("学习,专业是" + major);
	}
	
	//对父类的eat()方法进行了重写
	//如果这里是缺省，那么就无法实现重写
	public void eat(){
		System.out.println("学生应该多吃有营养的食物");
	}
	
	//此时，由于Person类中为private所以不构成重写
	public void show(){
		System.out.println("我是一个学生");
	}
	
	//同样构成重写，String是object的子类
	public String info(){
		return null;
	}
	
//	public int info1(){
//		方法名、形参列表相同。所以视为Person类info1的重写，但是基本数据类型必须返回值类型相同
//	}
	
	public static void info2(){
		//static 修饰下已经不再构成重写
	}
	
}
