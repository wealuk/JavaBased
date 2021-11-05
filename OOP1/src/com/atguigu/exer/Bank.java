package com.atguigu.exer;

public class Bank {
//该题复杂在account1类作为customer的一个属性，而customer又组成数组作为bank的属性
	//是一个包含关系。
	private Customer1[] customers;
	private int numberOfCustomer;
	
	public Bank(){
		//在创建银行对象时就要将Customer的数组初始化，而不是在addCustomer中每创建一个对象就初始化一次
		//没有这个初始化，则创建对象赋给数组时就会出现空指针异常
		customers = new Customer1[10];
	}
	
	//添加客户
	public void addCustomer(String f,String l){
		Customer1 cust = new Customer1(f , l);//方法运行完对象就出栈了，但它的数据却保存在数组里面了，所以可以重复一直创建这一个对象
		customers[numberOfCustomer] = cust;	//numberOfCustomer默认为0
		numberOfCustomer ++;
		//或者csutomers[numberOfCustomer++] = cust;
	}
	public int getNumberOfCustomer(){
		return numberOfCustomer;
	}
	public Customer1 getCustomer(int index){
		//return customers[index] 可能报异常(角标越界)
		if(index >= 0 && index < numberOfCustomer){
			return customers[index];
		}
		return null;
	}
	
}
