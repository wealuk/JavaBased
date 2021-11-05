package com.atguigu.java;
/*
 * 类的成员之四：代码块(或初始化块)
 * 
 * 1.代码块的作用：用来初始化类、对象
 * 2.代码块如果有修饰的话，只能使用static
 * 3.分类：静态代码块 vs 非静态代码块
 * 
 * 4.静态代码块
 * 		>内部可以输出语句
 * 		>随着类的加载而执行,而且只执行一次
 * 		>初始化类的信息
 * 		>如果一个类中定义了多个静态代码块，则按照声明的先后顺序执行
 * 		>静态代码块的执行要优于非静态代码块的执行
 * 		>静态代码块内只能调用静态的属性、静态的方法；不能调用非静态的结构
 * 
 * 5.非静态代码块
 * 		>内部有输出语句
 * 		>随着对象的创建而执行
 * 		>每创建一个对象，就执行一次非静态代码块
 * 		>作用：可以在创建对象时，对对象的属性等进行初始化
 * 		>如果一个类中定义了多个非静态代码块，则按照声明的先后顺序执行
 * 		>非静态代码块内能调用静态的属性、静态的方法，或非静态的属性、非静态的方法
 * 
 * 
 * 对属性可以赋值的位置：
 * ①默认初始化
 * ②显式初始化
 * ③构造器的初始化
 * ④有了对象以后，可以通过“对象.属性”或“对象.方法”的方式，进行赋值
 * ⑤在代码块内赋值			具体的运行顺序见下一个class
 * 
 * 题目见练习中的LeafTest、Son  这两个有很多要补充的知识，必看
 * 
 */
public class OOPTest07 {

	public static void main(String[] args) {
		String desc = Person.desc;//到这里时static的代码块就执行了(随着类的加载而执行)
		System.out.println(desc);
		
		Person p1 = new Person();//到这里非静态的代码块就执行了(随着对象的创建而执行)
		Person p2 = new Person();//再创建一个也会执行非static中的代码块
		System.out.println(p1.age);//在非静态代码块中初始化属性，
		
		Person.info();//前面调用过了，在调用就不会执行static的代码块(只执行一次)
		
		
		
	}
}

class Person{
	//属性
	String name;
	int age;
	static String desc = "我是一个人";
	
	//构造器
	public Person(){
		
	}
	public Person(String name , int age){
		this.name = name;
		this.age = age;
	}
	
	//static的代码块
	static{
		System.out.println("hello,static block-1");
		//调用静态结构(不能调用非静态的结构)
		desc = "我是一个爱学习的人";
		info();//可以调用静态的方法
		//不能调用非静态的结构
//		eat();无法调用非静态的方法
//		name = "Tom";无法调用非静态的属性
	}
	static{
		System.out.println("hello,static block-2");
	}
	
	//非static的代码块
	{
		System.out.println("hello,block - 1");
		//调用非静态的结构
		age = 1;
		eat();
		//调用静态结构
		info();
		desc = "你是一个爱学习的人";
		
	}
	{
		System.out.println("hello,block - 2");
	}
	
	//方法
	public void eat(){
		System.out.println("吃饭");
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	public static void info(){
		System.out.println("我是一个快乐的人");
	}
}