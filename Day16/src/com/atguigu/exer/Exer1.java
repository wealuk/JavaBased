package com.atguigu.exer;
/*
 * 练习1：判断程序的输出结果
 */
public class Exer1 {
	static void methodA() {
		try {
			System.out.println("进入方法A");//①
			throw new RuntimeException("制造异常");//③
		} finally {
			System.out.println("用A方法的finally");//②
		}
	}

	static void methodB() {
		try {
			System.out.println("进入方法B");//④
			return;
		} finally {
			System.out.println("调用B方法的finally");//⑤
		}
	}

	public static void main(String[] args) {
		try {
			methodA();
		} catch (Exception e) {//也用到了多态，Exception e = new RuntimeException();
			System.out.println(e.getMessage());//③	//多态，调=实际调用的是子类的getMessage
		}
		methodB();
	}

}
