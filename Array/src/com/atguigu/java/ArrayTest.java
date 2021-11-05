package com.atguigu.java;
/**
 * 
* @Description
* @author wealuk Email:2546867299@qq.com
* @version
* @date 2021年2月2日上午11:18:30
*
* 1.数组(Array)，是多个相同类型数据按一定顺序排列
的集合，并使用一个名字命名，并通过编号的方式
对这些数据进行统一管理。

2.数组的常见概念
 数组名
 下标(或索引)
 元素
 数组的长度

3.数组的特点：①数组是有序排列的
		②数组本身是引用数据类型，而数组中的元素可以是任何数据类型，包括
基本数据类型和引用数据类型。
 		③创建数组对象会在内存中开辟一整块连续的空间，而数组名中引用的是
这块连续空间的首地址。
 		④数组的长度一旦确定，就不能修改。
 
4.数组的分类：
 按照维度：一维数组、二维数组、三维数组、…
 按照元素的数据类型分：基本数据类型元素的数组、引用数据类型元素的数组(即对
象数组)

5.一维数组的使用
	①一维数组的声明和初始化
	②如何调用数组的指定位置的元素
	③如何获取数组的长度
	④如何遍历数组
	⑤数组元素的默认初始化值
	⑥数组的内存解析
 */
public class ArrayTest {
	public static void main(String[] args) {
		//1.1静态初始化：数组的初始化和数组元素的赋值同时进行
		int[] ids = new int[]{1001,1002,1003};
		//1.2动态初始化：数组的初始化和数组元素的赋值分开进行
		String[] names = new String[5];
		
		//错误的写法
//		int[] ids1 = new int[];即没有声明长度也没有赋值
//		int[5] ids2 = new int[];前面的[]一直是空的，赋值在后面
//		int[] ids3 = new int[3]{1,2,3};同时有了长度和赋值
		
		//总结：数组一旦初始化，那么长度就是确定的
		
		//2.如何调用数组的指定位置的元素：通过角标的方式调用
		//数组的角标(索引)从0开始，到数组的长度-1结束
		names[0] = "lbw";
		names[1] = "pdd";
		names[2] = "lxy";
		names[3] = "zjl";//要再抽离字符串中的字符比如z，则.charAt(0);
		names[4] = "yy";  
		
		//3.如何获取数组的长度
		//属性length
		System.out.println(names.length);
		System.out.println(ids.length);
		
		//4.如何遍历数组 
//		System.out.println(names[0]);
//		System.out.println(names[1]);
//		System.out.println(names[2]);
//		System.out.println(names[3]);
//		System.out.println(names[4]);
		//故可以优化直接用for循环遍历0~4以此来遍历数组	notes：特别的char[] arr = new char[]{'a','b','c'}
		for(int i = 0;i<names.length;i++){				//syso(arr)  结果是abc不是地址值因为print(char[])方法中自带了遍历数组的函数
			System.out.println(names[i]);				//别的类型没有都是object。
			
		//5,6见下一个class
		}
	}
}
