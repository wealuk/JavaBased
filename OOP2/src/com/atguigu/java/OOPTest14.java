package com.atguigu.java;
/*
 * 若将equals的重写改为引用数据类型用== ->line35
 * 
 * 总结：重写时equals基本数据类型用==，引用数据类型用equals。否则容易出现问题。
 * 		同时如果类中存在属性是另一个类的情况下，在equals中，类.equals(类)子类的equals也需要
 * 		在子类的方法中重写。像String、Date、包装类等的equals已经重写了，无需重写，但别的类没有
 * 		重写，需要先进行该属性类的重写
 */
public class OOPTest14 {

	public static void main(String[] args) {
		String s1 = "B";
		String s2 = "B";
		System.out.println(s1 == s2);//true
		//String类中每个字符都是在常量池中。s2与s1相同，会将s1的地址值赋给s2
		
		OOPTest14 t1 = new OOPTest14("Tom" , 18);
		OOPTest14 t2 = new OOPTest14("Tom" , 18);
		System.out.println(t1.equals(t2));//true,与String常量池有关，解释看上面注解
		
		//但是如果
		String s3 = new String("B");
		System.out.println(s1 == s3);//false
		System.out.println(s1.equals(s3));//true
		//所以引用数据类型对比用==时，有的适用有的不行，所以引用数据类型用equals
	}
	
	
	String name;
	int age;
	//Customer customer
	public OOPTest14(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//equals重写(将引用数据类型的对比改为 == )
	@Override
	public boolean equals(Object obj) {
		if(this == obj){
			return true;
		}
		if(obj instanceof OOPTest14){
			OOPTest14 test = (OOPTest14)obj;
			return test.name == this.name && this.age == test.age;// && this.customer.equals(test.customer)
		}						//如果存在属性是类，且该类没有重写的equals，那么在重写的方法中
		return false;			//必须先将该类的equals重写，不然就相当于 == 。
	}
}
