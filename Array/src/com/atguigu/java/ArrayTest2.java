package com.atguigu.java;
/*
 * 二维数组的使用
 * 
 * 1.理解：对于二维数组的理解，我们可以看成是一维数组
 *	array1又作为另一个一维数组array2的元素而存
 *	在。其实，从数组底层的运行机制来看，其实没
 *	有多维数组。(简单说，就是一个数组的元素是数组(引用数据类型))
 *int[][] arr = new int[3][2]; 也就是arr在堆中开辟一个3元素的数组，而这3个元素是开辟两个元素
 *的数组，相当于有三行两列,类似于嵌套循环.
 *
 *
 *2.二维数组的使用
	①二维数组的声明和初始化
	②如何调用数组的指定位置的元素
	③如何获取数组的长度
	④如何遍历数组
	⑤数组元素的默认初始化值
	⑥数组的内存解析
 */
public class ArrayTest2 {
	public static void main(String[] args) {
		//1.二维数组的声明和初始化
		//静态初始化
		int[][] arr = new int[][]{{1,2,3},{4,5},{6,7,8}};
		//动态初始化1
		String[][] arr1 = new String[3][2];
		//动态初始化2
		String[][] arr2 = new String[3][];//里面的元素还可以初始化
		
		//错误的情况
//		String[][] arr3 = new String[][4];
//		String[4][3] arr4 = new String[][];
//		int[][] arr5 = new int[4][3]{{1,2,3},{4,5}};
		
		//算正确但不标准的
//		int[] arr5[] = new int[][]{{1,2,3},{4,5}};
//		int[] arr5[] = {{1,2,3},{4,5}};
		
		//notes:在一维初始化中，[]可以放类型前面，也可以发名字前面，如int scores[] = new int[4];
		//也行并且如果后面赋值了，也可以这样命int[] scores = {1,2,3};，把前面可以省略。但是先
		//命个int[] ids;  ids = {1,2,3};却不行，因为ids数组类型无法判断。只有在一行中才可以省略
		//二维数组也是同理，但这些都不标准。int[] ids; ids = new int[3];
		
		//2.如何调用数组的指定位置的元素
		System.out.println(arr[0][1]);//2
		System.out.println(arr1[1][1]);//null
		//System.out.println(arr2[1][0]); 出现空指针，因为arr3[]中的三个一维数组没有初始化分配内存空间
		//故可以这样
		arr2[1] = new String[4];	//把第二个数组(元素)初始化为四个长度的数组
		System.out.println(arr2[1][0]);//null
		//所以调用内层的元素就用arr[][]   外层的用arr[]就行
		
		//3.如何获取数组的长度
		System.out.println(arr.length);//3(不是8)因为二维数组只是个说法，其实其本身仍是一个
								//一维数组，只是其元素又是一维数组。所以判断长度只需要看arr对应堆中的一位数组
								//有多少个(元素),也就是int[][]的第一个括号
		//又因为其元素又是数组，所以可以获取其元素的长度
		System.out.println(arr[0].length); //3 //notes:记住arr是代表数组,arr[]是代表调用里面的元素
											//故遍历，获取长度时，使用arr.length
		
		//4.如何遍历数组
		for(int i = 0;i<arr.length;i++){
			for(int j = 0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
			//5,6见test3
		}
	}
}
