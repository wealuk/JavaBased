package com.atguigu.java;
/*
 * 二维数组的使用：
 * 		规定：二维数组分为外出数组的元素和内层数组的元素
 * 		int[][] arr = new int[4][3];
 * 		外层元素arr[0],arr[1]等
 * 		内层元素arr[0][0],arr[1][2]等
 * 
 * 	5.数组元素的默认初始化值
 * 针对初始化方式一：比如int[][] arr = new int[4][3];
 * 外层的初始化值为：地址值
 * 内层元素的初始化值为：与一维数组的初始化值相同
 * 
 * 针对初始化方式二：比如int[][] arr = new int[4][];
 * 外层的初始化值为：null
 * 内层初始化值：不能调用，否则报错
 * 
 * 6.数组的内存解析
 * 建议去看视频或笔记图，理解了一维数组那个这个就不难理解
 * 
 * notes：引用类型存放要么是null，要么就是地址值。String[] arr = new String[4];   arr[3] = "lbw";
 * 所以该数组lbw是在方法区的常量池里，数组arr[3]里是对应lbw的地址值。而其他没有赋值的就是null
 * 又比如String[][] arr = new String[6][5];   arr里面的六个元素都是地址值，对应有五个元素的数组，而
 * 这六个外层元素所对应的内层元素都是null，如果给其赋值了，那么就变成连接常量池的一个地址值
 * 
 */
public class ArrayTest3 {
	public static void main(String[] args) {
		int[][] arr = new int[4][3];
		System.out.println(arr[0]);//[I@15db9742	一个[，是一维数组的地址值
		System.out.println(arr[0][0]);//0
		System.out.println(arr);//[[I@6d06d69c		两个[，是二维数组的地址值
		
		//二维数组其他类型如float，String都差不多。外层元素结果都是地址值，内层元素跟一维数组默认值一样
		//前提是内层元素初始化了，若没有则是下面的情况
		String[][] arr1 = new String[4][];
		System.out.println(arr1[1]);//结果为null 并且将String类型换成别的如double，其结果也是null
									//因为数组跟String一样，属于引用数据类型，所以没赋值时默认为null
//		System.out.println(arr1[1][0]);报错，空指针异常	
	}
}
