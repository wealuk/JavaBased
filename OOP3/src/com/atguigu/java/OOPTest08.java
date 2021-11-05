package com.atguigu.java;
/*
 * 对属性可以赋值的位置：
 * ①默认初始化
 * ②显式初始化
 * ③构造器的初始化
 * ④有了对象以后，可以通过“对象.属性”或“对象.方法”的方式，进行赋值
 * ⑤在代码块内赋值	(指非静态代码块，静态代码块无法调用非静态属性所以是不能对其赋值的)
 * 
 * 执行的先后顺序：① - ②/⑤ - ③ - ④	②和⑤谁先运行看在类中谁写在前面，谁就先运行
 */
public class OOPTest08 {

	public static void main(String[] args) {
		Order1 o1 = new Order1();
		System.out.println(o1.id);
	}
}

class Order1{
	int id = 10;
	{
		id = 11;		//结果为11，如果把代码块写在前面那么就是10了
	}
}
