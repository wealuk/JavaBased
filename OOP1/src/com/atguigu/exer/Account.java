package com.atguigu.exer;
/*
 * 1、写一个名为 Account 的类模拟账户。该类的属性和方法如下图所示。该类包括的属性：
账号 id，余额 balance，年利率 annualInterestRate；包含的方法：访问器方法（getter 和 setter
方法），取款方法 withdraw()，存款方法 deposit()。

2.a. 声明三个私有对象属性：firstName、lastName 和 account。
 b. 声明一个公有构造器，这个构造器带有两个代表对象属性的参数（f 和 l）
 c. 声明两个公有存取器来访问该对象属性，方法 getFirstName 和 getLastName 返回相应的属
性。
 d. 声明 setAccount 方法来对 account 属性赋值。
 e. 声明 getAccount 方法以获取 account 属性。

3.写一个测试程序。
（1） 创建一个 Customer ，名字叫 Jane Smith, 他有一个账号为 1000，余额为 2000 元，
年利率为 1.23％ 的账户。
（2） 对 Jane Smith 操作。
存入 100 元，再取出 960 元。再取出 2000 元。
打印出 Jane Smith 的基本信息


 */
public class Account {

	private int id;
	private double balance;
	private double annuallnterestRate;
	
	public Account(int id,double balance,double annualInterestRate){
		this.id = id;
		this.balance = balance;
		this.annuallnterestRate = annualInterestRate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnuallnterestRate() {
		return annuallnterestRate;
	}
	public void setAnnuallnterestRate(double annuallnterestRate) {
		this.annuallnterestRate = annuallnterestRate;
	}
	
	public void withdraw(double amount){
		if(this.balance >= amount){
			this.balance -= amount;
			System.out.println("成功取出："+amount);
		}else {
			System.out.println("余额不足，取款失败");
			return;
		}
	}
	public void seposit(double amount){
		if(amount >= 0){
			this.balance += amount;
			System.out.println("成功存入："+amount);
		}
	}
	
	
}
