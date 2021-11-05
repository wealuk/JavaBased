package com.atguigu.supertest;

public class Student extends Person{

	String major;
	int id = 1002;
	
	public Student(){
		//省略了super();如果父类没有空参的构造器，那么就会报错
	}
	
	public Student(String major){
				//省略了super();因为没有显式的声明super(形参列表)或this(形参列表)
		this.major = major;
	}
	
	public Student(String name,int age,String major){
//		this.name = name;
//		this.age = age;
		super(name , age);//调用Person的构造器,不在默认提供super();
		this.major = major;
	}
	
	@Override
	public void eat() {
		System.out.println("学生多吃有营养的");
	}
	public void study(){
		System.out.println("人可以学习");
		eat();//其实是this.eat();省略this。调用的子类所重写的
		super.eat();//调用的父类eat
		super.walk();//与this.walk没啥区别调用的都是父类的walk，说区别就是this是先找
					//子类找不到再找父类，而super先找的父类
	}
	
	public void show(){
		//this.name  super.age 都一样。都调用的继承的父类的属性
		//但属性不像方法一样，属性不能被覆盖。(没有重名this 、 super可以省略)
		System.out.println("name:" + this.name + ",age:" + super.age);
		System.out.println("id:" + this.id); //两个id，这里调用的是当前子类的1002(this可以省略)
		System.out.println("id:" + super.id);//这才是调用父类的id
	}
}
