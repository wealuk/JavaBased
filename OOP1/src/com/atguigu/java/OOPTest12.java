package com.atguigu.java;
/*
 * 面向对象的特征一：封装与隐藏
 * 一、问题的引入
 * 	对我们创建一个类的对象以后，我们可以通过“对象.属性”的方式，对对象的属性进行赋值，这里赋值操作
 * 要受属性的数据类型和存储范围的制约。除此之外，没有其他制约条件。但是在实际问题中，我们需要给属性
 * 赋值提供其他的限制条件。这个条件不能在属性声明前体现，我们只能通过方法进行限制条件的添加。（比如setLegs）
 * 同时我们需要避免用户再次使用"对象.属性"的方式进行赋值，则需要将属性声明为私有的(private)
 * -->针对于属性就体现了封装性
 * 
 * 二、封装性的体现：
 * 我们将类的属性私有化（private），同时，提供公共的（public）方法来获取（getXxx）和设置（setXxx）
 * 
 * 扩展：封装性的体现：① 如上    ②不对外暴露的私有方法   ③单例模式 (构造器私有化，就只有一个对象)  。。。
 * 
 * 三、封装性的体现，需要权限修饰符来配合
 * 1.Java的四种权限（从小到大）：private  缺省    protected  public 
 * 2.四种权限可以用来修饰类及类的内部结构：属性、方法、构造器、内部类。
 * 3.具体的，四种权限都可以用来修饰类的内部结构：属性、方法、构造器、内部类。（private在类中，缺省在包中，protected不同包的子类，public是项目中）
 * 					修饰类的话，只能使用 缺省 、public （缺省只能在包内用，public任何地方都可以用,跨包调用public类的话需要import，不是直接构建对象）
 * 
 * 总结封装性：Java提供四种权限修饰符来修饰类及类的内部结构，体现类及类的内部结构在被调用时的可见性大小
 */
public class OOPTest12 {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.name = "大黄";
		//a.age = 1;
	//	a.legs = 4;
		
		a.show();
		
		a.setLegs(-6);
		a.show();
	}
}

class Animal{
	String name;
	private int age;
	private int legs;//腿的个数，因为赋值要有限制条件，比如不能是负数，并且要是偶数。所以要新建方法来限制
			//并且要限制不能直接调用该属性，所以用到权限修饰符
			//总而言之，封装与隐藏就是让属性不能直接调用，并提供一个接口(setLegs)才能调用
			//堆中的属性仍然有legs，但是有权限修饰，有户无法直接调用
	//对属性的设置
	public void setLegs(int l){
		if(l >= 0 && l%2 == 0){
			legs = l;
		}else{
			legs = 0;
			//抛出一个异常（暂时未学）
		}
	}
	
	//对属性的获取
	public int getLegs(){
		return legs;	//相当于以前的syso(a.legs);现在不能调用属性了，只能通过public方法来调用
	}
	
	
	public void eat(){
		System.out.println("动物进食");
	}
	
	public void show(){
		System.out.println("name:"+name+" age:"+age+" legs:"+legs);
	}
	
	//提供关于属性的set和get方法
	public void setAge(int i){
		age = i;
	}
	public int getAge(){
		return age;
	}
}