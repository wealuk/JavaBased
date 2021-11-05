package com.atguigu.exer;
/*
 *  【拓展之笔试题】
创建一个长度为6的int型数组，要求数组元素的值都在1-30之间，且是随机赋值。同时，要求
元素的值各不相同。

此题此页是我个人的想法，老师的见ArrayDemo3,4
 */
public class ArrayDemo2 {
	public static void main(String[] args) {
		
		//1.创建一个数组
		int[] arr = new int[6];
		//2.给每一个元素赋值，并且满足赋值时值与前面不同
		//2.1给元素赋值，Math.random()表示的范围是[0.0,1.0)，要转为1~30，就要乘30+1转为int类型
		for(int i =0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*30+1);//Math.random()*30一定要打括号，因为(int)Math.random == 0
			//2.2在for循环里面再嵌套一个for循环遍历一个到arr[i]前面一位的数组，进行比较
			//用while循环，如果相等重新赋值arr[i]，并且不断的在while循环里面与遍历的arr[0]~arr[i-1]比较
			//此时需要label，跳过for循环来结束一次while循环，让重新赋值的arr[i]与便利的arr[0]~arr[i-1]比较
			//直到for循环遍历完仍满足条件，while循环才会执行下个循环体break跳出while，之前不满足条件就会
			//一直重新开始while里面的循环体
			label:while(true){
				for(int j = 0;j<i;j++){		//按demo4,不需要while，如果相等i--，回去执行1
					if(arr[i] == arr[j]){
						arr[i] = (int)(Math.random()*30+1);
						continue label;
					}
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
