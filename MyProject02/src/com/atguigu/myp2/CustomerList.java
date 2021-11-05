package com.atguigu.myp2;

public class CustomerList {

	private Customer[] customers;
	private int total;//记录已保存客户对象的数量
	
	/**
	 * 初始化customers[]的长度
	 * @param totalCustomer
	 */
	public CustomerList(int totalCustomer){
		customers = new Customer[totalCustomer];
	}
	/**
	 * 添加用户
	 * @Description
	 * @author wealuk
	 * @date 2021年3月8日下午10:50:54
	 * @param customer
	 * @return true为添加成功
	 */
	public boolean addCustomer(Customer customer){
		if(total >= customers.length){
			return false;
		}
		customers[total] = customer;
		total ++;
		return true;
	}
	/**
	 * 更改用户数据
	 * @Description
	 * @author wealuk
	 * @date 2021年3月8日下午10:59:15
	 * @param index
	 * @param cust
	 * @return true为替换成功
	 */
	public boolean replaceCustomer(int index , Customer cust){
		if(index <0 || index >= total){
			return false;
		}
		customers[index] = cust;
		return true;
	}
	/**
	 * 删除索引的用户
	 * @Description
	 * @author wealuk
	 * @date 2021年3月8日下午11:02:14
	 * @param index
	 * @return true为删除成功
	 */
	public boolean deleteCustomer(int index){
		if(index < 0 || index >= total){
			return false;
		}
		for(int i = index;i < total - 1;i++){
			customers[i] = customers[i + 1];
		}
		customers[total - 1] = null;
		total --;
		return true;
	}
	/**
	 * 返回数组中记录的所有客户对象
	 * @Description
	 * @author wealuk
	 * @date 2021年3月8日下午11:17:18
	 * @return
	 */
	public Customer[] getAllCustomers(){
		Customer[] custs = new Customer[total];
		for(int i = 0;i < total;i++){
			custs[i] = customers[i];
		}
		return custs;
	}
	/**
	 * 获取索引的用户
	 * @Description
	 * @author wealuk
	 * @date 2021年3月8日下午11:22:38
	 * @param index
	 * @return
	 */
	public Customer getCustomer(int index){
		if(index < 0 || index >= total){
			return null;
		}
		return customers[index];
	}
	
}
