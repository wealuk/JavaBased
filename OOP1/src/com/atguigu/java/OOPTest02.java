package com.atguigu.java;
/*
 * 一.设计类，就是设计类的成员
 * 
 * 属性 = 成员变量 = field = 域、字段
 * 方法 = 成员方法 = 函数 = method
 * 
 * 创建类的对象 = 类的实例化 = 实例化类
 * 
 * 二.类和对象的使用(面向对象思想落地的实现)
 *  1.创建类，设计类的成员
 *  2.创建类的对象			notes:类就像是设计图纸，而对象就是将其实例化，造出来。后面通过反射可以通过对象反推出类
 *  3.通过“对象.属性”或“对象.方法”调用对象的结构
 *  
 *  三.如果创建一个类的多个对象，则每个对象都独立拥有一套类的属性。（非static的）
 *  	意味着：如果我们修改一个对象的属性a，不影响另一个对象属性a的值
 *  
 *  四.对象内存解析与数组相似，具体可去看笔记图
 */
public class OOPTest02 {
	public static void main(String[] args) {
		//创建Person类的对象
		Person p1 = new Person();
		//Scanner scan = new Scanner(System.in);
		
		//调用对象的结构：属性，方法
		//调用属性：“对象.属性”
		p1.name = "Tom";
		p1.isMale = true;
		System.out.println(p1.name);
		
		//调用方法：“对象.方法"
		p1.eat();
		p1.sleep();
		p1.talk("Chinese");
		
		Person p2 = new Person();
		System.out.println(p2.name);//null		notes:与一维数组的默认初始值一样
		System.out.println(p2.isMale);//false
		
		Person p3 = p1;	//把p1变量保存的对象地址值赋给了p3，导致p1和p3指向了堆空间中的同一对象实体
		System.out.println(p3.name);//Tom			
		p3.age = 10;
		System.out.println(p1.age);//10
	}
}


class Person{
	//属性
	String name;
	int age = 1;
	boolean isMale;
	
	//方法
	public void eat(){
		System.out.println("人可以吃饭");
	}
	
	public void sleep(){
		System.out.println("人可以睡觉");
	}
	public void talk(String language){
		System.out.println("人可以说话，使用的是"+language);
	}
}
