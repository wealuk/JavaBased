package com.atguigu.java;
/*
 * final练习题
 * 
 * 也就是final修饰的是一个对象时，对象后是不能再创建新对象，也就是不能再将新地址值赋给它
 * 但对象里面的结构是可以改变的。就像女朋友只有一个不能改变，但其年龄是可以改变的
 */
public class OOPTest10 {
		public static void main(String[] args) {
			Other o = new Other();
			new OOPTest10().addOne(o);
		}

		public void addOne(final Other o) {
			// o = new Other();
			o.i++;//当final修饰的是一个类时，o用final修饰是一个不能修改的常量，o不能改变
		}			//也就是不能像上行的注释一样重新给其赋地址值再创建一个对象。
	}				//但是，修饰的类里面的属性是可以改变的。o.i++可以的。

	class Other {
		public int i;
	}


