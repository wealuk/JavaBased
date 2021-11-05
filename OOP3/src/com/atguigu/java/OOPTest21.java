package com.atguigu.java;
/*
 * 
 * 总结：成员内部类和局部内部类，在编译以后，都会生成字节码文件。
 * 		格式：成员内部类：外部类$内部类名.class
 * 			    局部内部类：外部类$数字  内部类名.class
 * 
 * 注意点：在局部内部类的方法中(比如：show) 如果调用局部内部类所声明的方法(比如method)中
 * 的局部变量(比如：num)，要求此局部变量声明为final的
 * 
 * jdk  7及之前的版本，要求此局部变量显式的声明为final
 * jdk  8及之后的版本，可以省略final的声明
 */
public class OOPTest21 {

	public void method(){
		//局部变量
		int num = 10;//省略了final
		
		class AA{
			public void show(){
//				num = 20;因为内部类和外部类是两个字节码文件，num要跨越一个文件传过来只能传一个
				System.out.println(num);//副本，所以这个值就不能修改只能调用。故为final。
			}
		}
	}
}
