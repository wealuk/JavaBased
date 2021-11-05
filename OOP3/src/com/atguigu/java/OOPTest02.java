package com.atguigu.java;

/*
 * static练习：
 * 有种自动赋值的思想：将static属性放到构造器里面，每创建一个对象就会自动改变static的属性
 * ，由于static修饰的属性是共有的，所以下一个对象的该属性是在前一个属性的基础上继承的
 * 
 */
public class OOPTest02 {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		Circle c3 = new Circle(3.4);
		
		System.out.println("c1的id" + c1.getId());//1001
		System.out.println("c2的id" + c2.getId());//1002,如果init不为static那么则c2.id为1001
		System.out.println("c3的id" + c3.getId());//1003
		
		System.out.println("圆的个数：" + Circle.getTotal());
	}
}

class Circle {

	private double radius;
	private int id;//自动赋值，每创建一个对象，id就+1

	public Circle() {
		id = init++;//init为static，每创建一个对象init就默认增加1,且init被所有对象所共享
		total++;
	}
	public Circle(double radius){
		this();
//		id = init++;
//		total++;
		this.radius = radius;
	}

	private static int total;//记录创建圆的个数，自动赋值
	private static int init = 1001;//static声明的属性被所有对象所共享

	public double findArea() {
		return 3.14 * radius * radius;
	}

	
	public static int getTotal() {
		return total;
	}


	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public int getId() {
		return id;
	}

}
