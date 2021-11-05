package com.atguigu.java;

/*
 * final:最终的
 * 
 * 1.final可以用来修饰的结构：类、方法、变量
 * 
 * 2.final用来修饰一个类：此类不能被其他类所继承
 * 					比如：String类、System类、StringBuffer类
 * 
 * 3.final用来修饰方法：表明此方法不可以被重写
 * 				比如：Object类中getClass();
 * 
 * 4.final 用来修饰变量，此时的“变量”就称为是一个常量
 * 		4.1 final修饰属性：可以考虑赋值的位置有：显式初始化、代码块中初始化、构造器中初始化
 * 		notes：final修饰的属性，必须确保自己能赋到值，不能让其默认赋值。final修饰后就变成了
 * 			常量，就不能再进行赋值修改操作了。
 * 		4.2 final修饰局部变量：
 * 				尤其是使用final修饰形参时，表明此形参是一个常量。当我们调用此方法时，给常量
 * 				形参赋了一个实参。一旦赋值以后，就只能在方法体内使用此形参，但不能进行重新赋值。 	
 * notes：final修饰构造器的形参时，那么每个对象的形参都是特定的常量不能修改，可以不同
 * 
 * static final：用来修饰属性：全局常量
 */
public class OOPTest09 {

//	final int width; 默认初始化赋值不行,也就是无法进行默认初始化，同样对象.方法来赋值
					//也会先默认初始化，再赋值也不行的。
	
	final int WIDTH = 0;;//显式初始化
	final int LEFT;
	final int RIGHT;
//	final int DOWN;
	{
		LEFT = 1;	//在代码块中赋值
	}
	public OOPTest09(){
		RIGHT = 2;	//在构造器中赋值
	}
	public OOPTest09(int n){//The blank final field RIGHT may not have been initialized
		RIGHT = n;//**final修饰的属性如果是用构造器来赋值的话，那么多个构造器中每一个都需要
					//对该属性进行赋值。可以赋的不一样，但必须有赋值操作。
					//确保final修饰的在任意的构造器中能够赋到值
	}
	
//	public void setDown(int down){
//		this.DOWN = down;
//	}
	
	public void show(){
		final int NUM = 10;//常量
//		NUM += 10;无法再进行操作了
	}
	public void show(final int num){
//		num = 10;编译不通过，实参赋给形参后,final修饰的局部变量就是一个常量了。无法再进行修改
		System.out.println(num);//但可以调用
	}
	
	public static void main(String[] args) {
		OOPTest09 test = new OOPTest09();
//		test.setDown(2);无法通过对象.方法来进行final属性的赋值
//		test.RIGHT = 10;//final赋值后的属性无法进行修改
	}
	
}

final class finalA {

}

// class B extends finalA{
// final修饰的类无法继承
// }
// class C extends String{
// 同理
// }

class AA {
	public final void eat() {

	}
}

class BB extends AA {
//	public void eat() {
//无法重写final修饰的方法
//	}
}
