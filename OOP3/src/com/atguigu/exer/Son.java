package com.atguigu.exer;
/*
 * 11111111111
44444444444
77777777777		静态代码块在main之前运行
************************
22222222222
33333333333
55555555555		此时不再调用静态的代码块了
66666666666		调子类，先运行父类的非静态代码块和构造器，然后是子类
************************
22222222222
33333333333
55555555555
66666666666		同上
************************
22222222222
33333333333		调父类，调父类的非静态代码块和构造器，子类不会被调用

 */
class Father {
	static {
		System.out.println("11111111111");
	}
	{
		System.out.println("22222222222");
	}

	public Father() {
		System.out.println("33333333333");

	}

}

public class Son extends Father {
	static {
		System.out.println("44444444444");
	}
	{
		System.out.println("55555555555");
	}
	public Son() {
		System.out.println("66666666666");
	}


	public static void main(String[] args) { // 由父及子 静态先行
		System.out.println("77777777777");//在main之前就先进行了1、4的静态代码块运行因为
				//main方法也是需要类来调的，所以先有类，就会先有static的静态代码块
		System.out.println("************************");
		new Son();
		System.out.println("************************");

		new Son();
		System.out.println("************************");
		new Father();
	}

}
