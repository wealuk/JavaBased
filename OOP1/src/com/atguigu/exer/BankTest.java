package com.atguigu.exer;

public class BankTest {

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.addCustomer("Jane", "Smith");
		//利用了匿名对象，直接给属性account赋值。因为匿名对象是方法运行完后形参出栈了，所以创建
		//的对象空间也会被回收，但是这里对象内存空间直接赋给了属性，而属性对应的customer对象
		//没有出栈，所以对于对象的的属性是一个类，可以直接用匿名对象的方式来直接赋值
		//连续操作
		bank.getCustomer(0).setAccount1(new Account1(2000));//直接开辟一个内存空间赋给
											//属性。无需创建一个对象再将对象的地址值赋给属性
		bank.getCustomer(0).getAccount1().withdraw(500);
		
		double balance = bank.getCustomer(0).getAccount1().getBalance();
		System.out.println("客户：" + bank.getCustomer(0).getFirstName() + "的账户余额为：" + balance);
		
		System.out.println("*********");
		
		bank.addCustomer("万里", "杨");
		
		System.out.println("银行用户的个数：" + bank.getNumberOfCustomer());
	}
	
	
}
