package com.atguigu.java;

import java.sql.Connection;

//多态性的使用举例一
public class AnimalTest {

	public static void main(String[] args) {
		AnimalTest test = new AnimalTest();
		test.func(new Dog());
		
		test.func(new Cat());
	}
	
	
	public void func(Animal animal){//Animal animal = new Dog()
		animal.eat();
		animal.shout();
		if(animal instanceof Dog){//方法的多态，dog属于dog，当然也属于dog的父类animal
			System.out.println("Dog");
			System.out.println("Person");
		}
		if(animal instanceof Animal){//同类属于同类
			System.out.println("Dog");
			System.out.println("Person");
		}
		if(animal instanceof Object){//子类必属于父类
			System.out.println("Dog");
			System.out.println("Person");
		}
	}
	//没有多态性，就需要func的重载方法。将animal改为各个子类的对象(如 Dog、Cat)
	//有多态性，就可以直接调用子类的对象,省略了方法的重载
//	public void func(Dog dog){
//		dog.eat();
//		dog.shout();
//	}
}

class Animal {

	public void eat() {
		System.out.println("动物，进食");
	}

	public void shout() {
		System.out.println("动物，叫");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("狗吃骨头");
	}

	public void shout() {
		System.out.println("汪汪汪");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("猫吃鱼");
	}

	public void shout() {
		System.out.println("喵喵喵");
	}
}

//举例二：
class Order{
	public void method(Object object){
		//省略了很多方法的重载
	}
}

//举例三：
class Driver{
	public void doData(Connection conn){//conn = new MySQLCoonection() / conn = new OracleCoonection
		//规范的步骤去操作数据
//		conn.method1;
//		conn.method2;
//		conn.method3;
		
	}
}
