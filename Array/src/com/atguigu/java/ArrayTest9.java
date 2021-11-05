package com.atguigu.java;

import java.util.Arrays;

/*
 * java.util.Arrays:操作数组的工具类，里面定义了很多操作数组的方法
 */
public class ArrayTest9 {
	public static void main(String[] args) {
		//1.boolean equals(int[] a,int[] b)	判断两个数组是否相等。
		int[] arr = new int[]{1,2,3,4};
		int[] arr1 = new int[]{1,3,2,4};
		boolean isEquals = Arrays.equals(arr, arr1);//false
		
		//2.String toString(int[] a)	输出数组信息。
		System.out.println(Arrays.toString(arr));
		
		//3.void fill(int[] a,int val)	将指定值填充到数组之中。
		Arrays.fill(arr, 10);
		System.out.println(Arrays.toString(arr));
		
		//4.void sort(int[] a)	对数组进行排序。
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		//5.int binarySearch(int[] a,int key) 	对排序后的数组进行二分法检索指定的值。
		int[] arr2 = new int[]{-98,-34,2,34,58,79,99,210,333};
		int index = Arrays.binarySearch(arr2,210);
		//找不到就会返回一个负数
		if(index >= 0){
			System.out.println(index);
		}else {
			System.out.println("未找到");
		}
	}
}
