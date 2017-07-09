package com.marving.dp.visitor;

//抽象元素角色
public abstract class Element {
	
	public abstract void accept(Visitor v);
}
