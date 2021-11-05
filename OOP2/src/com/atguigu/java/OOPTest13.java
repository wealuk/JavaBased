package com.atguigu.java;

import java.util.Date;

/*
 * 面试题： == 和equals()的区别
 * 
 * 一、回顾 == 的使用：
 * ==：运算符
 * 1.可以使用在基本数据类型变量和引用数据类型变量中
 * 2.如果比较的是基本数据类型，比较两个变量保存的数据是否相等(不一定要类型相同)
 * 	 如果比较的是引用数据类型，比较两个对象的地址值是否相等,即两个引用是否指向同一个对象实体
 * 补充： == 符号使用时，必须保证符号两边的变量类型一致(不是相同)，像int与Boolean无法比较
 * 
 * notes：equals两边比较的对象必须是同一个级别的，不能是子父类的关系
 * 这里我强调了很多次，在代码中我没有说明，这里的具体内容在下面的笔记以及OOPTest20的复习
 * 
 * 二、equals()方法的使用
 * 1.是一个方法，而非运算符
 * 2.只能适用于引用数据类型
 * 3.Object类equals()的定义：
 * 		public boolean equals(Object obj){
 * 				return (this == obj);
 * 		}
 * 	  说明：Object类中定义的equals()和==的作用是相同的，比较两个对象的地址值是否相同，即两个引用是否指向同一个对象实体
 * 
 * 4.像String 、Date、 File、包装类等都重写了Object类中的equals()方法,重写后，
 * 比较的不是两个引用的地址值是否相同，而是比较两个对象的“实体内容”是否相同
 * 
 * 5.通常情况下，我们自定义的类如果使用equals()的话，也通常是比较两个对象的“内容”是否相同。那么，
 * 我们就需要对Object类中的equals()进行重写     notes：instanceof后必须将object强转为该对象类
 * 重写的原则：比较两个对象的实体内容是否相同(可以自动快速重写equals)
 * 
 * notes:注意equals要求两个比较的类必须是同一个级别的，也就是不能是子父类的关系
 * 系统提供的如果不是同一个级别就会返回false，但自己手写的由于多态只要形参的类是该类的子类
 * 那么返回的也为true。这是不符合规定的，要求两个类必须是一个级别的，一个是Person另一个也要是
 * 
 * 另外重写有个细节看OOPTest14 
 */
public class OOPTest13 {

	public static void main(String[] args) {
		//基本数据类型
		int i = 10;
		int j = 10;
		double d = 10.0;
		System.out.println(i == j);//true
		System.out.println(i == d);//true,自动类型提升(不仅仅只有+才有，其他运算符也有)
		
		boolean b = true;
//		System.out.println(i == b);无法与布尔类型比较
		
		char c = 10;
		System.out.println(i == c);//true
		
		char c1 = 'A';
		char c2 = 65;
		System.out.println(c1 == c1);//true
		
		//引用数据类型
		OOPTest13 test1 = new OOPTest13("Tom",18);
		OOPTest13 test2 = new OOPTest13("Tom",18);
		System.out.println(test1 == test2);//false,不是同一个对象实体
		
		String strs1 = new String("atguigu");
		String strs2 = new String("atguigu");
		System.out.println(strs1 == strs2);//false
		
		String s1 = "B";
		String s2 = "B";
		System.out.println(s1 == s2);//true,看OOPTest14细节
		
		System.out.println("***********");
		System.out.println(test1.equals(test2));//false，equals重写后变为true  boolean java.lang.Object.equals(Object obj)
		//notes：继承的父类Object的equals方法，并且将test子类赋给了形参Object父类，体现了多态性
		//equals() 与 == 作用相同都是比较地址值		
		
		System.out.println(strs1.equals(strs2));//true，boolean java.lang.String.equals(Object anObject)
		//这里之所以是true是因为String是object的子类，对其equals方法进行了重写
							
		//不仅仅是String
		Date date1 = new Date(123456L);
		Date date2 = new Date(123456L);
		System.out.println(date1.equals(date2));//true
	}	
	
	String name;
	int age;
	public OOPTest13(String name ,int age){
		this.name = name;
		this.age = age;
	}
//	@Override //自动生成的equals重写
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		OOPTest13 other = (OOPTest13) obj;
//		if (age != other.age)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;
//	}
	
	//手动重写
	//重写的原则：比较两个对象的实体内容(即：name和age)是否相同
	@Override
	public boolean equals(Object obj) {
		if(this == obj){
			return true;
		}
		
		if(obj instanceof OOPTest13){//obj = new 实参,其实看实参是否是OOPTest13类
			OOPTest13 test = (OOPTest13)obj;//**Object是父类，必须强转为子类，
											//才能调用子类的属性和方法
			//比较两个对象的每个属性是否相同
//			if(this.age == test.age && this.name.equals(test.name)){
//				return true;
//			}else{
//				return false;
//			}或
			return this.age == test.age && this.name.equals(test.name);//String的equals()
		}else{									//引用数据类型不能 == ，要用到重写的euqals
			return false;	
		}
	}
}
