package com.atguigu.exer;
/*使用二维数组打印一个 10 行杨辉三角。(见课件)
【提示】
1. 第一行有 1 个元素, 第 n 行有 n 个元素
2. 每一行的第一个元素和最后一个元素都是 1
3. 从第三行开始, 对于非第一个元素和最后一个元
素的元素。即：
yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
*/
public class YangHuiTest {
	public static void main(String[] args) {
		//1.声明并初始化一个二维数组
		int[][] arr = new int[10][];
		//2.给数组的元素赋值
		for(int i = 0;i<arr.length;i++){
			arr[i] = new int[i+1];
			
			//2.1给首末元素赋值
			arr[i][0] = arr[i][i] = 1;
			//2.2给每行的非首末元素赋值
			if(i>1){
				for(int j = 1;j<arr[i].length-1;j++){
					arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
				}//if语句可以省略，因为<=1进入不了循环
			}
		}
		//3.遍历二维数组
		for(int i = 0;i<arr.length;i++){
			for(int j = 0;j<arr[i].length;j++){
//				if(j == 0 || j == i){
//					arr[i][j] = 1;			该部分是我第一次做的时候的想法，直接在遍历中赋值
//				}else {						也可以，但是按老师那样写步骤更加明确
//					arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
//				}
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
