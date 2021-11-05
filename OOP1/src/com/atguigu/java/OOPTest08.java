package com.atguigu.java;
/*
 * 
 * 关于变量的赋值：
 * 如果变量是基本数据类型，此时赋值的是变量所保存的数据值
 * 如果变量是引用数据类型，此时赋值的是变量所保存的地址值
 * 
 */
public class OOPTest08 {

		public static void main(String[] args) {
			//基本数据类型：在栈中开辟空间，传递的是数值，所以改变一个不改变另一个
			int m = 10;
			int n = m;
			System.out.println("m:"+m+"n:"+n);
			n = 20;
			System.out.println("m:"+m+"n:"+n);
			//引用数据类型：赋值后，传递的是地址值，一个改变另一个也变
			Order o1 = new Order();
			o1.orderId = 1001;
			Order o2 = o1;//o1,o2两个变量指向同一个地址值
			
			System.out.println("o1.orderId:"+o1.orderId+"o2.orderId:"+o2.orderId);
			
			o2.orderId = 1002;
			System.out.println("o1.orderId:"+o1.orderId+"o2.orderId:"+o2.orderId);
		}
}

class Order{
	int orderId;
}
