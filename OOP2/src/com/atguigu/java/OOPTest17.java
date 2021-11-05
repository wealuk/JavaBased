package com.atguigu.java;

import org.junit.Test;

/*
 * 包装类的使用：
 * 1.Java提供了8种基本数据类型对应的包装类，使得基本数据类型的变量具有类的特征
 * (Byte Short Integer Long Double Float Boolean Character-----就int - Integer,char -- Character,其他都是首字母大写没区别)
 * 2.掌握的：基本数据类型、包装类、String三者之间的相互转换
 * 
 * 
 * 总结：三者之间的转换：
 * 	基本数据类型和包装类：记自动装箱和自动拆箱就行了。
 * 并且Object obj = new Integer(1);  int i = (int)obj;可以直接自动拆箱一步到位，有多态
 * 	正因为可以Integer = 10;这样赋值了所以我们可以两者看成同一个类型来与String进行转换
 * 	基本数据类型、包装类 --> String：String.valueof(Xxx xx);因为自动装拆，Xxx用类或基本数据都是一样的
 * 	String -->基本数据类型、包装类:Xxx.parseXxx(String str);
 * 
 * 同样要转为什么类型，就调用该类型的方法。转String，就用String.valueof
 * 
 * 
 * 
 * 练习见OOPTest18
 * 
 */
public class OOPTest17 {

	
	//基本数据类型 --->包装类：调用包装类的构造器（赋给形参时要转换为包装类）
	@Test
	public void test1(){
		
		int num1 = 10;
//		System.out.println(num1.toString());基本数据类型无法调用方法
		Integer in1 = new Integer(num1);
		System.out.println(in1.toString());//10,包装类提供了重写的toString
		
		Integer in2 = new Integer("123");//记得String类型放纯数值
		System.out.println(in2.toString());//10,取出123的int数值
		
		//报异常 NumberFormatException，但boolean不会，不是true就是false
		Integer in3 = new Integer("123abc");
		System.out.println(in3.toString());//不是纯数值，无法取出int的数值
		
		Float f1 = new Float(12.3f);
		Float f2 = new Float("12.3");//想转什么结构就要符合该数值类型的条件，不能是12.3ab
		System.out.println(f1);//12.3
		System.out.println(f2);//12.3
		
		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean("true");
		System.out.println(b1);//true
		System.out.println(b2);//true
		Boolean b4 = new Boolean("True");
		System.out.println(b4);//true，忽略大小写
		
		Boolean b3 = new Boolean("true123");//不会报错，源码不是true就是flase
		System.out.println(b3);//false
		
		
		Order01 order = new Order01();
		System.out.println(order.isMale);//false，默认的
		System.out.println(order.isFemale);//null
	}
	
	//包装类 --> 基本数据类型：调用包装类的xxxValue()   （基本数据类型才能进行加减乘除）
	@Test
	public void test2(){
		Integer in1 = new Integer(12);
		
		int i1 = in1.intValue();
		System.out.println(i1 + 1);
		
		Float f1 = new Float(12.3);
		float f2 = f1.floatValue();
		System.out.println(f2 + 1);
	}
	
	/*
	 * JDK 5.0 新特性：自动装箱与自动拆箱
	 */
	@Test
	public void test3(){
		int numb1 = 10;
		method(numb1);//理论上需要将numb1转为包装类才能多态的放在形参里。但有新特性。
		
		//自动装箱：基本数据类型 --->包装类（替代了原来用构造器将基本数据类型转为包装类）
		int num2 = 10;
		Integer in1 = num2;
		
		boolean b1 = true;
		Boolean b2 = b1;//自动装箱
		
		//自动拆箱：包装类 --->基本数据类型
		System.out.println(in1.toString());
		int num3 = in1;
		
//		notes:Object obj = new Integer(1);
//		可以直接使用int i = (int)obj;同时括号里面放Integer也行
	}
	
	public void method(Object obj){
		System.out.println(obj);
	}
	
	//基本数据类型、包装类 --->String类型：调用String
	@Test
	public void test4(){
		int num1 = 10;
		//方式1：连接运算
		System.out.println(num1 + "");
		//方式2：调用String的valueOf(Xxx xxx)
		float f1 = 12.3f;
		String str2 = String.valueOf(f1);//"12.3"
		
		Double d1 = new Double(12.4);
		String str3 = String.valueOf(d1);
		System.out.println(str2);
		System.out.println(str3);
		
	}
	
	//String类型--->基本数据类型、包装类：调用包装类的parseXxx()
	@Test
	public void test5(){
		String str1 = "123";
		//错误的情况
//		int num1 = (int)str1;//不同数据类型，无法转
//		Integer in1 = (Integer)str1;//两个类无关系，无法强转
		
		//可能会报NumberFormatException,但boolean不会，因为不是true就是false
		int num2 = Integer.parseInt(str1);
		System.out.println(num2 + 1);
		
		String str2 = "true";
		boolean b1 = Boolean.parseBoolean(str2);
		System.out.println(b1);//str2 = "true1"则为false
	}
}

class Order01{
	boolean isMale;//默认为false
	Boolean isFemale;//对象，默认为null
}
