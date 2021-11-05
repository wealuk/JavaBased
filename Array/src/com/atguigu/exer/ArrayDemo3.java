package com.atguigu.exer;
/*
 * 方式一
 * notes:其实这个方法与2中的一样，也是在while里面不断转，区别就是老师的是一步步先结束for，再结束
 *while，自己的是label跳出一次外层while。所以老师的赋值要放在while里面，for的外面，与for并列作为循环体。两个方法都是用到了continue
 *有相等的就执行下一次while循环，直到满足条件才能到break;
 *demo2，3核心就是continue跳出一次while开始下一次
 *
 *其实此题部分思想与1~100的质数类似。可看质数的三个优化，有命boolean，label跳出外层循环等
 */
public class ArrayDemo3 {
	public static void main(String[] args) {
		//1.创建数组，赋值
		int[] arr = new int[6];
		for(int i =0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*30+1);
			boolean isFlag = false; 
			//2.创建一个while循环，确保在里面用arr[i]能不断与遍历的arr[0]~arr[i-1]比较
			while(true){
				for(int j = 0;j<i;j++){
					if(arr[i] == arr[j]){
						isFlag = true;
						break;
					}
				}
				if(isFlag){
					arr[i] = (int)(Math.random()*30+1);
					isFlag = false;
					continue;
				}
				break;
			}
		}
		//3.遍历打印出来
				for(int i = 0;i<arr.length;i++){
					System.out.println(arr[i]);
				}
	}
}
