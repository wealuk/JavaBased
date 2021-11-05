package com.atguigu.java;
/*
 * 接上一个，如果参数是引用数据类型
 * 
 * 归纳下：基本数据类型的实参赋给形参，就相当于复制的操作，两者独立的。
 * 		而引用数据类型，就相当于引用数据类型的赋值（区别与复制）操作，栈的不同变量指向的堆空间相同，也就是
 * 	地址值相同的。所以引用数据类型改变的其实就是实参。
 * 
 * 冒泡排序封装的那里可以去看看ArrayUtil
 * 练习见TransferTest和passobject
 */
public class OOPTest10 {

	public static void main(String[] args) {
		Date date = new Date();//①
		date.m = 10;
		date.n = 20;
		System.out.println("m:"+date.m+"n:"+date.n);
		
		OOPTest10 test = new OOPTest10();
		test.swap(date);
		System.out.println("m:"+date.m+"n:"+date.n);//m20,n10交换成功。原本堆中有一个对象空间
	//但是有个两个栈的变量指向这个空间，一个是①的date，一个是形参的date，两者共用同一个地址值（引用数据类型
		//实参赋给形参，相当于给的地址值）。方法结束后temp，形参的date变量都出了栈。但是①的date依然
		//指向着对象。所以还可以调用①date的属性，输出的也是这个
	}//*notes：这里的话，就是将具体的对象date的地址值赋给了形参。而与基本数据类型的区别也就是在这
	public void swap(Date date){	//基本数据类型只是把实参的值赋给了形参，而引用数据类型
		int temp = date.m;			//则是将自己的地址值赋给了形参。所以形参是引用数据类型
		date.m = date.n;			//的方法，改变的就是实参本身。		可见内存图
		date.n = temp;
	}
}

class Date{
	int m;
	int n;
}