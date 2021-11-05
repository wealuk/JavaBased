package com.atguigu.java;
/*
 * 如何自定义异常类？
 * 1.继承于现有的异常结构：RuntimeException(可以不进行异常处理)、Exception(必须进行异常处理)
 * 2.提供全局常量：serialVersionUID
 * 3.提供重载的构造器
 * 
 * 
 * 课后练习见exer
 * notes：如果在抛出的异常对象没有对Message进行赋值(构造器中),那么调用e.getMessage();输出null
 * 并且记得e.getMessage()返回一个String类型，要么接收要么直接加输出语句syso(e.getMessage())
 * 
 * e.getMessage()总之记得加输出语句，来接收String
 */
public class Exception08 extends Exception{

	static final long serialVersionUID = -3387516993124229948L;
	
	public Exception08(){
		
	}
	public Exception08(String msg){
		super(msg);
	}
}
