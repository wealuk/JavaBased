package com.atguigu.java;

import java.util.Scanner;
import java.util.Vector;

/*
 * 利用Vector 代替数组处理：从键盘读入学生成绩（以负数代表输入结束），找出
最高分，并输出学生成绩等级。

提示：数组一旦创建，长度就固定不变，所以在创建数组前就需要知道它的
长度。而向量类 java.util.Vector 可以根据需要动态伸缩。

创建 Vector 对象： Vector v=new Vector();

给向量添加元素 v.addElement(Object obj ); //obj 必须是对象

取出向量中的元素： Object obj = v.elementAt(0)

注意第一个元素的下标是 0 ，返回值是 Object 类型的。

计算向量的长度： v.size

若与最高分相差 10 分内： A等； 20 分内： B等；
30分内： C等；其它： D等5.8
包装类的使用


 */
public class OOPTest19 {

	public static void main(String[] args) {
		//1.实例化Scanner，用于从键盘获取学生成绩
		Scanner scan = new Scanner(System.in);
		
		//2.创建Vector对象：Vector v = new Vector();相当于原来的数值
		Vector v = new Vector();
		
		//通过for(;;)或while(true)方式，给Vector添加数据
		int maxScore = 0;
		for(;;){
			System.out.println("请输入学生成绩（以负数代表输入结束）");
			int score = scan.nextInt();
			//3.2当输入是负数时，退出循环
			if(score < 0){
				break;
			}
			if(score > 100){
				System.out.println("输入数据有误");
				continue;
			}
			
			//3.1添加操作： v.addElement(Object obj)
			//JDK5.0之前
			Integer isScore = new Integer(score);
			v.addElement(isScore);//多态
			//JDK5.0之后
//			v.addElement(score);//自动装箱
			//4.获取学生成绩的最大值
			if(maxScore < score){
				maxScore = score;
			}
		}
		
		//5.遍历Vector，得到每个学生的成绩，并与最大成绩比较，得到每个学生的等级
		char level;
		for(int i = 0;i < v.size();i++){
			Object obj = v.elementAt(i);//取出的元素是Integer包装类，有多态
			//JDK5.0之前
//			Integer isScore = (Integer)obj;//前面的多态，故可以强转
//			int score = isScore.intValue();
			//JDK5.0之后
			int score = (int)obj;//***obj = new Integer ,obj-->int也可以直接用自动装箱
			
			if(maxScore - score <= 10){
				level = 'A';
			}else if(maxScore - score <= 20){
				level = 'B';
			}else if(maxScore - score <=30){
				level = 'C';
			}else{
				level = 'D';
			}
			System.out.println("student-" + i + "score is" + score + ",level is" + level);
		}
	}
	
}
