package com.atguigu.java;
/*
 * 总结：如何看待代码中的编译时异常和运行时异常(Exception03)
 * 体会1：使用try-catch-finally处理编译时异常，使得程序在编译时就不再报错，但是运行时仍可能
 * 报错。相当于我们使用try-catch-finally将一个编译时可能出现的异常，延迟到运行时出现
 * notes：try-catch-finally相当于将编译时异常延缓到了运行时异常，让其编译可以通过
 * 		但是对于运行时异常，结果都是一样的。e.printStackTrace和直接运行他们都会打印出异常原因
 * 
 * 体会2：开发中，由于运行时异常比较常见，所以我们通常就不针对运行时异常编写try-catch-finally了。
 * 		针对于编译时异常，我们说一定要考虑异常的处理
 * notes：Error是不能处理，运行时异常是能处理但没必要处理，直接运行也是报异常原因。编译时异常
 * 是必须处理
 * 
 * 
 * 面试题：final、finally、finalize的区别
 * 类似的：throw和throws、Collection和Collections、String和StringBuffer和StringBuilder
 * 、ArrayList和LinkedList、重写和重载
 * 不相似的：抽象类和接口、==和equals、sleep()和wait()
 * 
 * 
 * 本节重点是两个异常处理方式
 * 
 * 对比两种处理方式：
 * 		try-catch-finally:真正的将异常给处理掉了。
 * 		  throws的方式只是将异常抛给了方法的调用者。并没有真正的将异常处理掉
 * 
 * throw和throws的区别：
 * throw表示抛出一个异常类的对象，生成异常对象的过程，声明在方法体内。
 * throws 属于异常处理的一种方式，声明在方法的声明处
 * 
 */
public class Exception09 {
	
}
