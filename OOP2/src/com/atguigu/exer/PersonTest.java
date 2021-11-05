package com.atguigu.exer;
/*
 * 用于重写和继承的练习
 */
public class PersonTest {

	public static void main(String[] args) {
		Student s = new Student("计算机科学与技术");
		s.eat();
		s.walk(100);//注意：调用的show是父类的(private) , 调用的eat是子类的(public)
		
		System.out.println("***********");
		s.study();
		//s.name;无法调用，虽然继承了，但是因为封装性无法调用，用s.getName()可以调用
		System.out.println(s.getName());
		
		Person p = new Person();
		//是父类的eat
		p.eat();
	}
}
