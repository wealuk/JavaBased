package com.atguigu.java;
/*
 * line33开始逐渐了解向下转型以及instanceof的使用
 * 具体看下面
 * 
 * 个人总结：向下转型即为父类通过强转赋给子类;多态即为向上转型。正常情况下，没有强转，父类是不能赋给子类的
 * 只有子类直接赋给父类。但是要注意，不是向下转型有强转就可以实现，需要先有多态(就是子类赋给父类)
 * 父类只能强转为该子类，其他子类是无法强转的(当然，强转为该子类的父类也可以)。
 * 总而言之，在多态的情况下(子类赋给父类),向下转型通过强转可以一直用到该子类到该父类以下的父类
 * 到该父类就是正常的创建对象了，该对象以上的父类则就是多态了
 * 比如ABCDE是依次继承的，A a = new E(); 那么a->bcde都是可以用向下转型实现的
 * B b = new E(); b->CDE都可以向下转型；B b = new B();就是正常创建;A a = b;就是多态
 * 
 * 而对于instanceof,子类是绝对属于父类的，所以 子类 instacneof 父类 返回的绝对是true
 * 但父类不一定属于子类， 父类 instanceof 子类，看多态时如果有  父类 = new 该子类，那么
 * 就返回true，没有 new 该子类就返回false
 * 
 * 归纳：要么是向下转型，要么就是多态。instanceof是判断父类是否属于子类的，从而决定该子类能否
 * 强转为该子类(向下转型)。而子类 instanceof 父类是没有意义的，总为true。
 * 
 */
import java.util.Date;

public class OOPTest10 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.eat();
		
		Man man = new Man();
		man.eat();
		man.age = 25;
		man.eartnMoney();
		
		
		System.out.println("***********");
		//对象的多态性，父类的引用指向子类的对象
		Person p2 = new Man();
		//Person p3 = new Woman();
		//多态的使用：当调用子父类同名同参数的方法时，实际执行的是子类重写父类的方法--虚拟方法的调用
		p2.eat();    //执行时运行的是子类的重写方法
		p2.walk();
		
//		p2.earnMoney报错，	编译时只能调用父类的属性和方法，p2是Person类
		System.out.println(p2.id);//1001，属性不能被覆盖，所以是谁的编译就运行谁。编译运行都看左边
		
		
		
		System.out.println("***********************");
		//不能调用子类所特有的方法和属性：编译时，p2是Preson类
		p2.name = "Tom";
//		p2.earnMoney();无法调用
//		p2.isSmoking();
		
		//有了对象的多态性以后，内存中实际上是加载了子类所特有的属性和方法，但是由于变量声明为
		//父类类型，导致编译时只能调用父类中声明的。子类特有的属性和方法无法调用
		
		//如何才能调用子类所特有的属性和方法呢？
		//向下转型：使用强制类型转换		notes:多态就是子类赋给父类，也称为向上转换，无需强转
		Man m1 = (Man)p2;//Man m1 = p2;是无法实现，只有子类对象赋给父类；不能父类对象赋给子类
		m1.eartnMoney();
		m1.isSmoking = true;
		
		//使用强转时，可能出现ClassCastException的异常
//		Woman w1 = (Woman)p2;	无法转换，因为line16 是p2 = new Man() ，可以将p2转回Man
//		w1.goShopping();		但无法转为woman。(p2是类Man的实例)
		
		/*
		 * instanceof关键字的使用			instance:实例
		 * 
		 * a instanceof A :判断对象a是否是类A的实例。如果是则返回true；不是返回false
		 * 
		 * 使用情景：为了避免向下转型时出现ClassCastException的异常,我们在向下转型之前
		 * 先进行instanceof的判断，一旦返回true，就进行向下转型。false不进行向下转型
		 * 
		 * 如果 a instance A 返回true，则a instance B也返回true，其中类	B是类A的父类
		 * 也就是a属于类A，那么也属于类A的父类 比如p2 = new Man p2属于Man,同样更属于Person类
		 */
		
		if(p2 instanceof Woman){
			Woman w1 = (Woman)p2;
			w1.goShopping();
			System.out.println("Woman");//false
		}
		if(p2 instanceof Man){//new Man所以为true。向下转型主要看父类是否是子类的实例
			Man m2 = (Man)p2;//因为子类必定是父类的实例
			m2.eartnMoney();
			System.out.println("Man");//true
		}
		if(p2 instanceof Person){//同一级别，此时不再是向下转型
			System.out.println("Person");//true
		}
		if(p2 instanceof Object){//子类属于父类，必为true，此时不再是向下转型
			//任何对象都可以作为Object的实例，也就是任意的对象都可以赋给Object
			System.out.println("Object");
		}
		
		//练习
		//问题一：编译时通过，运行时不通过
//		Person p3 = new Woman();
//		Man m3 = (Man)p3;
//		
//		Person p4 = new Person();
//		Man m4 = (Man)p4;
		
		
		//问题二：编译通过，运行也通过
//		Object obj = new Woman();//obj可以转换为Woman及其所有的父类
//		Person p = (Person)obj;
	}
		//编译不通过
//		Man m5 = new Woman();
//		String str = new Date();
		
		Object o = new Date();
		String str1 = (String)o;//编译可以通过，但无法运行
	
}
