package com.atguigu.exer;

public class Girl {

	private String name;
	private int age;
	
	
	public Girl(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Girl() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void marry(Boy boy){
		System.out.println("我想嫁"+boy.getName());
		boy.marry(this);//new Gilr() 的匿名对象不行，name属性为null。应该用this代表调用该
	}					//方法的对象
	/**
	 * 
	 * @Description 比较两个对象的大小
	 * @author wealuk
	 * @date 2021年2月25日上午10:14:46
	 * @param girl
	 * @return 正数表示对象大；负数表示小；0表示相等
	 */
	public int compare(Girl girl){
		if(this.age > girl.age){
			return 1;
		}else if(this.age < girl.age){
			return -1;
		}else {
			return 0;
		}
	}

	
}
