package com.atguigu.java;
/*
 * 拓展：修改题目，实现array2对array1数组的复制
 */
public class ArrayTest6 {
	public static void main(String[] args) {
		int[] array1,array2;
		
		array1 = new int[]{2,3,5,7,11,13,17,19};
		//显示array1的内容
		for(int i = 0;i<array1.length;i++){
			System.out.print(array1[i]+"\t");
		}
		
		//复制		重新开辟内存空间(数组)，把元素赋值相同
//		notes：此时就相当于把文件复制一份到桌面，不再是快捷方式，改变不影响另一个
		array2 = new int[array1.length];
		for(int i = 0;i<array2.length;i++){
			array2[i] = array1[i];
		}
		//修改
		for(int i = 0;i<array2.length;i++){
			if(i%2 == 0){
				array2[i] = i;
			}
		}
		//打印array1
		System.out.println();
		for(int i = 0;i<array1.length;i++){
			System.out.print(array1[i]+"\t");
		}
		
	}
}
