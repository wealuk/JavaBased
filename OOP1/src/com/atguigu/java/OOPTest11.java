package com.atguigu.java;
/*
 * 递归方法的使用：（了解）
 * 1.方法递归包含了一种隐式的循环，它会重复执行某段代码，但这种重复执
行无须循环控制。
   2.递归一定要向已知方向递归，否则这种递归就变成了无穷递归，类似于死
循环。

例1.求1~100自然数的和,以前学的有for循环+=，现在可以用递归
求n!将 + 改成*就行了

例题2.已知有一个数列：f(0) = 1,f(1) = 4,f(n+2)=2*f(n+1) + f(n),其中n是大于0
的整数，求f(10)的值。

例三
输入一个数据n，计算斐波那契数列(Fibonacci)的第n个值
1 1 2 3 5 8 13 21 34 55
规律：一个数等于前两个数之和
要求：计算斐波那契数列(Fibonacci)的第n个值，并将整个数列打印出来

例题4
汉诺塔

例题5
快排
 */
public class OOPTest11 {
	public static void main(String[] args) {
		OOPTest11 test = new OOPTest11();
		System.out.println(test.getSum(100));
		
		System.out.println(test.f(10));
	}
	//1.
	public int getSum(int n){
		if(n == 1){
			return 1;
		}else {
			return n + getSum(n-1);
		}
	}
	
	//2.
	public int f(int n){
		if(n == 0){
			return 1;
		}else if(n == 1){
			return 4;
		}else{
			return 2*f(n - 1) + f(n-2);
		}
	}
}
