package com.atguigu.contact;

/*
遍历1~100的质数（只能被1和本身除尽） 
*/
class OneToNine{
	public static void main(String[] args){
	boolean isFlag = true;  //如果按定义来 i%j !=0 不一定为质数比如15%4 =3。所以反过来让i%i == 0不让其打印就行了
	for(int i = 1;i<=100;i++){
		for(int j = 2;j<i;j++){
			if(i%j == 0){
			isFlag = false;
			}
		}
	if(isFlag == true){
	System.out.println(i);
	}
	isFlag = true;  //重置，让每次进入内层for循环的值都是true，否则到i = 4后都是false就无法打印了
	}
	}
}