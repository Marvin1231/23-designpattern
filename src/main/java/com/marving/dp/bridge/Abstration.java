package com.marving.dp.bridge;

//抽象化角色
public class Abstration {
	
	private Implementor imp;
	public Abstration(Implementor imp){
		this.imp = imp;
	}
	
	public void operation(){
		this.imp.operation();
	}
}
