package com.atguigu.java;

import java.util.Date;

/*
 * Object类中toString()的使用
 * 
 * 1.当我们输出一个对象的引用时，实际上就是调用当前对象的toString()  
 * notes:print方法最后调用了toString()方法，所以结果是一样的，直接输出对象，与输出对象.toString
 * 是一样的。
 * 不一样的地方是如果String s = null; 则直接输出为null, toString()为空指针异常具体看OOPTest20
 * 
 * 2.Object类中toString()的定义
 *  public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    } 
 * 
 * 3.像String、Date、File、包装类等都重写了Object类中的toString()方法
 * 	 使得在调用对象的toString()时，返回“实体内容”信息
 * 
 * 4.自定义类也可以重写toString()方法，当调用此方法时，返回对象的“实体内容” ->line77
 * 
 */
public class OOPTest15 {

	public static void main(String[] args) {
		OOPTest15 t1 = new OOPTest15("Tom",21);
		System.out.println(t1.toString());//com.atguigu.java.OOPTest15@15db9742
		System.out.println(t1);//com.atguigu.java.OOPTest15@15db9742//println调用了t1的toString方法，所以与上面相同
		//toString 重写后为OOPTest15[name = Tom , age = 21]
		
		String str = new String("MM");
		System.out.println(str);//MM,对toString方法进行了重写
		
		//notes:print方法最后调用了toString()方法,所以直接输入对象与对象.toString是同样的方法
		
		Date date = new Date(4567888L);
		System.out.println(date.toString());//Thu Jan 01 09:16:07 GMT+08:00 1970,也重写了
		
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OOPTest15 other = (OOPTest15) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	String name;
	int age;
	public OOPTest15(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//手动重写
//	@Override
//	public String toString() {
//		return "OOPTest15 [name=" + name + ", age=" + age + "]";
//	}
	
	//自动重写
	@Override
	public String toString() {
		return "OOPTest15 [name=" + name + ", age=" + age + "]";
	}
}
