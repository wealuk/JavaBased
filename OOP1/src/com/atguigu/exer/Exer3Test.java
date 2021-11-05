package com.atguigu.exer;
/*3.1 编写程序，声明一个method方法，在方法中打印一个10*8 的*型矩形，
在main方法中调用该方法。

3.2 修改上一个程序，在method方法中，除打印一个10*8的*型矩形外，再
计算该矩形的面积，并将其作为方法返回值。在main方法中调用该方法，
接收返回的面积值并打印。

3.3 修改上一个程序，在method方法提供m和n两个参数，方法中打印一个
m*n的*型矩形，并计算该矩形的面积， 将其作为方法返回值。在main方法
中调用该方法，接收返回的面积值并打印。
*/
public class Exer3Test {
	public static void main(String[] args) {
		Exer3Test test = new Exer3Test();
		//3.1测试
		//test.method();
		
		//3.2测试
			//test.method();这样会打印矩阵，但不会打印出数，要么命个变量来接收，要么就像方式二直接输出方法
//		方式一：
//		int area = test.method();
//		System.out.println("面积为"+area);
		
		//方式二：
		//System.out.println(test.method());	//相当于将方式一的两步变成了一步
											//syso里面放方法，看到的是返回值故可以编译
		
		//3.3测试(与3.2一样，也有两种方式)
		int area = test.method(12, 10);
		System.out.println("面积为"+area);
	}
	//3.1
//	public void method(){
//		for(int i = 0;i<10;i++){
//			for(int j = 0;j<8;j++){
//				System.out.print("*"+"\t");
//			}
//			System.out.println();
//		}
//	}
	
	//3.2
//	public int method(){
//		for(int i = 0;i<10;i++){
//			for(int j = 0;j<8;j++){
//				System.out.print("*"+"\t");
//			}
//			System.out.println();
//		}
//		return 10*8;
//	}
	
	//3.3
	public int method(int m,int n){
		for(int i = 0;i<m;i++){
			for(int j = 0;j<n;j++){
				System.out.print("*"+"\t");
			}
			System.out.println();
		}
		return m * n;
	}
}
