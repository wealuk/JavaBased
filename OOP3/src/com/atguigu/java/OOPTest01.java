package com.atguigu.java;
/*
 * static关键字的使用
 * 
 * 1.static：静态的
 * 2.static可以用来修饰：属性、方法、代码块、内部类(不含构造器)
 * 
 * 3.使用static修饰属性：静态变量（或类变量）
 * 		3.1属性：按是否使用static修饰，又分为：静态属性 vs 非静态属性(实例属性)
 * 			实例变量：当我们创建了类的多个对象，每个对象都独立的拥有一套类中的非静态属性 ，
 * 				当修改其中一个对象中的非静态属性时，不会导致其他对象中同样的属性值的修改
 * 			静态变量：我们创建了类的多个对象，多个对象共享一个静态变量。当通过某一个对象修改
 * 			静态变量时，会导致其他对象调用此静态变量时，是改变过了的
 * 		3.2static修饰属性的其他说明：
 * 			①静态变量随着类的加载而加载。可以通过“类.静态变量”的方式进行调用
 * 			②静态变量的加载要早于对象的创建
 * 			③由于类只会加载一次，则静态变量在内存中也只会存在一份，存在方法区的静态域中。
 * 
 * 			④		类变量		实例变量
 * 			  类		yes			no
 * 			 对象	yes			yes
 * 		3.3静态属性举例：System.out , Math.pi;
 * 类变量与局部变量的内存解析看笔记图，总之“类.静态变量”会直接在方法区开辟空间，无需对象的创建
 * 
 * 4.使用static修饰方法：
 * 		①随着类的加载而加载，可以通过“类.静态方法”的方式进行调用
 * 		②			静态方法		非静态方法
 * 			  类		yes			no
 * 			 对象	yes			yes
 * 		③静态方法中，只能调用静态的方法或属性(指同一个类中的方法或属性，原因见下面的notes*)
 * 		非静态方法中，既可以调用非静态的方法或属性，也可以调用静态的方法或属性
 * 
 * 
 * 5.static注意点：
 * 	5.1在静态的方法内，不能使用this关键字、super关键字(this、super所指向的都是非静态结构，而静态结构都是用类.结构来修饰)
 * 
 * **notes*：不能使用this、super不是因为是非静态结构而不能用，其核心是this、super是与当前类的
 * 		对象有关，而静态方法是在类时加载的，故不可能有当前类的对象。正是因为在静态方法中当前类
 * 		是没有对象的，所以static修饰的静态方法可以直接通过类来调用，但非static的结构是由于
 * 		没有当前类的对象故无法调用(非静态的必须将该类实例化对象才能调用)。但如果有别的类的对象
 * 		直接在静态方法加载或者在该静态方法中有别的静态方法可以得到一个对象(如Thread.currentThread)
 * 		,那么有对象的话，在静态方法同样可以通过对象.非静态结构调用非静态结构。
 * notes总结：静态结构可以通过类来调用，非静态结构需要类的实例对象来调用。故同一个类中，静态方法
 * 确实只能调用该类中静态结构(该类中的非静态结构没有该类的实例对象)，也就是this、super这些
 * 在静态方法中是绝对无法使用的。所以如果一个静态方法中有别的类的对象(静态方法的类是绝对不会有对象的)
 * 或者通过别的类的静态方法得到了对象(Thread.currentThread),那么有对象的情况下，在静态方法中
 * 是可以通过对象来调用该对象的非静态结构。(静态方法可以调用非静态结构，只是该静态结构不可能是本类的)
 * 
 * 	5.2关于静态方法和静态属性的使用，大家可以从生命周期的角度理解：类创建时就自带了静态属性和方法
 * 然后再创建一个个对象，从而开辟了内存空间有了非静态属性和方法，直到对象没了后类没了，静态结构也没了
 * 
 * 6.开发中，如何确定一个属性是否要声明为static的？
 * 			>属性是可以被多个对象所共享的，不会随着对象的不同而不同(如Bank测试的利率)
 * 			>类中的常量池也常常声明为static(比如pi)
 * 
 * 	开发中，如何确定一个方法是否要声明为static的？
 * 			>操作静态属性的方法，通常设置为static的(利率的get、set方法等)
 * 			>工具类中的方法，习惯上声明为static的。比如Math、Arrays、Collections
 * 	  (因为造出来的对象差不多，都是要调用其中的方法。所以设置为静态，不需要对象也可以调用其方法)
 * 
 * notes:一个重要的用法就是：许多类中可能封装了很多方法，如果要调用该类中的方法就需要创建
 * 1.该类的对象，通过对象才能调用方法。如果我们将方法static，那么就不要对象，直接通过类.方法
 * 就可以调用方法。
 * 2.另外如果一个属性为static，那么其get、set方法也是static修饰的
 * 
 */
public class OOPTest01 {

	public static void main(String[] args) {
		
		//通过类就可以调用类变量(静态变量)
		Chinese.nation = "中国";
		
		Chinese c1 = new Chinese();
		c1.name = "姚明";
		c1.age = 40;
		c1.nation = "中国";
		System.out.println(c1.nation);//中国
		
		Chinese c2 = new Chinese();
		c2.name = "马龙";
		c2.age = 30;
		c2.nation = "CHN";
		System.out.println(c1.nation);//CHN
		
		//编译不通过
//		Chinese.name = "张继科";
		
		
		c1.eat();
		Chinese.show();
		
		//编译错误
//		Chinese.eat();
//		Chinese.info();
	}
}

class Chinese{
	String name;
	int age;
	static String nation;
	
	public void eat(){
		System.out.println("中国人吃中餐");
		//调用非静态的结构
		this.info();
		System.out.println("name:" + name);
		//调用静态的结构
		show();//省略了Chinese
		Chinese.show();
		System.out.println("nation:" + nation);
	}
	public static void show(){
		System.out.println("我是一个中国人");
		//不能调用非静态的结构
//		eat();//其实是this.eat()  无法使用this、super，因为static时没有对象
//		name = "Tom"; 错误，无法调用非静态的
		
		//可以调用静态的结构
		System.out.println(nation);//nation其实时Chinese.nation，Chinese省略了。
		System.out.println(Chinese.nation);
//		System.out.println(this.nation);错误，static中还没有对象，无法用this、super
		
	}
	public void info(){
		System.out.println("name" + name + "age" + age);
	}
}
