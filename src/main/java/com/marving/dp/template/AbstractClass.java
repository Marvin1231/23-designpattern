package com.marving.dp.template;

//抽象模板角色
public abstract class AbstractClass {
	
	protected abstract void operation();
	public void templateMethod(){
		this.operation();
	}
}
