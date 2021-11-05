package com.atguigu.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

/*
 * 一、异常的处理：抓抛模型
 * 
 * 过程一：“抛”：程序在正常执行的过程中，一旦出现异常，就会在异常代码处生成一个对应异常类的对象
 * 				并将此对象抛出。一旦抛出对象以后，其后的代码就不再执行。
 * 
 * 			关于异常对象的产生：①系统自动生成的异常对象
 * 							  ②手动的生成一个异常对象，并抛出（throw）--->见Exception07
 * 
 * 过程二：“抓”，可以理解为异常的处理方式：①try-catch-finally  ②throws 
 * 
 * 
 * 二、try-catch-finally的使用
 * 
 * try{
 * 		//可能出现异常的代码
 * }catch(异常类型1 变量名1){
 *		//处理异常的方式1
 * }catch(异常类型2 变量名2){
 * 		//处理异常的方式2
 * }catch(异常类型3 变量名3){
 * 		//处理异常的方式3
 * }
 * .....
 * finally{
 * 		//一定执行的代码
 * }
 * 
 * 说明：
 * 1.finally是可选的
 * 2.使用try将可能出现异常代码包装起来，在执行过程中，一旦出现异常，就会生成一个对应异常的对象，
 * 根据此对象的类型，去catch中进行匹配(try中一个地方出现异常后直接跳到catch中，try
 * 异常后面的语句就不会再执行了)
 * 3.一旦try中的异常对象匹配到某一个catch时，就进入catch中进行异常的处理。一旦处理完成，就跳出
 * 当前的try-catch结构(在没有写finally的情况)。继续执行其后的代码(相当于处理了异常，可以继续运行)
 * 4.catch中的异常类型如果没有子父类关系，则谁声明在上，谁声明在下无所谓。
 * 	 catch中的异常类型如果满足子父类关系，则要求子类一定声明在父类的上面，否则，报错
 * 
 * 5.常用的异常对象处理的方式：①String getMessage()   ②void printStackTrace()
 * notes:message是异常的一个属性，在自己抛异常时可以对异常的构造器进行赋值，赋的就是message
 * 也就是要提示用户出错的原因，用getMessage()调用。printStackTrace()跟运行时异常一样，在运行
 * 时打印出错的原因(有很多红字的那个，运行时异常运行时直接有故可以不处理，编译时异常需要其打印出错误)
 * 
 * 6.在try结构中声明的变量。在出了try结构以后，就不能再被调用了。(强行要用的话，就可以将下面的
 * int num = 0;声明在try外面，然后里面只进行赋值操作)
 * 7.try-catch-finally结构可以嵌套
 * 
 * 如何看待代码中的编译时异常和运行时异常：
 * 体会1：使用try-catch-finally处理编译时异常，使得程序在编译时就不再报错，但是运行时仍可能
 * 报错。相当于我们使用try-catch-finally将一个编译时可能出现的异常，延迟到运行时出现
 * notes：try-catch-finally相当于将编译时异常延缓到了运行时异常，让其编译可以通过
 * 		但是对于运行时异常，结果都是一样的。e.printStackTrace和直接运行他们都会打印出异常原因
 * 
 * 体会2：开发中，由于运行时异常比较常见，所以我们通常就不针对运行时异常编写try-catch-finally了。
 * 		针对于编译时异常，我们说一定要考虑异常的处理
 * notes：Error是不能处理，运行时异常是能处理但没必要处理，直接运行也是报异常原因。编译时异常
 * 是必须处理
 * 
 * 
 */
public class Exception03 {

	@Test
	public void test1(){
		String str = "123";
		str = "abc";
		int num = 0;//如果要在try外使用num就需要声明在try外面，又局部变量必须初始化，try中
		try{		//可能无法确保赋值，故int num = 0;在里面只进行赋值
			num = Integer.parseInt(str);
			System.out.println("hello -- 1");
		}catch(NumberFormatException e){
			System.out.println("出现数值转换异常了，憋急");
			//打印出错的原因(异常处理)，有两种方法
			//①String getMessage();
			System.out.println(e.getMessage());//For input string: "abc"
			//②void printStackTrace()
			e.printStackTrace();
		}catch(NullPointerException e){
			System.out.println("出现了空指针异常");
		}catch(Exception e){//Exception是上面的父类，故不能放在他们的上面
			System.out.println("出现异常了");
		}
		System.out.println(num);
		System.out.println("hello -- 2");
	}
	
	@Test
	public void test2(){
		try{
			File file = new File("Hello.tex");
			FileInputStream fis = new FileInputStream(file);//hello文件不存在，会报错 
			
			int data = fis.read();
			while(data != -1){
				System.out.println((char)data);
				data = fis.read();
			}
			
			fis.close();
			
		}catch(FileNotFoundException e){//是IOException的子类
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
}
