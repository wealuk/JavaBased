package com.atguigu.java;
/*
 * 类的内部成员之五：内部类
 * 1.Java中允许将一个类A声明在另一个类B中，则类A就是内部类，类B称为外部类
 * 
 * 2.内部类的分类：成员内部类(静态、非静态) vs 局部内部类(方法内、代码块内、构造器内)
 * 
 * 3.成员内部类：
 * 		一方面，作为外部类的成员：
 * 					>调用外部类的结构
 * 					>可以被static修饰
 * 					>可以被四种不同的权限修饰
 * notes：外部类是不能被static修饰，且只有public和缺省两种权限修饰
 * 	
 * 		另一方面，作为一个类：
 * 					>类内可以定义属性、方法、构造器
 * 					>可以被final修饰，表示此类不能被继承。言外之意，不使用final，就可以被继承
 * 					>可以被abstract修饰，不能实例化
 * 
 * 4.关注如下的3个问题
 * 		4.1 如何实例化成员内部类的对象 -->line 28、31
 * 		4.2 如何在成员内部类中区分调用外部类的结构 -->line69
 * 		4.3 开发中局部内部类的使用 -->见OOPTest20
 * 
 */
public class OOPTest19 {
	public static void main(String[] args) {
		//创建Dog实例(静态的成员内部类)  	      将其看成外部类的一个成员，static可以用类.成员调用
		Person3.Dog dog = new Person3.Dog();
		dog.show();
		//创建Duck实例(非静态的成员内部类)		非static的成员，需要外部类实例化才能调用
//		Person3.Duck duck = new Person3.Duck();错误的，非static需要实例化，只有外部类是不行的
		Person3 p = new Person3();
		Person3.Duck duck = p.new Duck();
		duck.sing();
		
	}
}

class Person3{
	
	String name;
	int age;
	public void eat(){
		System.out.println("人：吃饭");
	}
	
	//静态成员内部类
	static class Dog{
		String name;
		int age;
		public void show(){
			System.out.println("你是真的狗");
//			eat();内部静态类中无法调用外部类的非静态方法。是Person3.this.eat()不是this.eat()
			//notes：内部类无法有跟外部类同名同参数的方法。属性可以
		}
	}
	//非静态成员内部类
	class Duck{
		String name;
		public Duck(){
			
		}
		public void sing(){
			System.out.println("我是一只压");
			eat();//调用外部类的非静态属性。Person3.this.eat();其中Person3.this省略了，不是this
			Person3.this.eat();
	//如果Duck类中有eat()的方法，那么调用的就是Duck的了，要用外部类的就需要Person3.this.eat()
		}
//		public void eat(){
//			System.out.println("信息");
//		}
		public void display(String name){
			System.out.println(name);//形参
			System.out.println(this.name);//Duck的name
			System.out.println(Person3.this.name);//Person3的name
		}
	}
	
	
	public void method(){
		//局部内部类
		class AA{
			
		}
	}
	
	{//局部内部类
		class BB{
			
		}
	}
	
	public Person3(){
		//局部内部类
		class CC{
			
		}
	}
	
	
}