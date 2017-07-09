package com.marving.dp.visitor;

//具体元素角色
public class ConcreteElement2 extends Element{

	public void operation(){
		System.out.println("ConcreteElement2 method" );
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
}
