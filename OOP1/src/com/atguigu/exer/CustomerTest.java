package com.atguigu.exer;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer("Jane","Smith");
		Account account = new Account(100,2000,0.123);
		customer.setAccount(account);
		
		//如果一个对象1get的返回值是一个对象2，那么调用get方法后面就可以接对象2的属性和方法
		customer.getAccount().seposit(100);
		customer.getAccount().withdraw(960);
		customer.getAccount().withdraw(2000);
		
		System.out.println("Customer [" + customer.getFirstName() + "," + customer.getLastName() + "] has a account: id is " + customer.getAccount().getId() + "annualInterestRate is " + customer.getAccount().getAnnuallnterestRate()*100 + "% , balance is" + customer.getAccount().getBalance());
	}
	
	
}
