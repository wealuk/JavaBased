package com.atguigu.java;
/*
 * 数组的冒泡排序:简而言之就是从左边第一个数开始，与右边的一个数比较。使两者大的一个数在右边。
 * 以此类推，每完成一次运算，就有一个最大值在最右边。直到按从小到大的顺序排列。
 * 如果有8个元素，就要完成7次运算，每次运算依次完成7，6，5，4，3，2，1个比较。
 * 
 * 典型的还有快速排序。自己看课件数组中的sort。此内容丰富，望以后来补充。
 */
public class ArrayTest8 {
	public static void main(String[] args) {
		int[] arr = new int[]{12,23,-31,98,-65,35,-24,78};
		for(int i = 0;i < arr.length - 1;i++){
			for(int j = 0;j<arr.length - 1-i;j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			
		}
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
	}
}
