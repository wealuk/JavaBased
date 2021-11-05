package com.atguigu.java;
/*
 * 抽象类的应用：模板方法的设计模式
 * 
 * 抽象类体现的就是一种模板模式的设计，抽象类作为多个子类的通用模 板，子类在抽象类的基础上
 * 进行扩展、改造，但子类总体上会保留抽象 类的行为方式.
 * 
 * 解决的问题：
 * >当功能内部一部分实现是确定的，一部分实现是不确定的。这时可以 把不确定的部分暴露出去，让子类去实现。
 * >换句话说，在软件开发中实现一个算法时，整体步骤很固定、通用， 这些步骤已经在父类中写
 *好了。但是某些部分易变，易变部分可以抽 象出来，供不同子类实现。这就是一种模板模式。
 * 
 */
public class OOPTest14 {

	public static void main(String[] args) {
		Template t = new SubTemplate();
		t.spendTime();//抽象类可以用多态的，也就是说抽象类的方法是可以调用的
	}
}

abstract class Template{
	
	//计算某段代码执行所需花费的时间
	public void spendTime(){
		long start = System.currentTimeMillis();
		
		code();//不确定的部分、易变的部分(将该部分暴露让子类去实现，所以将该方法抽象化)
		//notes：使用了多态，spendTime为父类的方法,code为抽象方法所以哪怕是在spendTime中
		//也会是调用子类所重写的
		long end = System.currentTimeMillis();
				
		System.out.println("花费的时间" + (end - start));
	}
	
	public abstract void code();
	
}

class SubTemplate extends Template{

	@Override
	public void code() {
		for(int i = 2;i <= 1000;i++){
			boolean isFlag = true;
			for(int j = 2;j <= Math.sqrt(i);j++){
				if(i % j == 0){
					isFlag = false;
					break;
				}
			}
			if(isFlag){
				System.out.println(i);
			}
		}
	}
}
