package com.atguigu.java;
/*
 * 匿名对象的使用：
 * 1.理解：我们创建的对象，没有显式的赋给一个变量名，即为匿名对象
 * 2.特点：匿名对象只能调用一次
 * 3.使用：
 * 
 * 
 * notes:形参本身会在栈里面创建一个变量，如果形参是一个类，当实参是实例化的对象，那么就是
 * 把对象的地址值赋给了形参，两个变量共用一个地址值。而匿名对象则是实参开辟地址值赋给形参
 * 将形参实例化。所以方法结束后就会被销毁（形参在方法中，运行完就出栈）
 */
public class OOPTest05 {
	public static void main(String[] args) {
		//一般的对象
		Phone p1 = new Phone();
		p1.sendEmail();
		p1.playGame();
		
		//匿名
//		new Phone().sendEmail();
//		new Phone().playGame();
		
		new Phone().price = 1999;
		new Phone().showPrice();//0.0  
		
		PhoneMall mall = new PhoneMall();
//		mall.show(p1);
		//匿名对象的使用
		mall.show(new Phone());		//此时就相当于把nwe Phone()开辟的内存赋给了show形参里面的phone
	}							//也就是局部变量，此时就相当于实例化了，两个phone.方法都是指向同一个对象
}								//不会像前面一样出现0.0

class PhoneMall{
	
	public void show(Phone phone){
		//调用对象的方法的方法，故需要对象作为参数
		phone.sendEmail();
		phone.playGame();
	}
}

class Phone{
	double price;
	
	public void sendEmail(){
		System.out.println("发送邮件");
	}
	
	public void playGame(){
		System.out.println("玩游戏");
	}
	
	public void showPrice(){
		System.out.println("价格为："+price);
	}
}
