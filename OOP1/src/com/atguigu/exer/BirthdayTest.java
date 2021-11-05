package com.atguigu.exer;
/*.声明一个日期类型MyDate：有属性：年year,月month，日day。创建2个日期
对象，分别赋值为：你的出生日期，你对象的出生日期，并显示信息。
*/
public class BirthdayTest {
	public static void main(String[] args) {
		MyDate me = new MyDate();
		MyDate her = new MyDate();
		me.year = 2002;
		me.month = 1;
		me.day = 3;
		System.out.println(me.info("我"));
		her.year = 2012;
		her.month = 1;
		her.day = 1;
		System.out.println(her.info("我对象"));
	}
	
}

class MyDate{
	int year;
	int month;
	int day;
	
	public String info(String name){
		return name+"的出生日期为"+year+"年"+month+"月"+day+"日。";
	}
}