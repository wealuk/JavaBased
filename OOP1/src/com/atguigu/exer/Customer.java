package com.atguigu.exer;

public class Customer {

	private String firstName;
	private String lastName;
	private Account account;//属性中有类,get就是返回account,set就是实参对象赋给形参地址值再赋给该属性
							//有类后面就可以通过customer.getAccount()来返回对象，然后通过
	public Customer(String f , String l){	//customer.getAccount().withdraw();来调用customer中
		this.firstName = f;				//account的属性和方法
		this.lastName = l;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	
}
