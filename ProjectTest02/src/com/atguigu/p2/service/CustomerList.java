package com.atguigu.p2.service;

import com.atguigu.p2.bean.Customer;

/**
 * 
* @Description	CustomerList为Customer对象的管理模块，
* 内部用数组管理一组Customer对象，并提供相应的添加、修改、删除和遍历方法，
* 供CustomerView调用(C)
* @author wealuk Email:2546867299@qq.com
* @version
* @date 2021年3月6日上午10:37:21
*
 */
public class CustomerList {

	private Customer[] customers;//用来保存对象的数组
	private int total;//记录已保存的对象的数量
	
	
	/**
	 * 用来初始化Customers数组的构造器
	 * @param totalCustomer
	 */
	public CustomerList(int totalCustomer) {
		customers = new Customer[totalCustomer];
	}
	/**
	 * 
	 * @Description	将指定的客户添加到数组中
	 * @author wealuk
	 * @date 2021年3月6日上午11:07:39
	 * @param customer
	 * @return	true:添加成功 false:添加失败
	 */
	public boolean addCustomer(Customer customer) {
		if(total >= customers.length){
			return false;
		}
		customers[total] = customer;
		total++;
		return true;
	}
	/**
	 * 
	 * @Description	修改指定索引位置的客户信息
	 * @author wealuk
	 * @date 2021年3月6日上午11:32:30
	 * @param index
	 * @param cust
	 * @return	true:修改成功 false:修改失败
	 */
	public boolean replaceCustomer(int index, Customer cust){
		if(index < 0 || index >= total){
			return false;
		}
		customers[index] = cust;
		return true;
	}
	/**
	 * 删除指定索引位置的客户
	 * @Description
	 * @author wealuk
	 * @date 2021年3月6日下午12:44:38
	 * @param index
	 * @return true:删除成功 false:删除失败
	 */
	public boolean deleteCustomer(int index){
		if(index < 0 || index >= total){
			return false;
		}
		//要删除一个用户，不能直接将一个数组元素变为null，因为数组是有序的。如果中间一个
		//为null，旁边都有值是不存在的。所以将后面一个值覆盖前面一个，再删除最后一个
		for(int i = index;i < total - 1;i++){
			customers[i]  =customers[i + 1];
		}
		
		//最后有数据的元素需要置空
		customers[total - 1] = null;
		total --;
		//或者customers[--total] = null;
		return true;
	}
	/**
	 * 
	 * @Description 获取所有的客户信息
	 * @author wealuk
	 * @date 2021年3月6日下午12:58:22
	 * @return
	 */
	public Customer[] getAllCustomers() {
		//不能return customers  ，因为有的元素可能为空，只要返回一个元素都初始化的数组
		Customer[] custs = new Customer[total];
		for(int i = 0;i < total;i++){
			custs[i]  = customers[i];
		}
		return custs;
	}
	/**
	 * 获取指定索引位置的客户
	 * @Description
	 * @author wealuk
	 * @date 2021年3月6日下午1:21:22
	 * @param index
	 * @return 如果找到则返回；没有则返回null
	 */
	public Customer getCustomer(int index) {
		if(index < 0 || index >= total){
			return null;
		}
		return customers[index];
	}
	/**
	 * 获取存储的客户数量
	 * @Description
	 * @author wealuk
	 * @date 2021年3月6日下午1:24:37
	 * @return
	 */
	public int getTotal(){
		return total;  //不能返回.length
	}

	
}
