package com.atguigu.exer;

public class CircleTest {
	public static void main(String[] args) {
		Circle1 c1 = new Circle1();
		
		c1.radius = 2.1;
		
		//方式一：
//		double area = c1.findArea();
//		System.out.println(area);
		
		//方式二
		//c1.findArea();
		
		//错误的调用
//		double area = findArea(3.4);
//				System.out.println(area);
	}
}

class Circle1{
	
	//属性
	double radius;
	
	//求圆的面积
	//方式一：
//	public double findArea(){
//		double area = Math.PI * radius * radius;
//		return area;
//	}
	
	//方式二：
//	public void findArea(){
//		double area = Math.PI * radius * radius;
//		System.out.println(area);
//	}
	

	//错误情况（除非把属性radius去掉）
//	public double findArea(double r){
//		double area = 3.14 * r * r;
//		return area;
//	}
}