package com.atguigu.java;
/*
 * 接口的应用：代理模式
 * 概述：代理模式是Java开发中使用较多的一种设计模式。代理设计就是为其 他对象
 * 提供一种代理以控制对这个对象的访问
 * 
 * 
 * 
 * 接口的练习见InterfaceTest1、2
 * 还有一个比较对象属性的练习较长就略了，有一个点就是Doulbe类可以调用compareTo的方法进行比较后返回值
 */
public class OOPTest17 {

	public static void main(String[] args) {
		Server server = new Server();
		ProxyServer proxyServer = new ProxyServer(server);//大部分功能都是由代理类来实现
		//唯有接口所提供的必须要被代理类来亲自做。所以用的是代理类的方法，赋给形参的是被代理类
		
		proxyServer.browse();
	}
}

interface NetWork{
	public void browse();
}

//被代理类
class Server implements NetWork{

	@Override
	public void browse() {
		System.out.println("真实的服务器访问网络");
	}
	
}

//代理类
class ProxyServer implements NetWork{

	private NetWork work;
	public ProxyServer(NetWork work){//创建代理类的对象时就要将被代理类的对象赋给形参。
		this.work = work;	//接口，利用多态来对实现类中的被代理类进行真实的调用
	}
	
	public void check(){
		System.out.println("联网之前的检查工作");
	}
	
	@Override
	public void browse() {
		check();
		
		work.browse();
	}
	
}