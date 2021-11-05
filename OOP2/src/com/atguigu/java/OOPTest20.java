package com.atguigu.java;

import org.junit.Test;

/*
 * 复习补充点：
 * 1.数组也可作为多态使用
 * 
 * 2.自动生成的equals与自己写的equals是有区别的，自己写的有问题
 * 
 */
public class OOPTest20 {

	@Test
	public void test(){
		int[] arr = new int[]{1,2,3};
		print(arr);
		System.out.println(arr.getClass());//class [I	为int类型的数组
		System.out.println(arr.getClass().getSuperclass());//class java.lang.Object
		//数组也作为Object的子类出现，可以调用Object类中声明的方法
	}
	public void print(Object obj){
		System.out.println(obj);
	}
	
	@Test
	public void test2(){
		Person p = new Person("Tom",12,1001);
		Man m = new Man("Tom",12,1001);//两者内容一样，并且Man是Person的子类
		//equals比较必须两个类是同一个级别，不能是子父类的关系
		System.out.println(p.equals(m));//用系统的为false,不是同一个类
		//自己手写的为true，obj = new Man();,Person是Man的父类，
		//所以obj instanceof Person为true
	}
	
	@Test
	public void test3(){
		String s = "Tom";
		s = null;
		System.out.println(s);//null，有保护机制，无法运行到toString()的方法
		System.out.println("***********");
		System.out.println(s.toString());//空指针异常
	}
}
