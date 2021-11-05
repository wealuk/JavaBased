package com.atguigu.java;
/*
 * 方法的重载（overload）loading...
 * 
 * 1.定义：在同一个类中，允许存在一个以上的同名方法，只要他们的参数个数或参数类型不同即可
 * 
 * 			“两个不同，一个相同”：同一个类，同一个方法名
 * 								参数列表不同：参数个数不同，参数类型不同
 * 
 * notes:权限修饰符、返回值类型必须相同，不然不是同一个方法了
 * 
 * 2.举例：
 * Arrays类中重载的sort() / binarySearch()
 * 
 * 3.判断是否重载
 * 跟方法的权限修饰符，返回值类型，形参变量名，方法体没关
 * 
 * 4.通过对象调用方法时，如何确定每一个指定的方法
 * 			方法名---->参数列表
 */
public class OOPTest06 {
	public static void main(String[] args) {
		OOPTest06 test = new OOPTest06();
		test.getSum(1, 2);//如果第一个存在就输出1，如果第一个注释掉，就输出2，double类型，进行自动类型转换
	}
	
	//如下的四个方法构成重载
	public void getSum(int i,int j){
		System.out.println("1");
	}
	
	public void getSum(double i,double j){
		System.out.println("2");
	}
	public void getSum(String s,int i){
				System.out.println("3");							//类型相同，顺序不同也可
	}
	public void getSum(int i,String s){
		System.out.println("4");
	}
	
//	public void getSum(int i,int j){
//		return 0;
//	}
//	public void getSum(int m,int n){
//		
//	}		这两个都与第一个冲突
	
//	private void getSum(int i,int j){
//		
//	}	也不行
	
//	public boolean getSum(int i,int j){
//		return true;
//	}	//不行
}
