package com.atguigu.java;

import org.junit.Test;

/*
 * 包装类的使用:练习面试题
 * 
 * 
 * 课后练习见下一节
 */
public class OOPTest18 {

	@Test
	public void test1(){
		Object o1 = true ? new Integer(1) : new Double(2.0);
		System.out.println(o1);
		//结果是1.0。true结果为第一个，有两个不同类型，会进行自动类型提升
	}
	
	@Test
	public void test2(){
		Object o2;
		if(true){
			o2 = new Integer(1);
		}else{
			o2 = new Double(2.0);
		}
		System.out.println(o2);//1,无需统一类型，就没有自动类型提升
	}
	
	public void method1() {
	Integer i = new Integer(1);
	Integer j = new Integer(1);
	System.out.println(i == j);//false，地址值不同
	
	//Integer内部定义了IntegerCache结构，IntegerCache中定义了Integer[],
	//保存了从-128~127范围的整数。如果我们使用自动装箱的方式，给Integer赋值的范围在
	//-128~127范围内，可以直接使用数组中的元素，不用再去new。目的：提高效率
	Integer m = 1;
	Integer n = 1;//调用的是同一个Integer[]中的同一个元素
	System.out.println(m == n);//true
	
	Integer x = 128;//超出了128，无法调用Integer[]，所以需要new一个，所以比较的是不同的地址值
	Integer y = 128;//相当于new 了一个对象
	System.out.println(x == y);//false
	}
}
