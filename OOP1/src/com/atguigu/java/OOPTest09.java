package com.atguigu.java;
/*
 * 方法的形参的传递机制：值传递
 * 
 * 1.形参：方法定义时，声明在小括号内的参数
 *   实参：方法调用时，实际传递给形参的数据
 * 
 * 2.值传递机制：
 * 2.1如果参数是基本数据类型*，此时实参赋给形参的是实参真实存储的数据值。（赋的数据值，不是地址
 * 方法形参改变，但实参是不变的。也就是实参赋给形参，形参会开辟自己的栈空间，只是值是与实参相同
 * ，但方法里面改变的是形参，实参没有变化）
 * 就比如冒泡排序，如果把相邻的两个数的交换封装成方法来调用，有两个形参变量i = arr[j], j = arr[j+1]
 * 是不行的，写法是错误的。变化的形参i，j。实际上arr[j],arr[j+1]没变
 * 2.2如果参数是引用数据类型，此时实参赋给形参的是实参存储数据的地址值
 * 
 * 要实现真正的交换看test10的引用数据类型为形参
 */
public class OOPTest09 {
	public static void main(String[] args) {
		
		int m = 10;
		int n = 20;
		
		System.out.println("m:"+m+"n:"+n);
		//交换两个变量的值的操作
//		int temp = m;
//		m = n;
//		n = temp;
		
		
		OOPTest09 test = new OOPTest09();
		test.swap(m, n);//notes：main方法里面的局部变量，方法形参都会开辟自己的空间，两个m和两个n
		//是分开的，此时实参赋给形参的是实参真实存储的数据值。而方法里面交换的是形参变量，
		//main的局部变量没有改变。所以方法运行完后就销毁了所以后面的输出语句的m，n对应的是
		//main中的局部变量		具体看内存解析
		System.out.println("m:"+m+"n:"+n);//m还是10，n为20，不是形参的m，n
	}
	public void swap(int m,int n){
		int temp = m;
		m = n;
		n = temp;
		System.out.println("m:"+m+"n:"+n);
	}
}
