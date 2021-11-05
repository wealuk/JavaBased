package com.atguigu.exer;

public class Person {

	//属性
	private String name;
	private int age;
	
	//构造器
	public Person() {
		
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//get、set方法
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
	
	//方法
	public void eat(){
		System.out.println("吃饭");
	}
	
	public void walk(int distance){
		System.out.println(	"走路，走的距离是：" + distance + "公里");
		show();	//不构成重载
		eat();	//构成重载
	}
	
	private void show(){
		System.out.println("我是一个人");
	}
	
	public Object info(){
		return null;
	}
	
	public double info1(){
		return 1.0;
	}
	
	public static void info2(){
		
	}
	
}
