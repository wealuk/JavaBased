package com.atguigu.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.junit.Test;

/*
 * try-catch-finally的中finally的使用：
 * 
 * 1.finally是可选的
 * 2.finally中声明的是一定会执行的代码。即使catch中又出现了异常、try中有return语句，catch中
 * 有retrurn语句等情况。
 * 
 * 3.像数据库连接、输入输出流、网络编程Socket等资源，JVM是不能自动的回收的，我们需要自己手动的
 * 进行资源的释放。此时，资源的释放，就需要声明在finally中(声明在try的最后的话，如果前面
 * 出现异常就会跳到catch然后跳出try结构，所以try异常后面的语句就无法执行，就无法关闭了。)
 * notes：这些资源的释放，需要写在finally里面。又因为声明在try中的对象出了try无法使用，所以
 * 需要将对象的声明在try外面，里面只进行赋值操作，关闭时才能调用对象（具体见test2）
 * 
 * 
 * 
 */
public class Exception04 {

	@Test
	public void test1(){
		try{
			int a = 10;
			int b = 0;
			System.out.println(a / b);
		}catch(ArithmeticException e){
			int[] arr = new int[10];
			System.out.println(arr[10]);//catch里面又存在异常，再报异常没有finally后面就
		}catch(Exception e){			//不再执行任何语句了
			e.printStackTrace();
		}
//		System.out.println("你好帅啊！！！");//如果是这个的话就不会执行
		
		finally{
			System.out.println("你好帅");
		}
	}
	
	public int method(){
		try{
			int[] arr = new int[10];
			System.out.println(arr[10]);//如果有异常就不会执行return了而会去catch中匹对
			return 1;//没有异常才会执行到return 1。没有异常时先执行finally再返回1
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			return 2;//有异常先执行finally再返回2
		}finally{
			System.out.println("我一定会执行");
			//return 3; 如果有这一行，无论是否有异常都会返回3。因为要返回1、2都必须先执行finally
			//所以也必定先执行return 3
		}
	}
	
	@Test
	public void testMethod(){
		int num = method();//在返回值之前，finally就执行了，也就是先执行finally再return 2
//		System.out.println(num);//故在上一行就已经输出了"我一定会执行"
	}
	
	
	@Test
	public void test2(){
		FileInputStream fis = null;//便于finally中fis.close的调用，声明在try里面的话，fis
			try {					//无法在try外面调用，也就是无法使用fis.close
				File file = new File("Hello.tex");
				fis = new FileInputStream(file);//hello文件不存在，会报错
				
				int data = fis.read();
				while(data != -1){
					System.out.println((char)data);
					data = fis.read();
				}
//				fis.close();//前面匹配到异常后无法执行到这一步
			} catch (Exception e) {
				e.printStackTrace();
			}finally{//try-catch-finally结构可以嵌套
				try {//嵌套使用
					if(fis != null){//可能file不存在，new FileInputStream(file)就会出错
					//报异常，那么fis也就没有成功赋值，仍然是null，fis.close也就会是空指针异常。
						//是null的话就没有开辟堆空间，就无需去关闭了 
						
						fis.close();//如果fis在try内声明那么出了try在这里就无法调用
						//同时fis.close();自己也要进行异常处理
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
	}
}
