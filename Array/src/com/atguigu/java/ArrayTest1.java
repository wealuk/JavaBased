package com.atguigu.java;
/*
 * ⑤。数组元素的默认初始化值(只给长度没赋值时)
 * 		>数组元素是整形：0
 * 		>浮点型：0.0
 * 		>char型：0或'\u0000',而不是'0'（底层的0，输出的形式上表示成空格的形式，但其代表的是0）
 * 		>boolean:false   notes:就像21&&22可以计算一样，将二进制0，1一个位上同时为1则为1，若
 * 							有一个不是1则为0.所以0类比于false，1类比于true
 * 
 * 		>是引用数据类型：null (但不是"null")
 * 
 * ⑥数组的内存解析
 * 1.内存分为栈(存放局部变量)，堆(new的一些，包括对象和数组)，方法区（包括常量池和静态域）
 * 2.命一个数组int[] arr = new int[]{1,2,3};
 * 				String[] arr1 = new String[4];
 * 			arr1[1] = "刘德华";		
 * 			arr1[2] = "张学友";
 * 			arr1 = new String[3];
 * 			sysout(arr1[1]);
 * int[] arr是局部变量，在栈中；而new的部分在堆中，两者通过底层位置代码联系起来，且变量只能
 * 联系一个。且arr对应的数组开始默认为0，0，0然后再改变为1，2，3。arr1也是如此。
 * 需要注意的是输出结果为null，因为在arr1再new一个时对应的代码变成了所开辟的新的内存空间，原来的
 * 就会被当成垃圾给清理掉。可参考笔记图数组内存结构
 */
public class ArrayTest1 {
	public static void main(String[] args) {
		//5.数组元素的默认初始化值
		int[] arr = new int[4];
		for(int i = 0;i<arr.length;i++){
			System.out.println(arr[i]);//0 0 0 0
		}
		short[] arr1 = new short[4];
		for(int i = 0;i<arr1.length;i++){
			System.out.println(arr1[i]);
		}
		float[] arr2 = new float[4];
		for(int i = 0;i<arr2.length;i++){
			System.out.println(arr2[i]);
		}
		char[] arr3 = new char[4];
		for(int i = 0;i<arr3.length;i++){
			System.out.println(arr3[i]);	//默认结果是0但表示的是空格
		}
		if(arr3[0] == 0){
			System.out.println("你好！");//能输出说明循环条件为true
		}
		boolean[] arr4 = new boolean[5];
		for(int i = 0;i<arr4.length;i++){
			System.out.println(arr4[i]);
		}
		String[] arr5 = new String[5];
		System.out.println(arr5[0]);
	
		if(arr5[0] == null){	//是字符串"null"就为false
			System.out.println("及你太美");
		}
		}
}
