package com.atguigu.java;
/*
 * 编写一个类实现银行账户的概念，包含的属性有“帐号”、
 * “密 码”、“存款余额”、“利率”、“最小余额”，定义封装这些 属性的方法。账号要自动生成。
	编写主类，使用银行账户类，输入、输出3个储户的上述信息。
	考虑：哪些属性可以设计成static属性。

 * 
 */
public class OOPTest03 {

	public static void main(String[] args) {
		Account a1 = new Account();
		Account a2 = new Account("qwerty",2000);
		
		Account.setInterestRate(0.012);
		Account.setMinMoney(100);
		
		System.out.println(a1);
		System.out.println(a2);
		
		System.out.println(a1.getInterestRate());
		System.out.println(a2.getMinMoney());
		
		
	}
}
class Account{
	
	private int id;
	private String pwd = "00000";
	private double balance;
	
	private static double interestRate;
	private static double minMoney = 1.0;
	private static int init = 1001;//用于自动生成id使用
	
	public Account(){
		id = init++;
	}
	public Account(String pwd,double balance){
		id = init++;
		this.pwd = pwd;
		this.balance = balance;
	}
	
	
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public static double getInterestRate() {
		return interestRate;
	}
	public static void setInterestRate(double interestRate) {
		Account.interestRate = interestRate;//get、set方法都是类.属性 = 形参，无法用this
	}
	public static double getMinMoney() {
		return minMoney;
	}
	public static void setMinMoney(double minMoney) {
		Account.minMoney = minMoney;
	}
	public int getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
	@Override
	public String toString() {
		return "Account [pwd=" + pwd + ", balance=" + balance + "]";
	}
}
	

