package com.atguigu.exer;

import java.util.Arrays;

/*4. 对象数组题目：
定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩
score(int)。 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
问题一：打印出3年级(state值为3）的学生信息。
问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息

提示：
1) 生成随机数：Math.random()，返回值类型double;
2) 四舍五入取整：Math.round(double d)，返回值类型long。

后面有优化，将问题1，2，遍历可以封装成方法


*/
public class StudentTest {
	public static void main(String[] args) {
									//notes：调用了下面的Student类，20个元素都是未初始化的对象
									//，此时每个元素（对象）都是null，在后面初始化（赋值）后
									//每个元素就是一个对象（类比于二维数组，每一个外出元素
									//就是一个数组）。故调用的Student类，所以也可以调用类里面的属性，方法
				//声明Student类型的数组
		Student[] stus = new Student[20];	//String[] arr = new String[3];也是对象数组，String也是类
		for(int i = 0;i < stus.length;i++){		//notes：相当于开辟一个Student类型的数组，每一个
			//给数组元素赋值						//元素都是student类型。跟String一样都是引用数据类型
			stus[i] = new Student();			//用法是相同的。并且student是类，让每一个元素初始化就是
			//给Student对象的属性赋值				//将类实例化也就是new一个对象。虽然每一个元素是student类
			stus[i].number = i + 1;				//但没有具体赋值（实例化对象）时输出是null；new了对象后就是地址值
										//①String[] arr = new String[4]; ②String[0] = "abc";②也相当于该题的
										// = new Student();   都是创建一个对象
			//年纪[1,6]
			stus[i].state = (int)(Math.random()*6+1);
			//成绩[1,100]
			stus[i].score = (int)(Math.random()*100+1);
		}
		//遍历
		for(int i = 0;i<stus.length;i++){
			//System.out.println(stus[i]);//全是地址值（类比于二维数组，一个里面是一维数组一个里面是对象）
			//要输出这些属性就要这样,直接调用属性或者创建一个显示学生成绩的方法
			//System.out.println(stus[i].number+","+stus[i].state+","+stus[i].score);
			System.out.println(stus[i].info());
		}
		
		//问题1
		System.out.println();
		for(int i = 0;i<stus.length;i++){
			if(stus[i].state == 3){
				System.out.println(stus[i].info());
			}
		}
		//问题2
		for(int i = 0;i<stus.length-1;i++){
			for(int j = 0;j<stus.length - 1 - i;j++){
				if(stus[j].score > stus[j+1].score){
					//接下来要转变的是对象，而不是对象的成绩
					Student temp = stus[j];
					stus[j] = stus[j+1];
					stus[j+1] = temp;
				}
			}
		}
		System.out.println();
		for(int i = 0;i<stus.length;i++){
			System.out.println(stus[i].info());
		}
	}
}

class Student{
	int number;//学号
	int state;//年级
	int score;//成绩
	
	public String info(){
		return "学生学号"+number+",年级"+state+",成绩"+score;
	}
}