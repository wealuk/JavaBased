package com.atguigu.java;
/*
 * 将之前数组的各种运算封装成方法，方便以后调用：
 * 求数值型数组中元素的最大值、最小值、平均数、总和等
 * 数组的复制、反转、查找(线性查找、二分法查找)
 */
public class ArrayUtil {
	
	//求数组的最大值
	public int getMax(int[] arr){
		int max = arr[0];
		for(int i = 1;i<arr.length;i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		return max;
	}
	
	//求数组的最小值
	public int getMin(int[] arr){
		int min = arr[0];
		for(int i = 1;i<arr.length;i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		return min;
	}
	
	//求和
	public int getSum(int[] arr){
		int sum = 0;
		for(int i = 0;i<arr.length;i++){
			sum += arr[i];
		}
		return sum;
	}
	//求平均值
	public int getAvg(int[] arr){
		
		return getSum(arr) / arr.length;
	}
	//反转数组
	public void reverse(int[] arr){
		for(int i = 0;i<arr.length / 2;i++){
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
	}
	//复制数组
	public int[] copy(int[] arr){
		int[] arr1 = new int[arr.length];
		for(int i =0;i<arr1.length;i++){
			arr1[i] = arr[i];
		}
		return arr1;
	}
	//数组的排序(此题涉及后面09，10的形参赋值问题，将交换过程封装成方法调用)
	public void sort(int[] arr){
		for(int i = 0;i < arr.length - 1;i++){
			for(int j = 0;j<arr.length - 1-i;j++){
				if(arr[j] > arr[j+1]){
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
					
//					①swap(arr[j],arr[j+1]);
					swap(arr,j,j+1);
				}
			}
			
		}
	}
//	①public void swap(int i,int j){
//		int temp = i;
//		i = j;
//		j = temp;			这个是错误的，基本数据类型只传递数据值，原本的arr[j],arr[j+1]没变
//	}
	
	public void swap(int[] arr,int i,int j){
		int temp = arr[i];		//这个才是正确的，用到引用数据类型，直接交换数组内值
		arr[i] = arr[j];
		arr[j] = temp;
	}
	//遍历数组
	public void print(int[] arr){
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
	}
	//查找指定元素
	public int getIndex(int[] arr,int dest){
		for(int i = 0;i<arr.length;i++){
			if(dest == arr[i]){
				return i;
			}
		}
		return -1;//返回一个负数，代表没有找到
	}
}
