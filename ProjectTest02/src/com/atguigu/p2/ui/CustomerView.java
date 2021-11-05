package com.atguigu.p2.ui;

import com.atguigu.p2.bean.Customer;
import com.atguigu.p2.service.CustomerList;
import com.atguigu.p2.util.CMUtility;

/**
 * 
 * @Description CustomerView为主模块，负责菜单的显示和处理用户操作
 * @author wealuk Email:2546867299@qq.com
 * @version
 * @date 2021年3月6日上午10:40:19
 *
 */
public class CustomerView {

	private CustomerList customerlist = new CustomerList(10);
	
//	public CustomerView(){
//		Customer customer = new Customer("星空幻语", '男', 19, "13325445887", "123@zjcqq.com");
//		customerlist.addCustomer(customer);
//	}

	/**
	 * 显示《客户信息管理软件》界面的方法
	 * 
	 * @Description
	 * @author wealuk
	 * @date 2021年3月6日下午1:42:42
	 */
	public void enterMainMenu() {

		boolean isFlag = true;
		while(isFlag){
		System.out.println("\n-----------------客户信息管理软件-----------------\n");
		System.out.println("                   1 添 加 客 户");
		System.out.println("                   2 修 改 客 户");
		System.out.println("                   3 删 除 客 户");
		System.out.println("                   4 客 户 列 表");
		System.out.println("                   5 退       出\n");
		System.out.print("                   请选择(1-5)：");
		
		char menu = CMUtility.readMenuSelection();
		switch(menu){
		case '1':
			addNewCustomer();
			break;
		case '2':
			modifyCustomer();
			break;
		case '3':
			deleteCustomer();
			break;
		case '4':
			listAllCustomers();
			break;
		case '5':
			System.out.println("确定是否退出(Y/N):");
			char isExit = CMUtility.readConfirmSelection();
			if(isExit == 'Y'){
				isFlag = false;
			}
		}
		
		}
	}

	/**
	 * 添加客户的操作
	 * 
	 * @Description
	 * @author wealuk
	 * @date 2021年3月6日下午1:40:59
	 */
	private void addNewCustomer() {
		System.out.println("---------------------添加客户---------------------");
		System.out.println("姓名：");
		String name = CMUtility.readString(10);
		System.out.println("性别：");
		char gender = CMUtility.readChar();
		System.out.println("年龄：");
		int age = CMUtility.readInt();
		System.out.println("电话:");
		String phone = CMUtility.readString(13);
		System.out.println("邮箱：");
		String eamil = CMUtility.readString(30);
		
		Customer customer = new Customer(name, gender, age, phone, eamil);
		boolean isSuccess = customerlist.addCustomer(customer);
		if(isSuccess){
			System.out.println("---------------------添加完成---------------------");
		}else{
			System.out.println("---------------------添加失败---------------------");
		}
	}

	/**
	 * 修改客户的操作
	 * 
	 * @Description
	 * @author wealuk
	 * @date 2021年3月6日下午1:41:12
	 */
	private void modifyCustomer() {
		System.out.println("---------------------修改客户---------------------");
		Customer cust;
		int number;
		for(;;){
			System.out.println("请选择待修改客户编号(-1退出)：");
			number = CMUtility.readInt();
			
			if(number == -1){
				return;
			}
			cust = customerlist.getCustomer(number - 1);
			if(cust == null){
				System.out.println("无法找到用户");
			}else{//找到了相应的客户
				break;
			}
			
		}
		//修改客户信息（for循环里面的cust、number无法在for外面使用，所以需要想别的方法,在外面声明，里面只赋值）
		System.out.println("姓名(" + cust.getName() + "):");
		String name = CMUtility.readString(10, cust.getName());
		System.out.println("性别(" + cust.getGender() + "):");
		char gender = CMUtility.readChar(cust.getGender());
		System.out.println("年龄(" + cust.getAge() + "):");
		int age = CMUtility.readInt(cust.getAge());
		System.out.println("电话(" + cust.getPhone() + "):");
		String phone = CMUtility.readString(13, cust.getPhone());
		System.out.println("邮箱(" + cust.getEmail() + "):");
		String email = CMUtility.readString(30, cust.getEmail());
		
		Customer newCust = new Customer(name, gender, age, phone, email);
		boolean isReplace = customerlist.replaceCustomer(number - 1, newCust);
		if(isReplace){
			System.out.println("---------------------修改完成---------------------");
		}else{
			System.out.println("---------------------修改失败---------------------");
			//这个无法运行到，因为customerlist.getCustomer()已经过滤了index错误的情况
		}
	}

	/**
	 * 删除客户的操作
	 * 
	 * @Description
	 * @author wealuk
	 * @date 2021年3月6日下午1:41:29
	 */
	private void deleteCustomer() {
		System.out.println("---------------------删除客户---------------------");
		int number;
		for(;;){
			System.out.println("请选择待删除客户编号(-1退出)：");
			number = CMUtility.readInt();
			if(number == -1){
				return;
			}
			Customer cust = customerlist.getCustomer(number - 1);
			if(cust == null){
				System.out.println("无法找到指定客户！");
			}else{
				break;
			}
		}
		//找到了指定客户
		System.out.println("确认是否删除(Y/N)：");
		char isDelete = CMUtility.readConfirmSelection();
		if(isDelete == 'Y'){
			boolean deleteSuccess = customerlist.deleteCustomer(number - 1);
			if(deleteSuccess){
				System.out.println("---------------------删除完成---------------------");
			}else{
				System.out.println("---------------------删除失败---------------------");
			}
		}else{
			return;
		}
	}

	/**
	 * 显示客户列表的操作
	 * 
	 * @Description
	 * @author wealuk
	 * @date 2021年3月6日下午1:41:53
	 */
	private void listAllCustomers() {
		System.out.println("\n---------------------------客户列表---------------------------");
		int total = customerlist.getTotal();
		if(total == 0){
			System.out.println("没有客户记录");
		}else{
			System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
			Customer[] custs = customerlist.getAllCustomers();
			for(int i = 0;i < total;i++){
				Customer cust = custs[i];	//custs[i].方法,麻烦就cust[i]赋给一个新的cust来用
				System.out.println((i + 1) + "\t" + cust.getName() + "\t" + cust.getGender() + "\t" + cust.getAge() + "\t" + cust.getPhone() + "\t" + cust.getEmail());
			}
		}
		
		System.out.println("-------------------------客户列表完成-------------------------\n");
	}

	public static void main(String[] args) {

		CustomerView view = new CustomerView();
		view.enterMainMenu();
	}

}
