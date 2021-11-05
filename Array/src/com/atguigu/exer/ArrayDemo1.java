package com.atguigu.exer;

import java.util.Scanner;

/*
 * 2. 从键盘读入学生成绩，找出最高分，
并输出学生成绩等级。
成绩>=最高分-10 等级为’A’
成绩>=最高分-20 等级为’B’
成绩>=最高分-30 等级为’C’
其余 等级为’D
提示：先读入学生人数，根据人数创建int数组，
存放学生成绩。
 */
public class ArrayDemo1 {
	public static void main(String[] args) {
		//1.Scanner读取学生个数
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入学生个数：");
		int i = scan.nextInt();
		//2.创造数组，存储学生成绩，动态初始化
		int[] arr = new int[i];
		//3.给数组中的元素赋值
		for(int j = 0;j<arr.length;j++){
			System.out.println("请输入第"+(j+1)+"名学生的成绩：");
			arr[j] = scan.nextInt();
		}
		//4.获取数组中元素的最大值
		int max = arr[0];
		for(int j = 1;j<arr.length;j++){
			if(arr[j]>max){
				max = arr[j];
			}
		}
		System.out.println("最高分为："+max);
		//5.根据成绩与最高分的差值，求出等级，并输出学生的成绩和等级
		char level;
		for(int j = 0;j<arr.length;j++){
			if(arr[j]>=(max-10)){
				level = 'A';
			}else if(arr[j]>=(max-20)){
				level = 'B';
			}else if(arr[j]>=(max-30)){
				level = 'C';
			}else{
				level = 'D';
			}
			System.out.println("student "+ j + " score is " + arr[j] + ",grade is " + level);
		}
		
	}
}
