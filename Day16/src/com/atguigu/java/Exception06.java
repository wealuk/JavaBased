package com.atguigu.java;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 方法重写的规则之一：
 * 子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型(原因见line16，其实就是防多态的影响)
 * notes：如果父类的方法没有抛异常，那么子类重写的方法也不能抛异常
 * 
 */
public class Exception06 {

	public static void main(String[] args) {
		Exception06 test = new Exception06();
		test.display(new SubClass());
		//原因就是形参是父类，所以对应的method抛出的异常也是父类的，故try-catch-finally是用来
		//处理父类的异常。而此时可以使用多态，实参可以是子类，所以使用时s.method()调用
		//的就是子类重写的方法，抛出的异常也就是子类所对应的。如果子类所抛出的异常不大于父类的
		//异常，那么仍然可以处理。如果大于父类的异常类型，那么try-catch-finally就没有匹对的异常。
		//总而言之：try-catch-finally是处理父类的异常类型。使用多态时，传进来的异常类型就是子类的
		//所以，子类的异常类型只有小于或等于父类的情况下，才可以处理异常。否则又会报错出异常
	}
	
	public void display(SuperClass s){
		try {
			s.method();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class SuperClass{
	public void method() throws IOException{
		
	}
}

class SubClass extends SuperClass{
	public void method() throws FileNotFoundException{
		
	}
}
