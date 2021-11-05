package com.atguigu.java;
/*
 * main()方法的使用说明：
 * 1.main()方法作为程序的入口
 * 2.main()方法也是一个普通的静态方法
 * 3.main()可以作为我们与控制台交互的方式。（之前，使用Scanner）
 * 
 * 第三点见下一个class
 */
public class OOPTest05 {

	public static void main(String[] args) {//入口
		Main.main(new String[100]);//Main中的main方法是静态的，可以直接在别的类用类.方法调用
		show();//静态方法无需造对象，如果是非静态则需要创对象在调用
	}
	
	public static void show(){
		
	}
}

class Main{
	public static void main(String[] args) {
		
		for(int i = 0;i < args.length;i++){
			args[i] = "args_" + i;
			System.out.println(args[i]);
		}
	}
}
