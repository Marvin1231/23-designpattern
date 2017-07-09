package com.marving.dp.visitor;


//具体元素角色
public class ConcreteElement1 extends Element{

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}
	
	public void operation(){
		System.out.println("ConcreteElement1 method" );
	}

}
