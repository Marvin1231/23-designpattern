package com.marving.dp.facade;

//外观角色
public class Facade {
	
	private ClassA classA = new ClassA();
	private ClassB classB = new ClassB();
	
	public void methodA(){
		//do Something
		this.classA.methodA();
	}
	
	public void methodB(){
		this.classB.methodB();
	}
}
