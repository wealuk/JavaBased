package com.atguigu.java;
/*
 * main()可以作为我们与控制台交互的方式。（之前，使用Scanner）
 * 
 * 用法：先run as一下，让其有个字节码文件  然后run as -- run Configurations  在arguements
 * 赋参数就行了。赋参数，就相当于String[i] = 字符串,且""可以不加;是可以直接交互的。
 * --**但是都是字符串String类型的
 * 如果要转基本数据类型就要使用包装类.parseXxx()方法
 */
public class OOPTest06 {

	public static void main(String[] args) {
		
		for(int i = 0;i < args.length;i++){
			System.out.println("*******" + args[i]);
			
			int num = Integer.parseInt(args[i]);
			System.out.println("***" + num);
		}
	}
}
