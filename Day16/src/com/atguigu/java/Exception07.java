package com.atguigu.java;
/*
 * 面试题：throw和throws的区别：
 * throw表示抛出一个异常类的对象，生成异常对象的过程，声明在方法体内。
 * throws 属于异常处理的一种方式，声明在方法的声明处
 * 
 * 
 */
public class Exception07 {

	public static void main(String[] args) {
		try {
			Student s = new Student();
			s.regist(-1001);
			System.out.println(s);
		} catch (Exception e) {
//			e.printStackTrace();//打印报错原因
			System.out.println(e.getMessage());//使用自己赋值的错误提示的属性，如果在line34
		}									//没有使用构造器对Message赋值，输出的就是null
	}
}

class Student{
	private int id;
	
	public void regist(int id) throws Exception{
		if(id > 0){
			this.id = id;
		}else{
//			System.out.println("您输入的数据非法");如果不抛异常用这个的话虽然有这个
								//提示语句，但是s的输出语句仍然会执行，显示id = 0。
			//手动抛出异常对象
//			throw new RuntimeException("您输入的数据非法");//运行时异常能通过编译，故可以
					//不进行异常处理，直接在运行时报错；要使报的错好看点可以try-catch处理
			throw new Exception("您输入的数据非法");//Exception包括编译时异常故方法需要throws
													//进行异常处理
			//notes:new一个异常对象时可以使用String Message的构造器，对提示的属性进行赋值
			
			//throw new Exception08("你输入的数据不对");自定义的异常(继承的RuntimeException
			//就不需要异常处理，可以直接运行时再报异常；继承Exception必须异常处理（运行异常
			//如果为了报错的信息更美观也可以进行异常处理，在catch中修改）)
		}
	}

	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}
}