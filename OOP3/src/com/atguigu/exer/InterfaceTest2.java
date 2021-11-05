package com.atguigu.exer;

public class InterfaceTest2 {

}

interface Playable {
	void play();
}

interface Bounceable {
	void play();
}

interface Rollable extends Playable, Bounceable {
	Ball ball = new Ball("PingPang");

}

class Ball implements Rollable {
	private String name;

	public String getName() {
		return name;
	}

	public Ball(String name) {
		this.name = name;
	}

	public void play() {//重写play方法没问题，两个接口的抽象方法虽然名字一样，但可以同时被重写
//		 ball = new Ball("Football");//这里才是问题所在，ball是省略了public static final
		System.out.println(ball.getName());//是一个全局常量，不能修改的
	}

}