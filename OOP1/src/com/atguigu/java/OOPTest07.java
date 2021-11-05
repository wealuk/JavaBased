package com.atguigu.java;
/*
 * 可变个数形参的方法
 * 
 * 1.JDK5.0新增的内容
 * 2.具体使用 
 * 		2.1可变个数形参的格式：  数据类型 ... 变量名
 * 		2.2当调用可变个数形参的方法时，传入的参数个数可以是0个，1个，2个。。。。。。等
 * 		2.3可变个数形参的方法与本类中方法命相同，形参不同的方法之间构成重载
 * 		2.4可变个数形参的方法与本类中方法命相同，形参相同的数组不构成重载。也就是不能共存
 * 		2.5可变个数形参在方法形参中，必须声明在末尾
 * 		2.6可变个数形参在方法形参中，最多只能声明一种可变形参
 */
public class OOPTest07 {
	public static void main(String[] args) {
		OOPTest07 test = new OOPTest07();
		test.show(12);
		test.show("hello");
		test.show("hello","world");
		test.show();
		//test.show(new String[]{"hello","world"});	数组就需要这样调用，比较麻烦了
		test.show(new String[]{"hello","world"});//依然可以运行String ... 所以当作数组来看
	}											//但基本可以省略new String
	public void show(int i){
		
	}
	
//	public void show(String s){		//因为方法名相同的，且该方法参数时确定的，如果存在的话，后面
//		System.out.println("show(String)");//可变个数形参就不会执行
//	}
	
	public void show(String ... strs){
		System.out.println("show(String ... strs)");
		
		//类似于数组，系统就将其当作数组（就是数组，就是[]变成了...）
		for(int i = 0;i<strs.length;i++){
			System.out.println(strs[i]);
		}
	}
	
//	public void show(String[] strs){
//	该方法与前面的可变个数形参不能共存，jdk5.0之前多个形参用的是数组，现在也能用，所以系统默认两个
//	}方法是相同的，不构成重载
	
	public void show(int i,String ... strs){
		//String ... 放在形参后面  不能是String ... strs ,int i
	}
}
