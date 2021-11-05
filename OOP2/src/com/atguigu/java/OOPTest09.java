package com.atguigu.java;

import java.util.Random;

/*
 * 虚拟方法(多态情况下)：
 * 子类中定义了与父类同名同参数的方法，在多态情况下，将此时父类的方法称为虚拟方法，父
 *类根据赋给它的不同子类对象，动态调用属于子类的该方法。这样的方法调用在编译期是无法确定的。
 *
 *编译时类型和运行时类型：
 *编译时e为Person类型，而方法的调用是在运行时确定的，
 *所以调用的是Student类 的getInfo()方法。——动态绑定
 * 
 * 方法的重载与重写：
 * 1. 二者的定义细节：重载：两同一不同，构造器也能重载；  
 * 重写：子类继承父类以后，可以对父类中同名同参数的方法，进行覆盖操作
 * 
 * 2.具体规则不同：略
 * 
 * 3. 从编译和运行的角度看：
 *重载，是指允许存在多个同名方法，而这些方法的参数不同。编译器根据方法不
 *同的参数表，对同名方法的名称做修饰。对于编译器而言，这些同名方法就成了
 *不同的方法。它们的调用地址在编译期就绑定了。Java的重载是可以包括父类
 *和子类的，即子类可以重载父类的同名不同参数的方法。
 *所以：对于重载而言，在方法调用之前，编译器就已经确定了所要调用的方法，
 *这称为“早绑定”或“静态绑定”；
 *而对于多态，只有等到方法调用的那一刻，解释运行器才会确定所要调用的具体
 *方法，这称为“晚绑定”或“动态绑定”。(重写)
 *总结：重载不表现多态性，重写表现多态性
 */
public class OOPTest09 {

	//面试题：多态是编译时行为还是运行时行为？ 运行时行为
	//证明如下：
	public static void main(String[] args) {
		int key = new Random().nextInt(3);

		System.out.println(key);

		Animal1  animal = getInstance(key);//动态的创建对象，动态绑定
		
		animal.eat();
		 
	}
	//返回不同的子类对象，从而进行动态绑定
	public static Animal1  getInstance(int key) {
		switch (key) {
		case 0:
			return new Cat1 ();
		case 1:
			return new Dog1 ();
		default:
			return new Sheep();
		}

	}
}



class Animal1  {

	protected void eat() {
		System.out.println("animal eat food");
	}
}

class Cat1  extends Animal1  {

	protected void eat() {
		System.out.println("cat eat fish");
	}
}

class Dog1  extends Animal1  {

	public void eat() {
		System.out.println("Dog eat bone");

	}

}

class Sheep  extends Animal1  {


	public void eat() {
		System.out.println("Sheep eat grass");

	}


}

	


