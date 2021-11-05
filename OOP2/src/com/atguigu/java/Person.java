package com.atguigu.java;
/*
 * OOPTest08的多态性使用
 */
public class Person {

	String name;
	int age;
	int id = 1001;
	
	public void eat(){
		System.out.println("人可以吃饭");
	}
	public void walk(){
		System.out.println("人可以走路");
	}
	
	
	//这后面是用于后面方法重写即OOPTest20复习所用的
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
//	public boolean equals(Object obj) {
//		if(this == obj){
//			return true;
//		}
//		
//		if(obj instanceof OOPTest13){//obj = new 实参,其实看实参是否是OOPTest13类
//			OOPTest13 test = (OOPTest13)obj;//**Object是父类，必须强转为子类，
//											//才能调用子类的属性和方法
//			//比较两个对象的每个属性是否相同
////			if(this.age == test.age && this.name.equals(test.name)){
////				return true;
////			}else{
////				return false;
////			}或
//			return this.age == test.age && this.name.equals(test.name);//String的equals()
//		}else{									//引用数据类型不能 == ，要用到重写的euqals
//			return false;	
//		}
//	}
	
	public Person() {
		super();
	}
	public Person(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}
}
