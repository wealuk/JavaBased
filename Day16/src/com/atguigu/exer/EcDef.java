package com.atguigu.exer;
//自定义异常
public class EcDef extends Exception{

	 static final long serialVersionUID = -33875169229948L;
	 
	 public EcDef(){
		 
	 }
	 public EcDef(String msg){
		 super(msg);
	 }
}
