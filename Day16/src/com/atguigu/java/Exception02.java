package com.atguigu.java;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Scanner;

import org.junit.Test;

/*
 * 一、异常体系结构
 * 
 * java.lang.Throwable
 * 		|----java.lang.Error:一般不编写针对性的代码进行处理
 * 		|----java.lang.Exception:可以进行异常的处理
 * 			|-----编译时异常(checked)
 * 				|----IOException
 * 					|----FileNotFoundExceptions
 * 				|----ClassNotFoundException
 * 			|-----运行时异常(unchecked,RuntimeException)
 * 				|----NullPointerException
 * 				|----ArrayIndexOutOfBoundsException
 * 				|----ClassCastException
 * 				|----NumberFormatException
 * 				|----InputMismatchException
 * 				|----ArithmeticException
 * 
 * 
 * 面试题：常见的异常有哪些？举例说明
 * 
 */
public class Exception02 {

	//NullPointerException
	@Test
	public void test1(){
		int[] arr = null;
		System.out.println(arr[1]);
		
		String str = "abc";
		str = null;
		System.out.println(str.charAt(0));
	}
	
	//IndexOutOfBoundsException
	@Test
	public void test2(){
		//ArrayIndexOutOfBoundsException
		int[] arr = new int[10];
		System.out.println(arr[10]);
		//StringIndexOutOfBoundsException
		String str = "abc";
		System.out.println(str.charAt(3));
	}
	
	//ClassCastException
	@Test
	public void test3(){
		Object obj = new Date();
		String str = (String)obj;
	}
	
	//NumberFormatException
	@Test
	public void test4(){
		String str = "abc";
		int num = Integer.parseInt(str);
	}
	
	//InputMismatchException
	@Test
	public void test5(){
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		System.out.println(score);//如果输入的不是int类型，比如是String的。就会提示输入数据不匹配
		scan.close();
	}
	
	//ArithmeticException
	@Test
	public void test6(){
		int a = 10;
		int b = 0;
		System.out.println(a/b);//算数异常
	}
	//**********************以下是编译时异常
//	@Test
//	public void test7(){
//		File file = new File("Hello,tex");
//		FileInputStream fis = new FileInputStream(file);
//		
//		int data = fis.read();
//		while(data != -1){
//			System.out.println((char)data);
//			data = fis.read();
//		}
//		
//		fis.close();
//		
//	}
	
}
