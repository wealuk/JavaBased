package com.atguigu.exer1;
/*
 * 创建 Account 类的一个子类 CheckAccount 代表可透支的账户，该账户中定义一个属性
overdraft 代表可透支限额。在 CheckAccount 类中重写 withdraw 方法，
如果（取款金额<账户余额），
可直接取款
如果（取款金额>账户余额），
计算需要透支的额度
判断可透支额 overdraft 是否足够支付本次透支需要，如果可以
将账户余额修改为 0，冲减可透支金额
如果不可以
提示用户超过可透支额的限额
 */
public class CheckAccount extends Account{

	private int overdraft;
	
	public CheckAccount(int id,double balance,double annualInterestRate,int overdraft){
		super(id,balance,annualInterestRate);
		this.overdraft = overdraft;
	}
	
	@Override
	public void withdraw(double amount) {
		if(getBalance() >= amount){
			//getBalance() -= amount 不行，因为改变返回的一个值，而属性balance没有改变
			//方式一
			//setBalance(getBalance() - amount);
			
			//方式二  这个常用，因为balance一般不能直接设置
			super.withdraw(amount);
		}else if(overdraft >= amount - getBalance()){
			overdraft -= amount - getBalance();//balance要在后面再清0 
			setBalance(0);
			
			//或
//			withdraw(getBalance());
		}else{
			System.out.println("超出可用额度");
		}
	}

	public int getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(int overdraft) {
		this.overdraft = overdraft;
	}

}
