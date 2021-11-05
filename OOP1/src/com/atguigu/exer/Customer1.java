package com.atguigu.exer;

public class Customer1 {

	private String firstName;
	private String lastName;
	private Account1 account;	//一个类的属性是另一个类，这种两个类为关联关系
	
	public Customer1(String f,String l){
		this.firstName = f;
		this.lastName = l;
	}
	
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public void setAccount1(Account1 acct){
		this.account = acct;
	}
	public Account1 getAccount1(){
		return account;	//Customer1对象通过getAccount1可以返回account，故getAccount1().xxx
	}					//就可以调用account类中的属性和方法
	
}
