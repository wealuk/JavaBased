package com.atguigu.java;
/*
 * 3. 数组的复制、反转、查找(线性查找、二分法查找)
 */
public class ArrayTest7 {
	public static void main(String[] args) {
		
			String[] arr = new String[]{"AA","BB","CC","DD","EE"};
			//数组的复制(区别于赋值，详情看5，6)
			String[] arr1 = new String[arr.length];
			for(int i =0;i<arr1.length;i++){
				arr1[i] = arr[i];
				System.out.print(arr1[i]+"\t");
			}
//			//数组的反转(比如arr反转就是让元素顺序反过来)
//			for(int i = 0;i<arr.length / 2;i++){
//				String temp = arr[i];
//				arr[i] = arr[arr.length - 1 - i];
//				arr[arr.length - 1 - i] = temp;
//			}
//			//遍历
//			for(int i =0;i<arr.length;i++){
//				System.out.print(arr[i]+"\t");
//			}
			//查找(或搜索)
			//线性查找：		（全部一个一个找）
			String dest = "BB";
			boolean isFlag = true;
			for(int i = 0;i<arr.length;i++){
				if(dest.equals(arr[i])){
					System.out.println("位置在"+i);
					isFlag = false;
					break;
				}
			}
		if(isFlag){
			System.out.println("没有找到");	//notes(isFlag):不加if判断的话，无论是否找到都会输出没有找到
											//所以参考质数那题的思想加一个Boolean类型，如果找到了
											//就不让"没有找到"输出(下面也有)
			
		}
		//二分法查找(前提是所要查找的数组是有序的)(取半)
		  int[] arr2 = new int[]{-98,-34,2,34,58,79,99,210,333};
		  int dest1 = -34;
		  int head = 0;//初始的首索引
		  int end = arr.length - 1;//初始的末索引
		  boolean isFlag1 = true;
		  while(head <= end){	//找不到时，就会出现head >= end
			  int middle = (head + end)/2;
			  if(dest1 == arr2[middle]){
				  System.out.println("位置为"+middle);
				  isFlag1 = false;				//notes(isFlag)：总结而言，isFlag一般用在有循环条件
				  break;					//的地方。循环里面满足条件会输出，此时不需要外面的输出语句
			  }else if(dest1 < arr2[middle]){	//，但是外面的输出语句不受循环控制，无论里面怎么样都会
				  end = middle - 1;				//输出。此时就需要一个boolean isFlag = true,里面满足
			  }else {							//条件就改为false。
				  head = middle + 1;
			  }
		  }
		if(isFlag1){
			System.out.println("没有找到");
		}
	}
}
