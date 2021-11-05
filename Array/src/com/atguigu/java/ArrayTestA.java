package com.atguigu.java;
/*
 * 数组常见异常：
 * 1.数组角标越界的异常
 * 2.空指针异常
 */
public class ArrayTestA {
	public static void main(String[] args) {
		//1.数组角标越界的异常ArrayIndexOutOfBoundsException
		int[] arr = new int[]{1,2,3,4};
		for(int i = 0;i<=arr.length;i++){
			System.out.println(arr[i]);
		}
		//2.空指针异常ArrayIndexOutOfBoundsException
		//情况一：
		int[] arr1 = new int[]{1,2,3};
		arr1 = null;		//数组为null的情况下，没有赋值或声明长度
		System.out.println(arr[0]);
		
		//情况二：
		int[][] arr3 = new int[4][];
		System.out.println(arr[0]);//null
//		System.out.println(arr[0][0]);//空指针
		
		//情况三：
		String[] arr4 = new String[]{"AA","BB","CC"};
		arr4[0] = null;
		System.out.println(arr4[0].toString());//空指针，null无法调用
	}
}
