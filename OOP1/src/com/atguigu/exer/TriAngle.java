package com.atguigu.exer;
/*
 * 编写两个类，TriAngle和TriAngleTest，其中TriAngle类中声明私有的底
边长base和高height，同时声明公共方法访问私有变量。此外，提供类
必要的构造器。另一个类中使用这些公共方法，计算三角形的面积。
 */
public class TriAngle {

	private double base;
	private double height;
	
	public TriAngle(){
		
	}
	
	public TriAngle(double b,double h){
		base = b;
		height = h;
	}
	
	public void setBase(double n){
		base = n;
	}
	
	public double getBase(){
		return base;
	}
	
	public void setHeight(double n){
		height = n;
	}
	
	public double getHeight(){
		return height;
	}
}
