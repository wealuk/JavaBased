package com.atguigu.java;
/*
 * abstract使用上的注意点：
 * 1.abstract不能用来修饰：属性、构造器等结构(用来修饰类、方法，所以必有子类和方法的重写)
 * 
 * 2.abstract不能用来修饰私有方法、静态方法、final的方法、final类(私有方法不能重写、静态方法
 * 不属于重写、final类不能有子类，final方法也不能重写)
 * 
 * notes：abstract能使用多态，父类抽象，但 父类  = new 子类 是可以的
 * 正因为可以使用多态，抽象类(父类)的非抽象方法也是可以用的，而调用抽象类的抽象方法其实调的子类的重写
 * 
 */
public class OOPTest12 extends Person2{
	public static void main(String[] args) {
		Person2 p1 = new OOPTest12();//多态的使用
		p1.walk();
	}

	@Override
	public void walk() {
		System.out.println("走路");
	}

}
abstract class Person2{
	public abstract void walk();
}
