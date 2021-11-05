package com.atguigu.java;
/*使用简单数组
(1)创建一个名为ArrayTest的类，在main()方法中声明array1和array2两个变量，
他们是int[]类型的数组。
(2)使用大括号{}，把array1初始化为8个素数：2,3,5,7,11,13,17,19。
(3)显示array1的内容。
(4)赋值array2变量等于array1，修改array2中的偶索引元素，使其等于索引值
(如array[0]=0,array[2]=2)。打印出array1。

思考：array1和array2是什么关系？	地址值相同，都指向堆中的唯一数组实体
拓展：修改题目，实现array2对array1数组的复制      见test6*/
public class ArrayTest5 {
	public static void main(String[] args) {
		int[] array1,array2;
		
		array1 = new int[]{2,3,5,7,11,13,17,19};
		//显示array1的内容
		for(int i = 0;i<array1.length;i++){
			System.out.print(array1[i]+"\t");
		}
		
		//赋值		notes：不能叫做数组的复制    array2相当于array1的快捷方式，因为他们地址相同
		array2 = array1;
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
		//发现修改array2但array1的值变了。原因是赋值时，是把1的地址值付给了2，两者的地址值一样
		//所以改2就相当于改1.    所以改方式不能称之为数组的复制
	}
}
