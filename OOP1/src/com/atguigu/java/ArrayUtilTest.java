package com.atguigu.java;
/*
 *对自己创的工具类的调用
 */
public class ArrayUtilTest {
	public static void main(String[] args) {
		ArrayUtil util = new ArrayUtil();
		int[] arr = new int[]{32,34,31,32,78,98,66,54,-12,-35,-74};
		System.out.println("最大值:"+util.getMax(arr));
		
//		//排序前
//		util.print(arr);
//		System.out.println();
//		//排序后
//		util.sort(arr);
//		util.print(arr);
		
		int index = util.getIndex(arr, 66);
		if(index >= 0){
			System.out.println("在"+index);
		}else {
			System.out.println("没有找到");
		}
	}
}
