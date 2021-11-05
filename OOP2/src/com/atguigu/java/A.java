package com.atguigu.java;
/*
 * 用于OOPTest05的权限修饰符修饰
 */
public class A {

	public static void main(String[] args) {
		OOPTest05 test = new OOPTest05();
		
		test.orderDefault = 1;
		test.orderProtected = 2;
		test.orderPublic = 3;
		
		test.methodDefault();
		test.methodProtected();
		test.methodPublic();
		
		//同一个包中的其他类，不可以调用OOPTest05类中的私有属性、方法。
//		test.orderPrivate = 4;
//		test.methodPrivate();
	}
}
