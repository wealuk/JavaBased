package com.atguigu.exer;
/*
 * 新思路
 * 
 */
public class ArrayDemo4 {
	public static void main(String[] args) {
		//1.赋值
		int[] arr = new int[6];
		for(int i =0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*30+1);
			//2.嵌套循环,如果相等，让i-1，重新回去执行第一步直到不相等
			for(int j = 0;j<i;j++){
				if(arr[i] == arr[j]){
					i--;
					break;
				}
			}
		}
		//3.遍历打印出来
		for(int i = 0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
