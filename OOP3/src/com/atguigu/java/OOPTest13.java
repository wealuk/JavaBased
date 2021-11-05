package com.atguigu.java;
/*
 * 抽象类的匿名子类(非抽象类也可以使用)
 * 
 * notes：其实就是new 抽象类(){};这代表的是该抽象类的子类，可以用一个抽象类  x来接收，也可直接
 * 使用，且{}里必须重写抽象方法。***注意，如果不是抽象类也可以使用，依然代表其是该类的子类。但可以不重写方法
 * 后面的接口的实现类的匿名实现类也是同样的道理
 * 
 */
public class OOPTest13 {

	public static void main(String[] args) {
		
		method(new Student());//匿名对象
		
		Worker woker = new Worker();
		method1(woker);//非匿名的类  非匿名的对象
		
		method1(new Worker());//非匿名的类  匿名的对象
		System.out.println("*********");
		
		//创建了一匿名子类的对象:p		//Peron1是不能创建对象的，所以new Perons1并不是给Peron1
		Person1 p = new Person1(){//来创建对象，而只是一个泛指的概念，指一个不知道名字的子类。
					//总结：new 抽象类(){};有方法体时，就代表其是该抽象类的一个匿名子类。哪怕
					//赋给了这个抽象类p，他也属于有对象名，但没类名。只知道其属于抽象类的一个
					//子类，但不知道是什么名字(赋给了p也一样，不属于Peron1类，属于其的匿名子类)
			@Override
			public void eat() {
				System.out.println("吃东西");
			}
			@Override
			public void breath() {
				System.out.println("哈哈呼吸");
			}
		};
		method1(p);
		
		//创建匿名子类的匿名对象
		//notes：new 抽象类(){};就代表了一个匿名子类，{}里面要求重写抽象类的方法。如果
		//赋给抽象类就是上面的那种情况；直接使用在方法内的话，就是该情况匿名子类的匿名对象
		method1(new Person1(){
			@Override
			public void eat() {
				System.out.println("好好吃东西");
			}

			@Override
			public void breath() {
				System.out.println("好好的呼吸新鲜空气");
			}
			
		});
		
	}
	
	public static void method1(Person1 p){
		p.eat();
		p.walk();
		p.breath();
	}
	
	public static void method(Student s){
		
	}
}
class Worker extends Person1{

	@Override
	public void eat() {
		
	}

	@Override
	public void breath() {
		
	}
	
}
