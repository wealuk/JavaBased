package com.atguigu.java;

import java.util.Date;

import org.junit.Test;

/*
 * Java中的JUnit单元测试
 * 
 * 步骤：
 * 1.选中当前工程 - 右键选择：build path  -  add libraries  - JUnit - 下一步
 * 
 * notes:开发中直接输入@Test然后快速修改直接导入并import了，相当于直接完成第4步
 * 
 * 2.创建Java类，进行单元测试
 * 		此时的Java类要求：①此类是public的  ②此类提供公共的无参构造器
 * 3.此类中声明单元测试方法
 * 此时的单元测试方法：方法的权限是public，没有返回值类型，没有形参
 * 
 * 4.此单元测试方法上需要声明注释：@Test，并在单元测试类中导入import org.junit.Test;
 * 
 * 5.声明好单元测试方法以后，就可以在方法体内测试相关代码
 * 6.写完代码以后，左键双击单元测试方法名，右键run as - JUnit Test
 * 
 * 
 * 说明：如果执行结果没有任何异常：绿条
 * 如果执行结果出现异常：红条
 */
public class OOPTest16 {

	int number = 10;
	
	@Test
	public void testEquals(){
		String s1 = "MM";
		String s2 = "MM";
		System.out.println(s1.equals(s2));
		
		//ClassCastException
//		Object obj = new String("GG");
//		Date date = (Date)obj;
		
		System.out.println(number);//main方法需要创建对象,单元测试方法直接查看属性
	}
	
	@Test
	public void testToString(){
		String s2 = "MM";
		System.out.println(s2.toString());
	}
}
