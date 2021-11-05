package com.atguigu.java;
/*
 * 接口的使用
 * 1.接口使用interface来定义
 * 2.Java中，接口和类是并列的两个结构
 * 3.如何定义接口：定义接口中的成员
 * 
 * 		3.1 JDK7及以前：只能定义全局常量和抽象方法
 * 			>全局常量：public static final的，但是书写时，可以省略不写
 * 			>抽象方法：public abstract的,书写时，也可以省略
 * notes：接口中都是public，所以可以单独省略public；方法也都是抽象的，故可以单独省略abstract
 * 
 * 		3.2 	JDK8：除了定义全局常量和抽象方法之外，还可以定义静态方法和、默认方法(略)
 * 
 * 4.接口中不能定义构造器！
 * 
 * 5.Java开发中，接口通过让类去实现(implements)的方式来使用,
 * 如果实现类覆盖了接口中的所以抽象方法，则此实现类可以实例化
 * 如果实现类没有覆盖接口中的所以抽象方法，则此实现类仍为一个抽象类
 * 
 * 6.Java类可以实现多个接口----->弥补了Java单继承性的局限性
 * 		格式： class AA extends BB implements CC,DD,EE
 * 
 * 7.接口与接口之间可以继承，而且可以多继承
 * 
 * *************
 * 8.接口的具体使用，体现多态(如形参是抽象类或者接口时，因为两者都不能实例化，所有只能使用多态)
 * 9.接口，实际上可以看做是一种规范(OOPTest16)
 * 
 * 
 * notes：子类对父类是继承，类对接口是实现。同样对抽象方法的覆盖也叫实现
 * 
 * 
 * 面试题：抽象类和接口有哪些异同？
 * 相同点：不能实例化；都可以包含抽象方法
 * 不同：①把抽象类和接口的定义，内部结构解释说明
 * 		②类：单继承性		接口：多继承
 * 			类和接口：多实现
 */
public class OOPTest15 {

	public static void main(String[] args) {
		System.out.println(Flyable.MAX_SPEED);
		System.out.println(Flyable.MIN_SPEED);
//		Flyable.MIN_SPEED = 2;public static final省略了,final修饰后无法改变
		Plane plane = new Plane();
		plane.fly();
	}
}

interface Flyable{
	
	//全局常量
	public static final int MAX_SPEED = 7900;
	int MIN_SPEED = 1;//省略了public static final
	
	//抽象方法
	public abstract void fly();
	//省略了public abstract
	void stop();
	//Interfaces cannot have constructors不能有构造器
//	public Flyable(){
//		
//	}
}
interface Attackable{
	void attack();
}

class Plane implements Flyable{
	//子类对父类是继承，类对接口是实现。同样对抽象方法的覆盖也叫实现
	@Override
	public void fly() {
		System.out.println("起飞，芜湖");
	}

	@Override
	public void stop() {
		System.out.println("老司机快停下");
	}
	
}
abstract class Kite implements Flyable{
	//必须要接口中的所以抽象方法都要实现，不能无法实例化，必须用abstract修饰
	@Override
	public void fly() {
		// TODO Auto-generated method stub
	}
}
class Bullet extends Object implements Flyable,Attackable{
	//对实现的接口的所有的抽象方法实现
	@Override
	public void attack() {
	}

	@Override
	public void fly() {
	}

	@Override
	public void stop() {
	}
}
//*****************************
interface AAA{
	void method1();
}
interface BBB{
	void method2();
}
interface CCC extends AAA,BBB{
	//此时CCC中method1、method2都有了，如果有个类实现了CCC，那么就要实现method1、method2
}
