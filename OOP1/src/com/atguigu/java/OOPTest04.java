package com.atguigu.java;
/*
 * 类中方法的声明和使用：
 * 
 * 方法：：描述类应该具有的功能
 * 比如：Math类：sqrt()\random()...
 * 		Scanner类：nextXxx()
 * 		Arrays类：sort()\binarySearch()\toString\equals()\....
 * 
 * 1.举例：public void eat(){}
 * 		public void sleep(int hour){}			notes:()里面有变量就是有形参，void 方法名就是不需要
 * 		public String getName(){}						返回值，如果是String 方法名，就返回一个String类型
 * 		public String getNation(String nation)
 * 
 * 2.方法的声明： 权限修饰符 返回值类型 方法名(形参列表){		notes:形参列表可有可无，可以有一个也可以有多个
 * 				方法体(调用时执行的是方法体)
 * 			}
 * 
 * 注意：static,final,abstract来修饰的方法后面再讲
 * 
 * 3.说明：
 * 		3.1权限修饰符：默认方法的权限修饰符都先使用public
 * 			Java规定的四种权限修饰符：private，public，缺省，protected		>封装性再细说
 * 
 * 		3.2返回值类型：有返回值  vs  没返回值
 * 			3.2.1如果方法有返回值，必须在方法声明时指定返回值类型。同时，方法中需要使用ruturn关键字
 * 					来返回指定类型的变量或常量：“return 数据”
 * 				如果方法没有返回值，则方法声明时，使用void修饰方法。通常，在没有返回值的方法中，就不需要
 * 					使用retrun。但是，如果使用的话，就只能“return;”表示结束方法的意思
 * 
 * 			3.2.2我们定义方法该不该有返回值
 * 				①题目要求
 * 				②凭经验		比如:Math.random(),Arrays.binarySearch()需要返回值。Arrays.sort()
 * 								就不要返回值。又如random不需要形参，sort需要等等具体问题具体分析
 * 
 * 		3.3方法名，属于标识符，遵循标识符的规则和规范，“见面知意”
 * 
 * 		3.4形参列表：方法可以声明0，1，或多个形参
 * 			3.4.1格式：数据类型1 形参1,数据类型2 形参2,......
 * 			3.4.2我们定义方法时，该不该定义形参
 * 					① 题目要求
 * 					②具体问题具体分析
 * 		3.5方法体：方法功能的实现
 * 
 * 4.return关键字的使用：
 * 		1.使用范围：使用在方法体中
 * 		2.作用：①结束方法
 * 				②针对有返回值类型的方法，使用“return 数据”方法返回所要的数据
 * 		3.注意点：return后面不可声明执行语句
 * 
 * 5.方法的使用中，可以调用当前类的属性和方法
 * 			特殊的：方法A中调用方法A：递归方法
 * 方法中不可定义方法
 * 
 * 注：题目中还有很多要注意的点，去exer看看吧
 */
public class OOPTest04 {
	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.sleep(8);
	}
}

class Customer{
	//属性
	String name;
	int age;
	boolean isMale;
	
	//方法
	public void eat(){
		System.out.println("客户吃饭");
		return;//结束方法，return后面不能声明表达式了
	}
	
	public void sleep(int hour){
		System.out.println("休息了"+hour+"分钟");
		eat();
		//sleep(10)	sleep中再调用sleep，此时出现栈溢出(StackOverFlowError),就是不断重复执行方法
		//不断声明变量hour，栈溢出
	}
	
	public String getName(){
		if(age > 18){
			return name;	//返回变量
		}else{
			return "Tom";	//返回常量
		}
	}
	
	public String getNation(String nation){
			String info = "我的国际是"+nation;
					return info;
	}
}