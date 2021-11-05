package com.atguigu.java;
/*
 * this关键字的使用:
 * 1.this可以用来修饰：属性、方法、构造器
 * 
 * 2.this修饰属性和方法：
 * 		this理解为当前对象
 * 
 * 		2.1在类的方法中，我们通常使用“this.属性”或者“this.方法”，调用当前对象的属性或方法.
 * 		但是通常情况下，我们选择省略“this”。特殊情况下，如果方法形参和类的属性同名时，我们
 * 		必须显式的使用“this.变量”的方式，表明此变量是属性而非形参
 * 
 *  	2.2在类的构造器中，我们通常使用“this.属性”或者“this.方法”，调用当前正在创建对象的属性或方法.
 * 		但是通常情况下，我们选择省略“this”。特殊情况下，如果构造器形参和类的属性同名时，我们
 * 		必须显式的使用“this.变量”的方式，表明此变量是属性而非形参
 * 
 * 3.this调用构造器
 * 		①我们在类的构造器中，可以显式的使用"this(形参列表)"的方式，调用本类中指定的其他构造器
 * 		②构造器中不能通过"this(形参列表)"的方式调用自己
 * 		③如果一个类中有n个构造器，则最多有n-1构造器中使用了"this(形参列表)"
 * 		④规定："this(形参列表)"必须声明在当前构造器的首行
 * 		⑤构造器内部，最多只能声明一个"this(形参列表)"，用来调用其他构造器
 * 
 * 练习见boy and girl
 * 
 * 前面几章的综合练习见Account、Customer   以及Account1、Customer1、Bank(这个重点看)，
 * 也就是实验2可以多做几遍
 */
public class OOPTest16 {

	public static void main(String[] args) {
		Person3 p1 = new Person3();
		p1.setAge(1);
		System.out.println(p1.getAge());
		
		Person3 p2 = new Person3("lbw");
		System.out.println(p2.getName());
		
		Person3 p3 = new Person3("pdd" , 25);
		System.out.println(p3.getAge());
		System.out.println(p3.getName());
	}
	
}

class Person3{
	//属性
	private String name;
	private int age;
	
	//构造器
	public Person3(){
		System.out.println("666");
	}
	public Person3(String name){
		this();	//调用第一个构造器
		this.name = name;
	}
	public Person3(String name , int age){
		this(name);	//调用第二个构造器  形参的name赋给this中的name；this的name赋给第二个构造器的
		this.age = age;	//形参name，属性 = name。也就是属性 = 第三个构造器的形参name,相当于
	}				//第三个构造器的形参直接赋值给属性。注意这里基本数据类型也是直接赋值
					//区分于实参赋给形参的值传递机制
	//方法
	public void setName(String name ){
		this.name = name;//this表示当前对象的，因为形参和属性重名所以方法里面两个的name取就近的形参。
	}				//所以就可以用this.name来代表类中的属性
	public String getName(){
		return this.name;//this可以省略（没有重名形参）
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}
	
	public void eat(){
		System.out.println("吃饭");
		this.study();
	}
	public void study(){
		System.out.println("学习");
	}
}