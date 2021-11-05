package com.atguigu.test;

import com.atguigu.java.OOPTest05;

/*
 * 用于OOPTest05的权限修饰符测试(是OOPTest05的子类--继承)
 */
public class Order extends OOPTest05{

	public void method(){
		orderProtected = 1;
		orderPublic = 2;
		
		methodProtected();
		methodPublic();
		
		//在不同包的子类中，不能使用Order类中声明的private和缺省权限的属性和方法
//		orderPrivate = 3;
//		orderDefault = 4;
//		methodPrivate();
//		methodDefault();
		
	}
	
}
