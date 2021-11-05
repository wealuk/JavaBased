package com.atguigu.myp2;

import java.awt.color.CMMException;


public class CustomerView {

	private CustomerList customerList = new CustomerList(10);

	public void enterMainMenu() {
		boolean isFlag = true;
		while (isFlag) {
			System.out.println("\n-----------------客户信息管理软件-----------------\n");
			System.out.println("                   1 添 加 客 户");
			System.out.println("                   2 修 改 客 户");
			System.out.println("                   3 删 除 客 户");
			System.out.println("                   4 客 户 列 表");
			System.out.println("                   5 退       出\n");
			System.out.print("                   请选择(1-5)：");

			char number = CMUtility.readMenuSelection();
			
			switch(number){
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
				System.out.print("确认是否删除(Y/N)：");
				char isTrue = CMUtility.readConfirmSelection();
				if(isTrue == 'Y'){
					isFlag = false;
					System.out.println("以退出");
				}
			}
		}
	}

	private void addNewCustomer() {
		System.out.println("---------------------添加客户---------------------");
		System.out.println("姓名：");
		String name = CMUtility.readString(10);
		System.out.println("性别:");
		char gender = CMUtility.readChar();
		System.out.println("年龄：");
		int age = CMUtility.readInt();
		System.out.println("电话：");
		String phone = CMUtility.readString(13);
		System.out.println("邮箱：");
		String email = CMUtility.readString(30);
		
		Customer customer = new Customer(name, age, gender, phone, email);
		boolean isAdd = customerList.addCustomer(customer);
		if(isAdd){
			System.out.println("---------------------添加完成---------------------");
		}else{
			System.out.println("---------------------添加失败---------------------");
			
		}
	}

	private void modifyCustomer() {
		System.out.println("---------------------修改客户---------------------");
		Customer cust;
		int number;
		while(true){
		System.out.println("选择待修改客户编号(-1退出)：");
		number = CMUtility.readInt();
		if(number == -1){
			return;
		}
		cust = customerList.getCustomer(number - 1);
		if(cust == null){
			System.out.println("无法找到指定客户！");
		}else{
			break;
		}
		}
		System.out.println("姓名(" + cust.getName() + "):");
		String name = CMUtility.readString(10, cust.getName());
		System.out.println("性别"+cust.getGender() + "):");
		char gender = CMUtility.readChar(cust.getGender());
		System.out.println("年龄(" + cust.getAge() + "):");
		int age = CMUtility.readInt(cust.getAge());
		System.out.println("电话(" + cust.getPhone() + "):");
		String phone = CMUtility.readString(13, cust.getPhone());
		System.out.println("邮箱(" + cust.getEmail() + "):");
		String email = CMUtility.readString(30, cust.getEmail());
		
		Customer customer = new Customer(name, age, gender, phone, email);
		//测试Debug将number - 1 变为number
		boolean isSuccess = customerList.replaceCustomer(number , customer);
		if(isSuccess){
			System.out.println("修改完成");
		}else{
			System.out.println("修改失败");
		}
	}

	private void deleteCustomer() {
		System.out.println("---------------------删除客户---------------------");
		int number;
		for(;;){
			System.out.println("请选择待删除客户编号(-1退出)：");
			number = CMUtility.readInt();
			if(number == -1){
				return;
			}
			Customer cust = customerList.getCustomer(number - 1);
			if(cust == null){
				System.out.println("此用户不存在");
			}else{
				break;
			}
		}
		System.out.println("确认是否删除(Y/N)：");
		char isDelete = CMUtility.readConfirmSelection();
		if(isDelete == 'Y'){
			customerList.deleteCustomer(number - 1);
			System.out.println("删除成功");
		}
	}

	private void listAllCustomers() {
		System.out.println("---------------------------客户列表---------------------------");
		Customer[] custs = customerList.getAllCustomers();
		if(custs.length == 0){
			System.out.println("没有客户记录");
		}else{
			System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
			for(int i = 0;i < custs.length;i++){
				System.out.println((i + 1) + "\t" + custs[i].getName() + "\t" +  custs[i].getGender() + "\t" +  custs[i].getAge() + "\t" +  custs[i].getPhone() + "\t" +  custs[i].getEmail());
			}
			
		}
		System.out.println("-------------------------客户列表完成-------------------------");
	}

	public static void main(String[] args) {
		CustomerView view = new CustomerView();
		view.enterMainMenu();
	}

}
