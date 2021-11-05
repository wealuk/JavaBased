package com.atguigu.java;
/*
 * 注：int[] x,y[];赋值以后，x为一维数组，y为二维数组int[] x  ; int[] y[]
 * 
 * 数组中常见的算法：
 * 1. 数组元素的赋值(杨辉三角、回形数等)  >见exer中的yanghui和rectangle
   2. 求数值型数组中元素的最大值、最小值、平均数、总和等	>就在该页test4
   3. 数组的复制、反转、查找(线性查找、二分法查找) >test7
   4. 数组元素的排序算法  >test8
 */
public class ArrayTest4 {
	public static void main(String[] args) {
		/*定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，
		然后求出所有元素的最大值，最小值，和值，平均值，并输出出来。
		要求：所有随机数都是两位数。
		提示；
		[0,1) * 90 [0,90) + 10  [10,100) [10,99]
		(int)(Math.random() * 90 + 10)*/
		
		int[] arr = new int[10];
		for(int i = 0;i<arr.length;i++){
			arr[i] = (int)(Math.random() * 90 + 10);
		}
		//求最大值
		int max = arr[0];
		for(int i = 1;i<arr.length;i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		System.out.println("最大值为:"+max);
		//求最小值
		int min = arr[0];
		for(int i = 1;i<arr.length;i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		System.out.println("最小值为:"+min);
		//求和
		int sum = 0;
		for(int i = 0;i<arr.length;i++){
			sum += arr[i];
		}
		System.out.println("和为:"+sum);
		//求平均值
		int average = sum / arr.length;
		System.out.println("平均值为："+average);
	}
}
