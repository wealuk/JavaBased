package com.atguigu.exer;
/*
 * 编写两个类，TriAngle和TriAngleTest，其中TriAngle类中声明私有的底
边长base和高height，同时声明公共方法访问私有变量。此外，提供类
必要的构造器。另一个类中使用这些公共方法，计算三角形的面积。
 */
public class TriAngleTest {

	public static void main(String[] args) {
		//调用第一个构造器  自己设置属性
		TriAngle t1 = new TriAngle();
		t1.setBase(3.2);
		t1.setHeight(2.5);
		System.out.println(" "+t1.getBase()+" "+t1.getHeight());
		
		//调用第二个    直接构造对象时就初始化属性
		TriAngle t2 = new TriAngle(2.5, 3.6);
		System.out.println(" "+t2.getBase()+" "+t2.getHeight());
		
		
	}
	
	
	
}
