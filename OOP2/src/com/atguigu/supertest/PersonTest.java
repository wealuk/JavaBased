package com.atguigu.supertest;

public class PersonTest {

	public static void main(String[] args) {
		Student s = new Student();
		s.show();
		System.out.println("*********");
		s.study();
		
		Student s1 = new Student("Tom",21,"IT");//通过super调用Person构造器
		s1.show();
		
		System.out.println();
		Student s2 = new Student();//会显示Person构造器的输出语句，因为Student空参构造器
				//默认有一个super();会调用父类的空参构造器
		Student s3 = new Student("lbw");//也会调用super()
		
	}
}
