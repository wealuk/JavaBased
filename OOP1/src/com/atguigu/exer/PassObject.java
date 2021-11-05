package com.atguigu.exer;
/*（1）定义一个Circle类，包含一个double型的radius属性代表圆的半径，一个
findArea()方法返回圆的面积。
（2）定义一个类PassObject，在类中定义一个方法printAreas()，该方法的定义
如下：public void printAreas(Circle c, int time)
在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。
例如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积。
（3）在main方法中调用printAreas()方法，调
用完毕后输出当前半径值。程序运行结果如图
所示。*/
public class PassObject {

	public static void main(String[] args) {
		PassObject p1 = new PassObject();
		
		Circle c = new Circle();
		p1.printAreas(c, 5);	//因为只用一次也可用匿名对象，直接p1.printArea(new Circle,5)
								//实参为对象将对象地址值赋给形参，匿名对象则是开辟地址值给形参。
		System.out.println("now the radius is "+c.radius);
	}							
	
	public void printAreas(Circle c,int time){
		System.out.println("radius\t\tarea");
		for(int i = 1;i <= time;i++){
			c.radius = i;
			System.out.println(c.radius+"\t\t"+c.findArea());
		}
		c.radius = time + 1;
	}
}
