package com.atguigu.java;
/*
 * 接口的使用：
 * 1.接口使用上也满足多态性
 * 2.接口，实际上就是定义了一种规范(接口只有抽象类，子类必须重写该方法，就相当于有了规范)
 * 3.开发中，体会面向接口编程
 * 
 * notes：抽象类的匿名跟接口的匿名对象类似。两者都无法直接实例化也就是只能使用多态，用子类
 * 来进行匿名。非匿名类就是new子类/实现类；匿名类就是new抽象类/接口(){};
 */
public class OOPTest16 {
	public static void main(String[] args) {
		
		Computer com = new Computer();
		//1.创建了接口的非匿名实现类的非匿名对象
		Flash flash = new Flash();
		com.transferData(flash);//因为USB不能实例化，只能使用实现类来进行调用，体现了多态
		//2.创建了接口的非匿名实现类的匿名对象
		com.transferData(new printer());
		//3.创建了接口的匿名实现类的非匿名对象
		USB phone = new USB(){

			@Override
			public void start() {
				System.out.println("手机开始工作");
			}

			@Override
			public void stop() {
				System.out.println("手机停止工作");
			}
		
		};
		com.transferData(phone);
		
		//4.创建了接口的匿名实现类的匿名对象
		com.transferData(new USB(){

			@Override
			public void start() {
				System.out.println("mp3开始工作");
			}

			@Override
			public void stop() {
				System.out.println("mp3停止工作");
			}
			
		});
	}
}

class Computer{
	public void transferData(USB usb){//USB usb = new Flash();USB无法实例化，只能调用其实现类
//		notes：接口没有构造器无法实例化，所以接口的使用必须用到多态。
		//并且里面所调用的方法都是实现类的(实现类必定对其抽象方法进行了实现(重写))。
		usb.start();
		
		System.out.println("具体传输数据的细节");
		
		usb.stop();
	}
}

interface USB{
	//常量：定义了长、宽、高、最大最小的传输速度
	
	
	void start();
	
	void stop();
}	
class Flash implements USB{

	@Override
	public void start() {
		System.out.println("U盘开启工作");
	}

	@Override
	public void stop() {
		System.out.println("U盘结束工作");
	}
	
}

class printer implements USB{

	@Override
	public void start() {
		System.out.println("打印机开启工作");
	}

	@Override
	public void stop() {
		System.out.println("打印机结束工作");
	}
	
}