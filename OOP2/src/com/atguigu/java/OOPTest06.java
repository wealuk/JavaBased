package com.atguigu.java;
/*
 * super关键字
 * 1.super理解为：父类的
 * 2.super可以用来调用：属性、方法、构造器
 * 
 * 3.super的使用：调用属性和方法
 * 	
 * 	3.1我们可以在子类的方法或构造器中。通过使用“super.属性”或“super.方法”的方式，显式的调用
 * 父类中声明属性或方法。但是，通常情况下，我们习惯省略super。（没有重名，调用的就是父类）
 * 
 * 	3.2特殊情况，当子类和父类定义了同名的属性时，我们要想在子类中调用父类中声明的属性，则必须显式的
 * 使用”super.属性“的方式，表明调用的是父类中声明的属性
 * 
 * 	3.3特殊情况，当子类重写了父类中的方法以后，我们想在子类的方法中调用父类中被重写的方法时则必须
 * 显式的使用”super.方法“的方式，表明调用的是父类中被重写的方法
 * 
 * 
 * 4.super调用构造器
 * 	4.1我们可以在子类的构造器中显式的使用“super(形参列表)”的方式，调用父类中声明的指定的构造器
 * 	4.2“super(形参列表)”的使用，必须声明在子类构造器的首行！
 * 	4.3我们在类的构造器中，针对于“super(形参列表)”或“this(形参列表)”只能二选一，不能同时出现(只能一个在首行)
 *	4.4在构造器的首行，没有显式的声明“super(形参列表)”或“this(形参列表)” ，则默认调用的是父类中空参的构造器，super()
 *	4.5在类的多个构造器中，至少有一个类的构造器使用了“super(形参列表)”来调用父类的构造器.因为
 *	this(形参列表)最多使用n - 1次,并且创建的类总有父类。构造器的首行不是this(形参列表)就是super(形参列表)。
 *	this(形参列表)和super(形参列表)可以显式的声明，两者都没有的话，就默认为super()
 *	4.6见子类对象实例化的全过程
 *
 *notes:1.父类有构造器，但没有空参的。子类若是使用的是默认的空参或是构造器有默认super()时
 *	会报错。解决方法:可以父类加空参构造器；在子类的构造器中调用父类别的构造器
 *	2.因为super只能放第一行，所以构造器会直接调到最高父类Object，而加载或者说继承的内容也是
 *从最高的父类往下加载完成
 * 
 * 
 */
public class OOPTest06 {

	//Test见com.atguigu.supertest
}