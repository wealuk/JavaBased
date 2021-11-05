package com.atguigu.exer;
/*
 * 总结：由父及子，静态先行
 * Root的静态初始化块
	Mid的静态初始化块
	Leaf的静态初始化块	1由父类到子类的静态代码块先进行
	Root的普通初始化块	
	Root的无参数的构造器	可以看出代码块比构造器先运行
	Mid的普通初始化块
	Mid的无参数的构造器
	Mid的带参数构造器，其参数值：尚硅谷
	Leaf的普通初始化块
	Leaf的构造器			2.由父类到子类依次加载其非静态代码块和构造器
 */
class Root{
	static{
		System.out.println("Root的静态初始化块");
	}
	{
		System.out.println("Root的普通初始化块");
	}
	public Root(){
		System.out.println("Root的无参数的构造器");
	}
}
class Mid extends Root{
	static{
		System.out.println("Mid的静态初始化块");
	}
	{
		System.out.println("Mid的普通初始化块");
	}
	public Mid(){
		System.out.println("Mid的无参数的构造器");
	}
	public Mid(String msg){
		//通过this调用同一类中重载的构造器
		this();
		System.out.println("Mid的带参数构造器，其参数值："
			+ msg);
	}
}
class Leaf extends Mid{
	static{
		System.out.println("Leaf的静态初始化块");
	}
	{
		System.out.println("Leaf的普通初始化块");
	}	
	public Leaf(){
		//通过super调用父类中有一个字符串参数的构造器
		super("尚硅谷");
		System.out.println("Leaf的构造器");
	}
}
public class LeafTest{
	public static void main(String[] args){
		new Leaf(); 
		//new Leaf();打开的话就不会再加载静态的代码块了
	}
}

