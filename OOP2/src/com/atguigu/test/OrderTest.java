package com.atguigu.test;

import com.atguigu.java.OOPTest05;

public class OrderTest {

	public static void main(String[] args) {
		
		OOPTest05 t = new OOPTest05();
		t.orderPublic = 1;
		t.methodPublic();
		
		//不同包下的普通类(非子类)要使用OOPTest05类，不可以调用声明为private、缺省、protected的方法和属性
		
	}
}
