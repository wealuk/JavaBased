package com.atguigu.java;
/*
 * abstract的使用
 * 1.abstract：抽象的
 * 2.abstract可以用来修饰的结构：类、方法
 * 
 * 3.abstract修饰类：抽象类
 * 			>此类不能实例化
 * 			>抽象类中一定有构造器，便于子类实例化时调用(涉及：子类对象实例化的全过程)
 * 			>开发中，都会提供抽象类的子类，让子类对象实例化，完成相关操作
 * 
 * 
 * 4.abstract修饰方法：抽象方法
 * 			>抽象方法只有方法的声明，没有方法体
 * 			>包含抽象方法的类，一定是一个抽象类。反之，抽象类中可以没有抽象方法的。
 *notes:抽象方法没有方法体，所以不是用来调用的。不能调用的话，就不能有该类的对象，所以abstract该类
 * 			>若子类重写了父类中的所有的抽象方法后，此子类方可实例化(直接、间接父类都要)
 * 			>若子类没有重写父类中的所有的抽象方法，此子类也是一个抽象类，需要使用abstract修饰
 * notes：抽象方法不能直接或间接的调用。所以要么子类将其重写让其可以调用；要么将该子类也也abstract
 * 化，让该子类也无法调用该抽象方法(不能让抽象方法有被调用的机会)
 * 
 * notes:比如之前的圆问题，将不规则几何体名为抽象类，求面积的方法也名为抽象的。到了子类，就会要求
 * 重写这个方法来对应自己的求面积方法。
 * 又比如父类是抽象的有计算燃料效率的抽象方法、计算行驶距离的抽象方法。而子类就是具体的车辆，
 * 就都有自己重写抽象方法对应的自己的计算方法。
 * 
 * notes1：细节点：对抽象类的抽象方法的覆盖严格意义上上不叫重写，而是对抽象方法的实现。因为
 * 抽象方法没有方法体，因叫实现。
 * 
 */
public class OOPTest11 {

	public static void main(String[] args) {
		//一旦Person1类抽象了，就不可实例化
//		Person1 p1 = new Person1();
//		p1.eat();	抽象类无法造对象
	}
}

abstract class Creature{
	public abstract void breath();
}

abstract class Person1 extends Creature{
	String name;
	int age;
	
	public Person1(){
		
	}
	public Person1(String name,int age){
		this.name = name;
		this.age = age;
	}
	//不是抽象方法
//	public void eat(){
//		
//	}
	
	//抽象方法
	public abstract void eat();
	
	public void walk(){
		System.out.println("人可以走路");
	}
}

class Student extends Person1{
	
	public Student(){
		
	}
	public Student(String name ,int age){
		super(name , age);
	}
	public void eat(){
		System.out.println("吃饭");
	}
	@Override
	public void breath() {
		//不仅要重写直接父类的抽象方法，间接父类的抽象方法也要重写
	}
}

