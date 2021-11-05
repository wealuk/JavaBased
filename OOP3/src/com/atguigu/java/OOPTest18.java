package com.atguigu.java;
/*
 * 
 * JDK8：除了定义全局常量和抽象方法之外，还可以定义静态方法、默认方法
 * 
 * 
 */
public class OOPTest18 {

	public static void main(String[] args) {
		
		SubClass s = new SubClass();
		
//	s.method1();
//	SubClass.method1();接口的静态方法无法被实现类以及其对象所调用
		//知识点1：接口定义的静态方法，只能通过接口来调用(只能通过接口.方法调用)
		CompareA.method1();
		//知识点2：通过实现类的对象，可以调用接口中的默认方法(类、接口.方法都不行)
		//如果实现类重写了接口的默认方法，调用时，仍然调用的是重写后的方法
//		notes：记static由接口实现，默认方法由对象实现，重写后调用的是重写的方法
		s.method2();
		//知识点3：如果子类(或实现类)继承的父类和实现的接口声明了同名同参数的方法，
		//那么子类在没有重写此方法的情况下，默认调用的是父类的同名同参数的方法-->类优先原则(前面的练习可知道属性不适用于类优先原则，不能有同名的属性，方法适用)
		//知识点4：如果实现类实现了多个接口，而这多个接口定义了同名同参数的默认方法
		//那么在实现类没有重写此方法的情况下，报错--->接口冲突
		//这就要求我们必须在实现类中重写此方法
		
		//notes:两个接口有同名同参数的默认方法是不行的，除非实现类重写了
		//一个父类、一个接口有同名同参数的默认方法是可以的，调用的是类的方法(没有重写的情况下)
		s.method3();
		
//		SubClass.method2();仅仅实现类是无法调用接口的默认方法，必须是实现类的对象
		
	}
}

interface CompareA{
	//静态方法
	public static void method1(){
		System.out.println("CompareA:北京");
	}
	//默认方法
	public default void method2(){
		System.out.println("CompareA：上海");
	}
	default void method3(){//与上面一样，public 可以省略
		System.out.println("CompareA:上海");
	}
}

//class SubClass extends SuperClass implements CompareA{
//	public void method2(){
//		System.out.println("SubClass:上海");
//	}
//}
//class SubClass implements CompareA,CompareBB{
//	public void method2(){
//		System.out.println("SubClass:上海");
//	}
//	public void method3(){//由于两个接口都有默认方法method3，所以必须重写防止接口冲突
//		System.out.println("SubClass:深圳");
//	}
//}
class SubClass extends SuperClass implements CompareA,CompareBB{
	public void method2(){
		System.out.println("SubClass:上海");
	}
	public void method3(){
		System.out.println("SubClass:深圳");
	}
	//知识点5：如何在子类(或实现类)的方法中调用父类、接口中被重写的方法
	public void myMethod(){
		method3();//调用自己定义的重写的方法
		super.method3();//调用的是父类中声明的
		//调用接口中的默认方法：接口.super.方法
		CompareA.super.method3();//只有有父类并且实现接口时才能使用
		CompareBB.super.method3();
		//CompareA.super.method2();
	}
}
class SuperClass{
	public void method3(){//与接口的method3重名
		System.out.println("SuperClass:上海");
	}
}
interface CompareBB{
	public default void method3(){
		System.out.println("CompareBB:上海");
	}
}