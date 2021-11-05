package com.atguigu.java;
/*
 * 多态的练习：
 * OOPTest09的面试题以及这个可以看下
 */
public class OOPTest11 {

	public static void main(String[] args) {
		Base base = new Sub();
		base.add(1, 2, 3);//sub_1,子类重写的方法(没去掉最下面注释的情况下)
				//去掉最下面的注释，也是sub_1,因为运行的是base的子类重写方法，注释的方法不构成重写
						
		
		// Sub s = (Sub)base;
		// s.add(1,2,3);  重载的问题，结果是sub_2，形参列表具体，所以运行的sub_2
	}
}

class Base {
	public void add(int a, int... arr) {
		System.out.println("base");
	}
}

class Sub extends Base {

	public void add(int a, int[] arr) {//构成重写
		System.out.println("sub_1");
	}

	// public void add(int a, int b, int c) {
	// System.out.println("sub_2");
	// }
}
